 
package DatabaseDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwQlqhspschuahoanung2018;
import LocalModel.VwQlqqlydottupsds2018;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class Vwqlqqlhspschuahoanung2018Dao {
    
    String sql = "select * from KH.VW_QLQ_HSPS_CHUAHOANUNG ";
    private List<VwQlqhspschuahoanung2018> dsketqua = new ArrayList<>();
    
     public List<VwQlqhspschuahoanung2018> findOneParaString(String prmname1, String prmvalue1)  {
        try {
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            
            // Tạo một câu SQL có 1 tham số (?)
            sql = sql + "Where " + prmname1 + "=?";
            
            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);
            
            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)
            pstm.setString(1, prmvalue1);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                VwQlqhspschuahoanung2018 qlqqlydottupsds2018= new VwQlqhspschuahoanung2018();
                qlqqlydottupsds2018.setIdcode(rs.getString("DOTTUPS"));
                qlqqlydottupsds2018.setId_nv_chitra(rs.getString("ID_NV_CHITRA"));
                qlqqlydottupsds2018.setTennhanvien(rs.getString("USER_NAME"));
                qlqqlydottupsds2018.setTongshs(rs.getBigDecimal("TONGSHS"));
                qlqqlydottupsds2018.setHston(rs.getBigDecimal("HSTON"));
                qlqqlydottupsds2018.setHsdachitra(rs.getBigDecimal("HSDACHITRA"));
                qlqqlydottupsds2018.setPhantchuahthanh(rs.getBigDecimal("PHANTRAMCHUAHT"));
                qlqqlydottupsds2018.setPhantramhoanthanh(rs.getBigDecimal("PHANTRAMDAHT"));
                qlqqlydottupsds2018.setLoaitu(rs.getString("ID_LOAITU"));
                qlqqlydottupsds2018.setTenloaitu(rs.getString("TEN_LOAITU"));
                dsketqua.add(qlqqlydottupsds2018);
                
            }
            
            pstm.close();
            
            return dsketqua;
        } catch (SQLException ex) {
            Logger.getLogger(Vwqlqqlhspschuahoanung2018Dao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public List<VwQlqhspschuahoanung2018> findTwoParaString(String prmname1, String prmvalue1,String prmname2, String prmvalue2) throws SQLException {
    
         ConnectionProvider.reconnectdbastatic();
         Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        sql = sql + "Where  " + prmname1 + "=?" +" AND "+prmname2+ "=?" ;

        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        pstm.setString(1, prmvalue1);
        pstm.setString(2, prmvalue2);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {

          VwQlqhspschuahoanung2018 qlqqlydottupsds2018= new VwQlqhspschuahoanung2018();
          qlqqlydottupsds2018.setIdcode(rs.getString("DOTTUPS"));
          qlqqlydottupsds2018.setId_nv_chitra(rs.getString("ID_NV_CHITRA"));
          qlqqlydottupsds2018.setTennhanvien(rs.getString("USER_NAME"));
          qlqqlydottupsds2018.setTongshs(rs.getBigDecimal("TONGSHS"));
          qlqqlydottupsds2018.setHston(rs.getBigDecimal("HSTON"));
          qlqqlydottupsds2018.setHsdachitra(rs.getBigDecimal("HSDACHITRA"));
          qlqqlydottupsds2018.setPhantchuahthanh(rs.getBigDecimal("PHANTRAMCHUAHT"));
          qlqqlydottupsds2018.setPhantramhoanthanh(rs.getBigDecimal("PHANTRAMDAHT"));
          qlqqlydottupsds2018.setLoaitu(rs.getString("ID_LOAITU"));
          qlqqlydottupsds2018.setTenloaitu(rs.getString("TEN_LOAITU"));
          dsketqua.add(qlqqlydottupsds2018);

        }

        pstm.close();

        return dsketqua;
    }
 
       
     public List<VwQlqhspschuahoanung2018> findThreeParaString(String prmname1, String prmvalue1,String prmname2, String prmvalue2,String prmname3, String prmvalue3) throws SQLException {
    
         ConnectionProvider.reconnectdbastatic();
         Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        sql = sql + "Where  " + prmname1 + "=?" +" AND "+prmname2+ "=?"  +" AND "+prmname3+ "=?";

        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        pstm.setString(1, prmvalue1);
        pstm.setString(2, prmvalue2);
        pstm.setString(3, prmvalue3);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {

          VwQlqhspschuahoanung2018 qlqqlydottupsds2018= new VwQlqhspschuahoanung2018();
          qlqqlydottupsds2018.setIdcode(rs.getString("DOTTUPS"));
          qlqqlydottupsds2018.setId_nv_chitra(rs.getString("ID_NV_CHITRA"));
          qlqqlydottupsds2018.setTennhanvien(rs.getString("USER_NAME"));
          qlqqlydottupsds2018.setTongshs(rs.getBigDecimal("TONGSHS"));
          qlqqlydottupsds2018.setHston(rs.getBigDecimal("HSTON"));
          qlqqlydottupsds2018.setHsdachitra(rs.getBigDecimal("HSDACHITRA"));
          qlqqlydottupsds2018.setPhantchuahthanh(rs.getBigDecimal("PHANTRAMCHUAHT"));
          qlqqlydottupsds2018.setPhantramhoanthanh(rs.getBigDecimal("PHANTRAMDAHT"));
          qlqqlydottupsds2018.setLoaitu(rs.getString("ID_LOAITU"));
          qlqqlydottupsds2018.setTenloaitu(rs.getString("TEN_LOAITU"));
          dsketqua.add(qlqqlydottupsds2018);

        }

        pstm.close();

        return dsketqua;
    }
 
     
     public String funcDuyetDottups( String idcode,String idnv)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_DUYET_DOTPS(?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, idcode);
            stm.setString(3, idnv);
 
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    } 
     
    public String funcHoanungDottups( String idcode,String idnv)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_HOANUNG_DOTPS(?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, idcode);
            stm.setString(3, idnv);
 
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    } 
 
    public String funcRemoveDottups( String  iddot,String userid,Number loaiph)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_PHUCHOI_DOTPS(?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.NUMBER);
  
            
            stm.setString(2, iddot);
            stm.setString(3, userid);
            stm.setInt(4, loaiph.intValue());
         
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }     
      
}
