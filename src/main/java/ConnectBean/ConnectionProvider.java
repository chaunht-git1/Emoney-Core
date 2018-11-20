 
package ConnectBean;
import static ConnectBean.Provider.CONNECTION_URL;
import static ConnectBean.Provider.DRIVER;
import static ConnectBean.Provider.PASSWORD;
import static ConnectBean.Provider.USERNAME;
import java.sql.*;
 
 
public class ConnectionProvider {
   
private static Connection con=null;

public static Connection getCon(){
    
	return con;
}

 
 

public static boolean isDbConnected(String sessionid) {
       
    try {
           
            String fnCall = "{call ? :=  KH.SMPKS.CHECK_SESSION_WEB(?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, sessionid);      
            stm.execute();
            String ketqua = (String) stm.getString(1);
            stm.close();
         
            if (ketqua.equalsIgnoreCase("T")){
                return true; 
            }
            else{
                
                return false; 
            }
          
    } catch (SQLException | NullPointerException e) {
           
          
           return false;
        
    }

}

 public static void reconnectdbastatic (){
    
try{

Class.forName(DRIVER);

 
   con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);

}catch(ClassNotFoundException | SQLException e){}
  
}
 
 
 
}
