 
package DatabaseDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwQlqHspsDetail2018;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class VwQlqHspsDetail2018Dao {
    
    String sql = "select * from KH.VW_QLQ_HSPS_DETAIL_2018 ";
    private List<VwQlqHspsDetail2018> dsketqua = new ArrayList<>();
    
     public List<VwQlqHspsDetail2018> findOneParaString(String prmname1, String prmvalue1)  {
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
                
                VwQlqHspsDetail2018 qlqqlydottupsds2018= new VwQlqHspsDetail2018();
                qlqqlydottupsds2018.setIdcode(rs.getString("IDCODE"));
                qlqqlydottupsds2018.setDottups(rs.getString("DOTTUPS"));
                qlqqlydottupsds2018.setIdChiNhanh(rs.getString("ID_CHINHANH"));
                qlqqlydottupsds2018.setSobn(rs.getLong("SOBN"));
                qlqqlydottupsds2018.setHoten(rs.getString("HOTEN"));
                qlqqlydottupsds2018.setMaNguoinhan(rs.getString("MA_NGUOINHAN"));
                qlqqlydottupsds2018.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
                qlqqlydottupsds2018.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
                qlqqlydottupsds2018.setDachitra(rs.getString("DACHITRA"));
                
                dsketqua.add(qlqqlydottupsds2018);
                
            }
            
            pstm.close();
            
            return dsketqua;
        } catch (SQLException ex) {
            Logger.getLogger(VwQlqHspsDetail2018Dao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public List<VwQlqHspsDetail2018> findTwoParaString(String prmname1, String prmvalue1,String prmname2, String prmvalue2) throws SQLException {
    
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

               VwQlqHspsDetail2018 qlqqlydottupsds2018= new VwQlqHspsDetail2018();
                qlqqlydottupsds2018.setIdcode(rs.getString("IDCODE"));
                qlqqlydottupsds2018.setDottups(rs.getString("DOTTUPS"));
                qlqqlydottupsds2018.setIdChiNhanh(rs.getString("ID_CHINHANH"));
                qlqqlydottupsds2018.setSobn(rs.getLong("SOBN"));
                qlqqlydottupsds2018.setHoten(rs.getString("HOTEN"));
                qlqqlydottupsds2018.setMaNguoinhan(rs.getString("MA_NGUOINHAN"));
                qlqqlydottupsds2018.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
                qlqqlydottupsds2018.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
                qlqqlydottupsds2018.setDachitra(rs.getString("DACHITRA"));
          dsketqua.add(qlqqlydottupsds2018);

        }

        pstm.close();

        return dsketqua;
    }
 
       
     public List<VwQlqHspsDetail2018> findThreeParaString(String prmname1, String prmvalue1,String prmname2, String prmvalue2,String prmname3, String prmvalue3) throws SQLException {
    
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

                VwQlqHspsDetail2018 qlqqlydottupsds2018= new VwQlqHspsDetail2018();
                qlqqlydottupsds2018.setIdcode(rs.getString("IDCODE"));
                qlqqlydottupsds2018.setDottups(rs.getString("DOTTUPS"));
                qlqqlydottupsds2018.setIdChiNhanh(rs.getString("ID_CHINHANH"));
                qlqqlydottupsds2018.setSobn(rs.getLong("SOBN"));
                qlqqlydottupsds2018.setHoten(rs.getString("HOTEN"));
                qlqqlydottupsds2018.setMaNguoinhan(rs.getString("MA_NGUOINHAN"));
                qlqqlydottupsds2018.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
                qlqqlydottupsds2018.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
                qlqqlydottupsds2018.setDachitra(rs.getString("DACHITRA"));
                dsketqua.add(qlqqlydottupsds2018);
       

        }

        pstm.close();

        return dsketqua;
    }
 
     
    
}
