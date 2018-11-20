package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwSolieutongSauImport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VwSolieutongSauImportDao {

    private String sql = " SELECT * FROM  KH.VW_SOLIEUTONG_SAU_IMPORT ";
    private List<VwSolieutongSauImport> vwSolieutongSauImports = new ArrayList<>();

    public List<VwSolieutongSauImport> findOneParam(String thuoctinh, String giatri) {

        Connection con = ConnectionProvider.getCon();
        sql = sql + "Where " + thuoctinh + "=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, giatri);
            ResultSet rs = pstm.executeQuery();
            VwSolieutongSauImport dc = new VwSolieutongSauImport();
            while (rs.next()) {
                dc.setSophieu(rs.getString("SOPHIEU"));
                dc.setTongshs(rs.getInt("TONG_SHS"));
                dc.setShstn(rs.getInt("SHS_TN"));
                dc.setShstq(rs.getInt("SHS_TQ"));
                dc.setShsck(rs.getInt("SHS_CK"));
                dc.setShstm(rs.getInt("SHS_TM"));
                dc.setMaxvnd(rs.getBigDecimal("MAX_VND"));
                dc.setMaxngoaite(rs.getBigDecimal("MAX_NGOAITE"));

                this.vwSolieutongSauImports.add(dc);
            }
        } catch (Exception e) {
            vwSolieutongSauImports = null;
        }
        return vwSolieutongSauImports;
    }
}
