package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwBarcodeKieuhoiListDetail;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VwBarcodeKieuhoiListDetailDao {

    private String sql = " SELECT * FROM KH.VW_BARCODE_KIEUHOI_LIST_DETAIL ";

    private List<VwBarcodeKieuhoiListDetail> vwBarcodeKieuhoiListDetails = new ArrayList();

    public List<VwBarcodeKieuhoiListDetail> findAll() {
        Connection con = ConnectionProvider.getCon();

        try {
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwBarcodeKieuhoiListDetail d = new VwBarcodeKieuhoiListDetail();
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setStt(rs.getInt("STT"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setHoten(rs.getString("HOTEN"));

                vwBarcodeKieuhoiListDetails.add(d);
            }
            s.close();
            rs.close();
            return vwBarcodeKieuhoiListDetails;
        } catch (Exception e) {
            vwBarcodeKieuhoiListDetails = new ArrayList();
            return vwBarcodeKieuhoiListDetails;
        }
    }

    public List<VwBarcodeKieuhoiListDetail> timtheosophieu(String sophieu) {
        Connection con = ConnectionProvider.getCon();
        sql += " WHERE SOPHIEU='" + sophieu + "' ";
        try {
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwBarcodeKieuhoiListDetail d = new VwBarcodeKieuhoiListDetail();
                d.setSophieu(rs.getString("SOPHIEU"));
                d.setStt(rs.getInt("STT"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setHoten(rs.getString("HOTEN"));

                vwBarcodeKieuhoiListDetails.add(d);
            }
            s.close();
            rs.close();
            return vwBarcodeKieuhoiListDetails;
        } catch (Exception e) {
            vwBarcodeKieuhoiListDetails = new ArrayList();
            return vwBarcodeKieuhoiListDetails;
        }
    }
}
