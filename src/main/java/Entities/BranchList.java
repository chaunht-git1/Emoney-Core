/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
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

/**
 *
 * @author chaunht
 */
@Entity
@Table(name = "BRANCH_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BranchList.findAll", query = "SELECT b FROM BranchList b")
    , @NamedQuery(name = "BranchList.findByIdCode", query = "SELECT b FROM BranchList b WHERE b.idCode = :idCode")
    , @NamedQuery(name = "BranchList.findByDescription", query = "SELECT b FROM BranchList b WHERE b.description = :description")
    , @NamedQuery(name = "BranchList.findByDiachi", query = "SELECT b FROM BranchList b WHERE b.diachi = :diachi")
    , @NamedQuery(name = "BranchList.findByIdCity", query = "SELECT b FROM BranchList b WHERE b.idCity = :idCity")
    , @NamedQuery(name = "BranchList.findByTel", query = "SELECT b FROM BranchList b WHERE b.tel = :tel")
    , @NamedQuery(name = "BranchList.findByFax", query = "SELECT b FROM BranchList b WHERE b.fax = :fax")
    , @NamedQuery(name = "BranchList.findByIdValidity", query = "SELECT b FROM BranchList b WHERE b.idValidity = :idValidity")
    , @NamedQuery(name = "BranchList.findByDateModified", query = "SELECT b FROM BranchList b WHERE b.dateModified = :dateModified")
    , @NamedQuery(name = "BranchList.findByIdTructhuoc", query = "SELECT b FROM BranchList b WHERE b.idTructhuoc = :idTructhuoc")
    , @NamedQuery(name = "BranchList.findByTentat", query = "SELECT b FROM BranchList b WHERE b.tentat = :tentat")
    , @NamedQuery(name = "BranchList.findByThumucNhanfile", query = "SELECT b FROM BranchList b WHERE b.thumucNhanfile = :thumucNhanfile")
    , @NamedQuery(name = "BranchList.findByIdRegion", query = "SELECT b FROM BranchList b WHERE b.idRegion = :idRegion")
    , @NamedQuery(name = "BranchList.findByCnTructhuoc", query = "SELECT b FROM BranchList b WHERE b.cnTructhuoc = :cnTructhuoc")
    , @NamedQuery(name = "BranchList.findByTimeLevel", query = "SELECT b FROM BranchList b WHERE b.timeLevel = :timeLevel")
    , @NamedQuery(name = "BranchList.findByMaSoThue", query = "SELECT b FROM BranchList b WHERE b.maSoThue = :maSoThue")
    , @NamedQuery(name = "BranchList.findByIdRole", query = "SELECT b FROM BranchList b WHERE b.idRole = :idRole")
    , @NamedQuery(name = "BranchList.findByScan", query = "SELECT b FROM BranchList b WHERE b.scan = :scan")
    , @NamedQuery(name = "BranchList.findByFullName", query = "SELECT b FROM BranchList b WHERE b.fullName = :fullName")
    , @NamedQuery(name = "BranchList.findByMausoHd", query = "SELECT b FROM BranchList b WHERE b.mausoHd = :mausoHd")
    , @NamedQuery(name = "BranchList.findByTelHd", query = "SELECT b FROM BranchList b WHERE b.telHd = :telHd")
    , @NamedQuery(name = "BranchList.findByMausoHd2", query = "SELECT b FROM BranchList b WHERE b.mausoHd2 = :mausoHd2")
    , @NamedQuery(name = "BranchList.findByDiachiHd", query = "SELECT b FROM BranchList b WHERE b.diachiHd = :diachiHd")
    , @NamedQuery(name = "BranchList.findByTenGd", query = "SELECT b FROM BranchList b WHERE b.tenGd = :tenGd")
    , @NamedQuery(name = "BranchList.findByMakerId", query = "SELECT b FROM BranchList b WHERE b.makerId = :makerId")
    , @NamedQuery(name = "BranchList.findByIdTinhtamung", query = "SELECT b FROM BranchList b WHERE b.idTinhtamung = :idTinhtamung")
    , @NamedQuery(name = "BranchList.findByTentatHd", query = "SELECT b FROM BranchList b WHERE b.tentatHd = :tentatHd")
    , @NamedQuery(name = "BranchList.findByIdGdTructuyen", query = "SELECT b FROM BranchList b WHERE b.idGdTructuyen = :idGdTructuyen")
    , @NamedQuery(name = "BranchList.findByIdGdTq", query = "SELECT b FROM BranchList b WHERE b.idGdTq = :idGdTq")
    , @NamedQuery(name = "BranchList.findByIdGdTn", query = "SELECT b FROM BranchList b WHERE b.idGdTn = :idGdTn")
    , @NamedQuery(name = "BranchList.findByIpServer", query = "SELECT b FROM BranchList b WHERE b.ipServer = :ipServer")
    , @NamedQuery(name = "BranchList.findByNhomTinhHh", query = "SELECT b FROM BranchList b WHERE b.nhomTinhHh = :nhomTinhHh")
    , @NamedQuery(name = "BranchList.findByGiaophieuTudong", query = "SELECT b FROM BranchList b WHERE b.giaophieuTudong = :giaophieuTudong")
    , @NamedQuery(name = "BranchList.findByIdKhuvucDv", query = "SELECT b FROM BranchList b WHERE b.idKhuvucDv = :idKhuvucDv")
    , @NamedQuery(name = "BranchList.findByRecordNote", query = "SELECT b FROM BranchList b WHERE b.recordNote = :recordNote")
    , @NamedQuery(name = "BranchList.findByIdKhuvucQuayso", query = "SELECT b FROM BranchList b WHERE b.idKhuvucQuayso = :idKhuvucQuayso")
    , @NamedQuery(name = "BranchList.findByLat", query = "SELECT b FROM BranchList b WHERE b.lat = :lat")
    , @NamedQuery(name = "BranchList.findByLongt", query = "SELECT b FROM BranchList b WHERE b.longt = :longt")
    , @NamedQuery(name = "BranchList.findByDescn", query = "SELECT b FROM BranchList b WHERE b.descn = :descn")})
public class BranchList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 60)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 500)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 60)
    @Column(name = "TEL")
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "FAX")
    private String fax;
    @Size(max = 20)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
    @Size(max = 20)
    @Column(name = "ID_TRUCTHUOC")
    private String idTructhuoc;
    @Size(max = 5)
    @Column(name = "TENTAT")
    private String tentat;
    @Size(max = 30)
    @Column(name = "THUMUC_NHANFILE")
    private String thumucNhanfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_REGION")
    private String idRegion;
    @Size(max = 20)
    @Column(name = "CN_TRUCTHUOC")
    private String cnTructhuoc;
    @Column(name = "TIME_LEVEL")
    private Short timeLevel;
    @Size(max = 50)
    @Column(name = "MA_SO_THUE")
    private String maSoThue;
    @Size(max = 20)
    @Column(name = "ID_ROLE")
    private String idRole;
    @Size(max = 1)
    @Column(name = "SCAN")
    private String scan;
    @Size(max = 300)
    @Column(name = "FULL_NAME")
    private String fullName;
    @Size(max = 50)
    @Column(name = "MAUSO_HD")
    private String mausoHd;
    @Size(max = 100)
    @Column(name = "TEL_HD")
    private String telHd;
    @Size(max = 100)
    @Column(name = "MAUSO_HD_2")
    private String mausoHd2;
    @Size(max = 500)
    @Column(name = "DIACHI_HD")
    private String diachiHd;
    @Size(max = 500)
    @Column(name = "TEN_GD")
    private String tenGd;
    @Size(max = 20)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Size(max = 1)
    @Column(name = "ID_TINHTAMUNG")
    private String idTinhtamung;
    @Size(max = 20)
    @Column(name = "TENTAT_HD")
    private String tentatHd;
    @Size(max = 1)
    @Column(name = "ID_GD_TRUCTUYEN")
    private String idGdTructuyen;
    @Size(max = 1)
    @Column(name = "ID_GD_TQ")
    private String idGdTq;
    @Size(max = 1)
    @Column(name = "ID_GD_TN")
    private String idGdTn;
    @Size(max = 20)
    @Column(name = "IP_SERVER")
    private String ipServer;
    @Size(max = 20)
    @Column(name = "NHOM_TINH_HH")
    private String nhomTinhHh;
    @Size(max = 1)
    @Column(name = "GIAOPHIEU_TUDONG")
    private String giaophieuTudong;
    @Size(max = 20)
    @Column(name = "ID_KHUVUC_DV")
    private String idKhuvucDv;
    @Size(max = 1000)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Size(max = 20)
    @Column(name = "ID_KHUVUC_QUAYSO")
    private String idKhuvucQuayso;
    @Size(max = 40)
    @Column(name = "LAT")
    private String lat;
    @Size(max = 40)
    @Column(name = "LONGT")
    private String longt;
    @Size(max = 40)
    @Column(name = "DESCN")
    private String descn;

    public BranchList() {
    }

    public BranchList(String idCode) {
        this.idCode = idCode;
    }

    public BranchList(String idCode, String idRegion) {
        this.idCode = idCode;
        this.idRegion = idRegion;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getIdTructhuoc() {
        return idTructhuoc;
    }

    public void setIdTructhuoc(String idTructhuoc) {
        this.idTructhuoc = idTructhuoc;
    }

    public String getTentat() {
        return tentat;
    }

    public void setTentat(String tentat) {
        this.tentat = tentat;
    }

    public String getThumucNhanfile() {
        return thumucNhanfile;
    }

    public void setThumucNhanfile(String thumucNhanfile) {
        this.thumucNhanfile = thumucNhanfile;
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }

    public String getCnTructhuoc() {
        return cnTructhuoc;
    }

    public void setCnTructhuoc(String cnTructhuoc) {
        this.cnTructhuoc = cnTructhuoc;
    }

    public Short getTimeLevel() {
        return timeLevel;
    }

    public void setTimeLevel(Short timeLevel) {
        this.timeLevel = timeLevel;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMausoHd() {
        return mausoHd;
    }

    public void setMausoHd(String mausoHd) {
        this.mausoHd = mausoHd;
    }

    public String getTelHd() {
        return telHd;
    }

    public void setTelHd(String telHd) {
        this.telHd = telHd;
    }

    public String getMausoHd2() {
        return mausoHd2;
    }

    public void setMausoHd2(String mausoHd2) {
        this.mausoHd2 = mausoHd2;
    }

    public String getDiachiHd() {
        return diachiHd;
    }

    public void setDiachiHd(String diachiHd) {
        this.diachiHd = diachiHd;
    }

    public String getTenGd() {
        return tenGd;
    }

    public void setTenGd(String tenGd) {
        this.tenGd = tenGd;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public String getIdTinhtamung() {
        return idTinhtamung;
    }

    public void setIdTinhtamung(String idTinhtamung) {
        this.idTinhtamung = idTinhtamung;
    }

    public String getTentatHd() {
        return tentatHd;
    }

    public void setTentatHd(String tentatHd) {
        this.tentatHd = tentatHd;
    }

    public String getIdGdTructuyen() {
        return idGdTructuyen;
    }

    public void setIdGdTructuyen(String idGdTructuyen) {
        this.idGdTructuyen = idGdTructuyen;
    }

    public String getIdGdTq() {
        return idGdTq;
    }

    public void setIdGdTq(String idGdTq) {
        this.idGdTq = idGdTq;
    }

    public String getIdGdTn() {
        return idGdTn;
    }

    public void setIdGdTn(String idGdTn) {
        this.idGdTn = idGdTn;
    }

    public String getIpServer() {
        return ipServer;
    }

    public void setIpServer(String ipServer) {
        this.ipServer = ipServer;
    }

    public String getNhomTinhHh() {
        return nhomTinhHh;
    }

    public void setNhomTinhHh(String nhomTinhHh) {
        this.nhomTinhHh = nhomTinhHh;
    }

    public String getGiaophieuTudong() {
        return giaophieuTudong;
    }

    public void setGiaophieuTudong(String giaophieuTudong) {
        this.giaophieuTudong = giaophieuTudong;
    }

    public String getIdKhuvucDv() {
        return idKhuvucDv;
    }

    public void setIdKhuvucDv(String idKhuvucDv) {
        this.idKhuvucDv = idKhuvucDv;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    public String getIdKhuvucQuayso() {
        return idKhuvucQuayso;
    }

    public void setIdKhuvucQuayso(String idKhuvucQuayso) {
        this.idKhuvucQuayso = idKhuvucQuayso;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongt() {
        return longt;
    }

    public void setLongt(String longt) {
        this.longt = longt;
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCode != null ? idCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchList)) {
            return false;
        }
        BranchList other = (BranchList) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.BranchList[ idCode=" + idCode + " ]";
    }
    
}
