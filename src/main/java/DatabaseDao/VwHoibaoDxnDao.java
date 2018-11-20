package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.VwHoiBaodxn2018;
import Model.VwHoibaoListGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class VwHoibaoDxnDao {

    private String sql = " SELECT * FROM  KH.VW_HOIBAO_DXN_2018";
    private List<VwHoiBaodxn2018> hoiBaodxn2018s = new ArrayList<>();
    private static int i;

    public List<VwHoiBaodxn2018> getAllData(String khoa)  {
 
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
 
        String charngay = null;
        String iddoitac=null;
        String dothb = null;
        String[] chuoingay =null;
        chuoingay=khoa.split("@");
        charngay=chuoingay[0];
        iddoitac=chuoingay[1];
        dothb=chuoingay[2];
  
        sql += " WHERE CHAR_NGAY = '" + charngay + "'" + " AND ID_DOITAC= '"+ iddoitac + "'" + " AND DOT_HB= '"+ dothb + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                
                VwHoiBaodxn2018 d = new VwHoiBaodxn2018();
                d.setOrdernumber(rs.getString("ORDER_NUMBER"));
                d.setSender(rs.getString("SENDER"));
                d.setCmnd(rs.getString("CMND"));
                d.setAmount(rs.getBigDecimal("AMOUNT"));
                d.setAmountinvnd(rs.getBigDecimal("AMOUNT_IN_VND"));
                hoiBaodxn2018s.add(d);

            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
             return null;
        }

      return hoiBaodxn2018s ;
    }
 
}
