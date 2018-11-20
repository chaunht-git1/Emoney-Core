 
package Controler;

import static ConnectBean.Provider.TENHETHONG;
import LocalModel.UserModel;
import SystemFunc.FunctionGlobal;
import SystemFunc.SessionBean;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
 
@Named(value = "systemManagedBean")
@SessionScoped
public class SystemManagedBean  implements Serializable{

    private String  hethong=TENHETHONG;
    private java.sql.Date    giohethong ;
    private UserModel model;
    
    
 
   public  void init(){
 
      model= SessionBean.getUseriNFOR();
      java.sql.Date ngayhethontem=  FunctionGlobal.getgiohethong();
      java.util.Date utilDate = new java.util.Date(ngayhethontem.getTime());
      giohethong=ngayhethontem;
     
   }
   
    public String  funcPreviouspage(String  previouspage)
    {
        
        return  previouspage+ "?faces-redirect=true";
        
    }
   
 
    
    
    public SystemManagedBean() {
        
        this.init();
        
    }

    public String getHethong() {
        return hethong;
    }

    public Date getGiohethong() {
        return giohethong;
    }

    public void setGiohethong(java.sql.Date giohethong) {
        this.giohethong = giohethong;
        String kq=null;
    }

    public UserModel getModel() {
        return model;
    }

    public void setModel(UserModel model) {
        this.model = model;
    }
    
    
  
    
 
    
}
