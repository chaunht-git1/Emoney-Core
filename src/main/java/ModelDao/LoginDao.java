package ModelDao;

 
import SystemFunc.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import javax.servlet.http.HttpSession;
import ConnectBean.UserDao;
import LocalModel.UserModel;
import ConnectBean.ConnectionProvider;
import Exten.CookieHelper;
import java.util.Base64;
import javax.servlet.http.Cookie;
 

public class LoginDao {
 

    public static boolean validate(String user, String password) {
        boolean status = false;
        String ketqua;
        String user_id;
        String pass;
        UserModel useMD = new UserModel();
        UserDao userDA = new UserDao();
        HttpSession session = SessionBean.getSession();
        String sessionid = session.getId();
        user_id = user;
        pass = password;

        try {

            // Kiem tra trang thai reload hay moi khoi tao  .
           // Object kt = session.getAttribute("statusdatabase");
           Connection con = null;
           ConnectionProvider.reconnectdbastatic();
         //  Connection con = null;
            con = ConnectionProvider.getCon();
            
          
 
            String fnCall = "{call ? :=  KH.SMPKS.fn_sign_on_java_2018(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
             
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.setString(2, user_id.toUpperCase());
            stm.setString(3, pass.toUpperCase());
            stm.setString(4, sessionid);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            
            //Lay bo gia tri tra ve 
            
            String[] kqlist=ketqua.split("@");
            // stm.close();
            if (kqlist[0].equalsIgnoreCase("T")) {
                CookieHelper cookieHelper = new CookieHelper();
                // cookieHelper.setCookie(username, "", 0);
                Cookie cookie = cookieHelper.getCookie(user+"-infor");
                if (cookie == null) {  
                    String encoded = Base64.getEncoder().encodeToString(ketqua.getBytes());
                    cookieHelper.setCookie(user + "-" + "info", encoded, 20 * 60);
                }

                return true;

            } else {
                MessageGlobal.showmessageError(ketqua);
                return false;
            }
            
       
          

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(ex.getMessage());
            return false;

        }

    }

    public static String[] getinfouser(String user ) {
        boolean status = false;
        String ketquas;
        String[] ketqua;
      

        try {

            // Kiem tra trang thai reload hay moi khoi tao  .
 
           Connection con = null;
           ConnectionProvider.reconnectdbastatic();
         //  Connection con = null;
            con = ConnectionProvider.getCon();
 
            String fnCall = "{call ? :=  KH.SMPKS.fn_get_infor_user_2018(?)}";
            CallableStatement stm = con.prepareCall(fnCall);
             
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            
            stm.setString(2, user);
            stm.execute();
            ketquas = (String) stm.getString(1);
            stm.close();
            ketqua=ketquas.split("@");
            return ketqua;
              

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(ex.getMessage());
            return null;

        }

    }
    
}
