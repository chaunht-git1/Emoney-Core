package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.Dschitietgiaodich;
import Model.VWSoduNhanvienListTemp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class VwSoduNhanvienListTempDao {

    private String sql = " SELECT * FROM KH.VW_SODU_NHANVIEN_LIST_TEMP ";
    private List<VWSoduNhanvienListTemp> vWSoduNhanvienListTemp = new ArrayList<>();
    private static int i;

    public List<VWSoduNhanvienListTemp> getAllData(String userid)  {

        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
 
        String chuoingay = null;
  
        sql += " WHERE USERID = '" + userid + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                
                VWSoduNhanvienListTemp d = new VWSoduNhanvienListTemp();
                d.setIdcode(rs.getString("IDCODE"));
                d.setIdChinhanh(rs.getString("ID_CHINHANH"));
                d.setDescription(rs.getString("DESCRIPTION"));
                d.setIdNhanvien(rs.getString("ID_NHANVIEN"));
                d.setUserName(rs.getString("USER_NAME"));
                d.setIdLoaicongno(rs.getString("ID_LOAICONGNO"));
                d.setSodudauky(rs.getBigDecimal("SODUDAUKY"));
                
                vWSoduNhanvienListTemp.add(d);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return vWSoduNhanvienListTemp ;
    }
 
}
