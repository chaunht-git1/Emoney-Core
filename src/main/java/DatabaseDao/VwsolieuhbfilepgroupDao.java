package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.VwHoiBaodxn2018;
import Model.VwHoibaoListGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class VwsolieuhbfilepgroupDao {

    private String sql = " SELECT * FROM  KH.VW_SOLIEUHB_FILEP_GROUP_2018";
    private List<VwHoibaoListGroup> hoibaoListGroups = new ArrayList<>();
    private static int i;

    public List<VwHoibaoListGroup> getAllData()  {
 
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
 
        String charngay = null;
        String iddoitac=null;
        String dothb = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                
                VwHoibaoListGroup d = new VwHoibaoListGroup();
                d.setIdcode(rs.getString("IDCODE"));
                d.setCharngay(rs.getString("CHARNGAY"));
                d.setChargio(rs.getString("CHARGIO"));
                d.setDoitacname(rs.getString("TENDOITAC"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setShs(rs.getInt("SHS"));
                hoibaoListGroups.add(d);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return hoibaoListGroups ;
    }
 
}
