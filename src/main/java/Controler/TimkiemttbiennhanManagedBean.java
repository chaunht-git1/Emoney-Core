package Controler;

import ApiFunction.ApiFun;
import LocalModel.DmXacminhToday;
import SystemFunc.*;
import ModelDao.DoitacListDao;
import ModelDao.VwLichsuGdListWebDao;
import ModelDao.VwTkttBiennhanDetailDao;
import SystemFunc.SessionBean;
import LocalModel.DoitacList;
import LocalModel.VwLichsuGdListWeb;
import LocalModel.VwTkttBiennhanDetail;
import LocalModel.VwTkttBiennhanMaster;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@Named(value = "timkiemttbiennhanManagedBean")
@SessionScoped
public class TimkiemttbiennhanManagedBean implements Serializable {

    private List<VwTkttBiennhanMaster> vwTkttBiennhanMasters;
    private List<VwTkttBiennhanDetail> vwTkttBiennhanDetails;
    private List<VwLichsuGdListWeb> vwLichsuGdListWebs;
    private VwTkttBiennhanMaster vwTkttBiennhanMaster;
    private VwTkttBiennhanDetail vwTkttBiennhanDetail;
    private List<DmXacminhToday>  dmXacminhTodays ;
    private String chuoitimkiem;
    private String sobntimkiem;
    private String phamvitimkiem;
    private String doitactimkiem;
    private String thuoctinhtimkiem;
    private String prmuserid;

    
    
    
   public TimkiemttbiennhanManagedBean(){
       
 
   }
   
   
   
    
     
         
    public void download(VwTkttBiennhanMaster chitiet) throws SQLException, IOException {

        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();

        ec.setResponseContentType("image/jpeg");

        if (chitiet == null) 
        {
        } else {
            String attachmentName = "attachment;filename=" + chitiet.getSobn() + ".jpg";
            ec.setResponseHeader("Content-Disposition", attachmentName);
            try (OutputStream out = ec.getResponseOutputStream()) {
                VwTkttBiennhanDetailDao dao = new VwTkttBiennhanDetailDao();
                InputStream inputStream;
                inputStream = dao.layhinhbiennhan(chitiet.getIdchinhanh(), chitiet.getIdcode(), chitiet.getStt());
                byte[] outputByte = new byte[4096];

                while (inputStream.read(outputByte, 0, 4096) != -1) {
                    out.write(outputByte, 0, 4096);
                }
                out.flush();
                fc.responseComplete();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public List<DoitacList> dsdoitacTimkiem() throws SQLException {

        DoitacListDao dao = new DoitacListDao();
        List<DoitacList> dsdoitac = new ArrayList<>();
        dsdoitac = dao.getdoitacTimkiem();

        return dsdoitac;
    }

    public String laythongtindetail() {
        vwTkttBiennhanDetails = new ArrayList<>();
        VwTkttBiennhanDetailDao dao = new VwTkttBiennhanDetailDao();
        //Lấy thông tin detail
        vwTkttBiennhanDetails = dao.timtheodieukien(vwTkttBiennhanMaster.getManguoinhan(), vwTkttBiennhanMaster.getIddoitac());
        if (vwTkttBiennhanDetails == null || vwTkttBiennhanDetails.isEmpty()) {

        } else {
            vwTkttBiennhanDetail = new VwTkttBiennhanDetail();
            vwTkttBiennhanDetail = vwTkttBiennhanDetails.get(0);
        }
        //Lấy danh sách xác minh
        VwLichsuGdListWebDao dao1 = new VwLichsuGdListWebDao();
        vwLichsuGdListWebs = dao1.timtheomabiennhan(vwTkttBiennhanMaster.getMabiennhan());

        return "timkiemthongtinbiennhan" + "?faces-redirect=true";
    }

    public void laythongtinmastertheosobn(String loaitk,String giatri) {

    

    }

    public void laythongtinmaster(String loaitk,String giatri ) {

        
    }
    
     

    public List<VwTkttBiennhanMaster> timtrongtuan() {
        
        return null;
    }

    public List<VwTkttBiennhanMaster> timtatca() {
      
        return vwTkttBiennhanMasters;
    }

    //get set
    public String getSobntimkiem() {
        return sobntimkiem;
    }

    public void setSobntimkiem(String sobntimkiem) {
        this.sobntimkiem = sobntimkiem;
    }

    public String getPrmuserid() {
        return prmuserid;
    }

    public void setPrmuserid(String prmuserid) {
        this.prmuserid = prmuserid;
    }

    public List<VwLichsuGdListWeb> getVwLichsuGdListWebs() {
        return vwLichsuGdListWebs;
    }

    public void setVwLichsuGdListWebs(List<VwLichsuGdListWeb> vwLichsuGdListWebs) {
        this.vwLichsuGdListWebs = vwLichsuGdListWebs;
    }

    public VwTkttBiennhanDetail getVwTkttBiennhanDetail() {
        return vwTkttBiennhanDetail;
    }

    public void setVwTkttBiennhanDetail(VwTkttBiennhanDetail vwTkttBiennhanDetail) {
        this.vwTkttBiennhanDetail = vwTkttBiennhanDetail;
    }

    public VwTkttBiennhanMaster getVwTkttBiennhanMaster() {
        return vwTkttBiennhanMaster;
    }

    public void setVwTkttBiennhanMaster(VwTkttBiennhanMaster vwTkttBiennhanMaster) {
        this.vwTkttBiennhanMaster = vwTkttBiennhanMaster;
    }

    public List<VwTkttBiennhanDetail> getVwTkttBiennhanDetails() {
        return vwTkttBiennhanDetails;
    }

    public void setVwTkttBiennhanDetails(List<VwTkttBiennhanDetail> vwTkttBiennhanDetails) {
        this.vwTkttBiennhanDetails = vwTkttBiennhanDetails;
    }

    public String getThuoctinhtimkiem() {
        return thuoctinhtimkiem;
    }

    public void setThuoctinhtimkiem(String thuoctinhtimkiem) {
        this.thuoctinhtimkiem = thuoctinhtimkiem;
    }

    public List<VwTkttBiennhanMaster> getVwTkttBiennhanMasters() {
        return vwTkttBiennhanMasters;
    }

    public void setVwTkttBiennhanMasters(List<VwTkttBiennhanMaster> vwTkttBiennhanMasters) {
        this.vwTkttBiennhanMasters = vwTkttBiennhanMasters;
    }

    public String getPhamvitimkiem() {
        return phamvitimkiem;
    }

    public void setPhamvitimkiem(String phamvitimkiem) {
        this.phamvitimkiem = phamvitimkiem;
    }

    public String getDoitactimkiem() {
        return doitactimkiem;
    }

    public void setDoitactimkiem(String doitactimkiem) {
        this.doitactimkiem = doitactimkiem;
    }

    public String getChuoitimkiem() {
        return chuoitimkiem;
    }

    public void setChuoitimkiem(String chuoitimkiem) {
        this.chuoitimkiem = chuoitimkiem;
    }

}
