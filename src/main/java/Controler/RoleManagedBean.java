 
package Controler;

import DatabaseDao.DoitactupslistDao;
import LocalModel.Doitactupslist;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
 
@Named(value = "roleManagedBean")
@SessionScoped
public class RoleManagedBean implements Serializable {
    
 
    private List<Doitactupslist> dsgiaodich;
    private Doitactupslist chitiet;
    private String statusRecord ;
    private boolean hidebuttonsave=true;
    private boolean hidebuttondel=true;
    
 
   public  void RoleManagedBean(){
       
       this.init();
     
   }
 
    
   public  void init(){
       
       chitiet =new Doitactupslist();
       DoitactupslistDao dao = new DoitactupslistDao();
       dsgiaodich=  dao.getAllData();
       statusRecord="select";
       hidebuttonsave=true;
     
   }
    
    
   public void hienthithongtinmaster() {
  
        this.init();
        DoitactupslistDao dao = new DoitactupslistDao();
        dsgiaodich=  dao.getAllData();
        
    }
   
   public void hienthithongtindetail(Doitactupslist d) {
      
       this. init();
       chitiet=d;
        
    }
   
    public void taomoi() {
         chitiet=new Doitactupslist();
         this.statusRecord="insert";
         hidebuttonsave=false;
         chitiet.setMakerid("CHAUNHT");
         chitiet.setDate_modified(new Date());
         chitiet.setNgayduyet(new Date());
         chitiet.setDuyet("Y");
         chitiet.setStt(1);
    }
    
     public void mokhoa() {
 
         this.statusRecord="update";
         hidebuttonsave=false;
         hidebuttondel=false;
     }
   
    public void capnhatthongtin(String status,Doitactupslist d) {
        
        String kq ;
  
        try {
            DoitactupslistDao dao = new DoitactupslistDao();
         
            if (status.equalsIgnoreCase("insert")) {
                
                kq = dao.funcInsertDoitactups( d);
            } 
            else if (status.equalsIgnoreCase("update"))
            {
                kq = dao.funcUpdateDoitactups(d);
            }
            else{
                kq = dao.funcDeleteDoitactups(d);
            }
            dsgiaodich=  dao.getAllData();
        } catch (Exception e) {
        }
 
       
    }
   
    
 
    public RoleManagedBean() {
    }

    public List<Doitactupslist> getDsgiaodich() {
        return dsgiaodich;
    }

    public void setDsgiaodich(List<Doitactupslist> dsgiaodich) {
        this.dsgiaodich = dsgiaodich;
    }

    public Doitactupslist getChitiet() {
        return chitiet;
    }

    public void setChitiet(Doitactupslist chitiet) {
        this.chitiet = chitiet;
    }

    public String getStatusRecord() {
        return statusRecord;
    }

    public void setStatusRecord(String statusRecord) {
        this.statusRecord = statusRecord;
    }

    public boolean isHidebuttonsave() {
        return hidebuttonsave;
    }

    public void setHidebuttonsave(boolean hidebuttonsave) {
        this.hidebuttonsave = hidebuttonsave;
    }

    public boolean isHidebuttondel() {
        return hidebuttondel;
    }

    public void setHidebuttondel(boolean hidebuttondel) {
        this.hidebuttondel = hidebuttondel;
    }
    
    
    
    
}
