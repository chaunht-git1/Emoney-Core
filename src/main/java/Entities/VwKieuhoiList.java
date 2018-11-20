 
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
 
@Entity
@Table(name = "VW_KIEUHOI_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwKieuhoiList.findAll", query = "SELECT v FROM VwKieuhoiList v")
    , @NamedQuery(name = "VwKieuhoiList.findByIdcode", query = "SELECT v FROM VwKieuhoiList v WHERE v.idcode = :idcode")
    , @NamedQuery(name = "VwKieuhoiList.findByIdChinhanh", query = "SELECT v FROM VwKieuhoiList v WHERE v.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "VwKieuhoiList.findBySophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.sophieu = :sophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByStt", query = "SELECT v FROM VwKieuhoiList v WHERE v.stt = :stt")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaycapnhat", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaycapnhat = :ngaycapnhat")
    , @NamedQuery(name = "VwKieuhoiList.findBySolanin", query = "SELECT v FROM VwKieuhoiList v WHERE v.solanin = :solanin")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichu = :ghichu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvNhaplieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvNhaplieu = :idNvNhaplieu")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayNhaplieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayNhaplieu = :ngayNhaplieu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvChitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvChitra = :idNvChitra")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayChitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayChitra = :ngayChitra")
    , @NamedQuery(name = "VwKieuhoiList.findBySotiengoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.sotiengoi = :sotiengoi")
    , @NamedQuery(name = "VwKieuhoiList.findByTygia", query = "SELECT v FROM VwKieuhoiList v WHERE v.tygia = :tygia")
    , @NamedQuery(name = "VwKieuhoiList.findByThanhtien", query = "SELECT v FROM VwKieuhoiList v WHERE v.thanhtien = :thanhtien")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDiadiemchitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDiadiemchitra = :idDiadiemchitra")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichuGoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichuGoi = :ghichuGoi")
    , @NamedQuery(name = "VwKieuhoiList.findByMaNguoinhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.maNguoinhan = :maNguoinhan")
    , @NamedQuery(name = "VwKieuhoiList.findByDiachi", query = "SELECT v FROM VwKieuhoiList v WHERE v.diachi = :diachi")
    , @NamedQuery(name = "VwKieuhoiList.findByIdCity", query = "SELECT v FROM VwKieuhoiList v WHERE v.idCity = :idCity")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDistrict", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDistrict = :idDistrict")
    , @NamedQuery(name = "VwKieuhoiList.findBySoCtTuythan", query = "SELECT v FROM VwKieuhoiList v WHERE v.soCtTuythan = :soCtTuythan")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaycap", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaycap = :ngaycap")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNoicap", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNoicap = :idNoicap")
    , @NamedQuery(name = "VwKieuhoiList.findByDachitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.dachitra = :dachitra")
    , @NamedQuery(name = "VwKieuhoiList.findByNguoigoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.nguoigoi = :nguoigoi")
    , @NamedQuery(name = "VwKieuhoiList.findByIdCongno", query = "SELECT v FROM VwKieuhoiList v WHERE v.idCongno = :idCongno")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDoitac", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDoitac = :idDoitac")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaitienchitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaitienchitra = :idLoaitienchitra")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaitiengoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaitiengoi = :idLoaitiengoi")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaicongno", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaicongno = :idLoaicongno")
    , @NamedQuery(name = "VwKieuhoiList.findBySolandichitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.solandichitra = :solandichitra")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvXoaphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvXoaphieu = :idNvXoaphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayXoaphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayXoaphieu = :ngayXoaphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByLydoxoaphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydoxoaphieu = :lydoxoaphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByDienthoai", query = "SELECT v FROM VwKieuhoiList v WHERE v.dienthoai = :dienthoai")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaygiaophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaygiaophieu = :ngaygiaophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaynhanphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaynhanphieu = :ngaynhanphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByDanhanphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.danhanphieu = :danhanphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByHoahongTaiquay", query = "SELECT v FROM VwKieuhoiList v WHERE v.hoahongTaiquay = :hoahongTaiquay")
    , @NamedQuery(name = "VwKieuhoiList.findByHoahongTainha", query = "SELECT v FROM VwKieuhoiList v WHERE v.hoahongTainha = :hoahongTainha")
    , @NamedQuery(name = "VwKieuhoiList.findBySolaninGiaophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.solaninGiaophieu = :solaninGiaophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByTygiaQuydoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.tygiaQuydoi = :tygiaQuydoi")
    , @NamedQuery(name = "VwKieuhoiList.findByChiphidilai", query = "SELECT v FROM VwKieuhoiList v WHERE v.chiphidilai = :chiphidilai")
    , @NamedQuery(name = "VwKieuhoiList.findByTygiaNgay", query = "SELECT v FROM VwKieuhoiList v WHERE v.tygiaNgay = :tygiaNgay")
    , @NamedQuery(name = "VwKieuhoiList.findBySotienCongno", query = "SELECT v FROM VwKieuhoiList v WHERE v.sotienCongno = :sotienCongno")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayHoibao", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayHoibao = :ngayHoibao")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvHoibao", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvHoibao = :idNvHoibao")
    , @NamedQuery(name = "VwKieuhoiList.findByDahoibao", query = "SELECT v FROM VwKieuhoiList v WHERE v.dahoibao = :dahoibao")
    , @NamedQuery(name = "VwKieuhoiList.findByTreophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.treophieu = :treophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByPhihoahong", query = "SELECT v FROM VwKieuhoiList v WHERE v.phihoahong = :phihoahong")
    , @NamedQuery(name = "VwKieuhoiList.findByGiotinhNam", query = "SELECT v FROM VwKieuhoiList v WHERE v.giotinhNam = :giotinhNam")
    , @NamedQuery(name = "VwKieuhoiList.findByNamsinh", query = "SELECT v FROM VwKieuhoiList v WHERE v.namsinh = :namsinh")
    , @NamedQuery(name = "VwKieuhoiList.findBySolanXuatfile", query = "SELECT v FROM VwKieuhoiList v WHERE v.solanXuatfile = :solanXuatfile")
    , @NamedQuery(name = "VwKieuhoiList.findByDakiemtra", query = "SELECT v FROM VwKieuhoiList v WHERE v.dakiemtra = :dakiemtra")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvKt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvKt = :idNvKt")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayKiemtra", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayKiemtra = :ngayKiemtra")
    , @NamedQuery(name = "VwKieuhoiList.findByDatruyenfile", query = "SELECT v FROM VwKieuhoiList v WHERE v.datruyenfile = :datruyenfile")
    , @NamedQuery(name = "VwKieuhoiList.findByFileName", query = "SELECT v FROM VwKieuhoiList v WHERE v.fileName = :fileName")
    , @NamedQuery(name = "VwKieuhoiList.findByIdChinhanhChitra", query = "SELECT v FROM VwKieuhoiList v WHERE v.idChinhanhChitra = :idChinhanhChitra")
    , @NamedQuery(name = "VwKieuhoiList.findByBiennhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.biennhan = :biennhan")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayBiennhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayBiennhan = :ngayBiennhan")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvBiennhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvBiennhan = :idNvBiennhan")
    , @NamedQuery(name = "VwKieuhoiList.findByCongtacvien", query = "SELECT v FROM VwKieuhoiList v WHERE v.congtacvien = :congtacvien")
    , @NamedQuery(name = "VwKieuhoiList.findByIdThanhtoan", query = "SELECT v FROM VwKieuhoiList v WHERE v.idThanhtoan = :idThanhtoan")
    , @NamedQuery(name = "VwKieuhoiList.findByTaikhoanthe", query = "SELECT v FROM VwKieuhoiList v WHERE v.taikhoanthe = :taikhoanthe")
    , @NamedQuery(name = "VwKieuhoiList.findByTruyenfileDoitac", query = "SELECT v FROM VwKieuhoiList v WHERE v.truyenfileDoitac = :truyenfileDoitac")
    , @NamedQuery(name = "VwKieuhoiList.findByGioTruyenfile", query = "SELECT v FROM VwKieuhoiList v WHERE v.gioTruyenfile = :gioTruyenfile")
    , @NamedQuery(name = "VwKieuhoiList.findByDateTruyenfile", query = "SELECT v FROM VwKieuhoiList v WHERE v.dateTruyenfile = :dateTruyenfile")
    , @NamedQuery(name = "VwKieuhoiList.findByXacminh", query = "SELECT v FROM VwKieuhoiList v WHERE v.xacminh = :xacminh")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayXacminh", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayXacminh = :ngayXacminh")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvTruyenfile", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvTruyenfile = :idNvTruyenfile")
    , @NamedQuery(name = "VwKieuhoiList.findByHoten", query = "SELECT v FROM VwKieuhoiList v WHERE v.hoten = :hoten")
    , @NamedQuery(name = "VwKieuhoiList.findByHoten1", query = "SELECT v FROM VwKieuhoiList v WHERE v.hoten1 = :hoten1")
    , @NamedQuery(name = "VwKieuhoiList.findByHoten2", query = "SELECT v FROM VwKieuhoiList v WHERE v.hoten2 = :hoten2")
    , @NamedQuery(name = "VwKieuhoiList.findByIdCtTuythan", query = "SELECT v FROM VwKieuhoiList v WHERE v.idCtTuythan = :idCtTuythan")
    , @NamedQuery(name = "VwKieuhoiList.findByMaKhachhang", query = "SELECT v FROM VwKieuhoiList v WHERE v.maKhachhang = :maKhachhang")
    , @NamedQuery(name = "VwKieuhoiList.findByKhachhangNhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.khachhangNhan = :khachhangNhan")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvBaocao", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvBaocao = :idNvBaocao")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayBaocao", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayBaocao = :ngayBaocao")
    , @NamedQuery(name = "VwKieuhoiList.findByNoinhantien", query = "SELECT v FROM VwKieuhoiList v WHERE v.noinhantien = :noinhantien")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvUpdate", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvUpdate = :idNvUpdate")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayUpdate", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayUpdate = :ngayUpdate")
    , @NamedQuery(name = "VwKieuhoiList.findByGiaytoHoten", query = "SELECT v FROM VwKieuhoiList v WHERE v.giaytoHoten = :giaytoHoten")
    , @NamedQuery(name = "VwKieuhoiList.findByGiaytoHoten1", query = "SELECT v FROM VwKieuhoiList v WHERE v.giaytoHoten1 = :giaytoHoten1")
    , @NamedQuery(name = "VwKieuhoiList.findByGiaytoHoten2", query = "SELECT v FROM VwKieuhoiList v WHERE v.giaytoHoten2 = :giaytoHoten2")
    , @NamedQuery(name = "VwKieuhoiList.findByCountPrint", query = "SELECT v FROM VwKieuhoiList v WHERE v.countPrint = :countPrint")
    , @NamedQuery(name = "VwKieuhoiList.findByNhapho", query = "SELECT v FROM VwKieuhoiList v WHERE v.nhapho = :nhapho")
    , @NamedQuery(name = "VwKieuhoiList.findByTrangthai", query = "SELECT v FROM VwKieuhoiList v WHERE v.trangthai = :trangthai")
    , @NamedQuery(name = "VwKieuhoiList.findByXacnhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.xacnhan = :xacnhan")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvXacnhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvXacnhan = :idNvXacnhan")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayXacnhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayXacnhan = :ngayXacnhan")
    , @NamedQuery(name = "VwKieuhoiList.findByNhands", query = "SELECT v FROM VwKieuhoiList v WHERE v.nhands = :nhands")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvNhands", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvNhands = :idNvNhands")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayNhands", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayNhands = :ngayNhands")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayChitraTrue", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayChitraTrue = :ngayChitraTrue")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvXacminh", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvXacminh = :idNvXacminh")
    , @NamedQuery(name = "VwKieuhoiList.findByChuyenBdien", query = "SELECT v FROM VwKieuhoiList v WHERE v.chuyenBdien = :chuyenBdien")
    , @NamedQuery(name = "VwKieuhoiList.findByMaXoaphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.maXoaphieu = :maXoaphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvTreophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvTreophieu = :idNvTreophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayTreophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayTreophieu = :ngayTreophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByMoikhach", query = "SELECT v FROM VwKieuhoiList v WHERE v.moikhach = :moikhach")
    , @NamedQuery(name = "VwKieuhoiList.findByNvMoikhach", query = "SELECT v FROM VwKieuhoiList v WHERE v.nvMoikhach = :nvMoikhach")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayMoikhach", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayMoikhach = :ngayMoikhach")
    , @NamedQuery(name = "VwKieuhoiList.findByNghingo", query = "SELECT v FROM VwKieuhoiList v WHERE v.nghingo = :nghingo")
    , @NamedQuery(name = "VwKieuhoiList.findByLydonghingo", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydonghingo = :lydonghingo")
    , @NamedQuery(name = "VwKieuhoiList.findByMakhNghingo", query = "SELECT v FROM VwKieuhoiList v WHERE v.makhNghingo = :makhNghingo")
    , @NamedQuery(name = "VwKieuhoiList.findByDakhaosat", query = "SELECT v FROM VwKieuhoiList v WHERE v.dakhaosat = :dakhaosat")
    , @NamedQuery(name = "VwKieuhoiList.findByRecordNote", query = "SELECT v FROM VwKieuhoiList v WHERE v.recordNote = :recordNote")
    , @NamedQuery(name = "VwKieuhoiList.findByGionhaplieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.gionhaplieu = :gionhaplieu")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayNghingo", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayNghingo = :ngayNghingo")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvNghingo", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvNghingo = :idNvNghingo")
    , @NamedQuery(name = "VwKieuhoiList.findByIdTreotaiquay", query = "SELECT v FROM VwKieuhoiList v WHERE v.idTreotaiquay = :idTreotaiquay")
    , @NamedQuery(name = "VwKieuhoiList.findByAgent", query = "SELECT v FROM VwKieuhoiList v WHERE v.agent = :agent")
    , @NamedQuery(name = "VwKieuhoiList.findByIdAgent", query = "SELECT v FROM VwKieuhoiList v WHERE v.idAgent = :idAgent")
    , @NamedQuery(name = "VwKieuhoiList.findByExtOrder", query = "SELECT v FROM VwKieuhoiList v WHERE v.extOrder = :extOrder")
    , @NamedQuery(name = "VwKieuhoiList.findByPayagentseq", query = "SELECT v FROM VwKieuhoiList v WHERE v.payagentseq = :payagentseq")
    , @NamedQuery(name = "VwKieuhoiList.findByPinNo", query = "SELECT v FROM VwKieuhoiList v WHERE v.pinNo = :pinNo")
    , @NamedQuery(name = "VwKieuhoiList.findByMaHtbn", query = "SELECT v FROM VwKieuhoiList v WHERE v.maHtbn = :maHtbn")
    , @NamedQuery(name = "VwKieuhoiList.findByIdTieuchi", query = "SELECT v FROM VwKieuhoiList v WHERE v.idTieuchi = :idTieuchi")
    , @NamedQuery(name = "VwKieuhoiList.findByIdKhh", query = "SELECT v FROM VwKieuhoiList v WHERE v.idKhh = :idKhh")
    , @NamedQuery(name = "VwKieuhoiList.findByLydoKhh", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydoKhh = :lydoKhh")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayKhh", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayKhh = :ngayKhh")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvKhh", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvKhh = :idNvKhh")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvPhuchoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvPhuchoi = :idNvPhuchoi")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayPhuchoi", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayPhuchoi = :ngayPhuchoi")
    , @NamedQuery(name = "VwKieuhoiList.findByMaPin", query = "SELECT v FROM VwKieuhoiList v WHERE v.maPin = :maPin")
    , @NamedQuery(name = "VwKieuhoiList.findByMaQlds", query = "SELECT v FROM VwKieuhoiList v WHERE v.maQlds = :maQlds")
    , @NamedQuery(name = "VwKieuhoiList.findByMaDsXacnhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.maDsXacnhan = :maDsXacnhan")
    , @NamedQuery(name = "VwKieuhoiList.findByThukem", query = "SELECT v FROM VwKieuhoiList v WHERE v.thukem = :thukem")
    , @NamedQuery(name = "VwKieuhoiList.findByLydoInlaibn", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydoInlaibn = :lydoInlaibn")
    , @NamedQuery(name = "VwKieuhoiList.findByInlaibn", query = "SELECT v FROM VwKieuhoiList v WHERE v.inlaibn = :inlaibn")
    , @NamedQuery(name = "VwKieuhoiList.findByInnvduyetInlaibn", query = "SELECT v FROM VwKieuhoiList v WHERE v.innvduyetInlaibn = :innvduyetInlaibn")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayduyetInlaibn", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayduyetInlaibn = :ngayduyetInlaibn")
    , @NamedQuery(name = "VwKieuhoiList.findByChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.chuyencn = :chuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByLydoYcChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydoYcChuyencn = :lydoYcChuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichuYcChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichuYcChuyencn = :ghichuYcChuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvDuyetChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvDuyetChuyencn = :idNvDuyetChuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayChuyencn = :ngayChuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayYeucauChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayYeucauChuyencn = :ngayYeucauChuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvYcChuyencn", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvYcChuyencn = :idNvYcChuyencn")
    , @NamedQuery(name = "VwKieuhoiList.findByLydoUpdate", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydoUpdate = :lydoUpdate")
    , @NamedQuery(name = "VwKieuhoiList.findByBiennhanC", query = "SELECT v FROM VwKieuhoiList v WHERE v.biennhanC = :biennhanC")
    , @NamedQuery(name = "VwKieuhoiList.findBySobn", query = "SELECT v FROM VwKieuhoiList v WHERE v.sobn = :sobn")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayPhCtTam", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayPhCtTam = :ngayPhCtTam")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvPhCtTam", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvPhCtTam = :idNvPhCtTam")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichuPhCtTam", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichuPhCtTam = :ghichuPhCtTam")
    , @NamedQuery(name = "VwKieuhoiList.findByHbdt", query = "SELECT v FROM VwKieuhoiList v WHERE v.hbdt = :hbdt")
    , @NamedQuery(name = "VwKieuhoiList.findByDothb", query = "SELECT v FROM VwKieuhoiList v WHERE v.dothb = :dothb")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayhbdt", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayhbdt = :ngayhbdt")
    , @NamedQuery(name = "VwKieuhoiList.findByHbfileno", query = "SELECT v FROM VwKieuhoiList v WHERE v.hbfileno = :hbfileno")
    , @NamedQuery(name = "VwKieuhoiList.findByBsttxacminh", query = "SELECT v FROM VwKieuhoiList v WHERE v.bsttxacminh = :bsttxacminh")
    , @NamedQuery(name = "VwKieuhoiList.findByNoidungbstt", query = "SELECT v FROM VwKieuhoiList v WHERE v.noidungbstt = :noidungbstt")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaybstt", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaybstt = :ngaybstt")
    , @NamedQuery(name = "VwKieuhoiList.findByNvbstt", query = "SELECT v FROM VwKieuhoiList v WHERE v.nvbstt = :nvbstt")
    , @NamedQuery(name = "VwKieuhoiList.findByXacnhanPcrt", query = "SELECT v FROM VwKieuhoiList v WHERE v.xacnhanPcrt = :xacnhanPcrt")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvXnPcrt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvXnPcrt = :idNvXnPcrt")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayXnPcrt", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayXnPcrt = :ngayXnPcrt")
    , @NamedQuery(name = "VwKieuhoiList.findByClockRecord", query = "SELECT v FROM VwKieuhoiList v WHERE v.clockRecord = :clockRecord")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvKspcrt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvKspcrt = :idNvKspcrt")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayKspcrt", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayKspcrt = :ngayKspcrt")
    , @NamedQuery(name = "VwKieuhoiList.findByMakhHuychi", query = "SELECT v FROM VwKieuhoiList v WHERE v.makhHuychi = :makhHuychi")
    , @NamedQuery(name = "VwKieuhoiList.findByDuyetDsDx", query = "SELECT v FROM VwKieuhoiList v WHERE v.duyetDsDx = :duyetDsDx")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvDuyetDsDx", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvDuyetDsDx = :idNvDuyetDsDx")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayDuyetDsDx", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayDuyetDsDx = :ngayDuyetDsDx")
    , @NamedQuery(name = "VwKieuhoiList.findByIdPcrt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idPcrt = :idPcrt")
    , @NamedQuery(name = "VwKieuhoiList.findByNhantin", query = "SELECT v FROM VwKieuhoiList v WHERE v.nhantin = :nhantin")
    , @NamedQuery(name = "VwKieuhoiList.findByDienthoaiNt", query = "SELECT v FROM VwKieuhoiList v WHERE v.dienthoaiNt = :dienthoaiNt")
    , @NamedQuery(name = "VwKieuhoiList.findByNoidungSms", query = "SELECT v FROM VwKieuhoiList v WHERE v.noidungSms = :noidungSms")
    , @NamedQuery(name = "VwKieuhoiList.findByDateSms", query = "SELECT v FROM VwKieuhoiList v WHERE v.dateSms = :dateSms")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvSms", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvSms = :idNvSms")
    , @NamedQuery(name = "VwKieuhoiList.findByIdSms", query = "SELECT v FROM VwKieuhoiList v WHERE v.idSms = :idSms")
    , @NamedQuery(name = "VwKieuhoiList.findByIdGiaodich", query = "SELECT v FROM VwKieuhoiList v WHERE v.idGiaodich = :idGiaodich")
    , @NamedQuery(name = "VwKieuhoiList.findByIdBank", query = "SELECT v FROM VwKieuhoiList v WHERE v.idBank = :idBank")
    , @NamedQuery(name = "VwKieuhoiList.findByDotck", query = "SELECT v FROM VwKieuhoiList v WHERE v.dotck = :dotck")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichuCk", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichuCk = :ghichuCk")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayCk", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayCk = :ngayCk")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvCk", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvCk = :idNvCk")
    , @NamedQuery(name = "VwKieuhoiList.findByDack", query = "SELECT v FROM VwKieuhoiList v WHERE v.dack = :dack")
    , @NamedQuery(name = "VwKieuhoiList.findByCkTienmat", query = "SELECT v FROM VwKieuhoiList v WHERE v.ckTienmat = :ckTienmat")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvCtck", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvCtck = :idNvCtck")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayCtck", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayCtck = :ngayCtck")
    , @NamedQuery(name = "VwKieuhoiList.findByXacnhanCk", query = "SELECT v FROM VwKieuhoiList v WHERE v.xacnhanCk = :xacnhanCk")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichuCtck", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichuCtck = :ghichuCtck")
    , @NamedQuery(name = "VwKieuhoiList.findByIdBranchArb", query = "SELECT v FROM VwKieuhoiList v WHERE v.idBranchArb = :idBranchArb")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvPhck", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvPhck = :idNvPhck")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayPhck", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayPhck = :ngayPhck")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDuyetKtck", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDuyetKtck = :idDuyetKtck")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayDuyetKtck", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayDuyetKtck = :ngayDuyetKtck")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvDuyetCtck", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvDuyetCtck = :idNvDuyetCtck")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayXnck", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayXnck = :ngayXnck")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvYcInlai", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvYcInlai = :idNvYcInlai")
    , @NamedQuery(name = "VwKieuhoiList.findByDachitratreo", query = "SELECT v FROM VwKieuhoiList v WHERE v.dachitratreo = :dachitratreo")
    , @NamedQuery(name = "VwKieuhoiList.findByIdTreophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idTreophieu = :idTreophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdSsDt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idSsDt = :idSsDt")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvTphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvTphieu = :idNvTphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayTphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayTphieu = :ngayTphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDuthuong", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDuthuong = :idDuthuong")
    , @NamedQuery(name = "VwKieuhoiList.findByIdKhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.idKhan = :idKhan")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaixm", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaixm = :idLoaixm")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvGiaophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvGiaophieu = :idNvGiaophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByGioGiaophieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.gioGiaophieu = :gioGiaophieu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdCtDuthuong", query = "SELECT v FROM VwKieuhoiList v WHERE v.idCtDuthuong = :idCtDuthuong")
    , @NamedQuery(name = "VwKieuhoiList.findByInlaiTunv", query = "SELECT v FROM VwKieuhoiList v WHERE v.inlaiTunv = :inlaiTunv")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvInlaitunv", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvInlaitunv = :idNvInlaitunv")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayInlaitunv", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayInlaitunv = :ngayInlaitunv")
    , @NamedQuery(name = "VwKieuhoiList.findByTenduong", query = "SELECT v FROM VwKieuhoiList v WHERE v.tenduong = :tenduong")
    , @NamedQuery(name = "VwKieuhoiList.findByLydoXmnk", query = "SELECT v FROM VwKieuhoiList v WHERE v.lydoXmnk = :lydoXmnk")
    , @NamedQuery(name = "VwKieuhoiList.findByHotenGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.hotenGoc = :hotenGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdQuocgiaNhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.idQuocgiaNhan = :idQuocgiaNhan")
    , @NamedQuery(name = "VwKieuhoiList.findByTrangthaiTt", query = "SELECT v FROM VwKieuhoiList v WHERE v.trangthaiTt = :trangthaiTt")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNhatkyTt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNhatkyTt = :idNhatkyTt")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvPhtreocthang", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvPhtreocthang = :idNvPhtreocthang")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayPhtreocthang", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayPhtreocthang = :ngayPhtreocthang")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayChitraCthang", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayChitraCthang = :ngayChitraCthang")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvChitraCthang", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvChitraCthang = :idNvChitraCthang")
    , @NamedQuery(name = "VwKieuhoiList.findByInlaiDiduong", query = "SELECT v FROM VwKieuhoiList v WHERE v.inlaiDiduong = :inlaiDiduong")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvIndiduong", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvIndiduong = :idNvIndiduong")
    , @NamedQuery(name = "VwKieuhoiList.findBySolaninDiduong", query = "SELECT v FROM VwKieuhoiList v WHERE v.solaninDiduong = :solaninDiduong")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNoname", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNoname = :idNoname")
    , @NamedQuery(name = "VwKieuhoiList.findByIdNvNhanphieu", query = "SELECT v FROM VwKieuhoiList v WHERE v.idNvNhanphieu = :idNvNhanphieu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdGpAuto", query = "SELECT v FROM VwKieuhoiList v WHERE v.idGpAuto = :idGpAuto")
    , @NamedQuery(name = "VwKieuhoiList.findByWardAuto", query = "SELECT v FROM VwKieuhoiList v WHERE v.wardAuto = :wardAuto")
    , @NamedQuery(name = "VwKieuhoiList.findByIdWard", query = "SELECT v FROM VwKieuhoiList v WHERE v.idWard = :idWard")
    , @NamedQuery(name = "VwKieuhoiList.findByMgCode", query = "SELECT v FROM VwKieuhoiList v WHERE v.mgCode = :mgCode")
    , @NamedQuery(name = "VwKieuhoiList.findByAgentDate", query = "SELECT v FROM VwKieuhoiList v WHERE v.agentDate = :agentDate")
    , @NamedQuery(name = "VwKieuhoiList.findBySttImpDt", query = "SELECT v FROM VwKieuhoiList v WHERE v.sttImpDt = :sttImpDt")
    , @NamedQuery(name = "VwKieuhoiList.findByTygiaDc", query = "SELECT v FROM VwKieuhoiList v WHERE v.tygiaDc = :tygiaDc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDieuchinhct", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDieuchinhct = :idDieuchinhct")
    , @NamedQuery(name = "VwKieuhoiList.findByIdQlqDottg", query = "SELECT v FROM VwKieuhoiList v WHERE v.idQlqDottg = :idQlqDottg")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaysinhkh", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaysinhkh = :ngaysinhkh")
    , @NamedQuery(name = "VwKieuhoiList.findByIdMobiHb", query = "SELECT v FROM VwKieuhoiList v WHERE v.idMobiHb = :idMobiHb")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayMobiHb", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayMobiHb = :ngayMobiHb")
    , @NamedQuery(name = "VwKieuhoiList.findBySotaikhoankh", query = "SELECT v FROM VwKieuhoiList v WHERE v.sotaikhoankh = :sotaikhoankh")
    , @NamedQuery(name = "VwKieuhoiList.findByMaDuthuong", query = "SELECT v FROM VwKieuhoiList v WHERE v.maDuthuong = :maDuthuong")
    , @NamedQuery(name = "VwKieuhoiList.findByDiachiGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.diachiGoc = :diachiGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByDienthoaiGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.dienthoaiGoc = :dienthoaiGoc")
    , @NamedQuery(name = "VwKieuhoiList.findBySoCtTuythanGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.soCtTuythanGoc = :soCtTuythanGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdCityGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.idCityGoc = :idCityGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDistrictGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDistrictGoc = :idDistrictGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichuGoiGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichuGoiGoc = :ghichuGoiGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByNguoigoiGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.nguoigoiGoc = :nguoigoiGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaitienchitraGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaitienchitraGoc = :idLoaitienchitraGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaicongnoGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaicongnoGoc = :idLoaicongnoGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLoaitiengoiGoc", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLoaitiengoiGoc = :idLoaitiengoiGoc")
    , @NamedQuery(name = "VwKieuhoiList.findByIdKhachhangtt", query = "SELECT v FROM VwKieuhoiList v WHERE v.idKhachhangtt = :idKhachhangtt")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaysinh", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "VwKieuhoiList.findByTrangthaixuly", query = "SELECT v FROM VwKieuhoiList v WHERE v.trangthaixuly = :trangthaixuly")
    , @NamedQuery(name = "VwKieuhoiList.findByGhichutrangthai", query = "SELECT v FROM VwKieuhoiList v WHERE v.ghichutrangthai = :ghichutrangthai")
    , @NamedQuery(name = "VwKieuhoiList.findByIdLock", query = "SELECT v FROM VwKieuhoiList v WHERE v.idLock = :idLock")
    , @NamedQuery(name = "VwKieuhoiList.findByBangchu", query = "SELECT v FROM VwKieuhoiList v WHERE v.bangchu = :bangchu")
    , @NamedQuery(name = "VwKieuhoiList.findByIdnvxndoitac", query = "SELECT v FROM VwKieuhoiList v WHERE v.idnvxndoitac = :idnvxndoitac")
    , @NamedQuery(name = "VwKieuhoiList.findByNgayxacnhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngayxacnhan = :ngayxacnhan")
    , @NamedQuery(name = "VwKieuhoiList.findByXacnhanhtdoitac", query = "SELECT v FROM VwKieuhoiList v WHERE v.xacnhanhtdoitac = :xacnhanhtdoitac")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaytiepnhan", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaytiepnhan = :ngaytiepnhan")
    , @NamedQuery(name = "VwKieuhoiList.findByNvxulycv", query = "SELECT v FROM VwKieuhoiList v WHERE v.nvxulycv = :nvxulycv")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaykhgd", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaykhgd = :ngaykhgd")
    , @NamedQuery(name = "VwKieuhoiList.findByNvkhgiaodich", query = "SELECT v FROM VwKieuhoiList v WHERE v.nvkhgiaodich = :nvkhgiaodich")
    , @NamedQuery(name = "VwKieuhoiList.findByKhachhangGd", query = "SELECT v FROM VwKieuhoiList v WHERE v.khachhangGd = :khachhangGd")
    , @NamedQuery(name = "VwKieuhoiList.findByThoigiaxuly", query = "SELECT v FROM VwKieuhoiList v WHERE v.thoigiaxuly = :thoigiaxuly")
    , @NamedQuery(name = "VwKieuhoiList.findByNoidunghuy", query = "SELECT v FROM VwKieuhoiList v WHERE v.noidunghuy = :noidunghuy")
    , @NamedQuery(name = "VwKieuhoiList.findByDainGoidien", query = "SELECT v FROM VwKieuhoiList v WHERE v.dainGoidien = :dainGoidien")
    , @NamedQuery(name = "VwKieuhoiList.findByCallkh", query = "SELECT v FROM VwKieuhoiList v WHERE v.callkh = :callkh")
    , @NamedQuery(name = "VwKieuhoiList.findByNgaycallnoname", query = "SELECT v FROM VwKieuhoiList v WHERE v.ngaycallnoname = :ngaycallnoname")
    , @NamedQuery(name = "VwKieuhoiList.findByNhanviencallnoname", query = "SELECT v FROM VwKieuhoiList v WHERE v.nhanviencallnoname = :nhanviencallnoname")
    , @NamedQuery(name = "VwKieuhoiList.findByIdcitygiao", query = "SELECT v FROM VwKieuhoiList v WHERE v.idcitygiao = :idcitygiao")
    , @NamedQuery(name = "VwKieuhoiList.findByIdDistrictgiao", query = "SELECT v FROM VwKieuhoiList v WHERE v.idDistrictgiao = :idDistrictgiao")
    , @NamedQuery(name = "VwKieuhoiList.findByDiachigiao", query = "SELECT v FROM VwKieuhoiList v WHERE v.diachigiao = :diachigiao")
    , @NamedQuery(name = "VwKieuhoiList.findByDotgp", query = "SELECT v FROM VwKieuhoiList v WHERE v.dotgp = :dotgp")
    , @NamedQuery(name = "VwKieuhoiList.findByKinhdo", query = "SELECT v FROM VwKieuhoiList v WHERE v.kinhdo = :kinhdo")
    , @NamedQuery(name = "VwKieuhoiList.findByVydo", query = "SELECT v FROM VwKieuhoiList v WHERE v.vydo = :vydo")
    , @NamedQuery(name = "VwKieuhoiList.findByInNoname", query = "SELECT v FROM VwKieuhoiList v WHERE v.inNoname = :inNoname")
    , @NamedQuery(name = "VwKieuhoiList.findByCorresno", query = "SELECT v FROM VwKieuhoiList v WHERE v.corresno = :corresno")})
public class VwKieuhoiList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 80)
    @Column(name = "IDCODE")
    private String idcode;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
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

    public VwKieuhoiList() {
    }

    public VwKieuhoiList(BigInteger stt) {
        this.stt = stt;
    }

    public VwKieuhoiList(BigInteger stt, String idDiadiemchitra, String maNguoinhan, Character dachitra, String idLoaitienchitra, String idLoaitiengoi, String idLoaicongno, String hoten) {
        this.stt = stt;
        this.idDiadiemchitra = idDiadiemchitra;
        this.maNguoinhan = maNguoinhan;
        this.dachitra = dachitra;
        this.idLoaitienchitra = idLoaitienchitra;
        this.idLoaitiengoi = idLoaitiengoi;
        this.idLoaicongno = idLoaicongno;
        this.hoten = hoten;
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
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
        hash += (stt != null ? stt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VwKieuhoiList)) {
            return false;
        }
        VwKieuhoiList other = (VwKieuhoiList) object;
        if ((this.stt == null && other.stt != null) || (this.stt != null && !this.stt.equals(other.stt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.VwKieuhoiList[ stt=" + stt + " ]";
    }
    
}
