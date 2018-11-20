package ConnectBean;

public interface Provider {
 
 
    
    String DBS_NAME = "kieuhoi";
    String URL_REPORT = "http://192.168.2.108/reports/rwservlet?config=";
    String SERVERNAME_REPORT = "rep_chitrakh_oracleas1";
    String REPORT_PATH = "/u05/kieuhoi/reports/VIE/";
    String REPORT_PATH_IN ="E:\\Output\\Report\\VIE\\";

    String DRIVER = "oracle.jdbc.driver.OracleDriver";
    String CONNECTION_URL = "jdbc:oracle:thin:@192.168.42.35:1521:khuat";
    String USERNAME = "kh";
    String PASSWORD = "2014nobody";
    String TENHETHONG = "Test";
    
//    String DRIVER = "oracle.jdbc.driver.OracleDriver";
//    String CONNECTION_URL = "jdbc:oracle:thin:@192.168.2.70:1521:kieuhoi";
//    String USERNAME = "kh";
//    String PASSWORD = "2014nobody";
//    String TENHETHONG = "Live";

    String DADABASEVW = "DatabaseView";
    String DADABASEKH = "DatabaseKieuhoi";
    
}
