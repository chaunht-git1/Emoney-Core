package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.VwTkttBiennhanDetail;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VwTkttBiennhanDetailDao {

    private String sql = " SELECT * FROM KH.VW_TKTT_BIENNHAN_DETAIL ";
    private List<VwTkttBiennhanDetail> vwTkttBiennhanDetails = new ArrayList<>();

    public List<VwTkttBiennhanDetail> timtheodieukien(String manguoinhan, String madoitac) {
        Connection con = ConnectionProvider.getCon();
        sql += " WHERE MA_NGUOINHAN = '" + manguoinhan + "' AND ID_DOITAC = '" + madoitac + "' ";

        try {
            Statement s = con.createStatement();
            s.setQueryTimeout(1800);

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                VwTkttBiennhanDetail d = new VwTkttBiennhanDetail();

                d.setIdchinhanh(rs.getString("ID_CHINHANH"));
                d.setChinhanhname(rs.getString("CHINHANH_NAME"));
                d.setSobn(rs.getInt("SOBN"));
                d.setDachitra(rs.getString("DACHITRA"));
                d.setBiennhan(rs.getString("BIENNHAN"));
                d.setSolandichitra(rs.getInt("SOLANDICHITRA"));
                d.setDanhanphieu(rs.getString("DANHANPHIEU"));
                d.setIdcttuythan(rs.getString("ID_CT_TUYTHAN"));
                d.setLoaigiayto(rs.getString("LOAIGIAYTO"));

                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                d.setNguoigoi(rs.getString("NGUOIGOI"));
                d.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
                d.setTygia(rs.getBigDecimal("TYGIA"));
                d.setThanhtien(rs.getBigDecimal("THANHTIEN"));
                d.setIdloaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
                d.setIdloaitiengoi(rs.getString("ID_LOAITIENGOI"));
                d.setIdloaicongno(rs.getString("ID_LOAICONGNO"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setIdcity(rs.getString("ID_CITY"));
                d.setCityname(rs.getString("CITY_NAME"));
                d.setDiachi(rs.getString("DIACHI"));
                d.setIdnvbaocao(rs.getString("ID_NV_BAOCAO"));
                d.setIdnvchitra(rs.getString("ID_NV_CHITRA"));
                d.setIdnvxacnhan(rs.getString("ID_NV_XACNHAN"));
                d.setIdnvbiennhan(rs.getString("ID_NV_BIENNHAN"));
                d.setKhachhangnhan(rs.getString("KHACHHANG_NHAN"));
                d.setHoten(rs.getString("HOTEN"));
                d.setXacminh(rs.getString("XACMINH"));
                d.setGhichu(rs.getString("GHICHU"));
                d.setLydoxmnk(rs.getString("LYDO_XMNK"));
                d.setIdnvnhaplieu(rs.getString("ID_NV_NHAPLIEU"));
                d.setIdnvtruyenfile(rs.getString("ID_NV_TRUYENFILE"));
                d.setDatetruyenfile(rs.getDate("DATE_TRUYENFILE"));
                d.setIdnvupdate(rs.getString("ID_NV_UPDATE"));
                d.setIdnvxoaphieu(rs.getString("ID_NV_XOAPHIEU"));
                d.setLydoxoaphieu(rs.getString("LYDOXOAPHIEU"));
                d.setIdnvkt(rs.getString("ID_NV_KT"));
                d.setIddiadiemchitra(rs.getString("ID_DIADIEMCHITRA"));
                d.setIdthanhtoan(rs.getString("ID_THANHTOAN"));
                d.setCongtacvien(rs.getString("CONGTACVIEN"));
                d.setDienthoai(rs.getString("DIENTHOAI"));
                d.setPinno(rs.getString("PIN_NO"));
                d.setAgent(rs.getString("AGENT"));
                d.setIdagent(rs.getString("ID_AGENT"));
                d.setPayagentseq(rs.getString("PAYAGENTSEQ"));
                d.setExtorder(rs.getString("EXT_ORDER"));
                d.setSocttuythan(rs.getString("SO_CT_TUYTHAN"));
                d.setIddistrict(rs.getString("ID_DISTRICT"));
                d.setDistrictname(rs.getString("DISTRICT_NAME"));
                d.setNgaychitratrue(rs.getDate("NGAY_CHITRA_TRUE"));
                d.setNgaychitra(rs.getDate("NGAY_CHITRA"));
                d.setNgaybiennhan(rs.getDate("NGAY_BIENNHAN"));
                d.setNgayxacminh(rs.getDate("NGAY_XACMINH"));
                d.setNgaygiaophieu(rs.getDate("NGAYGIAOPHIEU"));
                d.setBiennhanc(rs.getString("BIENNHAN_C"));
                d.setDakiemtra(rs.getString("DAKIEMTRA"));
                d.setIdnvxacminh(rs.getString("ID_NV_XACMINH"));
                d.setNgaynhaplieu(rs.getDate("NGAY_NHAPLIEU"));
                d.setNgayupdate(rs.getString("NGAY_UPDATE"));
                d.setNgayxoaphieu(rs.getDate("NGAY_XOAPHIEU"));
                d.setNgaykiemtra(rs.getDate("NGAY_KIEMTRA"));

                d.setSophieu(rs.getString("SOPHIEU"));
                d.setStt(rs.getInt("STT"));
                d.setSolanin(rs.getInt("SOLANIN"));
                d.setNhapho(rs.getString("NHAPHO"));
                d.setMakhachhang(rs.getString("MA_KHACHHANG"));
                d.setHoten1(rs.getString("HOTEN_1"));
                d.setGiaytohoten(rs.getString("GIAYTO_HOTEN"));
                d.setHoten2(rs.getString("HOTEN_2"));
                d.setGiaytohoten2(rs.getString("GIAYTO_HOTEN_2"));
                d.setGhichugoi(rs.getString("GHICHU_GOI"));
                d.setIdnvduyetchuyencn(rs.getString("ID_NV_DUYET_CHUYENCN"));
                d.setIdnvycchuyencn(rs.getString("ID_NV_YC_CHUYENCN"));
                d.setNgaychuyencn(rs.getDate("NGAY_CHUYENCN"));
                d.setNgayyeucauchuyencn(rs.getDate("NGAY_YEUCAU_CHUYENCN"));
                d.setLydoupdate(rs.getString("LYDO_UPDATE"));
                d.setLydoycchuyencn(rs.getString("LYDO_YC_CHUYENCN"));
                d.setDienthoaigoc(rs.getString("DIENTHOAI_GOC"));
                d.setDiachigoc(rs.getString("DIACHI_GOC"));

                d.setNgaycap(rs.getDate("NGAYCAP"));
                d.setIdnoicap(rs.getString("ID_NOICAP"));
                d.setNoicapname(rs.getString("NOICAP_NAME"));
                d.setIdbank(rs.getString("ID_BANK"));
                d.setBankname(rs.getString("BANK_NAME"));
                d.setDotck(rs.getInt("DOTCK"));
                d.setDack(rs.getString("DACK"));
                d.setIdnvck(rs.getString("ID_NV_CK"));
                d.setNgayck(rs.getDate("NGAY_CK"));
                d.setCktienmat(rs.getString("CK_TIENMAT"));
                d.setIdnvduyetctck(rs.getString("ID_NV_DUYET_CTCK"));
                d.setNgayxnck(rs.getDate("NGAY_XNCK"));
                d.setNgayxacnhan(rs.getDate("NGAYXACNHAN"));
                d.setXacnhanck(rs.getString("XACNHAN_CK"));
                d.setGhichuck(rs.getString("GHICHU_CK"));
                d.setSotaikhoankh(rs.getString("SOTAIKHOANKH"));
                d.setNoinhantien(rs.getString("NOINHANTIEN"));

                vwTkttBiennhanDetails.add(d);
            }
            return vwTkttBiennhanDetails;
        } catch (Exception e) {
            vwTkttBiennhanDetails = new ArrayList<>();
            return vwTkttBiennhanDetails;
        }

    }

    public InputStream layhinhbiennhan(String idchinhanh, String sophieu, Number stt) {
        Connection con = ConnectionProvider.getCon();

        String khoa =  sophieu  ;
        InputStream inputStream = null;

        try {

            String sql = " SELECT HINH_BN FROM KH.DM_QUANLY_IMAGE WHERE KHOA='" + khoa + "'";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                inputStream = rs.getBlob("HINH_BN").getBinaryStream();

            }
            statement.close();
        } catch (Exception e) {
        }
        return inputStream;
    }
}
