 
package Controler;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

 
@Named(value = "chuyentrangManagedBean")
@RequestScoped
public class ChuyentrangManagedBean {

   
     public String quanlyimportdulieu() {
        //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
        return "quanlyimportdulieu" + "?faces-redirect=true";
    }
     
   public String chuyentranggiaophieu() {
       
        //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
        return "forrwardgiaophieu";
        
    }
   
    public String chuyentrangtimkiem() {
       
        //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
        return "chuyentrangtimkiemx";
        
    }
    
    public String chuyentrangchu() {
       
        //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
        return "index";
        
    }
    
    public String chuyentrangnhaptufile() {
       
        //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
        return "quanlyimportdulieu";
        
    }
    
    
    
    
    public ChuyentrangManagedBean() {
    }
    
}
