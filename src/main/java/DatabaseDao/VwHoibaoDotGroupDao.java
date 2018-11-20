package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.Dschitietgiaodich;
import Model.VWSoduNhanvienListTemp;
import Model.VwHoibaoListGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class VwHoibaoDotGroupDao {

    private String sql = " SELECT * FROM  KH.VW_HOIBAO_LIST_GROUP ";
    private List<VwHoibaoListGroup> hoibaoListGroups = new ArrayList<>();
    private static int i;

    public List<VwHoibaoListGroup> getAllData(String charngay)  {

        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
 
        String chuoingay = null;
  
        sql += " WHERE CHAR_NGAY = '" + charngay + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                
                VwHoibaoListGroup d = new VwHoibaoListGroup();
                d.setIdcode(rs.getString("IDCODE"));
                d.setCharngay(rs.getString("CHAR_NGAY"));
                d.setDoitacname(rs.getString("ID_DOITAC"));
                d.setIddoitac(rs.getString("DOITAC_NAME"));
                d.setDothb(rs.getInt("DOT_HB"));
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
