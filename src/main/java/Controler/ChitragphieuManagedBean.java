 
package Controler;

 
import ApiFunction.ApiFun;
import DanhmucModel.DmCitylist;
import DanhmucModel.DmNhanvienList;
import DanhmucModel.DmQuanhuyenList;
import LocalModel.*;
import SystemFunc.FunctionFilter;
import SystemFunc.SessionBean;
import SystemFunc.SystemBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
@Named(value = "chitragphieuManagedBean")
@SessionScoped
public class ChitragphieuManagedBean implements Serializable {

    
     // Khai bao bien List.
    private List<VwDshosoDagiaophieuWeb> dsgddagiaochinhanh ;
    private List<VwDshosoChuagiaophieuWeb> dsgdchuagiaochinhanh ;
    private List<VwDshosoChuagiaophieuWeb> dsgdchuagiaofilter; 
    private List<VwDshosoDagiaophieuWeb> dsgddagiaofilter; 
    private List<VwDshosoCgpSumWeb> cgpsumwebs ;
    private List<VwDshosoDgpSumWeb> dagiaosumwebs ;
    private List<VwDshosoCgpSumWeb> cgpsumwebsfilter ;
    private List<VwDshosoDgpSumWeb> dagiaosumwebsfilter ;
    private List<VwDshosoChuagiaophieuWeb> dsgdchuagiao;
    private List<VwDshosoDagiaophieuWeb> dsdagiaochuagiao; 
    
    private List<DmQuanhuyenList> dsquanhuyen; 
    private List<DmCitylist> dscity ;
    private List<GiaytoList> dsgiayto ;
    private List<DmNhanvienList> dsnhnavienctwebs;
    private List<DmNhanvienList> dsnhnavienfilter;
    private List<VwDoitacGpWeb> dsdoitacGp;
    private List<VwDshosoDagiaophieuWeb> dsgddagiao;
    private List<VwDshosoDagiaophieuNv> dsgddagiaonv;
    private List<DshosoMg> dsdshosomg;
    
     // Khai bao bien Model.
 
    private VwDshosoChuagiaophieuWeb giaodichchuagiaoct=new VwDshosoChuagiaophieuWeb();
    private VwDsNhnavienctWeb dswhnavienctweb=new VwDsNhnavienctWeb();
    private KieuhoiList kieuhoiList = new KieuhoiList();
    private VwDshosoDagiaophieuNv gddagiaonv=new VwDshosoDagiaophieuNv();
    
     // Khai bao bien don .
    
    private String makhachhangtk  ;
    private String sobntk  ;
    private String loaitk;
    private String loainvact;
    private String iddoitactk;
    private String nvchitratk ;
    private Boolean isReset=true;
    
    
    
      
     public  String  capnhatgiaophieumothoso(VwDshosoChuagiaophieuWeb hosogiaophieu)  {
       
       /* ApiGiaophieuDao fun=new ApiGiaophieuDao();
          // Xu ly khoa  .
        String userid=SessionBean.getUserId();
        
        try {
            if(userid!=null)
            {
              String kq=fun.giaophieutungbn(hosogiaophieu, userid);
              if(kq.equalsIgnoreCase("T"))
              {
                   SystemBean.proMessError("Lưu thành công");
                  // Remove hs dang co ra khoi ds  .
                   dsgdchuagiao.remove(hosogiaophieu);
                   if(dsgdchuagiao.size()==0)
                   {
                       return "quanlygiaophieumaster" + "?faces-redirect=true"; 
                   }
                   else{
                       
                       return null;
                   }
              }
              else{
                  
                   SystemBean.proMessError("Lưu không thành công");
                    return null;
              }
            }
            else{
                
                 SystemBean.proMessError("Lưu không thành công");
                 return null;
            }
                
                
            }
     catch (Exception e) {
        SystemBean.proMessError("Lưu không thành công"+e.getMessage());
        return null;
       }
      
       */
        
            return null;
    }   
    

 
//  public  void laytygiamoi() throws SQLException{
//     
////    if(giaodichchuagiaoct.getIdLoaitienchitra().equalsIgnoreCase("VND"))
//// {
////     Number tygia=FunctionLocal.laytygiachitra(giaodichchuagiaoct.getIdLoaitiengoi(), "002");
////     giaodichchuagiaoct.setTygia((BigDecimal) tygia);
////     BigDecimal sotien=giaodichchuagiaoct.getSotiengoi();
////     double thanhtien= sotien.doubleValue()*tygia.doubleValue();
////     giaodichchuagiaoct.setThanhtien(new BigDecimal(thanhtien));
//// }   
//    
// } 
    
   
 public  void laydsquanhuyen(String city){
        
 } 
    
 
 public  void laydsnvquanhuyen(String district){
      
 } 
    
//public  void getdatadefault() throws SQLException{
// 
//   dscity.clear();
//// dsquanhuyen.clear();
//// dsNhnavienctWebs.clear();
//// String idchinhanh=SessionBean.getChinhanhId();
//// dsquanhuyen=FunctionLocal.dsquanhuyen("002");
//// dscity=FunctionLocal.laydscity();
//// dsNhnavienctWebs=FunctionLocal.laydsNVCHITRA("Y",idchinhanh );
// //this.laytygiamoi();
// 
// //return "chitietgiaophieu" + "?faces-redirect=true";    
// 
//}

 
 public void showdatagchuagptheochinhanh(String dk){
  
  
 }
    
    
// public void showdatagchuagpall(){
//     
//     if(  this.isReset)
//     {
// 
//     String chinhanh=SessionBean.getChinhanhId();
//     String userid=SessionBean.getUserId();
//      // Tao Entity .
//      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
//      EntityManager entitymanager = emfactory.createEntityManager();
//      //Tao Query .
//      Query query = null;
//      query=entitymanager.createQuery("SELECT v FROM VwDshosoChuagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh  ");
//      query.setParameter("idChinhanh",chinhanh);      
//      dsgdchuagiao=query.getResultList();
//      for (VwDshosoChuagiaophieuWeb dsgd1 : dsgdchuagiao) {
//          
//          dsgd1.setIdCity("002");
// 
//     }
//      
//      
//      // Lay danh sach đối tác  .
//      query = null;
//      query=entitymanager.createQuery("SELECT v FROM VwDoitacGpWeb v  ");   
//      dsdoitacGp=query.getResultList();
//      
//      
//      // Dong ket noi .
//      entitymanager.close();
//      this.isReset=false;
//     }
//     
//    
//}
// 
// 
// 
// public  void  timgiaodich(){
//     // String abc="123"; 
//    giaodichchuagiaoct = new VwDshosoChuagiaophieuWeb();
//     EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
//     EntityManager entitymanager = emfactory.createEntityManager();
//     Query query = null;
//     makhachhangtk="00001";
//     
//       switch (this.loaitk){
//                 case "00001" : 
//                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findBySobn");
//                     Long sob = Long.parseLong(makhachhangtk);
//                     query.setParameter("sobn", sob);
//                     break;
//                 case "00002" : 
//                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findByMaNguoinhan");
//                     query.setParameter("sobn", "");
//                     break;    
//                 case "00003" : 
//                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findByIdDoitac");
//                     query.setParameter("sobn", "");
//                     break;  
//                 case "00004" : 
//                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findByIdLoaitienchitra");
//                     query.setParameter("sobn", "");
//                     break;  
//                       } 
//    
//    
//     //  dsgd=query.getResultList();
//    
//     try {
//         dsgdchuagiao = query.getResultList();
//     } catch (Exception e) {
//     }
//           
//   
//    }  
 
 
 
 
// Phan danh cho giao phieu
 
  public void showdatagdsmoneygram(String dk){
 
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
     ApiFun fun= new  ApiFun();
     dsdshosomg=new ArrayList<>();
     //dsgdchuagiaochinhanh=new ArrayList<>();
     dsdshosomg=fun.dshsDshosoMg(chinhanh,dk);
 
 }
 // Loc dữ liệu .
 public void showdatafilter(String dk){
     // Nhan lai gia tri . 
    cgpsumwebsfilter=new ArrayList<>();
    
    
    // Loc theo dieu kien.
      if(dk.equalsIgnoreCase("ALL"))
     {
        cgpsumwebsfilter=cgpsumwebs;
     }
     else if (dk.contains("D1")){
         // Phieu moi . 
          List<VwDshosoCgpSumWeb> cgpSumWeb=cgpsumwebs;
          for (int i = 0; i < cgpSumWeb.size(); i++) 
 
          {
            VwDshosoCgpSumWeb lgp=new VwDshosoCgpSumWeb();
            lgp=cgpSumWeb.get(i);
            if(lgp.getIdLoaigiaophieu().equalsIgnoreCase("D1"))
            {
                 cgpsumwebsfilter.add(lgp);
            }
                 
          }
        
     }
     else if(dk.equalsIgnoreCase("D2"))
     {
         List<VwDshosoCgpSumWeb> cgpSumWeb=cgpsumwebs;
          for (int i = 0; i < cgpSumWeb.size(); i++) 
          {
            VwDshosoCgpSumWeb lgp=new VwDshosoCgpSumWeb();
            lgp=cgpSumWeb.get(i);
            if(lgp.getIdLoaigiaophieu().equalsIgnoreCase("D2"))
            {    if(lgp.getNvhis().equalsIgnoreCase("NOVALUE")){
                  cgpsumwebsfilter.add(lgp);
            }
                 
            }  
        
                 
          }
     
     }
     else if(dk.equalsIgnoreCase("D3")){
         List<VwDshosoCgpSumWeb> cgpSumWeb=cgpsumwebs;
          for (int i = 0; i < cgpSumWeb.size(); i++) 
          {
            VwDshosoCgpSumWeb lgp=new VwDshosoCgpSumWeb();
            lgp=cgpSumWeb.get(i);
            if(lgp.getIdLoaigiaophieu().equalsIgnoreCase("D2"))
            {    if(!lgp.getNvhis().equalsIgnoreCase("NOVALUE")){
                  cgpsumwebsfilter.add(lgp);
            }
                 
            }  
        
                 
          }
     }
     else {
         List<VwDshosoCgpSumWeb> cgpSumWeb=cgpsumwebs;
          for (int i = 0; i < cgpSumWeb.size(); i++) 
          {
            VwDshosoCgpSumWeb lgp=new VwDshosoCgpSumWeb();
            lgp=cgpSumWeb.get(i);
            if(lgp.getShsmg().intValue()>0)
            {   
                  cgpsumwebsfilter.add(lgp);
 
            }  
        
                 
          }
     }
 
     
     
 }
// Hien danh sách hồ sơ tổng .
 public void showdatagiaophieumaster(){
 
     
 }
// Hien chi tiet ho so can giao
 public String showdatagiaophieudetail(String dk,String idcity,String iddistrict){
     
     return "quanlygiaophieu" + "?faces-redirect=true";    
     
  
 }
    

 // Hoàn trả biên nhận  . 
  
  /* Hiện thông tin các hồ sơ hoàn trả */
  
   public void showdatagdagpall(){
     
     
 
}
   // Ds ho so chi tiet can nhan
    public String showdatahoanphieudetail(String dk,String idcity,String iddistrict,String loaitkiem,String chuoidoitac){
      
     return "quanlyhoanphieu" + "?faces-redirect=true";    
     
  
 }
    
    // Phuc hoi tung bien nhan.
    
       public  String  capnhathoanmothoso(VwDshosoDagiaophieuWeb hosohoanphieu)  {
       
      
        return null;
       
      
       
        
        
    }   
    
   
   
   
   

    public List<VwDshosoDgpSumWeb> getDagiaosumwebs() {
        return dagiaosumwebs;
    }

    public void setDagiaosumwebs(List<VwDshosoDgpSumWeb> dagiaosumwebs) {
        this.dagiaosumwebs = dagiaosumwebs;
    }

    public List<VwDshosoDgpSumWeb> getDagiaosumwebsfilter() {
        return dagiaosumwebsfilter;
    }

// Get/Set du lieu
    public void setDagiaosumwebsfilter(List<VwDshosoDgpSumWeb> dagiaosumwebsfilter) {
        this.dagiaosumwebsfilter = dagiaosumwebsfilter;
    }

    public VwDshosoDagiaophieuNv getGddagiaonv() {
        return gddagiaonv;
    }

    public void setGddagiaonv(VwDshosoDagiaophieuNv gddagiaonv) {
        this.gddagiaonv = gddagiaonv;
    }
 
 
 

    public List<VwDshosoDagiaophieuNv> getDsgddagiaonv() {
        return dsgddagiaonv;
    }

    public void setDsgddagiaonv(List<VwDshosoDagiaophieuNv> dsgddagiaonv) {
        this.dsgddagiaonv = dsgddagiaonv;
    }

    public List<VwDshosoDagiaophieuWeb> getDsgddagiaochinhanh() {
        return dsgddagiaochinhanh;
    }

    public void setDsgddagiaochinhanh(List<VwDshosoDagiaophieuWeb> dsgddagiaochinhanh) {
        this.dsgddagiaochinhanh = dsgddagiaochinhanh;
    }

    public List<VwDshosoDagiaophieuWeb> getDsgddagiaofilter() {
        return dsgddagiaofilter;
    }

    public void setDsgddagiaofilter(List<VwDshosoDagiaophieuWeb> dsgddagiaofilter) {
        this.dsgddagiaofilter = dsgddagiaofilter;
    }
    
    
 
 

    public List<VwDshosoDagiaophieuWeb> getDsgddagiao() {
        return dsgddagiao;
    }

    public void setDsgddagiao(List<VwDshosoDagiaophieuWeb> dsgddagiao) {
        this.dsgddagiao = dsgddagiao;
    }
 
 

    public String getIddoitactk() {
        return iddoitactk;
    }

    public void setIddoitactk(String iddoitactk) {
        this.iddoitactk = iddoitactk;
    }

 
 
    public List<VwDoitacGpWeb> getDsdoitacGp() {
        return dsdoitacGp;
    }

    public void setDsdoitacGp(List<VwDoitacGpWeb> dsdoitacGp) {
        this.dsdoitacGp = dsdoitacGp;
    }

 
 
    public String getMakhachhangtk() {
        return makhachhangtk;
    }

    public void setMakhachhangtk(String makhachhangtk) {
        this.makhachhangtk = makhachhangtk;
    }

    public String getSobntk() {
        return sobntk;
    }

    public void setSobntk(String sobntk) {
        this.sobntk = sobntk;
    }

    public String getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(String loaitk) {
        this.loaitk = loaitk;
    }

    public String getLoainvact() {
        return loainvact;
    }

    public void setLoainvact(String loainvact) {
        this.loainvact = loainvact;
    }

 

    public VwDshosoChuagiaophieuWeb getGiaodichchuagiaoct() {
        return giaodichchuagiaoct;
    }

    public void setGiaodichchuagiaoct(VwDshosoChuagiaophieuWeb giaodichchuagiaoct) {
        this.giaodichchuagiaoct = giaodichchuagiaoct;
    }

    public List<DmNhanvienList> getDsnhnavienctwebs() {
        return dsnhnavienctwebs;
    }

    public void setDsnhnavienctwebs(List<DmNhanvienList> dsnhnavienctwebs) {
        this.dsnhnavienctwebs = dsnhnavienctwebs;
    }

     

    public VwDsNhnavienctWeb getDswhnavienctweb() {
        return dswhnavienctweb;
    }

    public void setDswhnavienctweb(VwDsNhnavienctWeb dswhnavienctweb) {
        this.dswhnavienctweb = dswhnavienctweb;
    }

    

   
    public KieuhoiList getKieuhoiList() {
        return kieuhoiList;
    }

    public void setKieuhoiList(KieuhoiList kieuhoiList) {
        this.kieuhoiList = kieuhoiList;
    }

    public List<DshosoMg> getDsdshosomg() {
        return dsdshosomg;
    }

    public void setDsdshosomg(List<DshosoMg> dsdshosomg) {
        this.dsdshosomg = dsdshosomg;
    }

 
    
    
    public List<VwDshosoChuagiaophieuWeb> getDsgdchuagiao() {
        return dsgdchuagiao;
    }

    public void setDsgdchuagiao(List<VwDshosoChuagiaophieuWeb> dsgdchuagiao) {
        this.dsgdchuagiao = dsgdchuagiao;
    }

    public List<DmQuanhuyenList> getDsquanhuyen() {
        return dsquanhuyen;
    }

    public void setDsquanhuyen(List<DmQuanhuyenList> dsquanhuyen) {
        this.dsquanhuyen = dsquanhuyen;
    }

   

    

    public List<DmCitylist> getDscity() {
        return dscity;
    }

    public void setDscity(List<DmCitylist> dscity) {
        this.dscity = dscity;
    }

    

    public List<GiaytoList> getDsgiayto() {
        return dsgiayto;
    }

    public void setDsgiayto(List<GiaytoList> dsgiayto) {
        this.dsgiayto = dsgiayto;
    }

  

    public List<VwDshosoCgpSumWeb> getCgpsumwebs() {
        return cgpsumwebs;
    }

    public void setCgpsumwebs(List<VwDshosoCgpSumWeb> cgpsumwebs) {
        this.cgpsumwebs = cgpsumwebs;
    }

    public List<VwDshosoChuagiaophieuWeb> getDsgdchuagiaofilter() {
        return dsgdchuagiaofilter;
    }

    public void setDsgdchuagiaofilter(List<VwDshosoChuagiaophieuWeb> dsgdchuagiaofilter) {
        this.dsgdchuagiaofilter = dsgdchuagiaofilter;
    }

    public List<VwDshosoCgpSumWeb> getCgpsumwebsfilter() {
        return cgpsumwebsfilter;
    }

    public void setCgpsumwebsfilter(List<VwDshosoCgpSumWeb> cgpsumwebsfilter) {
        this.cgpsumwebsfilter = cgpsumwebsfilter;
    }

    public List<DmNhanvienList> getDsnhnavienfilter() {
        return dsnhnavienfilter;
    }

    public void setDsnhnavienfilter(List<DmNhanvienList> dsnhnavienfilter) {
        this.dsnhnavienfilter = dsnhnavienfilter;
    }

    public List<VwDshosoDagiaophieuWeb> getDsdagiaochuagiao() {
        return dsdagiaochuagiao;
    }

    public void setDsdagiaochuagiao(List<VwDshosoDagiaophieuWeb> dsdagiaochuagiao) {
        this.dsdagiaochuagiao = dsdagiaochuagiao;
    }
    
     

    
    
    public ChitragphieuManagedBean() {
    }
    
    
    
}
