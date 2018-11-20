 
package Controler;

import DatabaseDao.VwSoduNhanvienListTempDao;
import Model.VWSoduNhanvienListTemp;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

 
@Named(value = "taocnnvManagedBean")
@SessionScoped
public class TaocnnvManagedBean implements Serializable {
 
   private List<VWSoduNhanvienListTemp> nhanvienListTemps=new  ArrayList<>();
    
    
    public  void taosolieu(){
        
     
        
    }
    
     public  void getsolieu(){
         
        List<VWSoduNhanvienListTemp> nhanvienListTemp=new ArrayList<>();
        VwSoduNhanvienListTempDao dao=new VwSoduNhanvienListTempDao();
        nhanvienListTemp=dao.getAllData("CHAUNHT");
        nhanvienListTemps=nhanvienListTemp;
 
     }
    
    
    public TaocnnvManagedBean() {
    }

    public List<VWSoduNhanvienListTemp> getNhanvienListTemps() {
        return nhanvienListTemps;
    }

    public void setNhanvienListTemps(List<VWSoduNhanvienListTemp> nhanvienListTemps) {
        this.nhanvienListTemps = nhanvienListTemps;
    }
    
    
}
