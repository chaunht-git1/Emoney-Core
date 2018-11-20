 
package Controler;

import DatabaseDao.VwHoibaoDotGroupDao;
import DatabaseDao.VwHoibaoDxnDao;
import DatabaseDao.Vwsolieuhbfilep2018Dao;
import DatabaseDao.VwsolieuhbfilepgroupDao;
import Model.VwHoiBaodxn2018;
import Model.VwHoibaoListGroup;
import Model.Vwsolieuhbfilep2018;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 
@Named(value = "exportOmnexManagedBean")
@SessionScoped
public class ExportOmnexManagedBean implements Serializable {
 
    private List<VwHoibaoListGroup> hoibaoListGroup= new ArrayList();
    private List<VwHoiBaodxn2018> baodxn2018s= new ArrayList<VwHoiBaodxn2018>();
    private List<Vwsolieuhbfilep2018> vwsolieuhbfilep2018= new ArrayList<Vwsolieuhbfilep2018>();

    private String filename =null;
    private Date ngaytk;
    private String iddoitac;
    
     public  void getsolieu(Date ngaytao){
         try {
             String chuoingay = new SimpleDateFormat("yyyyMMdd").format(ngaytao);
             List<VwHoibaoListGroup> list = new ArrayList<VwHoibaoListGroup>();
             VwHoibaoDotGroupDao dao = new VwHoibaoDotGroupDao();
             list = dao.getAllData(chuoingay);
             hoibaoListGroup = list;
         } catch (Exception e) {
         }
       
 
     }
     
     public String  showdetail(String idcode) {
         
        VwHoibaoDxnDao dao= new VwHoibaoDxnDao();
        baodxn2018s=dao.getAllData(idcode);
        filename ="Omnex2018"+idcode ;
        return "exportsolieuomnexchitiet?faces-redirect=true";
 
     }
     
    public String  showdetailfilep(String idcode) {
         
        Vwsolieuhbfilep2018Dao dao= new Vwsolieuhbfilep2018Dao();
        
        vwsolieuhbfilep2018=dao.getAllData(idcode);
        filename ="FilePOmnex2018"  ;
        return "xacnhandothbtodaychitiet?faces-redirect=true";
 
     }
    
    
    public ExportOmnexManagedBean() {
        
        ngaytk= new Date();
        
    }

    public List<VwHoibaoListGroup> getHoibaoListGroup() {
        return hoibaoListGroup;
    }

    public void setHoibaoListGroup(List<VwHoibaoListGroup> hoibaoListGroup) {
        this.hoibaoListGroup = hoibaoListGroup;
    }

    public List<VwHoiBaodxn2018> getBaodxn2018s() {
        return baodxn2018s;
    }

    public void setBaodxn2018s(List<VwHoiBaodxn2018> baodxn2018s) {
        this.baodxn2018s = baodxn2018s;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getNgaytk() {
        return ngaytk;
    }

    public void setNgaytk(Date ngaytk) {
        this.ngaytk = ngaytk;
    }

    public String getIddoitac() {
        return iddoitac;
    }

    public void setIddoitac(String iddoitac) {
        this.iddoitac = iddoitac;
    }

    public List<Vwsolieuhbfilep2018> getVwsolieuhbfilep2018() {
        return vwsolieuhbfilep2018;
    }

    public void setVwsolieuhbfilep2018(List<Vwsolieuhbfilep2018> vwsolieuhbfilep2018) {
        this.vwsolieuhbfilep2018 = vwsolieuhbfilep2018;
    }
    
    
    
}
