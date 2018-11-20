package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwApiDetailChualaydl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* 
 Mục đích: Xử lý truy vấn dữ liệu trên bảng api detail
 Lưu ý: 
 Nhân viên: THACHHH 
 Ngày tạo: 07-02-2017
 Chỉnh sửa gần nhất: 
 Lý do chỉnh sửa: 
 */
public class VwApiDetailChualaydlDao {

    private String sql = " SELECT * FROM KH.VW_API_DETAIL_CHUALAYDL ";
    private List<VwApiDetailChualaydl> vwApiDetailChualaydls = new ArrayList<>();

    public List<VwApiDetailChualaydl> laydulieu(String iddoitac, String idnvlaydl) {
        Connection con = ConnectionProvider.getCon();
        sql += " WHERE ID_DOITAC = '" + iddoitac + "' AND ID_NV_LAYDL = '" + idnvlaydl.toUpperCase() + "'";
        try {
            Statement s = con.createStatement();
            s.setQueryTimeout(1800);

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwApiDetailChualaydl d = new VwApiDetailChualaydl();
                d.setIdcode(rs.getString("ID_CODE"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDataimport(rs.getString("DATA_IMPORT"));
                d.setCot1(rs.getString("COT_1"));
                d.setCot2(rs.getString("COT_2"));
                d.setCot3(rs.getString("COT_3"));
                d.setCot4(rs.getString("COT_4"));
                d.setCot5(rs.getString("COT_5"));
                d.setCot6(rs.getString("COT_6"));
                d.setCot7(rs.getString("COT_7"));
                d.setSttcol(rs.getInt("STT_COL"));
                d.setCot8(rs.getString("COT_8"));
                d.setCot9(rs.getString("COT_9"));
                d.setCot10(rs.getString("COT_10"));
                d.setCot11(rs.getString("COT_11"));
                d.setCot12(rs.getString("COT_12"));
                d.setCot13(rs.getString("COT_13"));
                d.setCot14(rs.getString("COT_14"));
                d.setCot15(rs.getString("COT_15"));
                d.setCot16(rs.getString("COT_16"));
                d.setCot17(rs.getString("COT_17"));
                d.setCot18(rs.getString("COT_18"));
                d.setCot19(rs.getString("COT_19"));
                d.setCot20(rs.getString("COT_20"));
                d.setCot21(rs.getString("COT_21"));
                d.setCot22(rs.getString("COT_22"));
                d.setCot23(rs.getString("COT_23"));
                d.setCot24(rs.getString("COT_24"));
                d.setCot25(rs.getString("COT_25"));
                d.setCot26(rs.getString("COT_26"));
                d.setCot27(rs.getString("COT_27"));
                d.setCot28(rs.getString("COT_28"));
                d.setCot29(rs.getString("COT_29"));
                d.setCot30(rs.getString("COT_30"));
                d.setCot31(rs.getString("COT_31"));
                d.setCot32(rs.getString("COT_32"));
                d.setCot33(rs.getString("COT_33"));
                d.setCot34(rs.getString("COT_34"));
                d.setCot35(rs.getString("COT_35"));
                d.setCot36(rs.getString("COT_36"));
                d.setCot37(rs.getString("COT_37"));
                d.setCot38(rs.getString("COT_38"));
                d.setCot39(rs.getString("COT_39"));
                d.setCot40(rs.getString("COT_40"));
                d.setApikey(rs.getString("APIKEY"));
                d.setMaqlds(rs.getString("MA_QLDS"));
                d.setLaydulieu(rs.getString("LAYDULIEU"));

                vwApiDetailChualaydls.add(d);
            }
        } catch (Exception e) {
            vwApiDetailChualaydls = new ArrayList<>();
        }

        return vwApiDetailChualaydls;
    }

    //Lấy dữ liệu bảng detail từ server ngoài đưa vào server trong
    public String laydulieuapi(String idnvlaydl) {
        Connection con = ConnectionProvider.getCon();

        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.FUNC_LAY_DULIEU_API(?)}";

        String kq = null;

        try {
            CallableStatement cs = con.prepareCall(fnCall);
            cs.setQueryTimeout(1800);
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            cs.setString(2, idnvlaydl.toUpperCase());

            ResultSet rs = cs.executeQuery();

            kq = rs.getString(1);

        } catch (Exception e) {
            kq = e.getMessage().toString();
        }

        return kq;
    }

    //Duyệt dữ liệu api để  hiển thị lên form master duyệt danh sách
    public String duyetdulieuapi(String iddoitac, String idnvlaydl) {
        Connection con = ConnectionProvider.getCon();

        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.FUNC_DUYET_DULIEU_API(?,?)}";

        String kq = null;

        try {
            CallableStatement cs = con.prepareCall(fnCall);
            cs.setQueryTimeout(1800);
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            cs.setString(2, iddoitac);
            cs.setString(3, idnvlaydl.toUpperCase());

            ResultSet rs = cs.executeQuery();

            kq = rs.getString(1);

        } catch (Exception e) {
            kq = e.getMessage().toString();
        }

        return kq;
    }

    //Cập nhật số thứ tự cho detail sau khi duyệt dữ liệu
    public String capnhatstt(String idcode, int stt) {
        Connection con = ConnectionProvider.getCon();

        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.FUNC_CAPNHAT_STT(?,?)}";

        String kq = null;

        try {
            CallableStatement cs = con.prepareCall(fnCall);
            cs.setQueryTimeout(1800);
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            cs.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);

            cs.setString(2, idcode);
            cs.setInt(3, stt);

            ResultSet rs = cs.executeQuery();

            kq = rs.getString(1);

        } catch (Exception e) {
            kq = e.getMessage().toString();
        }

        return kq;
    }
}
