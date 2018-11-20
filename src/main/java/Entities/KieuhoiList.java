 
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

 
@Entity
@Table(name = "KIEUHOI_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KieuhoiList.findAll", query = "SELECT k FROM KieuhoiList k")
    , @NamedQuery(name = "KieuhoiList.findByIdChinhanh", query = "SELECT k FROM KieuhoiList k WHERE k.kieuhoiListPK.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "KieuhoiList.findBySophieu", query = "SELECT k FROM KieuhoiList k WHERE k.kieuhoiListPK.sophieu = :sophieu")
    , @NamedQuery(name = "KieuhoiList.findByStt", query = "SELECT k FROM KieuhoiList k WHERE k.kieuhoiListPK.stt = :stt")
    , @NamedQuery(name = "KieuhoiList.findByNgaycapnhat", query = "SELECT k FROM KieuhoiList k WHERE k.ngaycapnhat = :ngaycapnhat")
    , @NamedQuery(name = "KieuhoiList.findBySolanin", query = "SELECT k FROM KieuhoiList k WHERE k.solanin = :solanin")
    , @NamedQuery(name = "KieuhoiList.findByGhichu", query = "SELECT k FROM KieuhoiList k WHERE k.ghichu = :ghichu")
    , @NamedQuery(name = "KieuhoiList.findByIdNvNhaplieu", query = "SELECT k FROM KieuhoiList k WHERE k.idNvNhaplieu = :idNvNhaplieu")
    , @NamedQuery(name = "KieuhoiList.findByNgayNhaplieu", query = "SELECT k FROM KieuhoiList k WHERE k.ngayNhaplieu = :ngayNhaplieu")
    , @NamedQuery(name = "KieuhoiList.findByIdNvChitra", query = "SELECT k FROM KieuhoiList k WHERE k.idNvChitra = :idNvChitra")
    , @NamedQuery(name = "KieuhoiList.findByNgayChitra", query = "SELECT k FROM KieuhoiList k WHERE k.ngayChitra = :ngayChitra")
    , @NamedQuery(name = "KieuhoiList.findBySotiengoi", query = "SELECT k FROM KieuhoiList k WHERE k.sotiengoi = :sotiengoi")
    , @NamedQuery(name = "KieuhoiList.findByTygia", query = "SELECT k FROM KieuhoiList k WHERE k.tygia = :tygia")
    , @NamedQuery(name = "KieuhoiList.findByThanhtien", query = "SELECT k FROM KieuhoiList k WHERE k.thanhtien = :thanhtien")
    , @NamedQuery(name = "KieuhoiList.findByIdDiadiemchitra", query = "SELECT k FROM KieuhoiList k WHERE k.idDiadiemchitra = :idDiadiemchitra")
    , @NamedQuery(name = "KieuhoiList.findByGhichuGoi", query = "SELECT k FROM KieuhoiList k WHERE k.ghichuGoi = :ghichuGoi")
    , @NamedQuery(name = "KieuhoiList.findByMaNguoinhan", query = "SELECT k FROM KieuhoiList k WHERE k.maNguoinhan = :maNguoinhan")
    , @NamedQuery(name = "KieuhoiList.findByDiachi", query = "SELECT k FROM KieuhoiList k WHERE k.diachi = :diachi")
    , @NamedQuery(name = "KieuhoiList.findByIdCity", query = "SELECT k FROM KieuhoiList k WHERE k.idCity = :idCity")
    , @NamedQuery(name = "KieuhoiList.findByIdDistrict", query = "SELECT k FROM KieuhoiList k WHERE k.idDistrict = :idDistrict")
    , @NamedQuery(name = "KieuhoiList.findBySoCtTuythan", query = "SELECT k FROM KieuhoiList k WHERE k.soCtTuythan = :soCtTuythan")
    , @NamedQuery(name = "KieuhoiList.findByNgaycap", query = "SELECT k FROM KieuhoiList k WHERE k.ngaycap = :ngaycap")
    , @NamedQuery(name = "KieuhoiList.findByIdNoicap", query = "SELECT k FROM KieuhoiList k WHERE k.idNoicap = :idNoicap")
    , @NamedQuery(name = "KieuhoiList.findByDachitra", query = "SELECT k FROM KieuhoiList k WHERE k.dachitra = :dachitra")
    , @NamedQuery(name = "KieuhoiList.findByNguoigoi", query = "SELECT k FROM KieuhoiList k WHERE k.nguoigoi = :nguoigoi")
    , @NamedQuery(name = "KieuhoiList.findByIdCongno", query = "SELECT k FROM KieuhoiList k WHERE k.idCongno = :idCongno")
    , @NamedQuery(name = "KieuhoiList.findByIdDoitac", query = "SELECT k FROM KieuhoiList k WHERE k.idDoitac = :idDoitac")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaitienchitra", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaitienchitra = :idLoaitienchitra")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaitiengoi", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaitiengoi = :idLoaitiengoi")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaicongno", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaicongno = :idLoaicongno")
    , @NamedQuery(name = "KieuhoiList.findBySolandichitra", query = "SELECT k FROM KieuhoiList k WHERE k.solandichitra = :solandichitra")
    , @NamedQuery(name = "KieuhoiList.findByIdNvXoaphieu", query = "SELECT k FROM KieuhoiList k WHERE k.idNvXoaphieu = :idNvXoaphieu")
    , @NamedQuery(name = "KieuhoiList.findByNgayXoaphieu", query = "SELECT k FROM KieuhoiList k WHERE k.ngayXoaphieu = :ngayXoaphieu")
    , @NamedQuery(name = "KieuhoiList.findByLydoxoaphieu", query = "SELECT k FROM KieuhoiList k WHERE k.lydoxoaphieu = :lydoxoaphieu")
    , @NamedQuery(name = "KieuhoiList.findByDienthoai", query = "SELECT k FROM KieuhoiList k WHERE k.dienthoai = :dienthoai")
    , @NamedQuery(name = "KieuhoiList.findByNgaygiaophieu", query = "SELECT k FROM KieuhoiList k WHERE k.ngaygiaophieu = :ngaygiaophieu")
    , @NamedQuery(name = "KieuhoiList.findByNgaynhanphieu", query = "SELECT k FROM KieuhoiList k WHERE k.ngaynhanphieu = :ngaynhanphieu")
    , @NamedQuery(name = "KieuhoiList.findByDanhanphieu", query = "SELECT k FROM KieuhoiList k WHERE k.danhanphieu = :danhanphieu")
    , @NamedQuery(name = "KieuhoiList.findByHoahongTaiquay", query = "SELECT k FROM KieuhoiList k WHERE k.hoahongTaiquay = :hoahongTaiquay")
    , @NamedQuery(name = "KieuhoiList.findByHoahongTainha", query = "SELECT k FROM KieuhoiList k WHERE k.hoahongTainha = :hoahongTainha")
    , @NamedQuery(name = "KieuhoiList.findBySolaninGiaophieu", query = "SELECT k FROM KieuhoiList k WHERE k.solaninGiaophieu = :solaninGiaophieu")
    , @NamedQuery(name = "KieuhoiList.findByTygiaQuydoi", query = "SELECT k FROM KieuhoiList k WHERE k.tygiaQuydoi = :tygiaQuydoi")
    , @NamedQuery(name = "KieuhoiList.findByChiphidilai", query = "SELECT k FROM KieuhoiList k WHERE k.chiphidilai = :chiphidilai")
    , @NamedQuery(name = "KieuhoiList.findByTygiaNgay", query = "SELECT k FROM KieuhoiList k WHERE k.tygiaNgay = :tygiaNgay")
    , @NamedQuery(name = "KieuhoiList.findBySotienCongno", query = "SELECT k FROM KieuhoiList k WHERE k.sotienCongno = :sotienCongno")
    , @NamedQuery(name = "KieuhoiList.findByNgayHoibao", query = "SELECT k FROM KieuhoiList k WHERE k.ngayHoibao = :ngayHoibao")
    , @NamedQuery(name = "KieuhoiList.findByIdNvHoibao", query = "SELECT k FROM KieuhoiList k WHERE k.idNvHoibao = :idNvHoibao")
    , @NamedQuery(name = "KieuhoiList.findByDahoibao", query = "SELECT k FROM KieuhoiList k WHERE k.dahoibao = :dahoibao")
    , @NamedQuery(name = "KieuhoiList.findByTreophieu", query = "SELECT k FROM KieuhoiList k WHERE k.treophieu = :treophieu")
    , @NamedQuery(name = "KieuhoiList.findByPhihoahong", query = "SELECT k FROM KieuhoiList k WHERE k.phihoahong = :phihoahong")
    , @NamedQuery(name = "KieuhoiList.findByGiotinhNam", query = "SELECT k FROM KieuhoiList k WHERE k.giotinhNam = :giotinhNam")
    , @NamedQuery(name = "KieuhoiList.findByNamsinh", query = "SELECT k FROM KieuhoiList k WHERE k.namsinh = :namsinh")
    , @NamedQuery(name = "KieuhoiList.findBySolanXuatfile", query = "SELECT k FROM KieuhoiList k WHERE k.solanXuatfile = :solanXuatfile")
    , @NamedQuery(name = "KieuhoiList.findByDakiemtra", query = "SELECT k FROM KieuhoiList k WHERE k.dakiemtra = :dakiemtra")
    , @NamedQuery(name = "KieuhoiList.findByIdNvKt", query = "SELECT k FROM KieuhoiList k WHERE k.idNvKt = :idNvKt")
    , @NamedQuery(name = "KieuhoiList.findByNgayKiemtra", query = "SELECT k FROM KieuhoiList k WHERE k.ngayKiemtra = :ngayKiemtra")
    , @NamedQuery(name = "KieuhoiList.findByDatruyenfile", query = "SELECT k FROM KieuhoiList k WHERE k.datruyenfile = :datruyenfile")
    , @NamedQuery(name = "KieuhoiList.findByFileName", query = "SELECT k FROM KieuhoiList k WHERE k.fileName = :fileName")
    , @NamedQuery(name = "KieuhoiList.findByIdChinhanhChitra", query = "SELECT k FROM KieuhoiList k WHERE k.idChinhanhChitra = :idChinhanhChitra")
    , @NamedQuery(name = "KieuhoiList.findByBiennhan", query = "SELECT k FROM KieuhoiList k WHERE k.biennhan = :biennhan")
    , @NamedQuery(name = "KieuhoiList.findByNgayBiennhan", query = "SELECT k FROM KieuhoiList k WHERE k.ngayBiennhan = :ngayBiennhan")
    , @NamedQuery(name = "KieuhoiList.findByIdNvBiennhan", query = "SELECT k FROM KieuhoiList k WHERE k.idNvBiennhan = :idNvBiennhan")
    , @NamedQuery(name = "KieuhoiList.findByCongtacvien", query = "SELECT k FROM KieuhoiList k WHERE k.congtacvien = :congtacvien")
    , @NamedQuery(name = "KieuhoiList.findByIdThanhtoan", query = "SELECT k FROM KieuhoiList k WHERE k.idThanhtoan = :idThanhtoan")
    , @NamedQuery(name = "KieuhoiList.findByTaikhoanthe", query = "SELECT k FROM KieuhoiList k WHERE k.taikhoanthe = :taikhoanthe")
    , @NamedQuery(name = "KieuhoiList.findByTruyenfileDoitac", query = "SELECT k FROM KieuhoiList k WHERE k.truyenfileDoitac = :truyenfileDoitac")
    , @NamedQuery(name = "KieuhoiList.findByGioTruyenfile", query = "SELECT k FROM KieuhoiList k WHERE k.gioTruyenfile = :gioTruyenfile")
    , @NamedQuery(name = "KieuhoiList.findByDateTruyenfile", query = "SELECT k FROM KieuhoiList k WHERE k.dateTruyenfile = :dateTruyenfile")
    , @NamedQuery(name = "KieuhoiList.findByXacminh", query = "SELECT k FROM KieuhoiList k WHERE k.xacminh = :xacminh")
    , @NamedQuery(name = "KieuhoiList.findByNgayXacminh", query = "SELECT k FROM KieuhoiList k WHERE k.ngayXacminh = :ngayXacminh")
    , @NamedQuery(name = "KieuhoiList.findByIdNvTruyenfile", query = "SELECT k FROM KieuhoiList k WHERE k.idNvTruyenfile = :idNvTruyenfile")
    , @NamedQuery(name = "KieuhoiList.findByHoten", query = "SELECT k FROM KieuhoiList k WHERE k.hoten = :hoten")
    , @NamedQuery(name = "KieuhoiList.findByHoten1", query = "SELECT k FROM KieuhoiList k WHERE k.hoten1 = :hoten1")
    , @NamedQuery(name = "KieuhoiList.findByHoten2", query = "SELECT k FROM KieuhoiList k WHERE k.hoten2 = :hoten2")
    , @NamedQuery(name = "KieuhoiList.findByIdCtTuythan", query = "SELECT k FROM KieuhoiList k WHERE k.idCtTuythan = :idCtTuythan")
    , @NamedQuery(name = "KieuhoiList.findByMaKhachhang", query = "SELECT k FROM KieuhoiList k WHERE k.maKhachhang = :maKhachhang")
    , @NamedQuery(name = "KieuhoiList.findByKhachhangNhan", query = "SELECT k FROM KieuhoiList k WHERE k.khachhangNhan = :khachhangNhan")
    , @NamedQuery(name = "KieuhoiList.findByIdNvBaocao", query = "SELECT k FROM KieuhoiList k WHERE k.idNvBaocao = :idNvBaocao")
    , @NamedQuery(name = "KieuhoiList.findByNgayBaocao", query = "SELECT k FROM KieuhoiList k WHERE k.ngayBaocao = :ngayBaocao")
    , @NamedQuery(name = "KieuhoiList.findByNoinhantien", query = "SELECT k FROM KieuhoiList k WHERE k.noinhantien = :noinhantien")
    , @NamedQuery(name = "KieuhoiList.findByIdNvUpdate", query = "SELECT k FROM KieuhoiList k WHERE k.idNvUpdate = :idNvUpdate")
    , @NamedQuery(name = "KieuhoiList.findByNgayUpdate", query = "SELECT k FROM KieuhoiList k WHERE k.ngayUpdate = :ngayUpdate")
    , @NamedQuery(name = "KieuhoiList.findByGiaytoHoten", query = "SELECT k FROM KieuhoiList k WHERE k.giaytoHoten = :giaytoHoten")
    , @NamedQuery(name = "KieuhoiList.findByGiaytoHoten1", query = "SELECT k FROM KieuhoiList k WHERE k.giaytoHoten1 = :giaytoHoten1")
    , @NamedQuery(name = "KieuhoiList.findByGiaytoHoten2", query = "SELECT k FROM KieuhoiList k WHERE k.giaytoHoten2 = :giaytoHoten2")
    , @NamedQuery(name = "KieuhoiList.findByCountPrint", query = "SELECT k FROM KieuhoiList k WHERE k.countPrint = :countPrint")
    , @NamedQuery(name = "KieuhoiList.findByNhapho", query = "SELECT k FROM KieuhoiList k WHERE k.nhapho = :nhapho")
    , @NamedQuery(name = "KieuhoiList.findByTrangthai", query = "SELECT k FROM KieuhoiList k WHERE k.trangthai = :trangthai")
    , @NamedQuery(name = "KieuhoiList.findByXacnhan", query = "SELECT k FROM KieuhoiList k WHERE k.xacnhan = :xacnhan")
    , @NamedQuery(name = "KieuhoiList.findByIdNvXacnhan", query = "SELECT k FROM KieuhoiList k WHERE k.idNvXacnhan = :idNvXacnhan")
    , @NamedQuery(name = "KieuhoiList.findByNgayXacnhan", query = "SELECT k FROM KieuhoiList k WHERE k.ngayXacnhan = :ngayXacnhan")
    , @NamedQuery(name = "KieuhoiList.findByNhands", query = "SELECT k FROM KieuhoiList k WHERE k.nhands = :nhands")
    , @NamedQuery(name = "KieuhoiList.findByIdNvNhands", query = "SELECT k FROM KieuhoiList k WHERE k.idNvNhands = :idNvNhands")
    , @NamedQuery(name = "KieuhoiList.findByNgayNhands", query = "SELECT k FROM KieuhoiList k WHERE k.ngayNhands = :ngayNhands")
    , @NamedQuery(name = "KieuhoiList.findByNgayChitraTrue", query = "SELECT k FROM KieuhoiList k WHERE k.ngayChitraTrue = :ngayChitraTrue")
    , @NamedQuery(name = "KieuhoiList.findByIdNvXacminh", query = "SELECT k FROM KieuhoiList k WHERE k.idNvXacminh = :idNvXacminh")
    , @NamedQuery(name = "KieuhoiList.findByChuyenBdien", query = "SELECT k FROM KieuhoiList k WHERE k.chuyenBdien = :chuyenBdien")
    , @NamedQuery(name = "KieuhoiList.findByMaXoaphieu", query = "SELECT k FROM KieuhoiList k WHERE k.maXoaphieu = :maXoaphieu")
    , @NamedQuery(name = "KieuhoiList.findByIdNvTreophieu", query = "SELECT k FROM KieuhoiList k WHERE k.idNvTreophieu = :idNvTreophieu")
    , @NamedQuery(name = "KieuhoiList.findByNgayTreophieu", query = "SELECT k FROM KieuhoiList k WHERE k.ngayTreophieu = :ngayTreophieu")
    , @NamedQuery(name = "KieuhoiList.findByMoikhach", query = "SELECT k FROM KieuhoiList k WHERE k.moikhach = :moikhach")
    , @NamedQuery(name = "KieuhoiList.findByNvMoikhach", query = "SELECT k FROM KieuhoiList k WHERE k.nvMoikhach = :nvMoikhach")
    , @NamedQuery(name = "KieuhoiList.findByNgayMoikhach", query = "SELECT k FROM KieuhoiList k WHERE k.ngayMoikhach = :ngayMoikhach")
    , @NamedQuery(name = "KieuhoiList.findByNghingo", query = "SELECT k FROM KieuhoiList k WHERE k.nghingo = :nghingo")
    , @NamedQuery(name = "KieuhoiList.findByLydonghingo", query = "SELECT k FROM KieuhoiList k WHERE k.lydonghingo = :lydonghingo")
    , @NamedQuery(name = "KieuhoiList.findByMakhNghingo", query = "SELECT k FROM KieuhoiList k WHERE k.makhNghingo = :makhNghingo")
    , @NamedQuery(name = "KieuhoiList.findByDakhaosat", query = "SELECT k FROM KieuhoiList k WHERE k.dakhaosat = :dakhaosat")
    , @NamedQuery(name = "KieuhoiList.findByRecordNote", query = "SELECT k FROM KieuhoiList k WHERE k.recordNote = :recordNote")
    , @NamedQuery(name = "KieuhoiList.findByGionhaplieu", query = "SELECT k FROM KieuhoiList k WHERE k.gionhaplieu = :gionhaplieu")
    , @NamedQuery(name = "KieuhoiList.findByNgayNghingo", query = "SELECT k FROM KieuhoiList k WHERE k.ngayNghingo = :ngayNghingo")
    , @NamedQuery(name = "KieuhoiList.findByIdNvNghingo", query = "SELECT k FROM KieuhoiList k WHERE k.idNvNghingo = :idNvNghingo")
    , @NamedQuery(name = "KieuhoiList.findByIdTreotaiquay", query = "SELECT k FROM KieuhoiList k WHERE k.idTreotaiquay = :idTreotaiquay")
    , @NamedQuery(name = "KieuhoiList.findByAgent", query = "SELECT k FROM KieuhoiList k WHERE k.agent = :agent")
    , @NamedQuery(name = "KieuhoiList.findByIdAgent", query = "SELECT k FROM KieuhoiList k WHERE k.idAgent = :idAgent")
    , @NamedQuery(name = "KieuhoiList.findByExtOrder", query = "SELECT k FROM KieuhoiList k WHERE k.extOrder = :extOrder")
    , @NamedQuery(name = "KieuhoiList.findByPayagentseq", query = "SELECT k FROM KieuhoiList k WHERE k.payagentseq = :payagentseq")
    , @NamedQuery(name = "KieuhoiList.findByPinNo", query = "SELECT k FROM KieuhoiList k WHERE k.pinNo = :pinNo")
    , @NamedQuery(name = "KieuhoiList.findByMaHtbn", query = "SELECT k FROM KieuhoiList k WHERE k.maHtbn = :maHtbn")
    , @NamedQuery(name = "KieuhoiList.findByIdTieuchi", query = "SELECT k FROM KieuhoiList k WHERE k.idTieuchi = :idTieuchi")
    , @NamedQuery(name = "KieuhoiList.findByIdKhh", query = "SELECT k FROM KieuhoiList k WHERE k.idKhh = :idKhh")
    , @NamedQuery(name = "KieuhoiList.findByLydoKhh", query = "SELECT k FROM KieuhoiList k WHERE k.lydoKhh = :lydoKhh")
    , @NamedQuery(name = "KieuhoiList.findByNgayKhh", query = "SELECT k FROM KieuhoiList k WHERE k.ngayKhh = :ngayKhh")
    , @NamedQuery(name = "KieuhoiList.findByIdNvKhh", query = "SELECT k FROM KieuhoiList k WHERE k.idNvKhh = :idNvKhh")
    , @NamedQuery(name = "KieuhoiList.findByIdNvPhuchoi", query = "SELECT k FROM KieuhoiList k WHERE k.idNvPhuchoi = :idNvPhuchoi")
    , @NamedQuery(name = "KieuhoiList.findByNgayPhuchoi", query = "SELECT k FROM KieuhoiList k WHERE k.ngayPhuchoi = :ngayPhuchoi")
    , @NamedQuery(name = "KieuhoiList.findByMaPin", query = "SELECT k FROM KieuhoiList k WHERE k.maPin = :maPin")
    , @NamedQuery(name = "KieuhoiList.findByMaQlds", query = "SELECT k FROM KieuhoiList k WHERE k.maQlds = :maQlds")
    , @NamedQuery(name = "KieuhoiList.findByMaDsXacnhan", query = "SELECT k FROM KieuhoiList k WHERE k.maDsXacnhan = :maDsXacnhan")
    , @NamedQuery(name = "KieuhoiList.findByThukem", query = "SELECT k FROM KieuhoiList k WHERE k.thukem = :thukem")
    , @NamedQuery(name = "KieuhoiList.findByLydoInlaibn", query = "SELECT k FROM KieuhoiList k WHERE k.lydoInlaibn = :lydoInlaibn")
    , @NamedQuery(name = "KieuhoiList.findByInlaibn", query = "SELECT k FROM KieuhoiList k WHERE k.inlaibn = :inlaibn")
    , @NamedQuery(name = "KieuhoiList.findByInnvduyetInlaibn", query = "SELECT k FROM KieuhoiList k WHERE k.innvduyetInlaibn = :innvduyetInlaibn")
    , @NamedQuery(name = "KieuhoiList.findByNgayduyetInlaibn", query = "SELECT k FROM KieuhoiList k WHERE k.ngayduyetInlaibn = :ngayduyetInlaibn")
    , @NamedQuery(name = "KieuhoiList.findByChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.chuyencn = :chuyencn")
    , @NamedQuery(name = "KieuhoiList.findByLydoYcChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.lydoYcChuyencn = :lydoYcChuyencn")
    , @NamedQuery(name = "KieuhoiList.findByGhichuYcChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.ghichuYcChuyencn = :ghichuYcChuyencn")
    , @NamedQuery(name = "KieuhoiList.findByIdNvDuyetChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.idNvDuyetChuyencn = :idNvDuyetChuyencn")
    , @NamedQuery(name = "KieuhoiList.findByNgayChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.ngayChuyencn = :ngayChuyencn")
    , @NamedQuery(name = "KieuhoiList.findByNgayYeucauChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.ngayYeucauChuyencn = :ngayYeucauChuyencn")
    , @NamedQuery(name = "KieuhoiList.findByIdNvYcChuyencn", query = "SELECT k FROM KieuhoiList k WHERE k.idNvYcChuyencn = :idNvYcChuyencn")
    , @NamedQuery(name = "KieuhoiList.findByLydoUpdate", query = "SELECT k FROM KieuhoiList k WHERE k.lydoUpdate = :lydoUpdate")
    , @NamedQuery(name = "KieuhoiList.findByBiennhanC", query = "SELECT k FROM KieuhoiList k WHERE k.biennhanC = :biennhanC")
    , @NamedQuery(name = "KieuhoiList.findBySobn", query = "SELECT k FROM KieuhoiList k WHERE k.sobn = :sobn")
    , @NamedQuery(name = "KieuhoiList.findByNgayPhCtTam", query = "SELECT k FROM KieuhoiList k WHERE k.ngayPhCtTam = :ngayPhCtTam")
    , @NamedQuery(name = "KieuhoiList.findByIdNvPhCtTam", query = "SELECT k FROM KieuhoiList k WHERE k.idNvPhCtTam = :idNvPhCtTam")
    , @NamedQuery(name = "KieuhoiList.findByGhichuPhCtTam", query = "SELECT k FROM KieuhoiList k WHERE k.ghichuPhCtTam = :ghichuPhCtTam")
    , @NamedQuery(name = "KieuhoiList.findByHbdt", query = "SELECT k FROM KieuhoiList k WHERE k.hbdt = :hbdt")
    , @NamedQuery(name = "KieuhoiList.findByDothb", query = "SELECT k FROM KieuhoiList k WHERE k.dothb = :dothb")
    , @NamedQuery(name = "KieuhoiList.findByNgayhbdt", query = "SELECT k FROM KieuhoiList k WHERE k.ngayhbdt = :ngayhbdt")
    , @NamedQuery(name = "KieuhoiList.findByHbfileno", query = "SELECT k FROM KieuhoiList k WHERE k.hbfileno = :hbfileno")
    , @NamedQuery(name = "KieuhoiList.findByBsttxacminh", query = "SELECT k FROM KieuhoiList k WHERE k.bsttxacminh = :bsttxacminh")
    , @NamedQuery(name = "KieuhoiList.findByNoidungbstt", query = "SELECT k FROM KieuhoiList k WHERE k.noidungbstt = :noidungbstt")
    , @NamedQuery(name = "KieuhoiList.findByNgaybstt", query = "SELECT k FROM KieuhoiList k WHERE k.ngaybstt = :ngaybstt")
    , @NamedQuery(name = "KieuhoiList.findByNvbstt", query = "SELECT k FROM KieuhoiList k WHERE k.nvbstt = :nvbstt")
    , @NamedQuery(name = "KieuhoiList.findByXacnhanPcrt", query = "SELECT k FROM KieuhoiList k WHERE k.xacnhanPcrt = :xacnhanPcrt")
    , @NamedQuery(name = "KieuhoiList.findByIdNvXnPcrt", query = "SELECT k FROM KieuhoiList k WHERE k.idNvXnPcrt = :idNvXnPcrt")
    , @NamedQuery(name = "KieuhoiList.findByNgayXnPcrt", query = "SELECT k FROM KieuhoiList k WHERE k.ngayXnPcrt = :ngayXnPcrt")
    , @NamedQuery(name = "KieuhoiList.findByClockRecord", query = "SELECT k FROM KieuhoiList k WHERE k.clockRecord = :clockRecord")
    , @NamedQuery(name = "KieuhoiList.findByIdNvKspcrt", query = "SELECT k FROM KieuhoiList k WHERE k.idNvKspcrt = :idNvKspcrt")
    , @NamedQuery(name = "KieuhoiList.findByNgayKspcrt", query = "SELECT k FROM KieuhoiList k WHERE k.ngayKspcrt = :ngayKspcrt")
    , @NamedQuery(name = "KieuhoiList.findByMakhHuychi", query = "SELECT k FROM KieuhoiList k WHERE k.makhHuychi = :makhHuychi")
    , @NamedQuery(name = "KieuhoiList.findByDuyetDsDx", query = "SELECT k FROM KieuhoiList k WHERE k.duyetDsDx = :duyetDsDx")
    , @NamedQuery(name = "KieuhoiList.findByIdNvDuyetDsDx", query = "SELECT k FROM KieuhoiList k WHERE k.idNvDuyetDsDx = :idNvDuyetDsDx")
    , @NamedQuery(name = "KieuhoiList.findByNgayDuyetDsDx", query = "SELECT k FROM KieuhoiList k WHERE k.ngayDuyetDsDx = :ngayDuyetDsDx")
    , @NamedQuery(name = "KieuhoiList.findByIdPcrt", query = "SELECT k FROM KieuhoiList k WHERE k.idPcrt = :idPcrt")
    , @NamedQuery(name = "KieuhoiList.findByNhantin", query = "SELECT k FROM KieuhoiList k WHERE k.nhantin = :nhantin")
    , @NamedQuery(name = "KieuhoiList.findByDienthoaiNt", query = "SELECT k FROM KieuhoiList k WHERE k.dienthoaiNt = :dienthoaiNt")
    , @NamedQuery(name = "KieuhoiList.findByNoidungSms", query = "SELECT k FROM KieuhoiList k WHERE k.noidungSms = :noidungSms")
    , @NamedQuery(name = "KieuhoiList.findByDateSms", query = "SELECT k FROM KieuhoiList k WHERE k.dateSms = :dateSms")
    , @NamedQuery(name = "KieuhoiList.findByIdNvSms", query = "SELECT k FROM KieuhoiList k WHERE k.idNvSms = :idNvSms")
    , @NamedQuery(name = "KieuhoiList.findByIdSms", query = "SELECT k FROM KieuhoiList k WHERE k.idSms = :idSms")
    , @NamedQuery(name = "KieuhoiList.findByIdGiaodich", query = "SELECT k FROM KieuhoiList k WHERE k.idGiaodich = :idGiaodich")
    , @NamedQuery(name = "KieuhoiList.findByIdBank", query = "SELECT k FROM KieuhoiList k WHERE k.idBank = :idBank")
    , @NamedQuery(name = "KieuhoiList.findByDotck", query = "SELECT k FROM KieuhoiList k WHERE k.dotck = :dotck")
    , @NamedQuery(name = "KieuhoiList.findByGhichuCk", query = "SELECT k FROM KieuhoiList k WHERE k.ghichuCk = :ghichuCk")
    , @NamedQuery(name = "KieuhoiList.findByNgayCk", query = "SELECT k FROM KieuhoiList k WHERE k.ngayCk = :ngayCk")
    , @NamedQuery(name = "KieuhoiList.findByIdNvCk", query = "SELECT k FROM KieuhoiList k WHERE k.idNvCk = :idNvCk")
    , @NamedQuery(name = "KieuhoiList.findByDack", query = "SELECT k FROM KieuhoiList k WHERE k.dack = :dack")
    , @NamedQuery(name = "KieuhoiList.findByCkTienmat", query = "SELECT k FROM KieuhoiList k WHERE k.ckTienmat = :ckTienmat")
    , @NamedQuery(name = "KieuhoiList.findByIdNvCtck", query = "SELECT k FROM KieuhoiList k WHERE k.idNvCtck = :idNvCtck")
    , @NamedQuery(name = "KieuhoiList.findByNgayCtck", query = "SELECT k FROM KieuhoiList k WHERE k.ngayCtck = :ngayCtck")
    , @NamedQuery(name = "KieuhoiList.findByXacnhanCk", query = "SELECT k FROM KieuhoiList k WHERE k.xacnhanCk = :xacnhanCk")
    , @NamedQuery(name = "KieuhoiList.findByGhichuCtck", query = "SELECT k FROM KieuhoiList k WHERE k.ghichuCtck = :ghichuCtck")
    , @NamedQuery(name = "KieuhoiList.findByIdBranchArb", query = "SELECT k FROM KieuhoiList k WHERE k.idBranchArb = :idBranchArb")
    , @NamedQuery(name = "KieuhoiList.findByIdNvPhck", query = "SELECT k FROM KieuhoiList k WHERE k.idNvPhck = :idNvPhck")
    , @NamedQuery(name = "KieuhoiList.findByNgayPhck", query = "SELECT k FROM KieuhoiList k WHERE k.ngayPhck = :ngayPhck")
    , @NamedQuery(name = "KieuhoiList.findByIdDuyetKtck", query = "SELECT k FROM KieuhoiList k WHERE k.idDuyetKtck = :idDuyetKtck")
    , @NamedQuery(name = "KieuhoiList.findByNgayDuyetKtck", query = "SELECT k FROM KieuhoiList k WHERE k.ngayDuyetKtck = :ngayDuyetKtck")
    , @NamedQuery(name = "KieuhoiList.findByIdNvDuyetCtck", query = "SELECT k FROM KieuhoiList k WHERE k.idNvDuyetCtck = :idNvDuyetCtck")
    , @NamedQuery(name = "KieuhoiList.findByNgayXnck", query = "SELECT k FROM KieuhoiList k WHERE k.ngayXnck = :ngayXnck")
    , @NamedQuery(name = "KieuhoiList.findByIdNvYcInlai", query = "SELECT k FROM KieuhoiList k WHERE k.idNvYcInlai = :idNvYcInlai")
    , @NamedQuery(name = "KieuhoiList.findByDachitratreo", query = "SELECT k FROM KieuhoiList k WHERE k.dachitratreo = :dachitratreo")
    , @NamedQuery(name = "KieuhoiList.findByIdTreophieu", query = "SELECT k FROM KieuhoiList k WHERE k.idTreophieu = :idTreophieu")
    , @NamedQuery(name = "KieuhoiList.findByIdSsDt", query = "SELECT k FROM KieuhoiList k WHERE k.idSsDt = :idSsDt")
    , @NamedQuery(name = "KieuhoiList.findByIdNvTphieu", query = "SELECT k FROM KieuhoiList k WHERE k.idNvTphieu = :idNvTphieu")
    , @NamedQuery(name = "KieuhoiList.findByNgayTphieu", query = "SELECT k FROM KieuhoiList k WHERE k.ngayTphieu = :ngayTphieu")
    , @NamedQuery(name = "KieuhoiList.findByIdDuthuong", query = "SELECT k FROM KieuhoiList k WHERE k.idDuthuong = :idDuthuong")
    , @NamedQuery(name = "KieuhoiList.findByIdKhan", query = "SELECT k FROM KieuhoiList k WHERE k.idKhan = :idKhan")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaixm", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaixm = :idLoaixm")
    , @NamedQuery(name = "KieuhoiList.findByIdNvGiaophieu", query = "SELECT k FROM KieuhoiList k WHERE k.idNvGiaophieu = :idNvGiaophieu")
    , @NamedQuery(name = "KieuhoiList.findByGioGiaophieu", query = "SELECT k FROM KieuhoiList k WHERE k.gioGiaophieu = :gioGiaophieu")
    , @NamedQuery(name = "KieuhoiList.findByIdCtDuthuong", query = "SELECT k FROM KieuhoiList k WHERE k.idCtDuthuong = :idCtDuthuong")
    , @NamedQuery(name = "KieuhoiList.findByInlaiTunv", query = "SELECT k FROM KieuhoiList k WHERE k.inlaiTunv = :inlaiTunv")
    , @NamedQuery(name = "KieuhoiList.findByIdNvInlaitunv", query = "SELECT k FROM KieuhoiList k WHERE k.idNvInlaitunv = :idNvInlaitunv")
    , @NamedQuery(name = "KieuhoiList.findByNgayInlaitunv", query = "SELECT k FROM KieuhoiList k WHERE k.ngayInlaitunv = :ngayInlaitunv")
    , @NamedQuery(name = "KieuhoiList.findByTenduong", query = "SELECT k FROM KieuhoiList k WHERE k.tenduong = :tenduong")
    , @NamedQuery(name = "KieuhoiList.findByLydoXmnk", query = "SELECT k FROM KieuhoiList k WHERE k.lydoXmnk = :lydoXmnk")
    , @NamedQuery(name = "KieuhoiList.findByHotenGoc", query = "SELECT k FROM KieuhoiList k WHERE k.hotenGoc = :hotenGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdQuocgiaNhan", query = "SELECT k FROM KieuhoiList k WHERE k.idQuocgiaNhan = :idQuocgiaNhan")
    , @NamedQuery(name = "KieuhoiList.findByTrangthaiTt", query = "SELECT k FROM KieuhoiList k WHERE k.trangthaiTt = :trangthaiTt")
    , @NamedQuery(name = "KieuhoiList.findByIdNhatkyTt", query = "SELECT k FROM KieuhoiList k WHERE k.idNhatkyTt = :idNhatkyTt")
    , @NamedQuery(name = "KieuhoiList.findByIdNvPhtreocthang", query = "SELECT k FROM KieuhoiList k WHERE k.idNvPhtreocthang = :idNvPhtreocthang")
    , @NamedQuery(name = "KieuhoiList.findByNgayPhtreocthang", query = "SELECT k FROM KieuhoiList k WHERE k.ngayPhtreocthang = :ngayPhtreocthang")
    , @NamedQuery(name = "KieuhoiList.findByNgayChitraCthang", query = "SELECT k FROM KieuhoiList k WHERE k.ngayChitraCthang = :ngayChitraCthang")
    , @NamedQuery(name = "KieuhoiList.findByIdNvChitraCthang", query = "SELECT k FROM KieuhoiList k WHERE k.idNvChitraCthang = :idNvChitraCthang")
    , @NamedQuery(name = "KieuhoiList.findByInlaiDiduong", query = "SELECT k FROM KieuhoiList k WHERE k.inlaiDiduong = :inlaiDiduong")
    , @NamedQuery(name = "KieuhoiList.findByIdNvIndiduong", query = "SELECT k FROM KieuhoiList k WHERE k.idNvIndiduong = :idNvIndiduong")
    , @NamedQuery(name = "KieuhoiList.findBySolaninDiduong", query = "SELECT k FROM KieuhoiList k WHERE k.solaninDiduong = :solaninDiduong")
    , @NamedQuery(name = "KieuhoiList.findByIdNoname", query = "SELECT k FROM KieuhoiList k WHERE k.idNoname = :idNoname")
    , @NamedQuery(name = "KieuhoiList.findByIdNvNhanphieu", query = "SELECT k FROM KieuhoiList k WHERE k.idNvNhanphieu = :idNvNhanphieu")
    , @NamedQuery(name = "KieuhoiList.findByIdGpAuto", query = "SELECT k FROM KieuhoiList k WHERE k.idGpAuto = :idGpAuto")
    , @NamedQuery(name = "KieuhoiList.findByWardAuto", query = "SELECT k FROM KieuhoiList k WHERE k.wardAuto = :wardAuto")
    , @NamedQuery(name = "KieuhoiList.findByIdWard", query = "SELECT k FROM KieuhoiList k WHERE k.idWard = :idWard")
    , @NamedQuery(name = "KieuhoiList.findByMgCode", query = "SELECT k FROM KieuhoiList k WHERE k.mgCode = :mgCode")
    , @NamedQuery(name = "KieuhoiList.findByAgentDate", query = "SELECT k FROM KieuhoiList k WHERE k.agentDate = :agentDate")
    , @NamedQuery(name = "KieuhoiList.findBySttImpDt", query = "SELECT k FROM KieuhoiList k WHERE k.sttImpDt = :sttImpDt")
    , @NamedQuery(name = "KieuhoiList.findByTygiaDc", query = "SELECT k FROM KieuhoiList k WHERE k.tygiaDc = :tygiaDc")
    , @NamedQuery(name = "KieuhoiList.findByIdDieuchinhct", query = "SELECT k FROM KieuhoiList k WHERE k.idDieuchinhct = :idDieuchinhct")
    , @NamedQuery(name = "KieuhoiList.findByIdQlqDottg", query = "SELECT k FROM KieuhoiList k WHERE k.idQlqDottg = :idQlqDottg")
    , @NamedQuery(name = "KieuhoiList.findByNgaysinhkh", query = "SELECT k FROM KieuhoiList k WHERE k.ngaysinhkh = :ngaysinhkh")
    , @NamedQuery(name = "KieuhoiList.findByIdMobiHb", query = "SELECT k FROM KieuhoiList k WHERE k.idMobiHb = :idMobiHb")
    , @NamedQuery(name = "KieuhoiList.findByNgayMobiHb", query = "SELECT k FROM KieuhoiList k WHERE k.ngayMobiHb = :ngayMobiHb")
    , @NamedQuery(name = "KieuhoiList.findBySotaikhoankh", query = "SELECT k FROM KieuhoiList k WHERE k.sotaikhoankh = :sotaikhoankh")
    , @NamedQuery(name = "KieuhoiList.findByMaDuthuong", query = "SELECT k FROM KieuhoiList k WHERE k.maDuthuong = :maDuthuong")
    , @NamedQuery(name = "KieuhoiList.findByDiachiGoc", query = "SELECT k FROM KieuhoiList k WHERE k.diachiGoc = :diachiGoc")
    , @NamedQuery(name = "KieuhoiList.findByDienthoaiGoc", query = "SELECT k FROM KieuhoiList k WHERE k.dienthoaiGoc = :dienthoaiGoc")
    , @NamedQuery(name = "KieuhoiList.findBySoCtTuythanGoc", query = "SELECT k FROM KieuhoiList k WHERE k.soCtTuythanGoc = :soCtTuythanGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdCityGoc", query = "SELECT k FROM KieuhoiList k WHERE k.idCityGoc = :idCityGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdDistrictGoc", query = "SELECT k FROM KieuhoiList k WHERE k.idDistrictGoc = :idDistrictGoc")
    , @NamedQuery(name = "KieuhoiList.findByGhichuGoiGoc", query = "SELECT k FROM KieuhoiList k WHERE k.ghichuGoiGoc = :ghichuGoiGoc")
    , @NamedQuery(name = "KieuhoiList.findByNguoigoiGoc", query = "SELECT k FROM KieuhoiList k WHERE k.nguoigoiGoc = :nguoigoiGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaitienchitraGoc", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaitienchitraGoc = :idLoaitienchitraGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaicongnoGoc", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaicongnoGoc = :idLoaicongnoGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdLoaitiengoiGoc", query = "SELECT k FROM KieuhoiList k WHERE k.idLoaitiengoiGoc = :idLoaitiengoiGoc")
    , @NamedQuery(name = "KieuhoiList.findByIdKhachhangtt", query = "SELECT k FROM KieuhoiList k WHERE k.idKhachhangtt = :idKhachhangtt")
    , @NamedQuery(name = "KieuhoiList.findByNgaysinh", query = "SELECT k FROM KieuhoiList k WHERE k.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "KieuhoiList.findByTrangthaixuly", query = "SELECT k FROM KieuhoiList k WHERE k.trangthaixuly = :trangthaixuly")
    , @NamedQuery(name = "KieuhoiList.findByGhichutrangthai", query = "SELECT k FROM KieuhoiList k WHERE k.ghichutrangthai = :ghichutrangthai")
    , @NamedQuery(name = "KieuhoiList.findByIdLock", query = "SELECT k FROM KieuhoiList k WHERE k.idLock = :idLock")
    , @NamedQuery(name = "KieuhoiList.findByBangchu", query = "SELECT k FROM KieuhoiList k WHERE k.bangchu = :bangchu")
    , @NamedQuery(name = "KieuhoiList.findByIdnvxndoitac", query = "SELECT k FROM KieuhoiList k WHERE k.idnvxndoitac = :idnvxndoitac")
    , @NamedQuery(name = "KieuhoiList.findByNgayxacnhan", query = "SELECT k FROM KieuhoiList k WHERE k.ngayxacnhan = :ngayxacnhan")
    , @NamedQuery(name = "KieuhoiList.findByXacnhanhtdoitac", query = "SELECT k FROM KieuhoiList k WHERE k.xacnhanhtdoitac = :xacnhanhtdoitac")
    , @NamedQuery(name = "KieuhoiList.findByNgaytiepnhan", query = "SELECT k FROM KieuhoiList k WHERE k.ngaytiepnhan = :ngaytiepnhan")
    , @NamedQuery(name = "KieuhoiList.findByNvxulycv", query = "SELECT k FROM KieuhoiList k WHERE k.nvxulycv = :nvxulycv")
    , @NamedQuery(name = "KieuhoiList.findByNgaykhgd", query = "SELECT k FROM KieuhoiList k WHERE k.ngaykhgd = :ngaykhgd")
    , @NamedQuery(name = "KieuhoiList.findByNvkhgiaodich", query = "SELECT k FROM KieuhoiList k WHERE k.nvkhgiaodich = :nvkhgiaodich")
    , @NamedQuery(name = "KieuhoiList.findByKhachhangGd", query = "SELECT k FROM KieuhoiList k WHERE k.khachhangGd = :khachhangGd")
    , @NamedQuery(name = "KieuhoiList.findByThoigiaxuly", query = "SELECT k FROM KieuhoiList k WHERE k.thoigiaxuly = :thoigiaxuly")
    , @NamedQuery(name = "KieuhoiList.findByNoidunghuy", query = "SELECT k FROM KieuhoiList k WHERE k.noidunghuy = :noidunghuy")
    , @NamedQuery(name = "KieuhoiList.findByDainGoidien", query = "SELECT k FROM KieuhoiList k WHERE k.dainGoidien = :dainGoidien")
    , @NamedQuery(name = "KieuhoiList.findByCallkh", query = "SELECT k FROM KieuhoiList k WHERE k.callkh = :callkh")
    , @NamedQuery(name = "KieuhoiList.findByNgaycallnoname", query = "SELECT k FROM KieuhoiList k WHERE k.ngaycallnoname = :ngaycallnoname")
    , @NamedQuery(name = "KieuhoiList.findByNhanviencallnoname", query = "SELECT k FROM KieuhoiList k WHERE k.nhanviencallnoname = :nhanviencallnoname")
    , @NamedQuery(name = "KieuhoiList.findByIdcitygiao", query = "SELECT k FROM KieuhoiList k WHERE k.idcitygiao = :idcitygiao")
    , @NamedQuery(name = "KieuhoiList.findByIdDistrictgiao", query = "SELECT k FROM KieuhoiList k WHERE k.idDistrictgiao = :idDistrictgiao")
    , @NamedQuery(name = "KieuhoiList.findByDiachigiao", query = "SELECT k FROM KieuhoiList k WHERE k.diachigiao = :diachigiao")
    , @NamedQuery(name = "KieuhoiList.findByDotgp", query = "SELECT k FROM KieuhoiList k WHERE k.dotgp = :dotgp")
    , @NamedQuery(name = "KieuhoiList.findByKinhdo", query = "SELECT k FROM KieuhoiList k WHERE k.kinhdo = :kinhdo")
    , @NamedQuery(name = "KieuhoiList.findByVydo", query = "SELECT k FROM KieuhoiList k WHERE k.vydo = :vydo")
    , @NamedQuery(name = "KieuhoiList.findByInNoname", query = "SELECT k FROM KieuhoiList k WHERE k.inNoname = :inNoname")
    , @NamedQuery(name = "KieuhoiList.findByCorresno", query = "SELECT k FROM KieuhoiList k WHERE k.corresno = :corresno")})
public class KieuhoiList implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KieuhoiListPK kieuhoiListPK;
    @Column(name = "NGAYCAPNHAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaycapnhat;
    @Column(name = "SOLANIN")
    private BigInteger solanin;
    @Size(max = 400)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 20)
    @Column(name = "ID_NV_NHAPLIEU")
    private String idNvNhaplieu;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayNhaplieu;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Column(name = "NGAY_CHITRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayChitra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_DIADIEMCHITRA")
    private String idDiadiemchitra;
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaycap;
    @Size(max = 20)
    @Column(name = "ID_NOICAP")
    private String idNoicap;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 20)
    @Column(name = "ID_CONGNO")
    private String idCongno;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENGOI")
    private String idLoaitiengoi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAICONGNO")
    private String idLoaicongno;
    @Column(name = "SOLANDICHITRA")
    private BigInteger solandichitra;
    @Size(max = 20)
    @Column(name = "ID_NV_XOAPHIEU")
    private String idNvXoaphieu;
    @Column(name = "NGAY_XOAPHIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayXoaphieu;
    @Size(max = 100)
    @Column(name = "LYDOXOAPHIEU")
    private String lydoxoaphieu;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Column(name = "NGAYGIAOPHIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaygiaophieu;
    @Column(name = "NGAYNHANPHIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaynhanphieu;
    @Column(name = "DANHANPHIEU")
    private Character danhanphieu;
    @Column(name = "HOAHONG_TAIQUAY")
    private BigDecimal hoahongTaiquay;
    @Column(name = "HOAHONG_TAINHA")
    private BigDecimal hoahongTainha;
    @Column(name = "SOLANIN_GIAOPHIEU")
    private BigInteger solaninGiaophieu;
    @Column(name = "TYGIA_QUYDOI")
    private BigDecimal tygiaQuydoi;
    @Column(name = "CHIPHIDILAI")
    private BigDecimal chiphidilai;
    @Column(name = "TYGIA_NGAY")
    private BigDecimal tygiaNgay;
    @Column(name = "SOTIEN_CONGNO")
    private BigDecimal sotienCongno;
    @Column(name = "NGAY_HOIBAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayHoibao;
    @Size(max = 20)
    @Column(name = "ID_NV_HOIBAO")
    private String idNvHoibao;
    @Column(name = "DAHOIBAO")
    private Character dahoibao;
    @Column(name = "TREOPHIEU")
    private Character treophieu;
    @Column(name = "PHIHOAHONG")
    private BigInteger phihoahong;
    @Column(name = "GIOTINH_NAM")
    private Character giotinhNam;
    @Size(max = 4)
    @Column(name = "NAMSINH")
    private String namsinh;
    @Column(name = "SOLAN_XUATFILE")
    private BigInteger solanXuatfile;
    @Size(max = 1)
    @Column(name = "DAKIEMTRA")
    private String dakiemtra;
    @Size(max = 20)
    @Column(name = "ID_NV_KT")
    private String idNvKt;
    @Column(name = "NGAY_KIEMTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayKiemtra;
    @Size(max = 1)
    @Column(name = "DATRUYENFILE")
    private String datruyenfile;
    @Size(max = 40)
    @Column(name = "FILE_NAME")
    private String fileName;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH_CHITRA")
    private String idChinhanhChitra;
    @Size(max = 1)
    @Column(name = "BIENNHAN")
    private String biennhan;
    @Column(name = "NGAY_BIENNHAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayBiennhan;
    @Size(max = 20)
    @Column(name = "ID_NV_BIENNHAN")
    private String idNvBiennhan;
    @Size(max = 1)
    @Column(name = "CONGTACVIEN")
    private String congtacvien;
    @Size(max = 20)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Size(max = 20)
    @Column(name = "TAIKHOANTHE")
    private String taikhoanthe;
    @Size(max = 1)
    @Column(name = "TRUYENFILE_DOITAC")
    private String truyenfileDoitac;
    @Column(name = "GIO_TRUYENFILE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gioTruyenfile;
    @Column(name = "DATE_TRUYENFILE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTruyenfile;
    @Size(max = 60)
    @Column(name = "XACMINH")
    private String xacminh;
    @Column(name = "NGAY_XACMINH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayXacminh;
    @Size(max = 20)
    @Column(name = "ID_NV_TRUYENFILE")
    private String idNvTruyenfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 100)
    @Column(name = "HOTEN_1")
    private String hoten1;
    @Size(max = 100)
    @Column(name = "HOTEN_2")
    private String hoten2;
    @Size(max = 20)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 20)
    @Column(name = "MA_KHACHHANG")
    private String maKhachhang;
    @Size(max = 100)
    @Column(name = "KHACHHANG_NHAN")
    private String khachhangNhan;
    @Size(max = 20)
    @Column(name = "ID_NV_BAOCAO")
    private String idNvBaocao;
    @Column(name = "NGAY_BAOCAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayBaocao;
    @Size(max = 5)
    @Column(name = "NOINHANTIEN")
    private String noinhantien;
    @Size(max = 20)
    @Column(name = "ID_NV_UPDATE")
    private String idNvUpdate;
    @Size(max = 20)
    @Column(name = "NGAY_UPDATE")
    private String ngayUpdate;
    @Size(max = 40)
    @Column(name = "GIAYTO_HOTEN")
    private String giaytoHoten;
    @Size(max = 40)
    @Column(name = "GIAYTO_HOTEN_1")
    private String giaytoHoten1;
    @Size(max = 40)
    @Column(name = "GIAYTO_HOTEN_2")
    private String giaytoHoten2;
    @Column(name = "COUNT_PRINT")
    private BigInteger countPrint;
    @Size(max = 1)
    @Column(name = "NHAPHO")
    private String nhapho;
    @Size(max = 1)
    @Column(name = "TRANGTHAI")
    private String trangthai;
    @Size(max = 1)
    @Column(name = "XACNHAN")
    private String xacnhan;
    @Size(max = 20)
    @Column(name = "ID_NV_XACNHAN")
    private String idNvXacnhan;
    @Size(max = 20)
    @Column(name = "NGAY_XACNHAN")
    private String ngayXacnhan;
    @Size(max = 20)
    @Column(name = "NHANDS")
    private String nhands;
    @Size(max = 20)
    @Column(name = "ID_NV_NHANDS")
    private String idNvNhands;
    @Column(name = "NGAY_NHANDS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayNhands;
    @Column(name = "NGAY_CHITRA_TRUE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayChitraTrue;
    @Size(max = 20)
    @Column(name = "ID_NV_XACMINH")
    private String idNvXacminh;
    @Size(max = 1)
    @Column(name = "CHUYEN_BDIEN")
    private String chuyenBdien;
    @Size(max = 100)
    @Column(name = "MA_XOAPHIEU")
    private String maXoaphieu;
    @Size(max = 20)
    @Column(name = "ID_NV_TREOPHIEU")
    private String idNvTreophieu;
    @Column(name = "NGAY_TREOPHIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayTreophieu;
    @Size(max = 1)
    @Column(name = "MOIKHACH")
    private String moikhach;
    @Size(max = 20)
    @Column(name = "NV_MOIKHACH")
    private String nvMoikhach;
    @Column(name = "NGAY_MOIKHACH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayMoikhach;
    @Column(name = "NGHINGO")
    private Character nghingo;
    @Size(max = 100)
    @Column(name = "LYDONGHINGO")
    private String lydonghingo;
    @Size(max = 20)
    @Column(name = "MAKH_NGHINGO")
    private String makhNghingo;
    @Size(max = 1)
    @Column(name = "DAKHAOSAT")
    private String dakhaosat;
    @Size(max = 20)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Column(name = "GIONHAPLIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gionhaplieu;
    @Column(name = "NGAY_NGHINGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayNghingo;
    @Size(max = 40)
    @Column(name = "ID_NV_NGHINGO")
    private String idNvNghingo;
    @Size(max = 1)
    @Column(name = "ID_TREOTAIQUAY")
    private String idTreotaiquay;
    @Size(max = 40)
    @Column(name = "AGENT")
    private String agent;
    @Size(max = 40)
    @Column(name = "ID_AGENT")
    private String idAgent;
    @Size(max = 40)
    @Column(name = "EXT_ORDER")
    private String extOrder;
    @Size(max = 40)
    @Column(name = "PAYAGENTSEQ")
    private String payagentseq;
    @Size(max = 40)
    @Column(name = "PIN_NO")
    private String pinNo;
    @Size(max = 40)
    @Column(name = "MA_HTBN")
    private String maHtbn;
    @Size(max = 20)
    @Column(name = "ID_TIEUCHI")
    private String idTieuchi;
    @Size(max = 1)
    @Column(name = "ID_KHH")
    private String idKhh;
    @Size(max = 100)
    @Column(name = "LYDO_KHH")
    private String lydoKhh;
    @Column(name = "NGAY_KHH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayKhh;
    @Size(max = 20)
    @Column(name = "ID_NV_KHH")
    private String idNvKhh;
    @Size(max = 20)
    @Column(name = "ID_NV_PHUCHOI")
    private String idNvPhuchoi;
    @Column(name = "NGAY_PHUCHOI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayPhuchoi;
    @Size(max = 40)
    @Column(name = "MA_PIN")
    private String maPin;
    @Size(max = 40)
    @Column(name = "MA_QLDS")
    private String maQlds;
    @Size(max = 40)
    @Column(name = "MA_DS_XACNHAN")
    private String maDsXacnhan;
    @Size(max = 1000)
    @Column(name = "THUKEM")
    private String thukem;
    @Size(max = 1000)
    @Column(name = "LYDO_INLAIBN")
    private String lydoInlaibn;
    @Size(max = 1)
    @Column(name = "INLAIBN")
    private String inlaibn;
    @Size(max = 20)
    @Column(name = "INNVDUYET_INLAIBN")
    private String innvduyetInlaibn;
    @Column(name = "NGAYDUYET_INLAIBN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayduyetInlaibn;
    @Size(max = 1)
    @Column(name = "CHUYENCN")
    private String chuyencn;
    @Size(max = 500)
    @Column(name = "LYDO_YC_CHUYENCN")
    private String lydoYcChuyencn;
    @Size(max = 1000)
    @Column(name = "GHICHU_YC_CHUYENCN")
    private String ghichuYcChuyencn;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET_CHUYENCN")
    private String idNvDuyetChuyencn;
    @Column(name = "NGAY_CHUYENCN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayChuyencn;
    @Column(name = "NGAY_YEUCAU_CHUYENCN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayYeucauChuyencn;
    @Size(max = 20)
    @Column(name = "ID_NV_YC_CHUYENCN")
    private String idNvYcChuyencn;
    @Size(max = 1000)
    @Column(name = "LYDO_UPDATE")
    private String lydoUpdate;
    @Size(max = 1)
    @Column(name = "BIENNHAN_C")
    private String biennhanC;
    @Column(name = "SOBN")
    private Long sobn;
    @Column(name = "NGAY_PH_CT_TAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayPhCtTam;
    @Size(max = 20)
    @Column(name = "ID_NV_PH_CT_TAM")
    private String idNvPhCtTam;
    @Size(max = 200)
    @Column(name = "GHICHU_PH_CT_TAM")
    private String ghichuPhCtTam;
    @Size(max = 10)
    @Column(name = "HBDT")
    private String hbdt;
    @Column(name = "DOTHB")
    private BigInteger dothb;
    @Column(name = "NGAYHBDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayhbdt;
    @Column(name = "HBFILENO")
    private BigInteger hbfileno;
    @Size(max = 1)
    @Column(name = "BSTTXACMINH")
    private String bsttxacminh;
    @Size(max = 2000)
    @Column(name = "NOIDUNGBSTT")
    private String noidungbstt;
    @Column(name = "NGAYBSTT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaybstt;
    @Size(max = 20)
    @Column(name = "NVBSTT")
    private String nvbstt;
    @Size(max = 1)
    @Column(name = "XACNHAN_PCRT")
    private String xacnhanPcrt;
    @Size(max = 20)
    @Column(name = "ID_NV_XN_PCRT")
    private String idNvXnPcrt;
    @Column(name = "NGAY_XN_PCRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayXnPcrt;
    @Size(max = 1)
    @Column(name = "CLOCK_RECORD")
    private String clockRecord;
    @Size(max = 20)
    @Column(name = "ID_NV_KSPCRT")
    private String idNvKspcrt;
    @Column(name = "NGAY_KSPCRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayKspcrt;
    @Size(max = 20)
    @Column(name = "MAKH_HUYCHI")
    private String makhHuychi;
    @Size(max = 1)
    @Column(name = "DUYET_DS_DX")
    private String duyetDsDx;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET_DS_DX")
    private String idNvDuyetDsDx;
    @Column(name = "NGAY_DUYET_DS_DX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDuyetDsDx;
    @Size(max = 20)
    @Column(name = "ID_PCRT")
    private String idPcrt;
    @Size(max = 1)
    @Column(name = "NHANTIN")
    private String nhantin;
    @Size(max = 50)
    @Column(name = "DIENTHOAI_NT")
    private String dienthoaiNt;
    @Size(max = 1000)
    @Column(name = "NOIDUNG_SMS")
    private String noidungSms;
    @Column(name = "DATE_SMS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSms;
    @Size(max = 20)
    @Column(name = "ID_NV_SMS")
    private String idNvSms;
    @Column(name = "ID_SMS")
    private BigInteger idSms;
    @Column(name = "ID_GIAODICH")
    private BigInteger idGiaodich;
    @Size(max = 20)
    @Column(name = "ID_BANK")
    private String idBank;
    @Column(name = "DOTCK")
    private BigInteger dotck;
    @Size(max = 1000)
    @Column(name = "GHICHU_CK")
    private String ghichuCk;
    @Column(name = "NGAY_CK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayCk;
    @Size(max = 20)
    @Column(name = "ID_NV_CK")
    private String idNvCk;
    @Size(max = 1)
    @Column(name = "DACK")
    private String dack;
    @Size(max = 1)
    @Column(name = "CK_TIENMAT")
    private String ckTienmat;
    @Size(max = 20)
    @Column(name = "ID_NV_CTCK")
    private String idNvCtck;
    @Column(name = "NGAY_CTCK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayCtck;
    @Size(max = 1)
    @Column(name = "XACNHAN_CK")
    private String xacnhanCk;
    @Size(max = 500)
    @Column(name = "GHICHU_CTCK")
    private String ghichuCtck;
    @Size(max = 20)
    @Column(name = "ID_BRANCH_ARB")
    private String idBranchArb;
    @Size(max = 20)
    @Column(name = "ID_NV_PHCK")
    private String idNvPhck;
    @Column(name = "NGAY_PHCK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayPhck;
    @Size(max = 20)
    @Column(name = "ID_DUYET_KTCK")
    private String idDuyetKtck;
    @Column(name = "NGAY_DUYET_KTCK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDuyetKtck;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET_CTCK")
    private String idNvDuyetCtck;
    @Column(name = "NGAY_XNCK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayXnck;
    @Size(max = 20)
    @Column(name = "ID_NV_YC_INLAI")
    private String idNvYcInlai;
    @Size(max = 1)
    @Column(name = "DACHITRATREO")
    private String dachitratreo;
    @Size(max = 1)
    @Column(name = "ID_TREOPHIEU")
    private String idTreophieu;
    @Size(max = 1)
    @Column(name = "ID_SS_DT")
    private String idSsDt;
    @Size(max = 20)
    @Column(name = "ID_NV_TPHIEU")
    private String idNvTphieu;
    @Column(name = "NGAY_TPHIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayTphieu;
    @Size(max = 1)
    @Column(name = "ID_DUTHUONG")
    private String idDuthuong;
    @Size(max = 1)
    @Column(name = "ID_KHAN")
    private String idKhan;
    @Size(max = 20)
    @Column(name = "ID_LOAIXM")
    private String idLoaixm;
    @Size(max = 20)
    @Column(name = "ID_NV_GIAOPHIEU")
    private String idNvGiaophieu;
    @Column(name = "GIO_GIAOPHIEU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gioGiaophieu;
    @Size(max = 20)
    @Column(name = "ID_CT_DUTHUONG")
    private String idCtDuthuong;
    @Size(max = 1)
    @Column(name = "INLAI_TUNV")
    private String inlaiTunv;
    @Size(max = 20)
    @Column(name = "ID_NV_INLAITUNV")
    private String idNvInlaitunv;
    @Column(name = "NGAY_INLAITUNV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayInlaitunv;
    @Size(max = 500)
    @Column(name = "TENDUONG")
    private String tenduong;
    @Size(max = 1000)
    @Column(name = "LYDO_XMNK")
    private String lydoXmnk;
    @Size(max = 100)
    @Column(name = "HOTEN_GOC")
    private String hotenGoc;
    @Size(max = 20)
    @Column(name = "ID_QUOCGIA_NHAN")
    private String idQuocgiaNhan;
    @Size(max = 1)
    @Column(name = "TRANGTHAI_TT")
    private String trangthaiTt;
    @Size(max = 20)
    @Column(name = "ID_NHATKY_TT")
    private String idNhatkyTt;
    @Size(max = 20)
    @Column(name = "ID_NV_PHTREOCTHANG")
    private String idNvPhtreocthang;
    @Column(name = "NGAY_PHTREOCTHANG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayPhtreocthang;
    @Column(name = "NGAY_CHITRA_CTHANG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayChitraCthang;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA_CTHANG")
    private String idNvChitraCthang;
    @Size(max = 1)
    @Column(name = "INLAI_DIDUONG")
    private String inlaiDiduong;
    @Size(max = 20)
    @Column(name = "ID_NV_INDIDUONG")
    private String idNvIndiduong;
    @Column(name = "SOLANIN_DIDUONG")
    private Long solaninDiduong;
    @Size(max = 1)
    @Column(name = "ID_NONAME")
    private String idNoname;
    @Size(max = 20)
    @Column(name = "ID_NV_NHANPHIEU")
    private String idNvNhanphieu;
    @Size(max = 1)
    @Column(name = "ID_GP_AUTO")
    private String idGpAuto;
    @Size(max = 1)
    @Column(name = "WARD_AUTO")
    private String wardAuto;
    @Size(max = 20)
    @Column(name = "ID_WARD")
    private String idWard;
    @Size(max = 20)
    @Column(name = "MG_CODE")
    private String mgCode;
    @Size(max = 50)
    @Column(name = "AGENT_DATE")
    private String agentDate;
    @Column(name = "STT_IMP_DT")
    private BigInteger sttImpDt;
    @Column(name = "TYGIA_DC")
    private BigInteger tygiaDc;
    @Size(max = 1)
    @Column(name = "ID_DIEUCHINHCT")
    private String idDieuchinhct;
    @Size(max = 40)
    @Column(name = "ID_QLQ_DOTTG")
    private String idQlqDottg;
    @Column(name = "NGAYSINHKH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaysinhkh;
    @Size(max = 1)
    @Column(name = "ID_MOBI_HB")
    private String idMobiHb;
    @Column(name = "NGAY_MOBI_HB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayMobiHb;
    @Size(max = 50)
    @Column(name = "SOTAIKHOANKH")
    private String sotaikhoankh;
    @Size(max = 20)
    @Column(name = "MA_DUTHUONG")
    private String maDuthuong;
    @Size(max = 500)
    @Column(name = "DIACHI_GOC")
    private String diachiGoc;
    @Size(max = 50)
    @Column(name = "DIENTHOAI_GOC")
    private String dienthoaiGoc;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN_GOC")
    private String soCtTuythanGoc;
    @Size(max = 20)
    @Column(name = "ID_CITY_GOC")
    private String idCityGoc;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT_GOC")
    private String idDistrictGoc;
    @Size(max = 500)
    @Column(name = "GHICHU_GOI_GOC")
    private String ghichuGoiGoc;
    @Size(max = 100)
    @Column(name = "NGUOIGOI_GOC")
    private String nguoigoiGoc;
    @Size(max = 20)
    @Column(name = "ID_LOAITIENCHITRA_GOC")
    private String idLoaitienchitraGoc;
    @Size(max = 20)
    @Column(name = "ID_LOAICONGNO_GOC")
    private String idLoaicongnoGoc;
    @Size(max = 20)
    @Column(name = "ID_LOAITIENGOI_GOC")
    private String idLoaitiengoiGoc;
    @Size(max = 40)
    @Column(name = "ID_KHACHHANGTT")
    private String idKhachhangtt;
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaysinh;
    @Size(max = 20)
    @Column(name = "TRANGTHAIXULY")
    private String trangthaixuly;
    @Size(max = 200)
    @Column(name = "GHICHUTRANGTHAI")
    private String ghichutrangthai;
    @Size(max = 1)
    @Column(name = "ID_LOCK")
    private String idLock;
    @Size(max = 500)
    @Column(name = "BANGCHU")
    private String bangchu;
    @Size(max = 1)
    @Column(name = "IDNVXNDOITAC")
    private String idnvxndoitac;
    @Column(name = "NGAYXACNHAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayxacnhan;
    @Size(max = 1)
    @Column(name = "XACNHANHTDOITAC")
    private String xacnhanhtdoitac;
    @Column(name = "NGAYTIEPNHAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaytiepnhan;
    @Size(max = 40)
    @Column(name = "NVXULYCV")
    private String nvxulycv;
    @Column(name = "NGAYKHGD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaykhgd;
    @Size(max = 40)
    @Column(name = "NVKHGIAODICH")
    private String nvkhgiaodich;
    @Size(max = 1)
    @Column(name = "KHACHHANG_GD")
    private String khachhangGd;
    @Column(name = "THOIGIAXULY")
    private BigInteger thoigiaxuly;
    @Size(max = 1000)
    @Column(name = "NOIDUNGHUY")
    private String noidunghuy;
    @Size(max = 1)
    @Column(name = "DAIN_GOIDIEN")
    private String dainGoidien;
    @Size(max = 1)
    @Column(name = "CALLKH")
    private String callkh;
    @Column(name = "NGAYCALLNONAME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaycallnoname;
    @Size(max = 40)
    @Column(name = "NHANVIENCALLNONAME")
    private String nhanviencallnoname;
    @Size(max = 40)
    @Column(name = "IDCITYGIAO")
    private String idcitygiao;
    @Size(max = 40)
    @Column(name = "ID_DISTRICTGIAO")
    private String idDistrictgiao;
    @Size(max = 1000)
    @Column(name = "DIACHIGIAO")
    private String diachigiao;
    @Size(max = 40)
    @Column(name = "DOTGP")
    private String dotgp;
    @Size(max = 40)
    @Column(name = "KINHDO")
    private String kinhdo;
    @Size(max = 40)
    @Column(name = "VYDO")
    private String vydo;
    @Column(name = "IN_NONAME")
    private BigInteger inNoname;
    @Size(max = 20)
    @Column(name = "CORRESNO")
    private String corresno;

    public KieuhoiList() {
    }

    public KieuhoiList(KieuhoiListPK kieuhoiListPK) {
        this.kieuhoiListPK = kieuhoiListPK;
    }

    public KieuhoiList(KieuhoiListPK kieuhoiListPK, String idDiadiemchitra, String maNguoinhan, Character dachitra, String idLoaitienchitra, String idLoaitiengoi, String idLoaicongno, String hoten) {
        this.kieuhoiListPK = kieuhoiListPK;
        this.idDiadiemchitra = idDiadiemchitra;
        this.maNguoinhan = maNguoinhan;
        this.dachitra = dachitra;
        this.idLoaitienchitra = idLoaitienchitra;
        this.idLoaitiengoi = idLoaitiengoi;
        this.idLoaicongno = idLoaicongno;
        this.hoten = hoten;
    }

    public KieuhoiList(String idChinhanh, String sophieu, BigInteger stt) {
        this.kieuhoiListPK = new KieuhoiListPK(idChinhanh, sophieu, stt);
    }

    public KieuhoiListPK getKieuhoiListPK() {
        return kieuhoiListPK;
    }

    public void setKieuhoiListPK(KieuhoiListPK kieuhoiListPK) {
        this.kieuhoiListPK = kieuhoiListPK;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    public BigInteger getSolanin() {
        return solanin;
    }

    public void setSolanin(BigInteger solanin) {
        this.solanin = solanin;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getIdNvNhaplieu() {
        return idNvNhaplieu;
    }

    public void setIdNvNhaplieu(String idNvNhaplieu) {
        this.idNvNhaplieu = idNvNhaplieu;
    }

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public Date getNgayChitra() {
        return ngayChitra;
    }

    public void setNgayChitra(Date ngayChitra) {
        this.ngayChitra = ngayChitra;
    }

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public BigDecimal getTygia() {
        return tygia;
    }

    public void setTygia(BigDecimal tygia) {
        this.tygia = tygia;
    }

    public BigDecimal getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(BigDecimal thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getIdDiadiemchitra() {
        return idDiadiemchitra;
    }

    public void setIdDiadiemchitra(String idDiadiemchitra) {
        this.idDiadiemchitra = idDiadiemchitra;
    }

    public String getGhichuGoi() {
        return ghichuGoi;
    }

    public void setGhichuGoi(String ghichuGoi) {
        this.ghichuGoi = ghichuGoi;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getIdNoicap() {
        return idNoicap;
    }

    public void setIdNoicap(String idNoicap) {
        this.idNoicap = idNoicap;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getIdCongno() {
        return idCongno;
    }

    public void setIdCongno(String idCongno) {
        this.idCongno = idCongno;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }

    public String getIdLoaitiengoi() {
        return idLoaitiengoi;
    }

    public void setIdLoaitiengoi(String idLoaitiengoi) {
        this.idLoaitiengoi = idLoaitiengoi;
    }

    public String getIdLoaicongno() {
        return idLoaicongno;
    }

    public void setIdLoaicongno(String idLoaicongno) {
        this.idLoaicongno = idLoaicongno;
    }

    public BigInteger getSolandichitra() {
        return solandichitra;
    }

    public void setSolandichitra(BigInteger solandichitra) {
        this.solandichitra = solandichitra;
    }

    public String getIdNvXoaphieu() {
        return idNvXoaphieu;
    }

    public void setIdNvXoaphieu(String idNvXoaphieu) {
        this.idNvXoaphieu = idNvXoaphieu;
    }

    public Date getNgayXoaphieu() {
        return ngayXoaphieu;
    }

    public void setNgayXoaphieu(Date ngayXoaphieu) {
        this.ngayXoaphieu = ngayXoaphieu;
    }

    public String getLydoxoaphieu() {
        return lydoxoaphieu;
    }

    public void setLydoxoaphieu(String lydoxoaphieu) {
        this.lydoxoaphieu = lydoxoaphieu;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public Date getNgaygiaophieu() {
        return ngaygiaophieu;
    }

    public void setNgaygiaophieu(Date ngaygiaophieu) {
        this.ngaygiaophieu = ngaygiaophieu;
    }

    public Date getNgaynhanphieu() {
        return ngaynhanphieu;
    }

    public void setNgaynhanphieu(Date ngaynhanphieu) {
        this.ngaynhanphieu = ngaynhanphieu;
    }

    public Character getDanhanphieu() {
        return danhanphieu;
    }

    public void setDanhanphieu(Character danhanphieu) {
        this.danhanphieu = danhanphieu;
    }

    public BigDecimal getHoahongTaiquay() {
        return hoahongTaiquay;
    }

    public void setHoahongTaiquay(BigDecimal hoahongTaiquay) {
        this.hoahongTaiquay = hoahongTaiquay;
    }

    public BigDecimal getHoahongTainha() {
        return hoahongTainha;
    }

    public void setHoahongTainha(BigDecimal hoahongTainha) {
        this.hoahongTainha = hoahongTainha;
    }

    public BigInteger getSolaninGiaophieu() {
        return solaninGiaophieu;
    }

    public void setSolaninGiaophieu(BigInteger solaninGiaophieu) {
        this.solaninGiaophieu = solaninGiaophieu;
    }

    public BigDecimal getTygiaQuydoi() {
        return tygiaQuydoi;
    }

    public void setTygiaQuydoi(BigDecimal tygiaQuydoi) {
        this.tygiaQuydoi = tygiaQuydoi;
    }

    public BigDecimal getChiphidilai() {
        return chiphidilai;
    }

    public void setChiphidilai(BigDecimal chiphidilai) {
        this.chiphidilai = chiphidilai;
    }

    public BigDecimal getTygiaNgay() {
        return tygiaNgay;
    }

    public void setTygiaNgay(BigDecimal tygiaNgay) {
        this.tygiaNgay = tygiaNgay;
    }

    public BigDecimal getSotienCongno() {
        return sotienCongno;
    }

    public void setSotienCongno(BigDecimal sotienCongno) {
        this.sotienCongno = sotienCongno;
    }

    public Date getNgayHoibao() {
        return ngayHoibao;
    }

    public void setNgayHoibao(Date ngayHoibao) {
        this.ngayHoibao = ngayHoibao;
    }

    public String getIdNvHoibao() {
        return idNvHoibao;
    }

    public void setIdNvHoibao(String idNvHoibao) {
        this.idNvHoibao = idNvHoibao;
    }

    public Character getDahoibao() {
        return dahoibao;
    }

    public void setDahoibao(Character dahoibao) {
        this.dahoibao = dahoibao;
    }

    public Character getTreophieu() {
        return treophieu;
    }

    public void setTreophieu(Character treophieu) {
        this.treophieu = treophieu;
    }

    public BigInteger getPhihoahong() {
        return phihoahong;
    }

    public void setPhihoahong(BigInteger phihoahong) {
        this.phihoahong = phihoahong;
    }

    public Character getGiotinhNam() {
        return giotinhNam;
    }

    public void setGiotinhNam(Character giotinhNam) {
        this.giotinhNam = giotinhNam;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public BigInteger getSolanXuatfile() {
        return solanXuatfile;
    }

    public void setSolanXuatfile(BigInteger solanXuatfile) {
        this.solanXuatfile = solanXuatfile;
    }

    public String getDakiemtra() {
        return dakiemtra;
    }

    public void setDakiemtra(String dakiemtra) {
        this.dakiemtra = dakiemtra;
    }

    public String getIdNvKt() {
        return idNvKt;
    }

    public void setIdNvKt(String idNvKt) {
        this.idNvKt = idNvKt;
    }

    public Date getNgayKiemtra() {
        return ngayKiemtra;
    }

    public void setNgayKiemtra(Date ngayKiemtra) {
        this.ngayKiemtra = ngayKiemtra;
    }

    public String getDatruyenfile() {
        return datruyenfile;
    }

    public void setDatruyenfile(String datruyenfile) {
        this.datruyenfile = datruyenfile;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getIdChinhanhChitra() {
        return idChinhanhChitra;
    }

    public void setIdChinhanhChitra(String idChinhanhChitra) {
        this.idChinhanhChitra = idChinhanhChitra;
    }

    public String getBiennhan() {
        return biennhan;
    }

    public void setBiennhan(String biennhan) {
        this.biennhan = biennhan;
    }

    public Date getNgayBiennhan() {
        return ngayBiennhan;
    }

    public void setNgayBiennhan(Date ngayBiennhan) {
        this.ngayBiennhan = ngayBiennhan;
    }

    public String getIdNvBiennhan() {
        return idNvBiennhan;
    }

    public void setIdNvBiennhan(String idNvBiennhan) {
        this.idNvBiennhan = idNvBiennhan;
    }

    public String getCongtacvien() {
        return congtacvien;
    }

    public void setCongtacvien(String congtacvien) {
        this.congtacvien = congtacvien;
    }

    public String getIdThanhtoan() {
        return idThanhtoan;
    }

    public void setIdThanhtoan(String idThanhtoan) {
        this.idThanhtoan = idThanhtoan;
    }

    public String getTaikhoanthe() {
        return taikhoanthe;
    }

    public void setTaikhoanthe(String taikhoanthe) {
        this.taikhoanthe = taikhoanthe;
    }

    public String getTruyenfileDoitac() {
        return truyenfileDoitac;
    }

    public void setTruyenfileDoitac(String truyenfileDoitac) {
        this.truyenfileDoitac = truyenfileDoitac;
    }

    public Date getGioTruyenfile() {
        return gioTruyenfile;
    }

    public void setGioTruyenfile(Date gioTruyenfile) {
        this.gioTruyenfile = gioTruyenfile;
    }

    public Date getDateTruyenfile() {
        return dateTruyenfile;
    }

    public void setDateTruyenfile(Date dateTruyenfile) {
        this.dateTruyenfile = dateTruyenfile;
    }

    public String getXacminh() {
        return xacminh;
    }

    public void setXacminh(String xacminh) {
        this.xacminh = xacminh;
    }

    public Date getNgayXacminh() {
        return ngayXacminh;
    }

    public void setNgayXacminh(Date ngayXacminh) {
        this.ngayXacminh = ngayXacminh;
    }

    public String getIdNvTruyenfile() {
        return idNvTruyenfile;
    }

    public void setIdNvTruyenfile(String idNvTruyenfile) {
        this.idNvTruyenfile = idNvTruyenfile;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHoten1() {
        return hoten1;
    }

    public void setHoten1(String hoten1) {
        this.hoten1 = hoten1;
    }

    public String getHoten2() {
        return hoten2;
    }

    public void setHoten2(String hoten2) {
        this.hoten2 = hoten2;
    }

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getKhachhangNhan() {
        return khachhangNhan;
    }

    public void setKhachhangNhan(String khachhangNhan) {
        this.khachhangNhan = khachhangNhan;
    }

    public String getIdNvBaocao() {
        return idNvBaocao;
    }

    public void setIdNvBaocao(String idNvBaocao) {
        this.idNvBaocao = idNvBaocao;
    }

    public Date getNgayBaocao() {
        return ngayBaocao;
    }

    public void setNgayBaocao(Date ngayBaocao) {
        this.ngayBaocao = ngayBaocao;
    }

    public String getNoinhantien() {
        return noinhantien;
    }

    public void setNoinhantien(String noinhantien) {
        this.noinhantien = noinhantien;
    }

    public String getIdNvUpdate() {
        return idNvUpdate;
    }

    public void setIdNvUpdate(String idNvUpdate) {
        this.idNvUpdate = idNvUpdate;
    }

    public String getNgayUpdate() {
        return ngayUpdate;
    }

    public void setNgayUpdate(String ngayUpdate) {
        this.ngayUpdate = ngayUpdate;
    }

    public String getGiaytoHoten() {
        return giaytoHoten;
    }

    public void setGiaytoHoten(String giaytoHoten) {
        this.giaytoHoten = giaytoHoten;
    }

    public String getGiaytoHoten1() {
        return giaytoHoten1;
    }

    public void setGiaytoHoten1(String giaytoHoten1) {
        this.giaytoHoten1 = giaytoHoten1;
    }

    public String getGiaytoHoten2() {
        return giaytoHoten2;
    }

    public void setGiaytoHoten2(String giaytoHoten2) {
        this.giaytoHoten2 = giaytoHoten2;
    }

    public BigInteger getCountPrint() {
        return countPrint;
    }

    public void setCountPrint(BigInteger countPrint) {
        this.countPrint = countPrint;
    }

    public String getNhapho() {
        return nhapho;
    }

    public void setNhapho(String nhapho) {
        this.nhapho = nhapho;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getXacnhan() {
        return xacnhan;
    }

    public void setXacnhan(String xacnhan) {
        this.xacnhan = xacnhan;
    }

    public String getIdNvXacnhan() {
        return idNvXacnhan;
    }

    public void setIdNvXacnhan(String idNvXacnhan) {
        this.idNvXacnhan = idNvXacnhan;
    }

    public String getNgayXacnhan() {
        return ngayXacnhan;
    }

    public void setNgayXacnhan(String ngayXacnhan) {
        this.ngayXacnhan = ngayXacnhan;
    }

    public String getNhands() {
        return nhands;
    }

    public void setNhands(String nhands) {
        this.nhands = nhands;
    }

    public String getIdNvNhands() {
        return idNvNhands;
    }

    public void setIdNvNhands(String idNvNhands) {
        this.idNvNhands = idNvNhands;
    }

    public Date getNgayNhands() {
        return ngayNhands;
    }

    public void setNgayNhands(Date ngayNhands) {
        this.ngayNhands = ngayNhands;
    }

    public Date getNgayChitraTrue() {
        return ngayChitraTrue;
    }

    public void setNgayChitraTrue(Date ngayChitraTrue) {
        this.ngayChitraTrue = ngayChitraTrue;
    }

    public String getIdNvXacminh() {
        return idNvXacminh;
    }

    public void setIdNvXacminh(String idNvXacminh) {
        this.idNvXacminh = idNvXacminh;
    }

    public String getChuyenBdien() {
        return chuyenBdien;
    }

    public void setChuyenBdien(String chuyenBdien) {
        this.chuyenBdien = chuyenBdien;
    }

    public String getMaXoaphieu() {
        return maXoaphieu;
    }

    public void setMaXoaphieu(String maXoaphieu) {
        this.maXoaphieu = maXoaphieu;
    }

    public String getIdNvTreophieu() {
        return idNvTreophieu;
    }

    public void setIdNvTreophieu(String idNvTreophieu) {
        this.idNvTreophieu = idNvTreophieu;
    }

    public Date getNgayTreophieu() {
        return ngayTreophieu;
    }

    public void setNgayTreophieu(Date ngayTreophieu) {
        this.ngayTreophieu = ngayTreophieu;
    }

    public String getMoikhach() {
        return moikhach;
    }

    public void setMoikhach(String moikhach) {
        this.moikhach = moikhach;
    }

    public String getNvMoikhach() {
        return nvMoikhach;
    }

    public void setNvMoikhach(String nvMoikhach) {
        this.nvMoikhach = nvMoikhach;
    }

    public Date getNgayMoikhach() {
        return ngayMoikhach;
    }

    public void setNgayMoikhach(Date ngayMoikhach) {
        this.ngayMoikhach = ngayMoikhach;
    }

    public Character getNghingo() {
        return nghingo;
    }

    public void setNghingo(Character nghingo) {
        this.nghingo = nghingo;
    }

    public String getLydonghingo() {
        return lydonghingo;
    }

    public void setLydonghingo(String lydonghingo) {
        this.lydonghingo = lydonghingo;
    }

    public String getMakhNghingo() {
        return makhNghingo;
    }

    public void setMakhNghingo(String makhNghingo) {
        this.makhNghingo = makhNghingo;
    }

    public String getDakhaosat() {
        return dakhaosat;
    }

    public void setDakhaosat(String dakhaosat) {
        this.dakhaosat = dakhaosat;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    public Date getGionhaplieu() {
        return gionhaplieu;
    }

    public void setGionhaplieu(Date gionhaplieu) {
        this.gionhaplieu = gionhaplieu;
    }

    public Date getNgayNghingo() {
        return ngayNghingo;
    }

    public void setNgayNghingo(Date ngayNghingo) {
        this.ngayNghingo = ngayNghingo;
    }

    public String getIdNvNghingo() {
        return idNvNghingo;
    }

    public void setIdNvNghingo(String idNvNghingo) {
        this.idNvNghingo = idNvNghingo;
    }

    public String getIdTreotaiquay() {
        return idTreotaiquay;
    }

    public void setIdTreotaiquay(String idTreotaiquay) {
        this.idTreotaiquay = idTreotaiquay;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(String idAgent) {
        this.idAgent = idAgent;
    }

    public String getExtOrder() {
        return extOrder;
    }

    public void setExtOrder(String extOrder) {
        this.extOrder = extOrder;
    }

    public String getPayagentseq() {
        return payagentseq;
    }

    public void setPayagentseq(String payagentseq) {
        this.payagentseq = payagentseq;
    }

    public String getPinNo() {
        return pinNo;
    }

    public void setPinNo(String pinNo) {
        this.pinNo = pinNo;
    }

    public String getMaHtbn() {
        return maHtbn;
    }

    public void setMaHtbn(String maHtbn) {
        this.maHtbn = maHtbn;
    }

    public String getIdTieuchi() {
        return idTieuchi;
    }

    public void setIdTieuchi(String idTieuchi) {
        this.idTieuchi = idTieuchi;
    }

    public String getIdKhh() {
        return idKhh;
    }

    public void setIdKhh(String idKhh) {
        this.idKhh = idKhh;
    }

    public String getLydoKhh() {
        return lydoKhh;
    }

    public void setLydoKhh(String lydoKhh) {
        this.lydoKhh = lydoKhh;
    }

    public Date getNgayKhh() {
        return ngayKhh;
    }

    public void setNgayKhh(Date ngayKhh) {
        this.ngayKhh = ngayKhh;
    }

    public String getIdNvKhh() {
        return idNvKhh;
    }

    public void setIdNvKhh(String idNvKhh) {
        this.idNvKhh = idNvKhh;
    }

    public String getIdNvPhuchoi() {
        return idNvPhuchoi;
    }

    public void setIdNvPhuchoi(String idNvPhuchoi) {
        this.idNvPhuchoi = idNvPhuchoi;
    }

    public Date getNgayPhuchoi() {
        return ngayPhuchoi;
    }

    public void setNgayPhuchoi(Date ngayPhuchoi) {
        this.ngayPhuchoi = ngayPhuchoi;
    }

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    public String getMaDsXacnhan() {
        return maDsXacnhan;
    }

    public void setMaDsXacnhan(String maDsXacnhan) {
        this.maDsXacnhan = maDsXacnhan;
    }

    public String getThukem() {
        return thukem;
    }

    public void setThukem(String thukem) {
        this.thukem = thukem;
    }

    public String getLydoInlaibn() {
        return lydoInlaibn;
    }

    public void setLydoInlaibn(String lydoInlaibn) {
        this.lydoInlaibn = lydoInlaibn;
    }

    public String getInlaibn() {
        return inlaibn;
    }

    public void setInlaibn(String inlaibn) {
        this.inlaibn = inlaibn;
    }

    public String getInnvduyetInlaibn() {
        return innvduyetInlaibn;
    }

    public void setInnvduyetInlaibn(String innvduyetInlaibn) {
        this.innvduyetInlaibn = innvduyetInlaibn;
    }

    public Date getNgayduyetInlaibn() {
        return ngayduyetInlaibn;
    }

    public void setNgayduyetInlaibn(Date ngayduyetInlaibn) {
        this.ngayduyetInlaibn = ngayduyetInlaibn;
    }

    public String getChuyencn() {
        return chuyencn;
    }

    public void setChuyencn(String chuyencn) {
        this.chuyencn = chuyencn;
    }

    public String getLydoYcChuyencn() {
        return lydoYcChuyencn;
    }

    public void setLydoYcChuyencn(String lydoYcChuyencn) {
        this.lydoYcChuyencn = lydoYcChuyencn;
    }

    public String getGhichuYcChuyencn() {
        return ghichuYcChuyencn;
    }

    public void setGhichuYcChuyencn(String ghichuYcChuyencn) {
        this.ghichuYcChuyencn = ghichuYcChuyencn;
    }

    public String getIdNvDuyetChuyencn() {
        return idNvDuyetChuyencn;
    }

    public void setIdNvDuyetChuyencn(String idNvDuyetChuyencn) {
        this.idNvDuyetChuyencn = idNvDuyetChuyencn;
    }

    public Date getNgayChuyencn() {
        return ngayChuyencn;
    }

    public void setNgayChuyencn(Date ngayChuyencn) {
        this.ngayChuyencn = ngayChuyencn;
    }

    public Date getNgayYeucauChuyencn() {
        return ngayYeucauChuyencn;
    }

    public void setNgayYeucauChuyencn(Date ngayYeucauChuyencn) {
        this.ngayYeucauChuyencn = ngayYeucauChuyencn;
    }

    public String getIdNvYcChuyencn() {
        return idNvYcChuyencn;
    }

    public void setIdNvYcChuyencn(String idNvYcChuyencn) {
        this.idNvYcChuyencn = idNvYcChuyencn;
    }

    public String getLydoUpdate() {
        return lydoUpdate;
    }

    public void setLydoUpdate(String lydoUpdate) {
        this.lydoUpdate = lydoUpdate;
    }

    public String getBiennhanC() {
        return biennhanC;
    }

    public void setBiennhanC(String biennhanC) {
        this.biennhanC = biennhanC;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public Date getNgayPhCtTam() {
        return ngayPhCtTam;
    }

    public void setNgayPhCtTam(Date ngayPhCtTam) {
        this.ngayPhCtTam = ngayPhCtTam;
    }

    public String getIdNvPhCtTam() {
        return idNvPhCtTam;
    }

    public void setIdNvPhCtTam(String idNvPhCtTam) {
        this.idNvPhCtTam = idNvPhCtTam;
    }

    public String getGhichuPhCtTam() {
        return ghichuPhCtTam;
    }

    public void setGhichuPhCtTam(String ghichuPhCtTam) {
        this.ghichuPhCtTam = ghichuPhCtTam;
    }

    public String getHbdt() {
        return hbdt;
    }

    public void setHbdt(String hbdt) {
        this.hbdt = hbdt;
    }

    public BigInteger getDothb() {
        return dothb;
    }

    public void setDothb(BigInteger dothb) {
        this.dothb = dothb;
    }

    public Date getNgayhbdt() {
        return ngayhbdt;
    }

    public void setNgayhbdt(Date ngayhbdt) {
        this.ngayhbdt = ngayhbdt;
    }

    public BigInteger getHbfileno() {
        return hbfileno;
    }

    public void setHbfileno(BigInteger hbfileno) {
        this.hbfileno = hbfileno;
    }

    public String getBsttxacminh() {
        return bsttxacminh;
    }

    public void setBsttxacminh(String bsttxacminh) {
        this.bsttxacminh = bsttxacminh;
    }

    public String getNoidungbstt() {
        return noidungbstt;
    }

    public void setNoidungbstt(String noidungbstt) {
        this.noidungbstt = noidungbstt;
    }

    public Date getNgaybstt() {
        return ngaybstt;
    }

    public void setNgaybstt(Date ngaybstt) {
        this.ngaybstt = ngaybstt;
    }

    public String getNvbstt() {
        return nvbstt;
    }

    public void setNvbstt(String nvbstt) {
        this.nvbstt = nvbstt;
    }

    public String getXacnhanPcrt() {
        return xacnhanPcrt;
    }

    public void setXacnhanPcrt(String xacnhanPcrt) {
        this.xacnhanPcrt = xacnhanPcrt;
    }

    public String getIdNvXnPcrt() {
        return idNvXnPcrt;
    }

    public void setIdNvXnPcrt(String idNvXnPcrt) {
        this.idNvXnPcrt = idNvXnPcrt;
    }

    public Date getNgayXnPcrt() {
        return ngayXnPcrt;
    }

    public void setNgayXnPcrt(Date ngayXnPcrt) {
        this.ngayXnPcrt = ngayXnPcrt;
    }

    public String getClockRecord() {
        return clockRecord;
    }

    public void setClockRecord(String clockRecord) {
        this.clockRecord = clockRecord;
    }

    public String getIdNvKspcrt() {
        return idNvKspcrt;
    }

    public void setIdNvKspcrt(String idNvKspcrt) {
        this.idNvKspcrt = idNvKspcrt;
    }

    public Date getNgayKspcrt() {
        return ngayKspcrt;
    }

    public void setNgayKspcrt(Date ngayKspcrt) {
        this.ngayKspcrt = ngayKspcrt;
    }

    public String getMakhHuychi() {
        return makhHuychi;
    }

    public void setMakhHuychi(String makhHuychi) {
        this.makhHuychi = makhHuychi;
    }

    public String getDuyetDsDx() {
        return duyetDsDx;
    }

    public void setDuyetDsDx(String duyetDsDx) {
        this.duyetDsDx = duyetDsDx;
    }

    public String getIdNvDuyetDsDx() {
        return idNvDuyetDsDx;
    }

    public void setIdNvDuyetDsDx(String idNvDuyetDsDx) {
        this.idNvDuyetDsDx = idNvDuyetDsDx;
    }

    public Date getNgayDuyetDsDx() {
        return ngayDuyetDsDx;
    }

    public void setNgayDuyetDsDx(Date ngayDuyetDsDx) {
        this.ngayDuyetDsDx = ngayDuyetDsDx;
    }

    public String getIdPcrt() {
        return idPcrt;
    }

    public void setIdPcrt(String idPcrt) {
        this.idPcrt = idPcrt;
    }

    public String getNhantin() {
        return nhantin;
    }

    public void setNhantin(String nhantin) {
        this.nhantin = nhantin;
    }

    public String getDienthoaiNt() {
        return dienthoaiNt;
    }

    public void setDienthoaiNt(String dienthoaiNt) {
        this.dienthoaiNt = dienthoaiNt;
    }

    public String getNoidungSms() {
        return noidungSms;
    }

    public void setNoidungSms(String noidungSms) {
        this.noidungSms = noidungSms;
    }

    public Date getDateSms() {
        return dateSms;
    }

    public void setDateSms(Date dateSms) {
        this.dateSms = dateSms;
    }

    public String getIdNvSms() {
        return idNvSms;
    }

    public void setIdNvSms(String idNvSms) {
        this.idNvSms = idNvSms;
    }

    public BigInteger getIdSms() {
        return idSms;
    }

    public void setIdSms(BigInteger idSms) {
        this.idSms = idSms;
    }

    public BigInteger getIdGiaodich() {
        return idGiaodich;
    }

    public void setIdGiaodich(BigInteger idGiaodich) {
        this.idGiaodich = idGiaodich;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public BigInteger getDotck() {
        return dotck;
    }

    public void setDotck(BigInteger dotck) {
        this.dotck = dotck;
    }

    public String getGhichuCk() {
        return ghichuCk;
    }

    public void setGhichuCk(String ghichuCk) {
        this.ghichuCk = ghichuCk;
    }

    public Date getNgayCk() {
        return ngayCk;
    }

    public void setNgayCk(Date ngayCk) {
        this.ngayCk = ngayCk;
    }

    public String getIdNvCk() {
        return idNvCk;
    }

    public void setIdNvCk(String idNvCk) {
        this.idNvCk = idNvCk;
    }

    public String getDack() {
        return dack;
    }

    public void setDack(String dack) {
        this.dack = dack;
    }

    public String getCkTienmat() {
        return ckTienmat;
    }

    public void setCkTienmat(String ckTienmat) {
        this.ckTienmat = ckTienmat;
    }

    public String getIdNvCtck() {
        return idNvCtck;
    }

    public void setIdNvCtck(String idNvCtck) {
        this.idNvCtck = idNvCtck;
    }

    public Date getNgayCtck() {
        return ngayCtck;
    }

    public void setNgayCtck(Date ngayCtck) {
        this.ngayCtck = ngayCtck;
    }

    public String getXacnhanCk() {
        return xacnhanCk;
    }

    public void setXacnhanCk(String xacnhanCk) {
        this.xacnhanCk = xacnhanCk;
    }

    public String getGhichuCtck() {
        return ghichuCtck;
    }

    public void setGhichuCtck(String ghichuCtck) {
        this.ghichuCtck = ghichuCtck;
    }

    public String getIdBranchArb() {
        return idBranchArb;
    }

    public void setIdBranchArb(String idBranchArb) {
        this.idBranchArb = idBranchArb;
    }

    public String getIdNvPhck() {
        return idNvPhck;
    }

    public void setIdNvPhck(String idNvPhck) {
        this.idNvPhck = idNvPhck;
    }

    public Date getNgayPhck() {
        return ngayPhck;
    }

    public void setNgayPhck(Date ngayPhck) {
        this.ngayPhck = ngayPhck;
    }

    public String getIdDuyetKtck() {
        return idDuyetKtck;
    }

    public void setIdDuyetKtck(String idDuyetKtck) {
        this.idDuyetKtck = idDuyetKtck;
    }

    public Date getNgayDuyetKtck() {
        return ngayDuyetKtck;
    }

    public void setNgayDuyetKtck(Date ngayDuyetKtck) {
        this.ngayDuyetKtck = ngayDuyetKtck;
    }

    public String getIdNvDuyetCtck() {
        return idNvDuyetCtck;
    }

    public void setIdNvDuyetCtck(String idNvDuyetCtck) {
        this.idNvDuyetCtck = idNvDuyetCtck;
    }

    public Date getNgayXnck() {
        return ngayXnck;
    }

    public void setNgayXnck(Date ngayXnck) {
        this.ngayXnck = ngayXnck;
    }

    public String getIdNvYcInlai() {
        return idNvYcInlai;
    }

    public void setIdNvYcInlai(String idNvYcInlai) {
        this.idNvYcInlai = idNvYcInlai;
    }

    public String getDachitratreo() {
        return dachitratreo;
    }

    public void setDachitratreo(String dachitratreo) {
        this.dachitratreo = dachitratreo;
    }

    public String getIdTreophieu() {
        return idTreophieu;
    }

    public void setIdTreophieu(String idTreophieu) {
        this.idTreophieu = idTreophieu;
    }

    public String getIdSsDt() {
        return idSsDt;
    }

    public void setIdSsDt(String idSsDt) {
        this.idSsDt = idSsDt;
    }

    public String getIdNvTphieu() {
        return idNvTphieu;
    }

    public void setIdNvTphieu(String idNvTphieu) {
        this.idNvTphieu = idNvTphieu;
    }

    public Date getNgayTphieu() {
        return ngayTphieu;
    }

    public void setNgayTphieu(Date ngayTphieu) {
        this.ngayTphieu = ngayTphieu;
    }

    public String getIdDuthuong() {
        return idDuthuong;
    }

    public void setIdDuthuong(String idDuthuong) {
        this.idDuthuong = idDuthuong;
    }

    public String getIdKhan() {
        return idKhan;
    }

    public void setIdKhan(String idKhan) {
        this.idKhan = idKhan;
    }

    public String getIdLoaixm() {
        return idLoaixm;
    }

    public void setIdLoaixm(String idLoaixm) {
        this.idLoaixm = idLoaixm;
    }

    public String getIdNvGiaophieu() {
        return idNvGiaophieu;
    }

    public void setIdNvGiaophieu(String idNvGiaophieu) {
        this.idNvGiaophieu = idNvGiaophieu;
    }

    public Date getGioGiaophieu() {
        return gioGiaophieu;
    }

    public void setGioGiaophieu(Date gioGiaophieu) {
        this.gioGiaophieu = gioGiaophieu;
    }

    public String getIdCtDuthuong() {
        return idCtDuthuong;
    }

    public void setIdCtDuthuong(String idCtDuthuong) {
        this.idCtDuthuong = idCtDuthuong;
    }

    public String getInlaiTunv() {
        return inlaiTunv;
    }

    public void setInlaiTunv(String inlaiTunv) {
        this.inlaiTunv = inlaiTunv;
    }

    public String getIdNvInlaitunv() {
        return idNvInlaitunv;
    }

    public void setIdNvInlaitunv(String idNvInlaitunv) {
        this.idNvInlaitunv = idNvInlaitunv;
    }

    public Date getNgayInlaitunv() {
        return ngayInlaitunv;
    }

    public void setNgayInlaitunv(Date ngayInlaitunv) {
        this.ngayInlaitunv = ngayInlaitunv;
    }

    public String getTenduong() {
        return tenduong;
    }

    public void setTenduong(String tenduong) {
        this.tenduong = tenduong;
    }

    public String getLydoXmnk() {
        return lydoXmnk;
    }

    public void setLydoXmnk(String lydoXmnk) {
        this.lydoXmnk = lydoXmnk;
    }

    public String getHotenGoc() {
        return hotenGoc;
    }

    public void setHotenGoc(String hotenGoc) {
        this.hotenGoc = hotenGoc;
    }

    public String getIdQuocgiaNhan() {
        return idQuocgiaNhan;
    }

    public void setIdQuocgiaNhan(String idQuocgiaNhan) {
        this.idQuocgiaNhan = idQuocgiaNhan;
    }

    public String getTrangthaiTt() {
        return trangthaiTt;
    }

    public void setTrangthaiTt(String trangthaiTt) {
        this.trangthaiTt = trangthaiTt;
    }

    public String getIdNhatkyTt() {
        return idNhatkyTt;
    }

    public void setIdNhatkyTt(String idNhatkyTt) {
        this.idNhatkyTt = idNhatkyTt;
    }

    public String getIdNvPhtreocthang() {
        return idNvPhtreocthang;
    }

    public void setIdNvPhtreocthang(String idNvPhtreocthang) {
        this.idNvPhtreocthang = idNvPhtreocthang;
    }

    public Date getNgayPhtreocthang() {
        return ngayPhtreocthang;
    }

    public void setNgayPhtreocthang(Date ngayPhtreocthang) {
        this.ngayPhtreocthang = ngayPhtreocthang;
    }

    public Date getNgayChitraCthang() {
        return ngayChitraCthang;
    }

    public void setNgayChitraCthang(Date ngayChitraCthang) {
        this.ngayChitraCthang = ngayChitraCthang;
    }

    public String getIdNvChitraCthang() {
        return idNvChitraCthang;
    }

    public void setIdNvChitraCthang(String idNvChitraCthang) {
        this.idNvChitraCthang = idNvChitraCthang;
    }

    public String getInlaiDiduong() {
        return inlaiDiduong;
    }

    public void setInlaiDiduong(String inlaiDiduong) {
        this.inlaiDiduong = inlaiDiduong;
    }

    public String getIdNvIndiduong() {
        return idNvIndiduong;
    }

    public void setIdNvIndiduong(String idNvIndiduong) {
        this.idNvIndiduong = idNvIndiduong;
    }

    public Long getSolaninDiduong() {
        return solaninDiduong;
    }

    public void setSolaninDiduong(Long solaninDiduong) {
        this.solaninDiduong = solaninDiduong;
    }

    public String getIdNoname() {
        return idNoname;
    }

    public void setIdNoname(String idNoname) {
        this.idNoname = idNoname;
    }

    public String getIdNvNhanphieu() {
        return idNvNhanphieu;
    }

    public void setIdNvNhanphieu(String idNvNhanphieu) {
        this.idNvNhanphieu = idNvNhanphieu;
    }

    public String getIdGpAuto() {
        return idGpAuto;
    }

    public void setIdGpAuto(String idGpAuto) {
        this.idGpAuto = idGpAuto;
    }

    public String getWardAuto() {
        return wardAuto;
    }

    public void setWardAuto(String wardAuto) {
        this.wardAuto = wardAuto;
    }

    public String getIdWard() {
        return idWard;
    }

    public void setIdWard(String idWard) {
        this.idWard = idWard;
    }

    public String getMgCode() {
        return mgCode;
    }

    public void setMgCode(String mgCode) {
        this.mgCode = mgCode;
    }

    public String getAgentDate() {
        return agentDate;
    }

    public void setAgentDate(String agentDate) {
        this.agentDate = agentDate;
    }

    public BigInteger getSttImpDt() {
        return sttImpDt;
    }

    public void setSttImpDt(BigInteger sttImpDt) {
        this.sttImpDt = sttImpDt;
    }

    public BigInteger getTygiaDc() {
        return tygiaDc;
    }

    public void setTygiaDc(BigInteger tygiaDc) {
        this.tygiaDc = tygiaDc;
    }

    public String getIdDieuchinhct() {
        return idDieuchinhct;
    }

    public void setIdDieuchinhct(String idDieuchinhct) {
        this.idDieuchinhct = idDieuchinhct;
    }

    public String getIdQlqDottg() {
        return idQlqDottg;
    }

    public void setIdQlqDottg(String idQlqDottg) {
        this.idQlqDottg = idQlqDottg;
    }

    public Date getNgaysinhkh() {
        return ngaysinhkh;
    }

    public void setNgaysinhkh(Date ngaysinhkh) {
        this.ngaysinhkh = ngaysinhkh;
    }

    public String getIdMobiHb() {
        return idMobiHb;
    }

    public void setIdMobiHb(String idMobiHb) {
        this.idMobiHb = idMobiHb;
    }

    public Date getNgayMobiHb() {
        return ngayMobiHb;
    }

    public void setNgayMobiHb(Date ngayMobiHb) {
        this.ngayMobiHb = ngayMobiHb;
    }

    public String getSotaikhoankh() {
        return sotaikhoankh;
    }

    public void setSotaikhoankh(String sotaikhoankh) {
        this.sotaikhoankh = sotaikhoankh;
    }

    public String getMaDuthuong() {
        return maDuthuong;
    }

    public void setMaDuthuong(String maDuthuong) {
        this.maDuthuong = maDuthuong;
    }

    public String getDiachiGoc() {
        return diachiGoc;
    }

    public void setDiachiGoc(String diachiGoc) {
        this.diachiGoc = diachiGoc;
    }

    public String getDienthoaiGoc() {
        return dienthoaiGoc;
    }

    public void setDienthoaiGoc(String dienthoaiGoc) {
        this.dienthoaiGoc = dienthoaiGoc;
    }

    public String getSoCtTuythanGoc() {
        return soCtTuythanGoc;
    }

    public void setSoCtTuythanGoc(String soCtTuythanGoc) {
        this.soCtTuythanGoc = soCtTuythanGoc;
    }

    public String getIdCityGoc() {
        return idCityGoc;
    }

    public void setIdCityGoc(String idCityGoc) {
        this.idCityGoc = idCityGoc;
    }

    public String getIdDistrictGoc() {
        return idDistrictGoc;
    }

    public void setIdDistrictGoc(String idDistrictGoc) {
        this.idDistrictGoc = idDistrictGoc;
    }

    public String getGhichuGoiGoc() {
        return ghichuGoiGoc;
    }

    public void setGhichuGoiGoc(String ghichuGoiGoc) {
        this.ghichuGoiGoc = ghichuGoiGoc;
    }

    public String getNguoigoiGoc() {
        return nguoigoiGoc;
    }

    public void setNguoigoiGoc(String nguoigoiGoc) {
        this.nguoigoiGoc = nguoigoiGoc;
    }

    public String getIdLoaitienchitraGoc() {
        return idLoaitienchitraGoc;
    }

    public void setIdLoaitienchitraGoc(String idLoaitienchitraGoc) {
        this.idLoaitienchitraGoc = idLoaitienchitraGoc;
    }

    public String getIdLoaicongnoGoc() {
        return idLoaicongnoGoc;
    }

    public void setIdLoaicongnoGoc(String idLoaicongnoGoc) {
        this.idLoaicongnoGoc = idLoaicongnoGoc;
    }

    public String getIdLoaitiengoiGoc() {
        return idLoaitiengoiGoc;
    }

    public void setIdLoaitiengoiGoc(String idLoaitiengoiGoc) {
        this.idLoaitiengoiGoc = idLoaitiengoiGoc;
    }

    public String getIdKhachhangtt() {
        return idKhachhangtt;
    }

    public void setIdKhachhangtt(String idKhachhangtt) {
        this.idKhachhangtt = idKhachhangtt;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getTrangthaixuly() {
        return trangthaixuly;
    }

    public void setTrangthaixuly(String trangthaixuly) {
        this.trangthaixuly = trangthaixuly;
    }

    public String getGhichutrangthai() {
        return ghichutrangthai;
    }

    public void setGhichutrangthai(String ghichutrangthai) {
        this.ghichutrangthai = ghichutrangthai;
    }

    public String getIdLock() {
        return idLock;
    }

    public void setIdLock(String idLock) {
        this.idLock = idLock;
    }

    public String getBangchu() {
        return bangchu;
    }

    public void setBangchu(String bangchu) {
        this.bangchu = bangchu;
    }

    public String getIdnvxndoitac() {
        return idnvxndoitac;
    }

    public void setIdnvxndoitac(String idnvxndoitac) {
        this.idnvxndoitac = idnvxndoitac;
    }

    public Date getNgayxacnhan() {
        return ngayxacnhan;
    }

    public void setNgayxacnhan(Date ngayxacnhan) {
        this.ngayxacnhan = ngayxacnhan;
    }

    public String getXacnhanhtdoitac() {
        return xacnhanhtdoitac;
    }

    public void setXacnhanhtdoitac(String xacnhanhtdoitac) {
        this.xacnhanhtdoitac = xacnhanhtdoitac;
    }

    public Date getNgaytiepnhan() {
        return ngaytiepnhan;
    }

    public void setNgaytiepnhan(Date ngaytiepnhan) {
        this.ngaytiepnhan = ngaytiepnhan;
    }

    public String getNvxulycv() {
        return nvxulycv;
    }

    public void setNvxulycv(String nvxulycv) {
        this.nvxulycv = nvxulycv;
    }

    public Date getNgaykhgd() {
        return ngaykhgd;
    }

    public void setNgaykhgd(Date ngaykhgd) {
        this.ngaykhgd = ngaykhgd;
    }

    public String getNvkhgiaodich() {
        return nvkhgiaodich;
    }

    public void setNvkhgiaodich(String nvkhgiaodich) {
        this.nvkhgiaodich = nvkhgiaodich;
    }

    public String getKhachhangGd() {
        return khachhangGd;
    }

    public void setKhachhangGd(String khachhangGd) {
        this.khachhangGd = khachhangGd;
    }

    public BigInteger getThoigiaxuly() {
        return thoigiaxuly;
    }

    public void setThoigiaxuly(BigInteger thoigiaxuly) {
        this.thoigiaxuly = thoigiaxuly;
    }

    public String getNoidunghuy() {
        return noidunghuy;
    }

    public void setNoidunghuy(String noidunghuy) {
        this.noidunghuy = noidunghuy;
    }

    public String getDainGoidien() {
        return dainGoidien;
    }

    public void setDainGoidien(String dainGoidien) {
        this.dainGoidien = dainGoidien;
    }

    public String getCallkh() {
        return callkh;
    }

    public void setCallkh(String callkh) {
        this.callkh = callkh;
    }

    public Date getNgaycallnoname() {
        return ngaycallnoname;
    }

    public void setNgaycallnoname(Date ngaycallnoname) {
        this.ngaycallnoname = ngaycallnoname;
    }

    public String getNhanviencallnoname() {
        return nhanviencallnoname;
    }

    public void setNhanviencallnoname(String nhanviencallnoname) {
        this.nhanviencallnoname = nhanviencallnoname;
    }

    public String getIdcitygiao() {
        return idcitygiao;
    }

    public void setIdcitygiao(String idcitygiao) {
        this.idcitygiao = idcitygiao;
    }

    public String getIdDistrictgiao() {
        return idDistrictgiao;
    }

    public void setIdDistrictgiao(String idDistrictgiao) {
        this.idDistrictgiao = idDistrictgiao;
    }

    public String getDiachigiao() {
        return diachigiao;
    }

    public void setDiachigiao(String diachigiao) {
        this.diachigiao = diachigiao;
    }

    public String getDotgp() {
        return dotgp;
    }

    public void setDotgp(String dotgp) {
        this.dotgp = dotgp;
    }

    public String getKinhdo() {
        return kinhdo;
    }

    public void setKinhdo(String kinhdo) {
        this.kinhdo = kinhdo;
    }

    public String getVydo() {
        return vydo;
    }

    public void setVydo(String vydo) {
        this.vydo = vydo;
    }

    public BigInteger getInNoname() {
        return inNoname;
    }

    public void setInNoname(BigInteger inNoname) {
        this.inNoname = inNoname;
    }

    public String getCorresno() {
        return corresno;
    }

    public void setCorresno(String corresno) {
        this.corresno = corresno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kieuhoiListPK != null ? kieuhoiListPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KieuhoiList)) {
            return false;
        }
        KieuhoiList other = (KieuhoiList) object;
        if ((this.kieuhoiListPK == null && other.kieuhoiListPK != null) || (this.kieuhoiListPK != null && !this.kieuhoiListPK.equals(other.kieuhoiListPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.KieuhoiList[ kieuhoiListPK=" + kieuhoiListPK + " ]";
    }
    
}
