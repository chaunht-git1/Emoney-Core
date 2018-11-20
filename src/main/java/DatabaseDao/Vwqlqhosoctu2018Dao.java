 
package DatabaseDao;

import ConnectBean.ConnectionProvider;
import LocalModel.Doitactupslist;
import LocalModel.Vwqlqhosoctu2018;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sun.net.smtp.SmtpClient;

 
public class Vwqlqhosoctu2018Dao {
    
    String sql = "select * from KH.VW_QLQ_HOSO_CTU_2018 ";
    private List<Vwqlqhosoctu2018> dsketqua = new ArrayList<>();
    
     public List<Vwqlqhosoctu2018> findDTUngOneParaString(String prmname1, String prmvalue1) throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        
        String  chuoisql = "select * FROM  VW_QLQ_HOSO_DTU_2018 ";
        // Tạo một câu SQL có 1 tham số (?)
        chuoisql= chuoisql + "Where " + prmname1 + "=?";

        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(chuoisql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        pstm.setString(1, prmvalue1);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {

            Vwqlqhosoctu2018 dc = new Vwqlqhosoctu2018();
            dc.setIdchinhanh(rs.getString("ID_CHINHANH"));
            dc.setSophieu(rs.getString("SOPHIEU"));
            dc.setStt(rs.getInt("STT"));
            dc.setIddoitac(rs.getString("ID_DOITAC"));
            dc.setTendoitac(rs.getString("TENDOITAC"));
            dc.setManguoinhan(rs.getString("MA_NGUOINHAN"));
            dc.setSobn(rs.getBigDecimal("SOBN"));
            dc.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
            dc.setId_loaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
            dsketqua.add(dc);

        }

        pstm.close();

        return dsketqua;
    }
     
    
     public List<Vwqlqhosoctu2018> findOneParaString(String prmname1, String prmvalue1) throws SQLException {
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

            Vwqlqhosoctu2018 dc = new Vwqlqhosoctu2018();
            dc.setIdchinhanh(rs.getString("ID_CHINHANH"));
            dc.setSophieu(rs.getString("SOPHIEU"));
            dc.setStt(rs.getInt("STT"));
            dc.setIddoitac(rs.getString("ID_DOITAC"));
            dc.setTendoitac(rs.getString("TENDOITAC"));
            dc.setManguoinhan(rs.getString("MA_NGUOINHAN"));
            dc.setSobn(rs.getBigDecimal("SOBN"));
            dc.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
            dc.setId_loaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
            dsketqua.add(dc);

        }

        pstm.close();

        return dsketqua;
    }
     
      public String funcInsertDottupsFromhs( Vwqlqhosoctu2018 data,String userid)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
        
        
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_INSERT_DOTTUPS_FROMHS(?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, data.getSobn().toString());
            stm.setString(3, userid);
            stm.setString(4, data.getIdchinhanh());
            stm.setString(5, userid);
 
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }
      
      public String funcKthosotu( String data)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_KTHOSOTU(?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
  
            
            stm.setString(2, data);
         
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }
}
