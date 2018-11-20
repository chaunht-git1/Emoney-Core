package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwApiMasterChualaydl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* 
 Mục đích: Xử lý truy vấn dữ liệu trên bảng api master
 Lưu ý: 
 Nhân viên: THACHHH 
 Ngày tạo: 07-02-2017
 Chỉnh sửa gần nhất: 
 Lý do chỉnh sửa: 
 */
public class VwApiMasterChualaydlDao {

    private String sql = " SELECT * FROM KH.VW_API_MASTER_CHUALAYDL ";
    private List<VwApiMasterChualaydl> vwApiMasterChualaydls = new ArrayList<>();

    public List<VwApiMasterChualaydl> laydulieu(String idnvlaydl) {
        Connection con = ConnectionProvider.getCon();

        sql += " WHERE ID_NV_LAYDL = '" + idnvlaydl.toUpperCase()+"'";

        try {
            Statement s = con.createStatement();
            s.setQueryTimeout(1800);

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwApiMasterChualaydl d = new VwApiMasterChualaydl();
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                d.setShs(rs.getInt("SHS"));
                d.setUsdtong(rs.getBigDecimal("USD_TONG"));
                d.setAudtong(rs.getBigDecimal("AUD_TONG"));
                d.setVndtong(rs.getBigDecimal("VND_TONG"));
                d.setGbptong(rs.getBigDecimal("GBP_TONG"));
                d.setEurtong(rs.getBigDecimal("EUR_TONG"));
                d.setCadtong(rs.getBigDecimal("CAD_TONG"));

                vwApiMasterChualaydls.add(d);
            }
        } catch (Exception e) {
            vwApiMasterChualaydls = new ArrayList<>();
        }

        return vwApiMasterChualaydls;
    }
}
