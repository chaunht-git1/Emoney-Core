 
package Controler;

import DatabaseDao.VwKieuhoiListDetailDao;
import DatabaseDao.VwKieuhoiListMasterDao;
import Model.Dschitietgiaodich;
import Model.VwKieuhoiListDetail;
import Model.VwKieuhoiListMaster;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
 
@Named(value = "hoibaoManagerBean")
@SessionScoped
public class HoibaoManagerBean implements Serializable {
 
    private Date ngaybiennhan;
    private String  iddoitac;
    private List<VwKieuhoiListMaster> dsgiaodich;
    private List<Dschitietgiaodich> dschitiet;
    
    
   public void hienthithongtinmaster() {
  
        VwKieuhoiListMasterDao dao = new VwKieuhoiListMasterDao();
     
        dsgiaodich=  dao.laydanhsachdoitac(iddoitac,ngaybiennhan );
    }
   
   public String hienthithongtindetail(String khoagd)  {
       
       VwKieuhoiListDetailDao dao = new VwKieuhoiListDetailDao();
       dschitiet=dao.laydanhsachchitiet(khoagd);
        return "chitietdsdaily";
    }
 
    public HoibaoManagerBean() {
    }

    public String getIddoitac() {
        return iddoitac;
    }

    public void setIddoitac(String iddoitac) {
        this.iddoitac = iddoitac;
    }

 
    public Date getNgaybiennhan() {
        return ngaybiennhan;
    }

    public void setNgaybiennhan(Date ngaybiennhan) {
        this.ngaybiennhan = ngaybiennhan;
    }

    public List<VwKieuhoiListMaster> getDsgiaodich() {
        return dsgiaodich;
    }

    public void setDsgiaodich(List<VwKieuhoiListMaster> dsgiaodich) {
        this.dsgiaodich = dsgiaodich;
    }

    public List<Dschitietgiaodich> getDschitiet() {
        return dschitiet;
    }

    public void setDschitiet(List<Dschitietgiaodich> dschitiet) {
        this.dschitiet = dschitiet;
    }

   
    
    
    
}
