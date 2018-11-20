 
package DatabaseDao;

import ConnectBean.ConnectionProvider;
import LocalModel.Doitactupslist;
import Model.VwHoibaoListGroup;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class DoitactupslistDao {
    
    
    private String sql = " SELECT * FROM   KH.VW_DOITAC_TUPS_LIST_2018 ";
    private List<Doitactupslist> listitemt = new ArrayList<>();
    private static int i;

    public List<Doitactupslist> getAllData()  {
 
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
       List<Doitactupslist> ds= new ArrayList<>();
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {     
                
                Doitactupslist d = new Doitactupslist();
                d.setIdcode(rs.getString("ID_CODE"));
                d.setTendoitac(rs.getString("DESCRIPTION"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setTimefrom(rs.getBigDecimal("TIMEFROM"));
                d.setTimeto(rs.getBigDecimal("TIMETO"));
                d.setStt(rs.getInt("STT"));
                d.setId_nv_duyet(rs.getString("ID_NV_DUYET"));
                d.setDuyet(rs.getString("DUYET"));
                d.setNgayduyet(rs.getDate("NGAYDUYET"));
                d.setDate_modified(rs.getDate("DATE_MODIFIED"));
                d.setMakerid(rs.getString("MAKERID"));
                ds.add(d);
            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return ds ;
    } 
    
    public List<Doitactupslist> getDataDoitac(String doitac)  {
 
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        List<Doitactupslist> ds= new ArrayList<>();
        sql += " WHERE  ID_DOITAC='"+doitac+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {     
                
                Doitactupslist d = new Doitactupslist();
                d.setIdcode(rs.getString("ID_CODE"));
                d.setTendoitac(rs.getString("DESCRIPTION"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setTimefrom(rs.getBigDecimal("TIMEFROM"));
                d.setTimeto(rs.getBigDecimal("TIMETO"));
                d.setStt(rs.getInt("STT"));
                d.setId_nv_duyet(rs.getString("ID_NV_DUYET"));
                d.setDuyet(rs.getString("DUYET"));
                d.setNgayduyet(rs.getDate("NGAYDUYET"));
                d.setDate_modified(rs.getDate("DATE_MODIFIED"));
                d.setMakerid(rs.getString("MAKERID"));
                ds.add(d);
            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return ds ;
    } 
    
 
   
    public String funcInsertDoitactups( Doitactupslist data)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_INSERT_DOITACTUPS(?,?,?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(5, oracle.jdbc.OracleTypes.INTEGER);
            stm.registerOutParameter(6, oracle.jdbc.OracleTypes.INTEGER);
            stm.registerOutParameter(7, oracle.jdbc.OracleTypes.INTEGER);
            
            stm.setString(2, data.getIdcode());
            stm.setString(3, data.getIddoitac());
            stm.setString(4, data.getMakerid());
            stm.setInt(5,   data.getTimefrom().intValue());
            stm.setInt(6, data.getTimeto().intValue());
            stm.setInt(7, data.getStt().intValue());
 
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }
    
     public String funcUpdateDoitactups( Doitactupslist data)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_UPDATE_DOITACTUPS(?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.INTEGER);
            stm.registerOutParameter(5, oracle.jdbc.OracleTypes.INTEGER);

            
            stm.setString(2, data.getIdcode());
            stm.setString(3, data.getIddoitac());
            stm.setInt(4,   data.getTimefrom().intValue());
            stm.setInt(5, data.getTimeto().intValue());
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }
     
     public String funcDeleteDoitactups( Doitactupslist data)  throws SQLException {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        String kq = null;
       
        String fnCall = "{?=call KH.PKS_QLQ_2018.FUNC_DELETE_DOITACTUPS(?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
        
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(3, oracle.jdbc.OracleTypes.VARCHAR);
             

            
            stm.setString(2, data.getIdcode());
            stm.setString(3, data.getIddoitac());
 
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }
}
