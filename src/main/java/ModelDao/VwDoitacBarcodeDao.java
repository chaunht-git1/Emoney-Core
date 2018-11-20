package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwDoitacBarcode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VwDoitacBarcodeDao {

    private String sql = " SELECT * FROM KH.VW_DOITAC_BARCODE ";
    private List<VwDoitacBarcode> vwDoitacBarcodes = new ArrayList<>();

    public List<VwDoitacBarcode> findAll() {
        Connection con = ConnectionProvider.getCon();

        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                VwDoitacBarcode d = new VwDoitacBarcode();
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));

                vwDoitacBarcodes.add(d);
            }
            return vwDoitacBarcodes;
        } catch (Exception e) {
            vwDoitacBarcodes = new ArrayList<>();
            return vwDoitacBarcodes;
        }
    }
}