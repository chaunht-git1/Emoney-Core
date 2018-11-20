package SystemFunc;

 
import ConnectBean.AlertCustom;
import ConnectBean.ConnectionProvider;
import LocalModel.DmXacminhToday;
import LocalModel.UserModel;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

public class FunctionGlobal {

    public static Number kiemtraketnoi(String dt, String lt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String bangchu(Number sotien, String lang, String loaitien) {

        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.cspke_misc.FN_NUM2WORDS(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, lang);
            stm.setFloat(3, sotien.floatValue());
            stm.setString(4, loaitien);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            return ketqua;

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return "";

        }

    }

    public static java.sql.Date getgiohethong() {

        try {
            java.sql.Date ketqua = null;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := PKS_SYSFUN.getsystoday }";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.DATE);
            stm.execute();
            ketqua=stm.getDate(1);
            stm.close();
            
            return ketqua;

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return null;

        }

    }
    
    public BufferedImage resizeImage(BufferedImage originalImage, int type) {
        BufferedImage resizedImage = new BufferedImage(800, 600, type);//set width and height of image
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, 800, 600, null);
        g.dispose();

        return resizedImage;
    }

    public java.sql.Date chuyenngayUtiltoSql(java.util.Date date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        return sqlDate;
    }

    public boolean insertBangTamBn(String idchinhanh, String sophieu, Number sott, String userid) {

        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "call KH.PKS_WEB_TRUCTUYEN.INSERT_TAMIN_BIENNHANTT(?,? ,?,?)";
            CallableStatement stm = con.prepareCall(fnCall);
//            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(3, Types.INTEGER);
            stm.setString(1, idchinhanh);
            stm.setString(2, sophieu);
            stm.setInt(3, sott.intValue());
            stm.setString(4, userid);
            stm.executeUpdate();
            // ketqua = (String) stm.getString(1) ; 
            stm.close();
            return true;

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return false;

        }

    }

    public static String disconectolduser(String user, String sessionid) {

        String ketqua = null;

        try {

            HttpSession session = SessionBean.getSession();
            UserModel mdusTest;
            mdusTest = (UserModel) session.getAttribute("g_userinfor");
            // Kiem tra trang thai reload hay moi khoi tao  .
            if (mdusTest == null) {
                // Disconect session cu 
                Connection con = ConnectionProvider.getCon();
                String fnCall = "{call ? := KH.SMPKS.DISCONECT_OLD_SESSION(?,?)}";
                CallableStatement stm = con.prepareCall(fnCall);
                stm.registerOutParameter(1, Types.VARCHAR);
                stm.registerOutParameter(2, Types.VARCHAR);
                stm.setString(2, user);
                stm.setString(3, sessionid);
                stm.execute();
                ketqua = (String) stm.getString(1);
                stm.close();
                return ketqua;
            } else {
                return "T";
            }

        } catch (SQLException ex) {

            return ketqua;

        }

    }

    public static boolean kiemtraketnoi(String sessionid) {

        boolean kq = ConnectionProvider.isDbConnected(sessionid);

        // Neu ban true thi binh thuong . False thi tro ve trang login .
        if (kq == false) {

            // HttpSession session = SessionBean.getSession();
            //   session.invalidate();
            return false;

        } else {

            return true;

        }

    }

    public static Number kttaikhoandoitac(String doitac, String loaitien, String sp) {

        try {
            Number ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.FUNCCHECKSOTIEN_DOITACTT(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.NUMERIC, 2);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.setString(2, doitac);
            stm.setString(3, loaitien);
            stm.setString(4, sp);
            stm.execute();
            ketqua = (Number) stm.getBigDecimal(1);
            stm.close();
            return ketqua;

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(ex.getMessage());
            return 0;

        }

    }

    public static Number hanmucnhap(String loaitien) {

        try {
            Number ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_WEB_TRUCTUYEN.FUNC_HANMUCNHAP(?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.NUMERIC, 2);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, loaitien);
            stm.execute();
            ketqua = (Number) stm.getBigDecimal(1);
            stm.close();
            return ketqua;

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(ex.getMessage());
            return 0;

        }

    }

    public static Boolean kiemtramasodoitac(String doitac, String maso) {

        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.CHECK_MA_NGUOINHAN_DOITAC(?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.setString(2, doitac);
            stm.setString(3, maso);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            if (ketqua.equalsIgnoreCase("T")) {

                return true;

            } else {

                return false;
            }

        } catch (SQLException ex) {

            SystemFunc.SystemBean.proMessError(ex.getMessage());
            return false;

        }

    }

    public static String laynhomnhanvienfromuser(String userid) {

        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_FIND_TTWEB.TIM_NHOMQUANLYFROMUSER(?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, userid);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            if (ketqua.equalsIgnoreCase("F")) {

                return ketqua;

            } else {

                return ketqua;
            }

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }

    }

    public static String giaophieunv(String userid, String nvchitra, String chinhanh, String sophieu, Number stt, String quanhuyen, String thanhpho, String diachi) {

        try {
            Number ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_QUANLY_CHINHAWEB.FUNC_UPDATE_BSTT(?,?,?,?,?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.NUMERIC, 0);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(6, Types.INTEGER);
            stm.setString(2, userid);
            stm.setString(3, nvchitra);
            stm.setString(4, chinhanh);
            stm.setString(5, sophieu);
            stm.setInt(6, stt.intValue());
            stm.setString(7, quanhuyen);
            stm.setString(8, thanhpho);
            stm.setString(9, diachi);
            stm.execute();
            ketqua = (Number) stm.getBigDecimal(1);
            stm.close();
            if (ketqua.intValue() == 1) {

                return "T";

            } else {

                return "F";
            }

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }

    }

    public static Boolean phanbohsnoname() {

        try {
            Number ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call KH.PKS_QUANLY_CHINHAWEB.DE_PHANBONHANVIENAUTO}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.execute();
            stm.close();

            return true;

        } catch (SQLException ex) {

            //  SystemBean.proMessError(ex.getMessage());
            return false;

        }

    }

    public static String capnhatdain(String chinhanh, String sophieu, Number stt) {

        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_QUANLY_CHINHAWEB.FUNC_UPDATE_DAINGOIDIEN(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.NUMERIC, 0);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.registerOutParameter(4, Types.INTEGER);
            stm.setString(2, chinhanh);
            stm.setString(3, sophieu);
            stm.setInt(4, stt.intValue());

            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();

            return ketqua;

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }

    }

    public String solieusosanhqldschuakhop(String userid, String maqlds, String sophieu) {
        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_PRINT_REPORT.FUN_SOLIEU_SSQLDS_CHUAKHOP(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            stm.setString(2, userid);
            stm.setString(3, maqlds);
            stm.setString(4, sophieu);

            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();

            return ketqua;

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }
    }

    public String kiemtrakhopsolieuchuaimport(String sophieu, String userid) {

        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_IMP_DOITAC_WEB.FUNC_KT_KHOPSOLIEU_CHUAIMPORT(?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            stm.setString(2, sophieu);
            stm.setString(3, userid);

            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();

            return ketqua;

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }
    }
    
    public String huydotimport(String sophieu){
        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_IMP_DOITAC_WEB.HUY_DOT_IMPORT(?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            stm.setString(2, sophieu);
            
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();

            return ketqua;

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }
    }
    
    public String solieusosanhqldssauimport(String userid, String maqlds, String sophieu) {
        try {
            String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_PRINT_REPORT.FUN_SOLIEU_SSQLDS_KHOPSOLIEU(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            stm.setString(2, userid);
            stm.setString(3, maqlds);
            stm.setString(4, sophieu);

            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();

            return ketqua;

        } catch (SQLException ex) {

            SystemBean.proMessError(ex.getMessage());
            return null;

        }
    }
    
    public InputStream laybarcodetuchuoi(String chuoi) {
 
        String url = "http://emoney-web.dongamoneytransfer.com.vn/PQcodeExplem/qrservlet?qrtext=" + chuoi;
        try {
            URL urlConn = new URL(url);
            InputStream inputStream = urlConn.openStream();
            return inputStream;
        } catch (Exception e) {
            return null;
        }
    }

    public   void downloadfilereport(String filename,JasperPrint print,ServletOutputStream out,   HttpServletResponse response  ) {
 
       
        try {
            response.setContentType("application/x-download");     
            response.setHeader("Content-Disposition", "attachment;filename=" + filename + ".pdf");
            JasperExportManager.exportReportToPdfStream(print, out);
            out.flush();
            out.close();
        } catch (Exception e) {
           
        }
    }  
 
    public   void showmessage(String filename){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
    }
    
      public   String getcurrentpagestitle(){
           FacesContext ctx = FacesContext.getCurrentInstance();
           String test = ctx.getViewRoot().getViewId();
            String[] chuoi=test.split("/");
            int dem=chuoi.length;
            String viewid=chuoi[dem-1];
            return viewid;
    }
    
    
    
     
    
}
