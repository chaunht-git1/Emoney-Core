 
package Controler;

import DatabaseDao.VwQlqHspsDetail2018Dao;
import DatabaseDao.Vwqlqhosoctu2018Dao;
import DatabaseDao.Vwqlqqlhspschuahoanung2018Dao;
import DatabaseDao.Vwqlqqlydottupsds2018Dao;
import LocalModel.VwQlqHspsDetail2018;
import LocalModel.VwQlqhspschuahoanung2018;
import LocalModel.VwQlqqlydottupsds2018;
import LocalModel.Vwqlqhosoctu2018;
import Model.TkiemModel;
import SystemFunc.MessageGlobal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
@Named(value = "hoanungpsManagedBean")
@SessionScoped
public class HoanungpsManagedBean implements Serializable {

   private List<VwQlqhspschuahoanung2018> dsgiaodich;
   private List<VwQlqHspsDetail2018> dschitiet;
 
   private TkiemModel loaitkiem;
 
   
   public  void init(){
       
       loaitkiem=new TkiemModel();
       loaitkiem.setValuetk("N");
 
   }
   
   
   public void hienthithongtinmaster(String chinhanh,String userid) {
       
      Vwqlqqlhspschuahoanung2018Dao dao = new Vwqlqqlhspschuahoanung2018Dao();
      dsgiaodich=  dao.findOneParaString("ID_CHINHANH", chinhanh );
          
 
    }
   
   public void thongtinchitiet1( ){
       
         String loaitk="A";
       
   }
   
    public void thongtinchitiet(VwQlqhspschuahoanung2018 data,String chinhanh,String userid,String loaitk ) {
      dschitiet= new ArrayList<>();
      VwQlqHspsDetail2018Dao dao = new VwQlqHspsDetail2018Dao();
      String khoaidcode=null;
      if (loaitk.equalsIgnoreCase("N")){
        khoaidcode=data.getIdcode()+"N";
        dschitiet=  dao.findOneParaString("IDCODE",khoaidcode); 
      }
      else if (loaitk.equalsIgnoreCase("Y")){
         khoaidcode=data.getIdcode()+"Y";
         dschitiet=  dao.findOneParaString("IDCODE",khoaidcode ); 
      }
      else{
          
        dschitiet=  dao.findOneParaString("DOTTUPS", data.getIdcode() ); 
          
      }
  
 
    }
   
     public String chuyenthuquy() {
  
     // VwKieuhoiListMasterDao dao = new VwKieuhoiListMasterDao();
     
       //dsgiaodich=  dao.laydanhsachdoitac(iddoitac,ngaybiennhan );
          dschitiet= new ArrayList<>();
          
       
 
         return "chuyenthuquy";
         
    }
   
  
    
     public void timkiemthongtin(TkiemModel tkiemModel ) throws SQLException {
 
           Vwqlqhosoctu2018Dao dao = new Vwqlqhosoctu2018Dao();
 
           dschitiet= new ArrayList<>();
          // dschitiet=  dao.findOneParaString(loaitkiem.getLoaitk(), loaitkiem.getValuetk());
           if (dschitiet.size()==0) {
                MessageGlobal.messkhongtimthaykq("");
           }
           else{
                MessageGlobal.messtimthaykq(dschitiet.size());
           }
          
  
    }
    
   
    
       
 
   
  
    
    
        public void funcRemoveDottups ( VwQlqqlydottupsds2018 data,String userid) {
        
        String kq ;
        String loaitu=data.getIdloaitu();
        int loaicn;
        if (loaitu.equalsIgnoreCase("002072"))
        {
            loaicn=1;
        }
        else{
            loaicn=2;
        }
  
        try {
               Vwqlqqlydottupsds2018Dao dao = new Vwqlqqlydottupsds2018Dao();
 
                kq = dao.funcRemoveDottups(data.getIdcode(),userid , loaicn);
                
           if (kq.equalsIgnoreCase("T")) {
                MessageGlobal.messluuthanhcong("");
           }
           else{
                MessageGlobal.messluukhongthanhcong("");
           }
               
        } catch (Exception e) {
        }
 
       
    }
    
  public void funcHoanungDottups ( VwQlqhspschuahoanung2018 data,String userid) {
        
        String kq ;
  
        try {
               Vwqlqqlydottupsds2018Dao dao = new Vwqlqqlydottupsds2018Dao();
 
                kq = dao.funcHoanungDottups(data.getIdcode(),userid  );
                
           if (kq.equalsIgnoreCase("T")) {
                MessageGlobal.messluuthanhcong("");
           }
           else{
                MessageGlobal.messluukhongthanhcong("");
           }
               
        } catch (Exception e) {
        }
 
       
    }
             
    public HoanungpsManagedBean() {

         this.init();
 
    }

    public List<VwQlqhspschuahoanung2018> getDsgiaodich() {
        return dsgiaodich;
    }

    public void setDsgiaodich(List<VwQlqhspschuahoanung2018> dsgiaodich) {
        this.dsgiaodich = dsgiaodich;
    }

    public List<VwQlqHspsDetail2018> getDschitiet() {
        return dschitiet;
    }

    public void setDschitiet(List<VwQlqHspsDetail2018> dschitiet) {
        this.dschitiet = dschitiet;
    }

  
 
     

    public TkiemModel getLoaitkiem() {
        return loaitkiem;
    }

    public void setLoaitkiem(TkiemModel loaitkiem) {
        this.loaitkiem = loaitkiem;
    }
 
    
 
    
    
 
}
