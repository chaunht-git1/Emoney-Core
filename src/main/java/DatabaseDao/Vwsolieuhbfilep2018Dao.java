package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.VwHoiBaodxn2018;
import Model.VwHoibaoListGroup;
import Model.Vwsolieuhbfilep2018;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class Vwsolieuhbfilep2018Dao {

    private String sql = " SELECT * FROM  KH.VW_SOLIEUHB_FILEP_2018";
    private List<Vwsolieuhbfilep2018> vwsolieuhbfilep2018s = new ArrayList<>();
    private static int i;

    public List<Vwsolieuhbfilep2018> getAllData(String khoa)  {
 
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
 
        String charngay = null;
        String iddoitac=null;
        String dothb = null;
//        String[] chuoingay =null;
//        chuoingay=khoa.split("@");
//        charngay=chuoingay[0];
//        iddoitac=chuoingay[1];
//        dothb=chuoingay[2];
  
        sql += " WHERE  ID_DOITAC= '"+ khoa + "'" ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                
                Vwsolieuhbfilep2018 d = new Vwsolieuhbfilep2018();
                d.setSobn(rs.getString("SOBN"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setLoaitienchi(rs.getString("ID_LOAITIENCHITRA"));
                d.setSotien(rs.getBigDecimal("SOTIENGOI"));
                vwsolieuhbfilep2018s.add(d);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return vwsolieuhbfilep2018s ;
    }
 
}
