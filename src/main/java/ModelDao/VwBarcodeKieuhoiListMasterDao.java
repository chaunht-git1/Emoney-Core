package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwBarcodeKieuhoiListMaster;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VwBarcodeKieuhoiListMasterDao {

    private String sql = " SELECT * FROM KH.VW_BARCODE_KIEUHOI_LIST_MASTER ";
    private List<VwBarcodeKieuhoiListMaster> vwBarcodeKieuhoiListMasters = new ArrayList<>();

    public List<VwBarcodeKieuhoiListMaster> findAll() {
        Connection con = ConnectionProvider.getCon();
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwBarcodeKieuhoiListMaster d = new VwBarcodeKieuhoiListMaster();
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                d.setBarcodestatus(rs.getString("BARCODE_STATUS"));
                d.setBarcode(rs.getString("BARCODE"));
                d.setShs(rs.getInt("SHS"));
                
                if(rs.getString("BARCODE").equalsIgnoreCase("Y")){
                    d.setDisChitiet(true);
                }else{
                    d.setDisChitiet(false);
                }

                vwBarcodeKieuhoiListMasters.add(d);
            }
            s.close();
            rs.close();
            return vwBarcodeKieuhoiListMasters;
        } catch (Exception e) {
            vwBarcodeKieuhoiListMasters = new ArrayList<>();
            return vwBarcodeKieuhoiListMasters;
        }

    }
    
    public List<VwBarcodeKieuhoiListMaster> timtheothuoctinh(String thuoctinh, String giatri) {
        Connection con = ConnectionProvider.getCon();

        sql += " WHERE " + thuoctinh + " = '" + giatri + "' ";

        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwBarcodeKieuhoiListMaster d = new VwBarcodeKieuhoiListMaster();
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                d.setBarcodestatus(rs.getString("BARCODE_STATUS"));
                d.setBarcode(rs.getString("BARCODE"));
                d.setShs(rs.getInt("SHS"));

                if (rs.getString("BARCODE").equalsIgnoreCase("Y")) {
                    d.setDisChitiet(true);
                } else {
                    d.setDisChitiet(false);
                }

                vwBarcodeKieuhoiListMasters.add(d);
            }
            s.close();
            rs.close();
            return vwBarcodeKieuhoiListMasters;
        } catch (Exception e) {
            vwBarcodeKieuhoiListMasters = new ArrayList<>();
            return vwBarcodeKieuhoiListMasters;
        }
    }

}
