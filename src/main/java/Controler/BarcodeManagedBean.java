package Controler;

import ModelDao.BarcodeListDao;
import ModelDao.VwBarcodeKieuhoiListDetailDao;
import ModelDao.VwBarcodeKieuhoiListMasterDao;
import ModelDao.VwDoitacBarcodeDao;
import SystemFunc.SessionBean;
import LocalModel.VwBarcodeKieuhoiListDetail;
import LocalModel.VwBarcodeKieuhoiListMaster;
import LocalModel.VwDoitacBarcode;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named(value = "barcodeManagedBean")
@SessionScoped
public class BarcodeManagedBean implements Serializable {
    
    
    public BarcodeManagedBean() {
        this.hienthongtinmasterchuataobarcode();
        this.laydanhsachdoitac();
    }
    
    


    private List<VwBarcodeKieuhoiListMaster> vwBarcodeKieuhoiListMasters;
    private List<VwBarcodeKieuhoiListDetail> vwBarcodeKieuhoiListDetails;

    private VwBarcodeKieuhoiListMaster vwBarcodeKieuhoiListMaster;
    
    private List<VwDoitacBarcode> vwDoitacBarcodes;
    
    private String iddoitactimkiem;
    private String idtrangthaitimkiem;
    
    
    public void hienthongtinmasterchuataobarcode() {
        vwBarcodeKieuhoiListMasters = new ArrayList();
        VwBarcodeKieuhoiListMasterDao dao = new VwBarcodeKieuhoiListMasterDao();
        vwBarcodeKieuhoiListMasters = dao.timtheothuoctinh("BARCODE", "N");
        this.laydanhsachdoitac();
    }
    
    

    
    public void timmastertheomadoitac() {
        vwBarcodeKieuhoiListMasters = new ArrayList();
        VwBarcodeKieuhoiListMasterDao dao = new VwBarcodeKieuhoiListMasterDao();
        vwBarcodeKieuhoiListMasters = dao.timtheothuoctinh("ID_DOITAC", iddoitactimkiem);
    }
    
     public void laydanhsachdoitac() {
        VwDoitacBarcodeDao dao = new VwDoitacBarcodeDao();
        vwDoitacBarcodes = dao.findAll();
    }
     
    public void timtheotrangthai() {
        vwBarcodeKieuhoiListMasters = new ArrayList();
        VwBarcodeKieuhoiListMasterDao dao = new VwBarcodeKieuhoiListMasterDao();
        vwBarcodeKieuhoiListMasters = dao.timtheothuoctinh("BARCODE", idtrangthaitimkiem);
    }



    public void hienthongtinmaster() {
        vwBarcodeKieuhoiListMasters = new ArrayList();
        VwBarcodeKieuhoiListMasterDao dao = new VwBarcodeKieuhoiListMasterDao();
        vwBarcodeKieuhoiListMasters = dao.findAll();
        this.laydanhsachdoitac();
    }

    public void hienthongtindetail() {
        vwBarcodeKieuhoiListDetails = new ArrayList<>();
        VwBarcodeKieuhoiListDetailDao dao = new VwBarcodeKieuhoiListDetailDao();
        vwBarcodeKieuhoiListDetails = dao.timtheosophieu(vwBarcodeKieuhoiListMaster.getSophieu());
    }

    public String chuyentrangthembarcode() {
        //Lấy danh sách hồ sơ chưa có barcode theo số phiếu từ bảng master
      //  this.hienthongtindetail();
        return "quanlythembarcode" + "?faces-redirect=true";
    }

    public void insertlaibarcode() {
        String iddoitac = vwBarcodeKieuhoiListMaster.getIddoitac();
        String sophieu = vwBarcodeKieuhoiListMaster.getSophieu();
        String userid = SessionBean.getUserId();
        BarcodeListDao dao = new BarcodeListDao();
        dao.insertlaibarcode(iddoitac, sophieu, userid, vwBarcodeKieuhoiListDetails);
    }

    public String xulyinsertlaibarcode() {
        this.insertlaibarcode();
        return "quanlythembarcode" + "?faces-redirect=true";
    }

    public String xulytaonhanhinsertlaibarcode() {
        this.hienthongtindetail();
        this.insertlaibarcode();
        this.hienthongtinmaster();
        return "quanlythembarcode" + "?faces-redirect=true";
    }

    //get set

    public List<VwDoitacBarcode> getVwDoitacBarcodes() {
        return vwDoitacBarcodes;
    }

    public void setVwDoitacBarcodes(List<VwDoitacBarcode> vwDoitacBarcodes) {
        this.vwDoitacBarcodes = vwDoitacBarcodes;
    }

    public String getIddoitactimkiem() {
        return iddoitactimkiem;
    }

    public void setIddoitactimkiem(String iddoitactimkiem) {
        this.iddoitactimkiem = iddoitactimkiem;
    }

    public String getIdtrangthaitimkiem() {
        return idtrangthaitimkiem;
    }

    public void setIdtrangthaitimkiem(String idtrangthaitimkiem) {
        this.idtrangthaitimkiem = idtrangthaitimkiem;
    }
    
    
    
    public List<VwBarcodeKieuhoiListDetail> getVwBarcodeKieuhoiListDetails() {
        return vwBarcodeKieuhoiListDetails;
    }

    public void setVwBarcodeKieuhoiListDetails(List<VwBarcodeKieuhoiListDetail> vwBarcodeKieuhoiListDetails) {
        this.vwBarcodeKieuhoiListDetails = vwBarcodeKieuhoiListDetails;
    }

    public List<VwBarcodeKieuhoiListMaster> getVwBarcodeKieuhoiListMasters() {
        return vwBarcodeKieuhoiListMasters;
    }

    public void setVwBarcodeKieuhoiListMasters(List<VwBarcodeKieuhoiListMaster> vwBarcodeKieuhoiListMasters) {
        this.vwBarcodeKieuhoiListMasters = vwBarcodeKieuhoiListMasters;
    }

    public VwBarcodeKieuhoiListMaster getVwBarcodeKieuhoiListMaster() {
        return vwBarcodeKieuhoiListMaster;
    }

    public void setVwBarcodeKieuhoiListMaster(VwBarcodeKieuhoiListMaster vwBarcodeKieuhoiListMaster) {
        this.vwBarcodeKieuhoiListMaster = vwBarcodeKieuhoiListMaster;
    }
    
    

}
