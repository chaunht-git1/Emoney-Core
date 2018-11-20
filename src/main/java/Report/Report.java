 
package Report;

import ConnectBean.ConnectionProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

 
public class Report {
    
    public static void main(String[] args) throws FileNotFoundException, JRException {
        try {
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            JasperPrint print=JasperFillManager.fillReport("D:\\Damtc\\Source\\Web\\emoney-core\\src\\main\\webapp\\resources\\report\\reporttest.jasper" , null, con);
            String kq=null;
            JasperViewer.viewReport(print);
        } catch (Exception e) {
        }
       
        
    }
    
}
