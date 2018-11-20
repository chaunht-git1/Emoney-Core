package SystemFunc;

import LocalModel.VwDshosoDagiaophieuWeb;
import java.util.ArrayList;
import java.util.List;

public class FunctionFilter {

 
  public List<VwDshosoDagiaophieuWeb> locdskhachhangdagiao(List<VwDshosoDagiaophieuWeb> dsachin,String dk,String iddoitac) {
 
    List<VwDshosoDagiaophieuWeb> dsout=new ArrayList<>();
    
      for (int i = 0; i < dsachin.size(); i++) {
          
          VwDshosoDagiaophieuWeb dagiaophieuWeb= new VwDshosoDagiaophieuWeb();
          dagiaophieuWeb=dsachin.get(i);
          String doitac=dagiaophieuWeb.getIdDoitac();
          if(dk.equalsIgnoreCase("order"))
          {
              String[] dsdoitac=iddoitac.split("@");
              String dt1=dsdoitac[0];
              String dt2=dsdoitac[1];
              String dt3=dsdoitac[2];
              
              if(!(doitac.equalsIgnoreCase(dt1)||doitac.equalsIgnoreCase(dt2)||doitac.equalsIgnoreCase(dt3)))
              {
                 dsout.add(dagiaophieuWeb);
              }
               
          }
          else{
              
               if( doitac.equalsIgnoreCase(iddoitac) )
              {
                  dsout.add(dagiaophieuWeb);
              }
              
              
          }
          
      }
      
      
    return dsout;
  }
    
}
