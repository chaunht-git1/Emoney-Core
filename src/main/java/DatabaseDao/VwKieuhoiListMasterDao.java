package DatabaseDao;

import ConnectBean.ConnectionProvider;
import Model.VwKieuhoiListMaster;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VwKieuhoiListMasterDao {

    private String sql = " SELECT * FROM KH.VW_KIEUHOI_LIST_MASTER ";
    private List<VwKieuhoiListMaster> vwKieuhoiListMasters = new ArrayList<>();

    public List<VwKieuhoiListMaster> laydanhsachdoitac( String madoitac, Date ngaybiennhan) {
        Connection con = ConnectionProvider.getCon();

      
        sql += " WHERE   ID_DOITAC = '" + madoitac + "' AND NGAY_BIENNHAN = ?";
       
        try {
            CallableStatement ps = con.prepareCall(sql);
            ps.setQueryTimeout(1800);
 
                    ps.registerOutParameter(1, oracle.jdbc.OracleTypes.DATE);
                    ps.setDate(1, new java.sql.Date(ngaybiennhan.getTime()));
      
              

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VwKieuhoiListMaster d = new VwKieuhoiListMaster();
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                d.setAgent(rs.getString("AGENT"));
                d.setNgaybiennhan(rs.getDate("NGAY_BIENNHAN"));
                d.setDachitra(rs.getString("DACHITRA"));
                d.setShs(rs.getInt("SHS"));
                d.setIdcode(rs.getString("IDCODE"));
     
                vwKieuhoiListMasters.add(d);
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            vwKieuhoiListMasters = new ArrayList<>();
        }

        return vwKieuhoiListMasters;
    }
}
