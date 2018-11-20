 
package Controler;

import ConnectBean.ConnectionProvider;
import static ConnectBean.Provider.REPORT_PATH_IN;
import SystemFunc.FunctionGlobal;
import SystemFunc.SessionBean;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Connection;
import javax.enterprise.context.SessionScoped;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
 
@Named(value = "reportManagedBean")
@SessionScoped
public class ReportManagedBean implements Serializable {

     
    public ReportManagedBean() {
    }
    
   public void inreport(){
           HttpServletResponse response = SessionBean.getResponse();
           
           try {
            FunctionGlobal  functionGlobal= new FunctionGlobal();
            ServletOutputStream out = response.getOutputStream();
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            JasperPrint print=JasperFillManager.fillReport(REPORT_PATH_IN+"RE_HB_OMNEX.jasper" , null, con);
            String filename = "testreport";
            functionGlobal.downloadfilereport(filename,print,out, response);
           } catch (Exception e) {
               String kh=e.getMessage();
          }
   }
    
    
}
