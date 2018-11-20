package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwKiemtratrungmaImport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VwKiemtratrungmaImportDao {

    private String sql = " SELECT * FROM KH.VW_KIEMTRATRUNGMA_IMPORT ";
    private List<VwKiemtratrungmaImport> vwKiemtratrungmaImports = new ArrayList<>();

    public List<VwKiemtratrungmaImport> timtheodieukien(String sophieu, String iddoitac) {
        Connection con = ConnectionProvider.getCon();

        sql += " WHERE SOPHIEU = '" + sophieu + "' AND ID_DOITAC = '" + iddoitac + "' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                VwKiemtratrungmaImport d = new VwKiemtratrungmaImport();
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setIddoitac(rs.getString("ID_DOITAC"));

                vwKiemtratrungmaImports.add(d);
            }

            rs.close();
            ps.close();

            return vwKiemtratrungmaImports;
        } catch (Exception e) {
            vwKiemtratrungmaImports = new ArrayList<>();
            return vwKiemtratrungmaImports;
        }
    }
}
