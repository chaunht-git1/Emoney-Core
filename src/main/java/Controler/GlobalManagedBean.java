 
package Controler;

import Model.DoitacList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import DatabaseDao.DoitacListDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

 
@Named(value = "globalManagedBean")
@ApplicationScoped
public class GlobalManagedBean {

   private String description = "Alto has power windows";
   private  List<DoitacList> doitacLists= new ArrayList<>();

   
  
   public   void GlobalManagedBean(){
 
       doitacLists =this.laydsdoitac();
     
   }
   
   public List<DoitacList> laydsdoitac(){
       
       List<DoitacList> ketqua = new ArrayList<>();
       DoitacListDao dao= new DoitacListDao();
              
       try {
           ketqua=dao.getdoitacimportweb();
       } catch (SQLException ex) {
           return null;
       }
       
       return ketqua;        
               
   }
   
   
   
    public List<DoitacList> getDoitacLists() {
        return doitacLists;
    }

    public void setDoitacLists(List<DoitacList> doitacLists) {
        this.doitacLists = doitacLists;
    }
 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
   
   
   
    public GlobalManagedBean() {
    }
    
}
