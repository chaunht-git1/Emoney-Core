 
package Controler;

import DatabaseDao.Vwqlqhosoctu2018Dao;
import DatabaseDao.Vwqlqhosoctuth2018Dao;
import DatabaseDao.Vwqlqqlydottupsds2018Dao;
import LocalModel.UserModel;
import LocalModel.VwQlqqlydottupsds2018;
import LocalModel.Vwhschuahoanung2018;
import LocalModel.Vwqlqhosoctu2018;
import LocalModel.Vwqlqhosoctuth2018;
import Model.TkiemModel;
import SystemFunc.FunctionGlobal;
import SystemFunc.MessageGlobal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
 
@Named(value = "tamungpsManagedBean")
@SessionScoped
public class TamungpsManagedBean implements Serializable {

   private List<Vwqlqhosoctuth2018> dsgiaodich;
   private List<Vwqlqhosoctu2018> dschitiet;
   private List<VwQlqqlydottupsds2018> dsqlqqlydottupsds2018;
   private List<Vwhschuahoanung2018>  vwhschuahoanung2018;
   private TkiemModel loaitkiem;
   private TkiemModel loaitkiemhs;
   private String previouspage;
 
   
   public  void init(){
       
       loaitkiem=new TkiemModel();
       loaitkiemhs=new TkiemModel();
       loaitkiem.setValuetk("T");
       loaitkiemhs.setLoaitk("SOBN");
   }
   

   
   public void hienthithongtinmaster(String chinhanh,String userid) {
      Vwqlqhosoctuth2018Dao dao = new Vwqlqhosoctuth2018Dao();
       try {
 
           dsgiaodich=  dao.findOneParaString("ID_CHINHANH", chinhanh );
      
       } catch (SQLException ex) {
           Logger.getLogger(TamungpsManagedBean.class.getName()).log(Level.SEVERE, null, ex);
       }
          
 
    }
   
     public String chuyenthuquy() {
  
     // VwKieuhoiListMasterDao dao = new VwKieuhoiListMasterDao();
     
       //dsgiaodich=  dao.laydanhsachdoitac(iddoitac,ngaybiennhan );
          dschitiet= new ArrayList<>();
          
          Vwqlqhosoctu2018 vwqlqhosoctu2018= new Vwqlqhosoctu2018();
          vwqlqhosoctu2018.setManguoinhan("60476530");
          vwqlqhosoctu2018.setTendoitac("Money Gram");
          vwqlqhosoctu2018.setSotiengoi(8590074);
          vwqlqhosoctu2018.setId_loaitienchitra("VND");
          dschitiet.add(vwqlqhosoctu2018);
 
         return "chuyenthuquy";
         
    }
     
    public String thongtinchitiet(Vwqlqhosoctuth2018 data) {
       FunctionGlobal fg=  new FunctionGlobal();
       try {
           Vwqlqhosoctu2018Dao dao = new Vwqlqhosoctu2018Dao();
           dschitiet= new ArrayList<>();
           dschitiet=  dao.findOneParaString("IDCODEVIEW",data.getIdcode() );
           this.previouspage= fg.getcurrentpagestitle( );
           return "ttchitiet"+ "?faces-redirect=true";
       } catch (SQLException ex) {
           Logger.getLogger(TamungpsManagedBean.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
         
    }
   
    public String hienthithongtindetail() {
  
     // VwKieuhoiListMasterDao dao = new VwKieuhoiListMasterDao();
     
       //dsgiaodich=  dao.laydanhsachdoitac(iddoitac,ngaybiennhan );
          dschitiet= new ArrayList<>();

          Vwqlqhosoctu2018 vwqlqhosoctu2018= new Vwqlqhosoctu2018();
          vwqlqhosoctu2018.setManguoinhan("60476530");
          vwqlqhosoctu2018.setTendoitac("Money Gram");
          vwqlqhosoctu2018.setSotiengoi(8590074);
          vwqlqhosoctu2018.setId_loaitienchitra("VND");
          dschitiet.add(vwqlqhosoctu2018);
 
         return "ttchitiet"+ "?faces-redirect=true";
         
    }
    
     public void timkiemthongtin(TkiemModel tkiemModel ) throws SQLException {
 
           Vwqlqhosoctu2018Dao dao = new Vwqlqhosoctu2018Dao();
 
           dschitiet= new ArrayList<>();
           dschitiet=  dao.findDTUngOneParaString(tkiemModel.getLoaitk(), tkiemModel.getValuetk());
           if (dschitiet.size()==0) {
                MessageGlobal.messkhongtimthaykq("");
           }
           else{
                MessageGlobal.messtimthaykq(dschitiet.size());
           }
          
  
    }
    
    public void hienthithongtintupsmaster(String chinhanh,String loaitk) {
  
       try {
           Vwqlqqlydottupsds2018Dao dao = new Vwqlqqlydottupsds2018Dao();   
           dsqlqqlydottupsds2018=  dao.findTwoParaString("ID_CHINHANH",chinhanh,"ID_QLQ_DUYET",loaitk );
       } catch (SQLException ex) {
           Logger.getLogger(TamungpsManagedBean.class.getName()).log(Level.SEVERE, null, ex);
       }
 
    }
    
       
   public void  hosochuahungmaster() {
  
     // VwKieuhoiListMasterDao dao = new VwKieuhoiListMasterDao();
     
       //dsgiaodich=  dao.laydanhsachdoitac(iddoitac,ngaybiennhan );
          vwhschuahoanung2018= new ArrayList<>();

          Vwhschuahoanung2018 hschuahoanung2018= new Vwhschuahoanung2018();
          hschuahoanung2018.setDottups("20180807PHUONGHT001");
          hschuahoanung2018.setId_nv_chitra("PHUONGHT");
          hschuahoanung2018.setTennv("HUỲNH THANH PHƯƠNG");
          hschuahoanung2018.setShs(1);
          vwhschuahoanung2018.add(hschuahoanung2018);
          
          this.hienthithongtindetail();
          
 
    }
   
 
    public void funcInsertDottupsFromhs( Vwqlqhosoctu2018 d,String usrid  ) {
        
        String kq ;
  
        try {
               Vwqlqhosoctu2018Dao dao = new Vwqlqhosoctu2018Dao();
 
                kq = dao.funcInsertDottupsFromhs(d,usrid);
           if (kq.equalsIgnoreCase("T")) {
               dschitiet= new ArrayList<>();
               dschitiet=  dao.findDTUngOneParaString("SOBN", d.getSobn().toString());
                MessageGlobal.messluuthanhcong("");
           }
           else if (kq.equalsIgnoreCase("CR")){
                MessageGlobal.showmessageError("Dữ liệu đã tạm ứng - kiểm tra lại !!!");
           }
           else{
                MessageGlobal.messluukhongthanhcong("");
           }
               
        } catch (Exception e) {
        }
 
       
    }
   
    public void funcInsertDottups ( Vwqlqhosoctuth2018 data ,UserModel model) {
        
        String kq ;
  
        try {
               Vwqlqhosoctuth2018Dao dao = new Vwqlqhosoctuth2018Dao();
 
                kq = dao.funcInsertDottups(data,data.getId_doitac(),model.getUserid(),model.getHomebranch());
           if (kq.equalsIgnoreCase("T")) {
                dsgiaodich=  dao.findOneParaString("ID_CHINHANH", model.getHomebranch() );
                MessageGlobal.messluuthanhcong("");
           }
           else if (kq.equalsIgnoreCase("CR")){
                MessageGlobal.showmessageError("Dữ liệu đã tạm ứng - kiểm tra lại !!!");
           }
           else{
                MessageGlobal.messluukhongthanhcong("");
           }
               
        } catch (Exception e) {
        }
 
       
    }
    
        public void funcRemoveDottups ( VwQlqqlydottupsds2018 data,UserModel model ) {
        
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
 
                kq = dao.funcRemoveDottups(data.getIdcode(),model.getUserid() , loaicn);
                
           if (kq.equalsIgnoreCase("T")) {
                dsqlqqlydottupsds2018=  dao.findTwoParaString("ID_CHINHANH",model.getHomebranch(),"ID_QLQ_DUYET","T" );
                MessageGlobal.messluuthanhcong("");
           }
           else{
                MessageGlobal.messluukhongthanhcong("");
           }
               
        } catch (Exception e) {
        }
 
       
    }
    
        public void funcDuyetDottups ( VwQlqqlydottupsds2018 data,String userid,String chinhanh) {
        
        String kq ;
        String loaitu=data.getIdloaitu();
  
        try {
               Vwqlqqlydottupsds2018Dao dao = new Vwqlqqlydottupsds2018Dao();
 
                kq = dao.funcDuyetDottups(data.getIdcode(),userid  );
                
           if (kq.equalsIgnoreCase("T")) {
                this.hienthithongtintupsmaster(chinhanh, "T");
                MessageGlobal.messluuthanhcong("");
           }
           else{
                MessageGlobal.messluukhongthanhcong("");
           }
               
        } catch (Exception e) {
        }
 
       
    }
        

    public TamungpsManagedBean() {

         this.init();
 
    }

    public List<Vwqlqhosoctuth2018> getDsgiaodich() {
        return dsgiaodich;
    }

    public void setDsgiaodich(List<Vwqlqhosoctuth2018> dsgiaodich) {
        this.dsgiaodich = dsgiaodich;
    }

    public List<Vwqlqhosoctu2018> getDschitiet() {
        return dschitiet;
    }

    public void setDschitiet(List<Vwqlqhosoctu2018> dschitiet) {
        this.dschitiet = dschitiet;
    }

    public List<VwQlqqlydottupsds2018> getDsqlqqlydottupsds2018() {
        return dsqlqqlydottupsds2018;
    }

    public void setDsqlqqlydottupsds2018(List<VwQlqqlydottupsds2018> dsqlqqlydottupsds2018) {
        this.dsqlqqlydottupsds2018 = dsqlqqlydottupsds2018;
    }

    public List<Vwhschuahoanung2018> getVwhschuahoanung2018() {
        return vwhschuahoanung2018;
    }

    public void setVwhschuahoanung2018(List<Vwhschuahoanung2018> vwhschuahoanung2018) {
        this.vwhschuahoanung2018 = vwhschuahoanung2018;
    }

    public TkiemModel getLoaitkiem() {
        return loaitkiem;
    }

    public void setLoaitkiem(TkiemModel loaitkiem) {
        this.loaitkiem = loaitkiem;
    }

    public String getPreviouspage() {
        return previouspage;
    }

    public void setPreviouspage(String previouspage) {
        this.previouspage = previouspage;
    }

    public TkiemModel getLoaitkiemhs() {
        return loaitkiemhs;
    }

    public void setLoaitkiemhs(TkiemModel loaitkiemhs) {
        this.loaitkiemhs = loaitkiemhs;
    }
 
    
 
    
    
 
}
