package ModelDao;

import ConnectBean.*;
import SystemFunc.SessionBean;
import LocalModel.KieuhoiList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import LocalModel.GiaodichTTModel;
import java.math.BigDecimal;
import java.sql.CallableStatement;

public class KieuhoiListDao {

    String sql = "select * from KH.KIEUHOI_LIST ";
    private List<KieuhoiList> vwdskhtructuyenktList = new ArrayList<>();

    public List<KieuhoiList> findAll() throws SQLException {

        Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        //   sql = sql;
        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        //pstm.setString(1, Id);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            KieuhoiList dc = new KieuhoiList();
            dc.setIdChiNhanh(rs.getString("ID_CHINHANH"));
            dc.setSoPhieu(rs.getString("SOPHIEU"));
            dc.setStt(rs.getInt("STT"));
            dc.setNgaycapnhat(rs.getDate("NGAYCAPNHAT"));
            dc.setSolanin(rs.getInt("SOLANIN"));
            dc.setGhichu(rs.getString("GHICHU"));
            dc.setIdNvNhaplieu(rs.getString("ID_NV_NHAPLIEU"));
            dc.setNgayNhaplieu(rs.getDate("NGAY_NHAPLIEU"));
            dc.setIdNvChitra(rs.getString("ID_NV_CHITRA"));
            dc.setNgayChitra(rs.getDate("NGAY_CHITRA"));
            dc.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
            dc.setTygia(rs.getBigDecimal("TYGIA"));
            dc.setThanhtien(rs.getBigDecimal("THANHTIEN"));
            dc.setIdDiadiemchitra(rs.getString("ID_DIADIEMCHITRA"));
            dc.setGhichuGoi(rs.getString("GHICHU_GOI"));
            dc.setMaNguoinhan(rs.getString("MA_NGUOINHAN"));
            dc.setDiachi(rs.getString("DIACHI"));
            dc.setIdCity(rs.getString("ID_CITY"));
            dc.setIdDistrict(rs.getString("ID_DISTRICT"));
            dc.setSoCtTuythan(rs.getString("SO_CT_TUYTHAN"));
            dc.setNgaycap(rs.getDate("NGAYCAP"));
            dc.setIdNoicap(rs.getString("ID_NOICAP"));
            dc.setDachitra(rs.getString("DACHITRA"));
            dc.setNguoigoi(rs.getString("NGUOIGOI"));
            dc.setIdCongno(rs.getString("ID_CONGNO"));
            dc.setIdDoitac(rs.getString("ID_DOITAC"));
            dc.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
            dc.setIdLoaitiengoi(rs.getString("ID_LOAITIENGOI"));
            dc.setIdLoaicongno(rs.getString("ID_LOAICONGNO"));
            dc.setSolandichitra(rs.getInt("SOLANDICHITRA"));
            dc.setIdNvXoaphieu(rs.getString("ID_NV_XOAPHIEU"));
            dc.setNgayXoaphieu(rs.getDate("NGAY_XOAPHIEU"));
            dc.setLydoxoaphieu(rs.getString("LYDOXOAPHIEU"));
            dc.setDienthoai(rs.getString("DIENTHOAI"));
            dc.setNgaygiaophieu(rs.getDate("NGAYGIAOPHIEU"));
            dc.setNgaynhanphieu(rs.getDate("NGAYNHANPHIEU"));
            dc.setDanhanphieu(rs.getString("DANHANPHIEU"));
            dc.setHoahongTaiquay(rs.getBigDecimal("HOAHONG_TAIQUAY"));
            dc.setHoahongTainha(rs.getBigDecimal("HOAHONG_TAINHA"));
            dc.setSolaninGiaophieu(rs.getInt("SOLANIN_GIAOPHIEU"));
            dc.setTygiaQuydoi(rs.getBigDecimal("TYGIA_QUYDOI"));
            dc.setChiphidilai(rs.getBigDecimal("CHIPHIDILAI"));
            dc.setTygiaNgay(rs.getBigDecimal("TYGIA_NGAY"));
            dc.setSotienCongno(rs.getBigDecimal("SOTIEN_CONGNO"));
            dc.setNgayHoibao(rs.getDate("NGAY_HOIBAO"));
            dc.setIdNvHoibao(rs.getString("ID_NV_HOIBAO"));
            dc.setDahoibao(rs.getString("DAHOIBAO"));
            dc.setTreophieu(rs.getString("TREOPHIEU"));
            dc.setPhihoahong(rs.getInt("PHIHOAHONG"));
            dc.setGiotinhNam(rs.getString("GIOTINH_NAM"));
            dc.setNamsinh(rs.getString("NAMSINH"));
            dc.setSolanXuatfile(rs.getInt("SOLAN_XUATFILE"));
            dc.setDakiemtra(rs.getString("DAKIEMTRA"));
            dc.setIdNvKt(rs.getString("ID_NV_KT"));
            dc.setNgayKiemtra(rs.getDate("NGAY_KIEMTRA"));
            dc.setDatruyenfile(rs.getString("DATRUYENFILE"));
            dc.setFileName(rs.getString("FILE_NAME"));
            dc.setIdChinhanhChitra(rs.getString("ID_CHINHANH_CHITRA"));
            dc.setBiennhan(rs.getString("BIENNHAN"));
            dc.setNgayBiennhan(rs.getDate("NGAY_BIENNHAN"));
            dc.setIdNvBiennhan(rs.getString("ID_NV_BIENNHAN"));
            dc.setCongtacvien(rs.getString("CONGTACVIEN"));
            dc.setIdThanhtoan(rs.getString("ID_THANHTOAN"));
            dc.setTaikhoanthe(rs.getString("TAIKHOANTHE"));
            dc.setTruyenfileDoitac(rs.getString("TRUYENFILE_DOITAC"));
            dc.setGioTruyenfile(rs.getDate("GIO_TRUYENFILE"));
            dc.setDateTruyenfile(rs.getDate("DATE_TRUYENFILE"));
            dc.setXacminh(rs.getString("XACMINH"));
            dc.setNgayXacminh(rs.getDate("NGAY_XACMINH"));
            dc.setIdNvTruyenfile(rs.getString("ID_NV_TRUYENFILE"));
            dc.setHoten(rs.getString("HOTEN"));
            dc.setHoten1(rs.getString("HOTEN_1"));
            dc.setHoten2(rs.getString("HOTEN_2"));
            dc.setIdCtTuythan(rs.getString("ID_CT_TUYTHAN"));
            dc.setMaKhachhang(rs.getString("MA_KHACHHANG"));
            dc.setKhachhangNhan(rs.getString("KHACHHANG_NHAN"));
            dc.setIdNvBaocao(rs.getString("ID_NV_BAOCAO"));
            dc.setNgayBaocao(rs.getDate("NGAY_BAOCAO"));
            dc.setNoinhantien(rs.getString("NOINHANTIEN"));
            dc.setIdNvUpdate(rs.getString("ID_NV_UPDATE"));
            dc.setNgayUpdate(rs.getString("NGAY_UPDATE"));
            dc.setGiaytoHoten(rs.getString("GIAYTO_HOTEN"));
            dc.setGiaytoHoten1(rs.getString("GIAYTO_HOTEN_1"));
            dc.setGiaytoHoten2(rs.getString("GIAYTO_HOTEN_2"));
            dc.setCountPrint(rs.getInt("COUNT_PRINT"));
            dc.setNhapho(rs.getString("NHAPHO"));
            dc.setTrangthai(rs.getString("TRANGTHAI"));
            dc.setXacnhan(rs.getString("XACNHAN"));
            dc.setIdNvXacnhan(rs.getString("ID_NV_XACNHAN"));
            dc.setNgayXacnhan(rs.getString("NGAY_XACNHAN"));
            dc.setNhands(rs.getString("NHANDS"));
            dc.setIdNvNhands(rs.getString("ID_NV_NHANDS"));
            dc.setNgayNhands(rs.getDate("NGAY_NHANDS"));
            dc.setNgayChitraTrue(rs.getDate("NGAY_CHITRA_TRUE"));
            dc.setIdNvXacminh(rs.getString("ID_NV_XACMINH"));
            dc.setChuyenBdien(rs.getString("CHUYEN_BDIEN"));
            dc.setMaXoaphieu(rs.getString("MA_XOAPHIEU"));
            dc.setIdNvTreophieu(rs.getString("ID_NV_TREOPHIEU"));
            dc.setNgayTreophieu(rs.getDate("NGAY_TREOPHIEU"));
            dc.setMoikhach(rs.getString("MOIKHACH"));
            dc.setNvMoikhach(rs.getString("NV_MOIKHACH"));
            dc.setNgayMoikhach(rs.getDate("NGAY_MOIKHACH"));
            dc.setNghingo(rs.getString("NGHINGO"));
            dc.setLydonghingo(rs.getString("LYDONGHINGO"));
            dc.setMakhNghingo(rs.getString("MAKH_NGHINGO"));
            dc.setDakhaosat(rs.getString("DAKHAOSAT"));
            dc.setRecordNote(rs.getString("RECORD_NOTE"));
            dc.setGionhaplieu(rs.getDate("GIONHAPLIEU"));
            dc.setNgayNghingo(rs.getDate("NGAY_NGHINGO"));
            dc.setIdNvNghingo(rs.getString("ID_NV_NGHINGO"));
            dc.setIdTreotaiquay(rs.getString("ID_TREOTAIQUAY"));
            dc.setAgent(rs.getString("AGENT"));
            dc.setIdAgent(rs.getString("ID_AGENT"));
            dc.setExtOrder(rs.getString("EXT_ORDER"));
            dc.setPayagentseq(rs.getString("PAYAGENTSEQ"));
            dc.setPinNo(rs.getString("PIN_NO"));
            dc.setMaHtbn(rs.getString("MA_HTBN"));
            dc.setIdTieuchi(rs.getString("ID_TIEUCHI"));
            dc.setIdKhh(rs.getString("ID_KHH"));
            dc.setLydoKhh(rs.getString("LYDO_KHH"));
            dc.setNgayKhh(rs.getDate("NGAY_KHH"));
            dc.setIdNvKhh(rs.getString("ID_NV_KHH"));
            dc.setIdNvPhuchoi(rs.getString("ID_NV_PHUCHOI"));
            dc.setNgayPhuchoi(rs.getDate("NGAY_PHUCHOI"));
            dc.setMaPin(rs.getString("MA_PIN"));
            dc.setMaQlds(rs.getString("MA_QLDS"));
            dc.setMaDsXacnhan(rs.getString("MA_DS_XACNHAN"));
            dc.setThukem(rs.getString("THUKEM"));
            dc.setLydoInlaibn(rs.getString("LYDO_INLAIBN"));
            dc.setInlaibn(rs.getString("INLAIBN"));
            dc.setInnvduyetInlaibn(rs.getString("INNVDUYET_INLAIBN"));
            dc.setNgayduyetInlaibn(rs.getDate("NGAYDUYET_INLAIBN"));
            dc.setChuyencn(rs.getString("CHUYENCN"));
            dc.setLydoYcChuyencn(rs.getString("LYDO_YC_CHUYENCN"));
            dc.setGhichuYcChuyencn(rs.getString("GHICHU_YC_CHUYENCN"));
            dc.setIdNvDuyetChuyencn(rs.getString("ID_NV_DUYET_CHUYENCN"));
            dc.setNgayChuyencn(rs.getDate("NGAY_CHUYENCN"));
            dc.setNgayYeucauChuyencn(rs.getDate("NGAY_YEUCAU_CHUYENCN"));
            dc.setIdNvYcChuyencn(rs.getString("ID_NV_YC_CHUYENCN"));
            dc.setLydoUpdate(rs.getString("LYDO_UPDATE"));
            dc.setBiennhanC(rs.getString("BIENNHAN_C"));
            dc.setSobn(rs.getLong("SOBN"));
            dc.setNgayPhCtTam(rs.getDate("NGAY_PH_CT_TAM"));
            dc.setIdNvPhCtTam(rs.getString("ID_NV_PH_CT_TAM"));
            dc.setGhichuPhCtTam(rs.getString("GHICHu_PH_CT_TAM"));
            dc.setHbdt(rs.getString("HBDT"));
            dc.setDothb(rs.getInt("DOTHB"));
            dc.setNgayhbdt(rs.getDate("NGAYHBDT"));
            dc.setHbfileno(rs.getInt("HBFILENO"));
            dc.setBsttxacminh(rs.getString("BSTTXACMINH"));
            dc.setNoidungbstt(rs.getString("NOIDUNGBSTT"));
            dc.setNgaybstt(rs.getDate("NGAYBSTT"));
            dc.setNvbstt(rs.getString("NVBSTT"));
            dc.setXacnhanPcrt(rs.getString("XACNHAN_PCRT"));
            dc.setIdNvXnPcrt(rs.getString("ID_NV_XN_PCRT"));
            dc.setNgayXnPcrt(rs.getDate("NGAY_XN_PCRT"));
            dc.setClockRecord(rs.getString("CLOCK_RECORD"));
            dc.setIdNvKspcrt(rs.getString("ID_NV_KSPCRT"));
            dc.setNgayKspcrt(rs.getDate("NGAY_KSPCRT"));
            dc.setMakhHuychi(rs.getString("MAKH_HUYCHI"));
            dc.setDuyetDsDx(rs.getString("DUYET_DS_DX"));
            dc.setIdNvDuyetDsDx(rs.getString("ID_NV_DUYET_DS_DX"));
            dc.setNgayDuyetDsDx(rs.getDate("NGAY_DUYET_DS_DX"));
            dc.setIdPcrt(rs.getString("ID_PCRT"));
            dc.setNhantin(rs.getString("NHANTIN"));
            dc.setDienthoaiNt(rs.getString("DIENTHOAI_NT"));
            dc.setNoidungSms(rs.getString("NOIDUNG_SMS"));
            dc.setDateSms(rs.getDate("DATE_SMS"));
            dc.setIdNvSms(rs.getString("ID_NV_SMS"));
            dc.setIdSms(rs.getInt("ID_SMS"));
            dc.setIdGiaodich(rs.getInt("ID_GIAODICH"));
            dc.setIdBank(rs.getString("ID_BANK"));
            dc.setDotck(rs.getInt("DOTCK"));
            dc.setGhichuCk(rs.getString("GHICHU_CK"));
            dc.setNgayCk(rs.getDate("NGAY_CK"));
            dc.setIdNvCk(rs.getString("ID_NV_CK"));
            dc.setDack(rs.getString("DACK"));
            dc.setCkTienmat(rs.getString("CK_TIENMAT"));
            dc.setIdNvCtck(rs.getString("ID_NV_CTCK"));
            dc.setNgayCtck(rs.getDate("NGAY_CTCK"));
            dc.setXacnhanCk(rs.getString("XACNHAN_CK"));
            dc.setGhichuCtck(rs.getString("GHICHU_CTCK"));
            dc.setIdBranchArb(rs.getString("ID_BRANCH_ARB"));
            dc.setIdNvPhck(rs.getString("ID_NV_PHCK"));
            dc.setNgayPhck(rs.getDate("NGAY_PHCK"));
            dc.setIdDuyetKtck(rs.getString("ID_DUYET_KTCK"));
            dc.setNgayDuyetKtck(rs.getDate("NGAY_DUYET_KTCK"));
            dc.setIdNvDuyetCtck(rs.getString("ID_NV_DUYET_CTCK"));
            dc.setNgayXnck(rs.getDate("NGAY_XNCK"));
            dc.setIdNvYcInlai(rs.getString("ID_NV_YC_INLAI"));
            dc.setDachitratreo(rs.getString("DACHITRATREO"));
            dc.setIdTreophieu(rs.getString("ID_TREOPHIEU"));
            dc.setIdSsDt(rs.getString("ID_SS_DT"));
            dc.setIdNvTphieu(rs.getString("ID_NV_TPHIEU"));
            dc.setNgayTphieu(rs.getDate("NGAY_TPHIEU"));
            dc.setIdDuthuong(rs.getString("ID_DUTHUONG"));
            dc.setIdKhan(rs.getString("ID_KHAN"));
            dc.setIdLoaixm(rs.getString("ID_LOAIXM"));
            dc.setIdNvGiaophieu(rs.getString("ID_NV_GIAOPHIEU"));
            dc.setGioGiaophieu(rs.getDate("GIO_GIAOPHIEU"));
            dc.setIdCtDuthuong(rs.getString("ID_CT_DUTHUONG"));
            dc.setInlaiTunv(rs.getString("INLAI_TUNV"));
            dc.setIdNvInlaitunv(rs.getString("ID_NV_INLAITUNV"));
            dc.setNgayInlaitunv(rs.getDate("NGAY_INLAITUNV"));
            dc.setTenduong(rs.getString("TENDUONG"));
            dc.setLydoXmnk(rs.getString("LYDO_XMNK"));
            dc.setHotenGoc(rs.getString("HOTEN_GOC"));
            dc.setIdQuocgiaNhan(rs.getString("ID_QUOCGIA_NHAN"));
            dc.setTrangthaiTt(rs.getString("TRANGTHAI_TT"));
            dc.setInlaiDiduong(rs.getString("INLAI_DIDUONG"));
            dc.setIdNvIndiduong(rs.getString("ID_NV_INDIDUONG"));
            dc.setIdNvPhtreocthang(rs.getString("ID_NV_PHTREOCTHANG"));
            dc.setNgayChitraCthang(rs.getDate("NGAY_CHITRA_CTHANG"));
            dc.setIdNvChitraCthang(rs.getString("ID_NV_CHITRA_CTHANG"));
            dc.setSolaninDiduong(rs.getInt("SOLANIN_DIDUONG"));
            dc.setIdNoname(rs.getString("ID_NONAME"));
            dc.setIdNvNhanphieu(rs.getString("ID_NV_NHANPHIEU"));
            dc.setInNoname(rs.getString("IN_NONAME"));
            dc.setSlinNoname(rs.getInt("SLIN_NONAME"));
            dc.setIdNhatkyTt(rs.getString("ID_NHATKY_TT"));
            dc.setDotgp(rs.getString("DOTGP"));
            dc.setSotiengoc(rs.getInt("SOTIENGOC"));
            dc.setDiachigoc(rs.getString("DIACHIGOC"));
            dc.setDienthoaigoc(rs.getString("DIENTHOAIGOC"));
            dc.setMgCode(rs.getString("MG_CODE"));
            dc.setIdGpAuto(rs.getString("ID_GP_AUTO"));
            dc.setWardAuto(rs.getString("WARD_AUTO"));
            dc.setIdWard(rs.getString("ID_WARD"));
            dc.setAgentDate(rs.getString("AGENT_DATE"));
            dc.setSttImpDt(rs.getInt("STT_IMP_DT"));
            dc.setIdDieuchinhct(rs.getString("ID_DIEUCHINHCT"));
            dc.setTygiaDc(rs.getFloat("TYGIA_DC"));
            dc.setIdQlqDottg(rs.getString("ID_QLQ_DOTTG"));
            dc.setIdQlqDuyet(rs.getString("ID_QLQ_DUYET"));
            dc.setIdQlqMoichitien(rs.getString("ID_QLQ_MOICHITIEN"));
            dc.setIdQlqNhandutien(rs.getString("ID_QLQ_NHANDUTIEN"));
            dc.setQlqNgaychuyenKsq(rs.getDate("QLQ_NGAYCHUYEN_KSQ"));
            dc.setQlqNgayKsqDuyet(rs.getDate("QLQ_NGAY_KSQ_DUYET"));
            dc.setQlqNgayTquyMoi(rs.getDate("QLQ_NGAY_TQUY_MOI"));
            dc.setQlqNgayTquyNhandutien(rs.getDate("QLQ_NGAY_TQUY_NHANDUTIEN"));
            dc.setQlqNgayNvchinhaNhandu(rs.getDate("QLQ_NGAY_NVCHINHA_NHANDU"));
            dc.setIdHoibaoMobile(rs.getString("ID_HOIBAO_MOBILE"));
            dc.setSotaikhoankh(rs.getString("SOTAIKHOANKH"));
            dc.setMaDuthuong(rs.getString("MA_DUTHUONG"));
            dc.setIdKhuvucQuayso(rs.getString("ID_KHUVUC_QUAYSO"));
            dc.setNgaysinhkh(rs.getDate("NGAYSINHKH"));
            dc.setNgayMobiHb(rs.getDate("NGAY_MOBI_HB"));
            dc.setIdMobiHb(rs.getString("ID_MOBI_HB"));
            dc.setKhachHangGd(rs.getString("KHACHHANG_GD"));
            dc.setNvkhgiaodich(rs.getString("NVKHGIAODICH"));
            dc.setNgaykhgd(rs.getDate("NGAYKHGD"));
            dc.setNvxulycv(rs.getString("NVXULYCV"));
            dc.setNgaytiepnhan(rs.getDate("NGAYTIEPNHAN"));
            dc.setXacnhandoitac(rs.getString("XACNHANHTDOITAC"));
            dc.setNgayxacnhan(rs.getDate("NGAYXACNHAN"));
            dc.setIdnvxndoitac(rs.getString("IDNVXNDOITAC"));
            dc.setBangchu(rs.getString("BANGCHU"));
            dc.setIdlock(rs.getString("ID_LOCK"));
            dc.setGhichutrangthai(rs.getString("GHICHUTRANGTHAI"));
            dc.setIdkhachhangtt(rs.getString("ID_KHACHHANGTT"));
            dc.setNgaysinh(rs.getDate("NGAYSINH"));
            dc.setThoigiaxuly(rs.getInt("THOIGIAXULY"));
            dc.setTrangthaixuly(rs.getString("TRANGTHAIXULY"));
            dc.setIdlydohuytt(rs.getString("ID_LYDOHUYTT"));

            this.vwdskhtructuyenktList.add(dc);
        }

        pstm.close();

        return vwdskhtructuyenktList;
    }

    public List<KieuhoiList> findOneParaString(String prmname1, String prmvalue1) throws SQLException {

        Connection con = ConnectionProvider.getCon();

        // Tạo một câu SQL có 1 tham số (?)
        sql = sql + "Where " + prmname1 + "=?";

        // Tạo một đối tượng PreparedStatement.
        PreparedStatement pstm = con.prepareStatement(sql);

        // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
        pstm.setString(1, prmvalue1);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            KieuhoiList dc = new KieuhoiList();
            dc.setIdChiNhanh(rs.getString("ID_CHINHANH"));
            dc.setSoPhieu(rs.getString("SOPHIEU"));
            dc.setStt(rs.getInt("STT"));
            dc.setNgaycapnhat(rs.getDate("NGAYCAPNHAT"));
            dc.setSolanin(rs.getInt("SOLANIN"));
            dc.setGhichu(rs.getString("GHICHU"));
            dc.setIdNvNhaplieu(rs.getString("ID_NV_NHAPLIEU"));
            dc.setNgayNhaplieu(rs.getDate("NGAY_NHAPLIEU"));
            dc.setIdNvChitra(rs.getString("ID_NV_CHITRA"));
            dc.setNgayChitra(rs.getDate("NGAY_CHITRA"));
            dc.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
            dc.setTygia(rs.getBigDecimal("TYGIA"));
            dc.setThanhtien(rs.getBigDecimal("THANHTIEN"));
            dc.setIdDiadiemchitra(rs.getString("ID_DIADIEMCHITRA"));
            dc.setGhichuGoi(rs.getString("GHICHU_GOI"));
            dc.setMaNguoinhan(rs.getString("MA_NGUOINHAN"));
            dc.setDiachi(rs.getString("DIACHI"));
            dc.setIdCity(rs.getString("ID_CITY"));
            dc.setIdDistrict(rs.getString("ID_DISTRICT"));
            dc.setSoCtTuythan(rs.getString("SO_CT_TUYTHAN"));
            dc.setNgaycap(rs.getDate("NGAYCAP"));
            dc.setIdNoicap(rs.getString("ID_NOICAP"));
            dc.setDachitra(rs.getString("DACHITRA"));
            dc.setNguoigoi(rs.getString("NGUOIGOI"));
            dc.setIdCongno(rs.getString("ID_CONGNO"));
            dc.setIdDoitac(rs.getString("ID_DOITAC"));
            dc.setIdLoaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
            dc.setIdLoaitiengoi(rs.getString("ID_LOAITIENGOI"));
            dc.setIdLoaicongno(rs.getString("ID_LOAICONGNO"));
            dc.setSolandichitra(rs.getInt("SOLANDICHITRA"));
            dc.setIdNvXoaphieu(rs.getString("ID_NV_XOAPHIEU"));
            dc.setNgayXoaphieu(rs.getDate("NGAY_XOAPHIEU"));
            dc.setLydoxoaphieu(rs.getString("LYDOXOAPHIEU"));
            dc.setDienthoai(rs.getString("DIENTHOAI"));
            dc.setNgaygiaophieu(rs.getDate("NGAYGIAOPHIEU"));
            dc.setNgaynhanphieu(rs.getDate("NGAYNHANPHIEU"));
            dc.setDanhanphieu(rs.getString("DANHANPHIEU"));
            dc.setHoahongTaiquay(rs.getBigDecimal("HOAHONG_TAIQUAY"));
            dc.setHoahongTainha(rs.getBigDecimal("HOAHONG_TAINHA"));
            dc.setSolaninGiaophieu(rs.getInt("SOLANIN_GIAOPHIEU"));
            dc.setTygiaQuydoi(rs.getBigDecimal("TYGIA_QUYDOI"));
            dc.setChiphidilai(rs.getBigDecimal("CHIPHIDILAI"));
            dc.setTygiaNgay(rs.getBigDecimal("TYGIA_NGAY"));
            dc.setSotienCongno(rs.getBigDecimal("SOTIEN_CONGNO"));
            dc.setNgayHoibao(rs.getDate("NGAY_HOIBAO"));
            dc.setIdNvHoibao(rs.getString("ID_NV_HOIBAO"));
            dc.setDahoibao(rs.getString("DAHOIBAO"));
            dc.setTreophieu(rs.getString("TREOPHIEU"));
            dc.setPhihoahong(rs.getInt("PHIHOAHONG"));
            dc.setGiotinhNam(rs.getString("GIOTINH_NAM"));
            dc.setNamsinh(rs.getString("NAMSINH"));
            dc.setSolanXuatfile(rs.getInt("SOLAN_XUATFILE"));
            dc.setDakiemtra(rs.getString("DAKIEMTRA"));
            dc.setIdNvKt(rs.getString("ID_NV_KT"));
            dc.setNgayKiemtra(rs.getDate("NGAY_KIEMTRA"));
            dc.setDatruyenfile(rs.getString("DATRUYENFILE"));
            dc.setFileName(rs.getString("FILE_NAME"));
            dc.setIdChinhanhChitra(rs.getString("ID_CHINHANH_CHITRA"));
            dc.setBiennhan(rs.getString("BIENNHAN"));
            dc.setNgayBiennhan(rs.getDate("NGAY_BIENNHAN"));
            dc.setIdNvBiennhan(rs.getString("ID_NV_BIENNHAN"));
            dc.setCongtacvien(rs.getString("CONGTACVIEN"));
            dc.setIdThanhtoan(rs.getString("ID_THANHTOAN"));
            dc.setTaikhoanthe(rs.getString("TAIKHOANTHE"));
            dc.setTruyenfileDoitac(rs.getString("TRUYENFILE_DOITAC"));
            dc.setGioTruyenfile(rs.getDate("GIO_TRUYENFILE"));
            dc.setDateTruyenfile(rs.getDate("DATE_TRUYENFILE"));
            dc.setXacminh(rs.getString("XACMINH"));
            dc.setNgayXacminh(rs.getDate("NGAY_XACMINH"));
            dc.setIdNvTruyenfile(rs.getString("ID_NV_TRUYENFILE"));
            dc.setHoten(rs.getString("HOTEN"));
            dc.setHoten1(rs.getString("HOTEN_1"));
            dc.setHoten2(rs.getString("HOTEN_2"));
            dc.setIdCtTuythan(rs.getString("ID_CT_TUYTHAN"));
            dc.setMaKhachhang(rs.getString("MA_KHACHHANG"));
            dc.setKhachhangNhan(rs.getString("KHACHHANG_NHAN"));
            dc.setIdNvBaocao(rs.getString("ID_NV_BAOCAO"));
            dc.setNgayBaocao(rs.getDate("NGAY_BAOCAO"));
            dc.setNoinhantien(rs.getString("NOINHANTIEN"));
            dc.setIdNvUpdate(rs.getString("ID_NV_UPDATE"));
            dc.setNgayUpdate(rs.getString("NGAY_UPDATE"));
            dc.setGiaytoHoten(rs.getString("GIAYTO_HOTEN"));
            dc.setGiaytoHoten1(rs.getString("GIAYTO_HOTEN_1"));
            dc.setGiaytoHoten2(rs.getString("GIAYTO_HOTEN_2"));
            dc.setCountPrint(rs.getInt("COUNT_PRINT"));
            dc.setNhapho(rs.getString("NHAPHO"));
            dc.setTrangthai(rs.getString("TRANGTHAI"));
            dc.setXacnhan(rs.getString("XACNHAN"));
            dc.setIdNvXacnhan(rs.getString("ID_NV_XACNHAN"));
            dc.setNgayXacnhan(rs.getString("NGAY_XACNHAN"));
            dc.setNhands(rs.getString("NHANDS"));
            dc.setIdNvNhands(rs.getString("ID_NV_NHANDS"));
            dc.setNgayNhands(rs.getDate("NGAY_NHANDS"));
            dc.setNgayChitraTrue(rs.getDate("NGAY_CHITRA_TRUE"));
            dc.setIdNvXacminh(rs.getString("ID_NV_XACMINH"));
            dc.setChuyenBdien(rs.getString("CHUYEN_BDIEN"));
            dc.setMaXoaphieu(rs.getString("MA_XOAPHIEU"));
            dc.setIdNvTreophieu(rs.getString("ID_NV_TREOPHIEU"));
            dc.setNgayTreophieu(rs.getDate("NGAY_TREOPHIEU"));
            dc.setMoikhach(rs.getString("MOIKHACH"));
            dc.setNvMoikhach(rs.getString("NV_MOIKHACH"));
            dc.setNgayMoikhach(rs.getDate("NGAY_MOIKHACH"));
            dc.setNghingo(rs.getString("NGHINGO"));
            dc.setLydonghingo(rs.getString("LYDONGHINGO"));
            dc.setMakhNghingo(rs.getString("MAKH_NGHINGO"));
            dc.setDakhaosat(rs.getString("DAKHAOSAT"));
            dc.setRecordNote(rs.getString("RECORD_NOTE"));
            dc.setGionhaplieu(rs.getDate("GIONHAPLIEU"));
            dc.setNgayNghingo(rs.getDate("NGAY_NGHINGO"));
            dc.setIdNvNghingo(rs.getString("ID_NV_NGHINGO"));
            dc.setIdTreotaiquay(rs.getString("ID_TREOTAIQUAY"));
            dc.setAgent(rs.getString("AGENT"));
            dc.setIdAgent(rs.getString("ID_AGENT"));
            dc.setExtOrder(rs.getString("EXT_ORDER"));
            dc.setPayagentseq(rs.getString("PAYAGENTSEQ"));
            dc.setPinNo(rs.getString("PIN_NO"));
            dc.setMaHtbn(rs.getString("MA_HTBN"));
            dc.setIdTieuchi(rs.getString("ID_TIEUCHI"));
            dc.setIdKhh(rs.getString("ID_KHH"));
            dc.setLydoKhh(rs.getString("LYDO_KHH"));
            dc.setNgayKhh(rs.getDate("NGAY_KHH"));
            dc.setIdNvKhh(rs.getString("ID_NV_KHH"));
            dc.setIdNvPhuchoi(rs.getString("ID_NV_PHUCHOI"));
            dc.setNgayPhuchoi(rs.getDate("NGAY_PHUCHOI"));
            dc.setMaPin(rs.getString("MA_PIN"));
            dc.setMaQlds(rs.getString("MA_QLDS"));
            dc.setMaDsXacnhan(rs.getString("MA_DS_XACNHAN"));
            dc.setThukem(rs.getString("THUKEM"));
            dc.setLydoInlaibn(rs.getString("LYDO_INLAIBN"));
            dc.setInlaibn(rs.getString("INLAIBN"));
            dc.setInnvduyetInlaibn(rs.getString("INNVDUYET_INLAIBN"));
            dc.setNgayduyetInlaibn(rs.getDate("NGAYDUYET_INLAIBN"));
            dc.setChuyencn(rs.getString("CHUYENCN"));
            dc.setLydoYcChuyencn(rs.getString("LYDO_YC_CHUYENCN"));
            dc.setGhichuYcChuyencn(rs.getString("GHICHU_YC_CHUYENCN"));
            dc.setIdNvDuyetChuyencn(rs.getString("ID_NV_DUYET_CHUYENCN"));
            dc.setNgayChuyencn(rs.getDate("NGAY_CHUYENCN"));
            dc.setNgayYeucauChuyencn(rs.getDate("NGAY_YEUCAU_CHUYENCN"));
            dc.setIdNvYcChuyencn(rs.getString("ID_NV_YC_CHUYENCN"));
            dc.setLydoUpdate(rs.getString("LYDO_UPDATE"));
            dc.setBiennhanC(rs.getString("BIENNHAN_C"));
            dc.setSobn(rs.getLong("SOBN"));
            dc.setNgayPhCtTam(rs.getDate("NGAY_PH_CT_TAM"));
            dc.setIdNvPhCtTam(rs.getString("ID_NV_PH_CT_TAM"));
            dc.setGhichuPhCtTam(rs.getString("GHICHu_PH_CT_TAM"));
            dc.setHbdt(rs.getString("HBDT"));
            dc.setDothb(rs.getInt("DOTHB"));
            dc.setNgayhbdt(rs.getDate("NGAYHBDT"));
            dc.setHbfileno(rs.getInt("HBFILENO"));
            dc.setBsttxacminh(rs.getString("BSTTXACMINH"));
            dc.setNoidungbstt(rs.getString("NOIDUNGBSTT"));
            dc.setNgaybstt(rs.getDate("NGAYBSTT"));
            dc.setNvbstt(rs.getString("NVBSTT"));
            dc.setXacnhanPcrt(rs.getString("XACNHAN_PCRT"));
            dc.setIdNvXnPcrt(rs.getString("ID_NV_XN_PCRT"));
            dc.setNgayXnPcrt(rs.getDate("NGAY_XN_PCRT"));
            dc.setClockRecord(rs.getString("CLOCK_RECORD"));
            dc.setIdNvKspcrt(rs.getString("ID_NV_KSPCRT"));
            dc.setNgayKspcrt(rs.getDate("NGAY_KSPCRT"));
            dc.setMakhHuychi(rs.getString("MAKH_HUYCHI"));
            dc.setDuyetDsDx(rs.getString("DUYET_DS_DX"));
            dc.setIdNvDuyetDsDx(rs.getString("ID_NV_DUYET_DS_DX"));
            dc.setNgayDuyetDsDx(rs.getDate("NGAY_DUYET_DS_DX"));
            dc.setIdPcrt(rs.getString("ID_PCRT"));
            dc.setNhantin(rs.getString("NHANTIN"));
            dc.setDienthoaiNt(rs.getString("DIENTHOAI_NT"));
            dc.setNoidungSms(rs.getString("NOIDUNG_SMS"));
            dc.setDateSms(rs.getDate("DATE_SMS"));
            dc.setIdNvSms(rs.getString("ID_NV_SMS"));
            dc.setIdSms(rs.getInt("ID_SMS"));
            dc.setIdGiaodich(rs.getInt("ID_GIAODICH"));
            dc.setIdBank(rs.getString("ID_BANK"));
            dc.setDotck(rs.getInt("DOTCK"));
            dc.setGhichuCk(rs.getString("GHICHU_CK"));
            dc.setNgayCk(rs.getDate("NGAY_CK"));
            dc.setIdNvCk(rs.getString("ID_NV_CK"));
            dc.setDack(rs.getString("DACK"));
            dc.setCkTienmat(rs.getString("CK_TIENMAT"));
            dc.setIdNvCtck(rs.getString("ID_NV_CTCK"));
            dc.setNgayCtck(rs.getDate("NGAY_CTCK"));
            dc.setXacnhanCk(rs.getString("XACNHAN_CK"));
            dc.setGhichuCtck(rs.getString("GHICHU_CTCK"));
            dc.setIdBranchArb(rs.getString("ID_BRANCH_ARB"));
            dc.setIdNvPhck(rs.getString("ID_NV_PHCK"));
            dc.setNgayPhck(rs.getDate("NGAY_PHCK"));
            dc.setIdDuyetKtck(rs.getString("ID_DUYET_KTCK"));
            dc.setNgayDuyetKtck(rs.getDate("NGAY_DUYET_KTCK"));
            dc.setIdNvDuyetCtck(rs.getString("ID_NV_DUYET_CTCK"));
            dc.setNgayXnck(rs.getDate("NGAY_XNCK"));
            dc.setIdNvYcInlai(rs.getString("ID_NV_YC_INLAI"));
            dc.setDachitratreo(rs.getString("DACHITRATREO"));
            dc.setIdTreophieu(rs.getString("ID_TREOPHIEU"));
            dc.setIdSsDt(rs.getString("ID_SS_DT"));
            dc.setIdNvTphieu(rs.getString("ID_NV_TPHIEU"));
            dc.setNgayTphieu(rs.getDate("NGAY_TPHIEU"));
            dc.setIdDuthuong(rs.getString("ID_DUTHUONG"));
            dc.setIdKhan(rs.getString("ID_KHAN"));
            dc.setIdLoaixm(rs.getString("ID_LOAIXM"));
            dc.setIdNvGiaophieu(rs.getString("ID_NV_GIAOPHIEU"));
            dc.setGioGiaophieu(rs.getDate("GIO_GIAOPHIEU"));
            dc.setIdCtDuthuong(rs.getString("ID_CT_DUTHUONG"));
            dc.setInlaiTunv(rs.getString("INLAI_TUNV"));
            dc.setIdNvInlaitunv(rs.getString("ID_NV_INLAITUNV"));
            dc.setNgayInlaitunv(rs.getDate("NGAY_INLAITUNV"));
            dc.setTenduong(rs.getString("TENDUONG"));
            dc.setLydoXmnk(rs.getString("LYDO_XMNK"));
            dc.setHotenGoc(rs.getString("HOTEN_GOC"));
            dc.setIdQuocgiaNhan(rs.getString("ID_QUOCGIA_NHAN"));
            dc.setTrangthaiTt(rs.getString("TRANGTHAI_TT"));
            dc.setInlaiDiduong(rs.getString("INLAI_DIDUONG"));
            dc.setIdNvIndiduong(rs.getString("ID_NV_INDIDUONG"));
            dc.setIdNvPhtreocthang(rs.getString("ID_NV_PHTREOCTHANG"));
            dc.setNgayChitraCthang(rs.getDate("NGAY_CHITRA_CTHANG"));
            dc.setIdNvChitraCthang(rs.getString("ID_NV_CHITRA_CTHANG"));
            dc.setSolaninDiduong(rs.getInt("SOLANIN_DIDUONG"));       
            dc.setMgCode(rs.getString("MG_CODE"));
            dc.setIdGpAuto(rs.getString("ID_GP_AUTO"));
            dc.setWardAuto(rs.getString("WARD_AUTO"));
            dc.setIdWard(rs.getString("ID_WARD"));
            dc.setAgentDate(rs.getString("AGENT_DATE"));
            dc.setSttImpDt(rs.getInt("STT_IMP_DT"));
            dc.setIdDieuchinhct(rs.getString("ID_DIEUCHINHCT"));
            dc.setTygiaDc(rs.getFloat("TYGIA_DC"));
           // dc.setIdQlqDottg(rs.getString("ID_QLQ_DOTTG"));
           // dc.setIdQlqDuyet(rs.getString("ID_QLQ_DUYET"));
          //  dc.setIdQlqMoichitien(rs.getString("ID_QLQ_MOICHITIEN"));
          //  dc.setIdQlqNhandutien(rs.getString("ID_QLQ_NHANDUTIEN"));
          //  dc.setQlqNgaychuyenKsq(rs.getDate("QLQ_NGAYCHUYEN_KSQ"));
         //   dc.setQlqNgayKsqDuyet(rs.getDate("QLQ_NGAY_KSQ_DUYET"));
          //  dc.setQlqNgayTquyMoi(rs.getDate("QLQ_NGAY_TQUY_MOI"));
           // dc.setQlqNgayTquyNhandutien(rs.getDate("QLQ_NGAY_TQUY_NHANDUTIEN"));
           // dc.setQlqNgayNvchinhaNhandu(rs.getDate("QLQ_NGAY_NVCHINHA_NHANDU"));
           // dc.setIdHoibaoMobile(rs.getString("ID_HOIBAO_MOBILE"));
            dc.setSotaikhoankh(rs.getString("SOTAIKHOANKH"));
            dc.setMaDuthuong(rs.getString("MA_DUTHUONG"));
            //dc.setIdKhuvucQuayso(rs.getString("ID_KHUVUC_QUAYSO"));
            dc.setNgaysinhkh(rs.getDate("NGAYSINHKH"));
     //       dc.setNgayMobiHb(rs.getDate("NGAY_MOBI_HB"));
      //      dc.setIdMobiHb(rs.getString("ID_MOBI_HB"));
           // dc.setKhachHangGd(rs.getString("KHACHHANG_GD"));
          //  dc.setNvkhgiaodich(rs.getString("NVKHGIAODICH"));
          //  dc.setNgaykhgd(rs.getDate("NGAYKHGD"));
          //  dc.setNvxulycv(rs.getString("NVXULYCV"));
          ////  dc.setNgaytiepnhan(rs.getDate("NGAYTIEPNHAN"));
         //   dc.setXacnhandoitac(rs.getString("XACNHANHTDOITAC"));
         //   dc.setNgayxacnhan(rs.getDate("NGAYXACNHAN"));
         //   dc.setIdnvxndoitac(rs.getString("IDNVXNDOITAC"));
            //dc.setBangchu(rs.getString("BANGCHU"));
            dc.setIdlock(rs.getString("ID_LOCK"));
         //   dc.setGhichutrangthai(rs.getString("GHICHUTRANGTHAI"));
          //  dc.setIdkhachhangtt(rs.getString("ID_KHACHHANGTT"));
            dc.setNgaysinh(rs.getDate("NGAYSINH"));
       //     dc.setThoigiaxuly(rs.getInt("THOIGIAXULY"));
        //    dc.setTrangthaixuly(rs.getString("TRANGTHAIXULY"));
        //    dc.setIdlydohuytt(rs.getString("ID_LYDOHUYTT"));

            this.vwdskhtructuyenktList.add(dc);
        }

        pstm.close();

        return vwdskhtructuyenktList;
    }

    public Boolean updateOneRecord(GiaodichTTModel inputClass) throws SQLException {

        Connection con = ConnectionProvider.getCon();
        String ketqua = null;
        String userid = SessionBean.getUserId();
        String idchinhanh = SessionBean.getChinhanhId();

        try {
            String fnCall = "{?= call KH.PKS_WEB_TRUCTUYEN.FUNC_CAPNHAT_GDTRUCTUYEN_WEB(?,?,?,?,?,?,?,?,?,?,?)}";

            CallableStatement stm = con.prepareCall(fnCall);
            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            if (inputClass.getLoaiTien().equalsIgnoreCase("VND")) {
                stm.registerOutParameter(7, oracle.jdbc.OracleTypes.NUMBER, 0);
            } else {
                stm.registerOutParameter(7, oracle.jdbc.OracleTypes.NUMBER, 2);
            }
            stm.setString(2, inputClass.getChinhanh());
            stm.setString(3, inputClass.getSophieu());
            stm.setInt(4, inputClass.getStt().intValue());
            stm.setString(5, inputClass.getDoitac());
            stm.setString(6, inputClass.getLoaiTien());

            if (inputClass.getLoaiTien().equalsIgnoreCase("VND")) {
                stm.setLong(7, inputClass.getSotien().longValue());
            } else {
                stm.setBigDecimal(7, (BigDecimal) inputClass.getSotien());
            }

            stm.setString(8, inputClass.getBangchu());
            stm.setString(9, inputClass.getNguoigui());
            stm.setString(10, inputClass.getTinnhan());
            stm.setString(11, userid);
            stm.setString(12, inputClass.getMaSoBienNhan());
            stm.executeUpdate();
            String upperCased = stm.getString(1);
            stm.close();
            //con.close();
       
            return true;
        } catch (SQLException ex) {

        
            return false;
        }
    }

//    Hàm hủy giao dịch của hội sở
    public Boolean huygiaodichhoiso(GiaodichTTModel dc) throws SQLException {
//        khởi tạo kết nối
        Connection con = ConnectionProvider.getCon();
//        tạo chuỗi truy vấn
        String fnCall = "{?= call KH.PKS_WEB_TRUCTUYEN.FUNC_HUYGIAODICH_TT(?,?,?,?,?)}";
        String idchinhanh = SessionBean.getChinhanhId();
        String iduser = SessionBean.getUserId();
        String kq = null;
        try {
//        tạo statement tuong ung voi cau truy van
            CallableStatement cstm = con.prepareCall(fnCall);
//        giới hạn thời gian thực hiện truy vấn
            cstm.setQueryTimeout(1800);
//        ràng buộc KDL tương ứng với từng tham số truyền vào
//        kiểu chuỗi không cần tạo ràng buộc
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            cstm.registerOutParameter(4, oracle.jdbc.OracleTypes.INTEGER);
//        gán giá trị cụ thể cho từng dấu ?
            cstm.setString(2, dc.getChinhanh());
            cstm.setString(3, dc.getSophieu());
            cstm.setInt(4, dc.getStt().intValue());
            cstm.setString(5, dc.getNoidunghuy());
            cstm.setString(6, iduser);
//            thực tri truy vấn
            cstm.executeUpdate();
//        lấy giá trị trả về của câu truy vấn
            kq = cstm.getString(1);
//            đóng kết nối
            cstm.close();
            if (kq.equalsIgnoreCase("T")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    //Cap nhat thong tin ho so tai quay vao ho so truc tuyen, sau do huy ho so tai quay
    public String capnhathosotructuyen(GiaodichTTModel dung, GiaodichTTModel sai) {
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?= call KH.PKS_WEB_TRUCTUYEN.FUNC_CAPNHAT_GDTRUCTUYEN_CCN(?,?,?,?,?,?,?)}";
        String userid = SessionBean.getUserId();
        String kq = null;
        try {
            CallableStatement cstm = con.prepareCall(fnCall);
            cstm.setQueryTimeout(1800);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            cstm.registerOutParameter(4, oracle.jdbc.OracleTypes.INTEGER);
            cstm.registerOutParameter(7, oracle.jdbc.OracleTypes.INTEGER);

            cstm.setString(2, dung.getChinhanh());
            cstm.setString(3, dung.getSophieu());
            cstm.setInt(4, dung.getStt().intValue());
            cstm.setString(5, sai.getChinhanh());
            cstm.setString(6, sai.getSophieu());
            cstm.setInt(7, sai.getStt().intValue());
            cstm.setString(8, userid);

            cstm.executeUpdate();
            kq = cstm.getString(1);
            cstm.close();
            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }

    public String insertOneRecord(GiaodichTTModel inputClass) throws SQLException {

        Connection con = ConnectionProvider.getCon();
        String ketqua = null;
        String userid = SessionBean.getUserId();
        String idchinhanh = SessionBean.getChinhanhId();
        if (idchinhanh != null) {

            try {
                String fnCall = "{?= call KH.PKS_WEB_TRUCTUYEN.INSERT_GIAODICH_TRUCTUYEN(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";

                /*CHINHANH VARCHAR2,  
                 HTEN VARCHAR2, 
                 MANGUOINHAN VARCHAR2,
                 IDCTTUYTHAN VARCHAR2, 
                 SCHUNGTU VARCHAR2 , 
                 NGAYC DATE , 
                 NOICAP VARCHAR2 , 
                 SOTIEN NUMBER , 
                 QUOCGIA VARCHAR2,
                 CITY VARCHAR2, 
                 DISTRICT VARCHAR2,
                 NVNHAP VARCHAR2,
                 LTIEN varchar2 ,
                 DTHOAI VARCHAR2,
                 NGUI VARCHAR2,
                 LOAITIEN VARCHAR2,
                 DCHI VARCHAR2)*/
                CallableStatement stm = con.prepareCall(fnCall);
                stm.setQueryTimeout(1800);
                stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
                stm.registerOutParameter(7, oracle.jdbc.OracleTypes.DATE);
                stm.registerOutParameter(9, oracle.jdbc.OracleTypes.NUMBER, 2);

                stm.setString(2, idchinhanh);
                stm.setString(3, inputClass.getHotenKh());
                stm.setString(4, inputClass.getMaSoBienNhan());
                stm.setString(5, inputClass.getIdLoaiGiayTo());
                stm.setString(6, inputClass.getSoGiayTo());
                stm.setDate(7, new java.sql.Date(inputClass.getNgaycap().getTime()));
                stm.setString(8, inputClass.getNoicap());
                stm.setBigDecimal(9, (BigDecimal) inputClass.getSotien());
                stm.setString(10, inputClass.getQuocgia());
                stm.setString(11, inputClass.getThanhpho());
                stm.setString(12, inputClass.getQuanhuyen());
                stm.setString(13, userid);
                stm.setString(14, inputClass.getLoaiTien());
                stm.setString(15, inputClass.getDienthoai());
                stm.setString(16, inputClass.getNguoigui());
                stm.setString(17, inputClass.getLoaiTien());
                stm.setString(18, inputClass.getDiaChi());
                stm.setString(19, inputClass.getMaKhachHang());
                stm.setString(20, inputClass.getDoitac());
                stm.executeUpdate();
                //String dt = stm.getString(15);
                ketqua = stm.getString(1);
                stm.close();
                //con.close();
                return ketqua;
            } catch (SQLException ex) {

                 SystemFunc.SystemBean.proMessError(ex.getMessage());
                return ketqua;

            }
        } else {
             SystemFunc.SystemBean.proMessError("Ma chi nhanh khong ton tai!");
            return ketqua;
        }

    }

    public String xacnhangiaodich(GiaodichTTModel inputClass) {
        Connection con = ConnectionProvider.getCon();
        String userid = SessionBean.getUserId();
        String kq = null;
        String fnCall = "{?= call KH.PKS_WEB_TRUCTUYEN.FUN_XACNHAN_GIAODICH_TT(?,?,?,? )}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);
            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.NUMBER, 0);
            stm.setString(2, inputClass.getChinhanh());
            stm.setString(3, inputClass.getSophieu());
            stm.setInt(4, inputClass.getStt().intValue());
            stm.setString(5, userid);

            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }

    public String huygiaodich(GiaodichTTModel inputClass) {
        Connection con = ConnectionProvider.getCon();
        String userid = SessionBean.getUserId();
        String kq = null;
        String fnCall = "{?= call KH.PKS_WEB_TRUCTUYEN.FUNC_HUY_GDTRUCTUYEN_WEB(?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);
            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.NUMBER, 0);
            stm.setString(2, inputClass.getChinhanh());
            stm.setString(3, inputClass.getSophieu());
            stm.setInt(4, inputClass.getStt().intValue());
            stm.setString(5, userid);

            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            return kq;
        }
    }

}
