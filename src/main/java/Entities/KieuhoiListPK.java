/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author chaunht
 */
@Embeddable
public class KieuhoiListPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;

    public KieuhoiListPK() {
    }

    public KieuhoiListPK(String idChinhanh, String sophieu, BigInteger stt) {
        this.idChinhanh = idChinhanh;
        this.sophieu = sophieu;
        this.stt = stt;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChinhanh != null ? idChinhanh.hashCode() : 0);
        hash += (sophieu != null ? sophieu.hashCode() : 0);
        hash += (stt != null ? stt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KieuhoiListPK)) {
            return false;
        }
        KieuhoiListPK other = (KieuhoiListPK) object;
        if ((this.idChinhanh == null && other.idChinhanh != null) || (this.idChinhanh != null && !this.idChinhanh.equals(other.idChinhanh))) {
            return false;
        }
        if ((this.sophieu == null && other.sophieu != null) || (this.sophieu != null && !this.sophieu.equals(other.sophieu))) {
            return false;
        }
        if ((this.stt == null && other.stt != null) || (this.stt != null && !this.stt.equals(other.stt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.KieuhoiListPK[ idChinhanh=" + idChinhanh + ", sophieu=" + sophieu + ", stt=" + stt + " ]";
    }
    
}
