 
package DatabaseDao;

import ConnectBean.ConnectionProvider;
import LocalModel.Vwqlqhosoctuth2018;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 
public class Vwqlqhosoctuth2018Dao {
    
    String sql = "select * from KH.VW_QLQ_HOSO_CTU_TH_2018 ";
    private List<Vwqlqhosoctuth2018> dsketqua = new ArrayList<>();
    
     public List<Vwqlqhosoctuth2018> findOneParaString(String prmname1, String prmvalue1) throws SQLException {
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

            Vwqlqhosoctuth2018 dc = new Vwqlqhosoctuth2018();
            dc.setId_chinhanh(rs.getString("ID_CHINHANH"));
            dc.setIdcode(rs.getString("IDCODE"));
            dc.setTen_nhanvien(rs.getString("TEN_NHANVIEN"));
            dc.setId_nv_chitra(rs.getString("ID_NV_CHITRA"));
            dc.setId_doitac(rs.getString("ID_DOITAC"));
            dc.setShs(rs.getBigDecimal("SHS"));
          
            dsketqua.add(dc);

        }

        pstm.close();

        return dsketqua;
    }
     
     public List<Vwqlqhosoctuth2018> findTwoParaString(String prmname1, String prmvalue1,String prmname2, String prmvalue2) throws SQLException {
    
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

            Vwqlqhosoctuth2018 dc = new Vwqlqhosoctuth2018();
            dc.setId_chinhanh(rs.getString("ID_CHINHANH"));
            dc.setIdcode(rs.getString("IDCODE"));
            dc.setTen_nhanvien(rs.getString("TEN_NHANVIEN"));
            dc.setId_nv_chitra(rs.getString("ID_NV_CHITRA"));
            dc.setId_doitac(rs.getString("ID_DOITAC"));
            dc.setShs(rs.getBigDecimal("SHS"));
          
            dsketqua.add(dc);

        }

        pstm.close();

        return dsketqua;
    }
     
      public String funcInsertDottups(Vwqlqhosoctuth2018 data, String iddoitac,String idnv,String chinhanh)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_INSERT_DOTTUPS(?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, iddoitac);
            stm.setString(3, idnv);
            stm.setString(4, chinhanh);
            stm.setString(5, data.getId_nv_chitra());
            
 
 
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
