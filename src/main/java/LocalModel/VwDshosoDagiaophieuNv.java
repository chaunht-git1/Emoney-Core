 
package LocalModel;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
 
 
public class VwDshosoDagiaophieuNv   {
 
    
  
    private String idcode;
     
    private String idNvChitra;
    
    private String idChinhanh;
    
    private String tennv;
     
    private BigInteger shs;
   
    private BigInteger usd;
    
    private BigInteger cad;
   
    private BigInteger gbp;
     
    private BigInteger eur;
   
    private BigInteger aud;
   
    private BigInteger thanhtien;

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }
    
    
    

    public VwDshosoDagiaophieuNv() {
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getUsd() {
        return usd;
    }

    public void setUsd(BigInteger usd) {
        this.usd = usd;
    }

    public BigInteger getCad() {
        return cad;
    }

    public void setCad(BigInteger cad) {
        this.cad = cad;
    }

    public BigInteger getGbp() {
        return gbp;
    }

    public void setGbp(BigInteger gbp) {
        this.gbp = gbp;
    }

    public BigInteger getEur() {
        return eur;
    }

    public void setEur(BigInteger eur) {
        this.eur = eur;
    }

    public BigInteger getAud() {
        return aud;
    }

    public void setAud(BigInteger aud) {
        this.aud = aud;
    }

    public BigInteger getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(BigInteger thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
