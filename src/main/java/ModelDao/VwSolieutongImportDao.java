package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwSolieutongImport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VwSolieutongImportDao {

    private String sql = " SELECT * FROM  KH.VW_SOLIEUTONG_IMPORT ";
    private List<VwSolieutongImport> vwSolieutongImports = new ArrayList<>();

    public List<VwSolieutongImport> findOneParam(String thuoctinh, String giatri) {

        Connection con = ConnectionProvider.getCon();
        sql = sql + "Where " + thuoctinh + "=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, giatri);
            ResultSet rs = pstm.executeQuery();
            VwSolieutongImport dc = new VwSolieutongImport();
            while (rs.next()) {
                dc.setSophieu(rs.getString("SOPHIEU"));
                dc.setTongshs(rs.getInt("TONG_SHS"));
                dc.setShstn(rs.getInt("SHS_TN"));
                dc.setShstq(rs.getInt("SHS_TQ"));
                dc.setShsck(rs.getInt("SHS_CK"));
                dc.setShstm(rs.getInt("SHS_TM"));
                dc.setMaxvnd(rs.getBigDecimal("MAX_VND"));
                dc.setMaxngoaite(rs.getBigDecimal("MAX_NGOAITE"));

                this.vwSolieutongImports.add(dc);
            }
        } catch (Exception e) {
            vwSolieutongImports = null;
        }
        return vwSolieutongImports;
    }
}
