 
package Controler;

import DatabaseDao.VwHoibaoDotGroupDao;
import DatabaseDao.VwHoibaoDxnDao;
import DatabaseDao.VwsolieuhbfilepgroupDao;
import Model.VwHoiBaodxn2018;
import Model.VwHoibaoListGroup;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 
@Named(value = "xacnhantthoibaoManagedBean")
@SessionScoped
public class XacnhantthoibaoManagedBean implements Serializable {
 
    private List<VwHoibaoListGroup> hoibaoListGroup= new ArrayList();
    private List<VwHoiBaodxn2018> baodxn2018s= new ArrayList<VwHoiBaodxn2018>();
    private String filename =null;
    private Date ngaytk;
    private String iddoitac;
    private String loaihb;
    
     public  void getsolieu(){
         
         try {
 
             List<VwHoibaoListGroup> list = new ArrayList<VwHoibaoListGroup>();
             VwsolieuhbfilepgroupDao dao = new VwsolieuhbfilepgroupDao();
             list = dao.getAllData();
             hoibaoListGroup = list;
         } catch (Exception e) {
         }
       
 
     }
     
     public String  showdetail(String idcode) {
         
        VwHoibaoDxnDao dao= new VwHoibaoDxnDao();
        baodxn2018s=dao.getAllData(idcode);
        filename ="Omnex2018"  ;
        return "exportsolieuomnexchitiet?faces-redirect=true";
 
     }
    
    
    public XacnhantthoibaoManagedBean() {
        
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

    public String getLoaihb() {
        return loaihb;
    }

    public void setLoaihb(String loaihb) {
        this.loaihb = loaihb;
    }
    
    
    
}
