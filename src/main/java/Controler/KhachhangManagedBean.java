 
package Controler;

 
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static ConnectBean.Provider.*;
import java.util.ArrayList;
import javax.faces.event.ComponentSystemEvent;
 

 
@Named(value = "khachhangManagedBean")
@SessionScoped
public class KhachhangManagedBean implements Serializable {

 
 
    
    private String makhachhangtk  ;
    private String dktimkiemchuagoikhach;
    private String sobntk =null ;
    private String loaitk=null  ;
    private String loainvct=null;
    private Boolean khoasobn;
    private Boolean isDisKhtrung=true;
    private Boolean isDisxoakh=true;
    private String loaitkdulieu="00001";
 
    
    public void resetvalue() throws SQLException{
        
  
        
    }
    
     public  String  capnhatttgdich() throws SQLException{
      
                
             return null;
 
    }   
     
     
    
     public void laysogiaytogangd() {

       

    }
    
   public  void  timgiaodich(){
     
          
    }  
   
    public  void  timgiaodichchuagoikhach(){
   
   
    }  
   
     
    
    public  String xacnhankhachhang(String userid ) throws SQLException{
        
      
       return null;
        
    } 
    
     public  void laydsquanhuyen() throws SQLException{
       
        
    } 
      
     public  void laydsnhanvienct() throws SQLException{
       
         
    } 
     
    public  String  chuyentrangsuakhachhang(  ) throws SQLException{
        
 
        return "suakhachhang" + "?faces-redirect=true";
  
        
    } 
    
    
    public  String  xoathongtin() throws SQLException{
 
      return null;
 
    }
    
    
    public void dsgiaodichgoikhach(){
           
 
    }
    
    
    public  String chuyentranggdchuagoikhach(){
       return null;
    }
    public  void capnhatthongtinkh( ){
 
        
    }
    
    public  String chuyentrangkhachhangfromgiaodich(){
    
      
       return "timkiemkhachhang" + "?faces-redirect=true";
    }

     public  String chuyentrangtaokhachhang() throws SQLException{
     
       return "taokhachhang" + "?faces-redirect=true";
    }
     
     
     public  void ktcmnd() {
         
        
        
    }
     
     
     public  String  insertkhachhang() throws SQLException{
       
                return "timkiemkhachhang" + "?faces-redirect=true";
        
     
          
        
    } 
    //Su kien thuc hien truoc khi LoadPage .
     
       public void isResetWhenPageLoad(ComponentSystemEvent event){

     
         
   
      } 
       
       
       private Boolean batloicmnd( ){
           
         
           
           return true;
       }
       
       // Lay danh sach thanh pho theo dk tim kiem .
       
     public  String xacnhanchuyendiaban(String makhachhang ,int dsgiaodich ) throws SQLException{
        
         
        
        
        return "chitietkhachhang" + "?faces-redirect=true";
       
        
    }   
       
       
 

    // Khai bao get/set .

    public String getLoaitkdulieu() {
        return loaitkdulieu;
    }

    public void setLoaitkdulieu(String loaitkdulieu) {
        this.loaitkdulieu = loaitkdulieu;
    }
       
  

    public Boolean getIsDisxoakh() {
        return isDisxoakh;
    }

    public void setIsDisxoakh(Boolean isDisxoakh) {
        this.isDisxoakh = isDisxoakh;
    }
 
    public KhachhangManagedBean() {
    }
    
}
