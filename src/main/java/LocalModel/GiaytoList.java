/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocalModel;

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

 
public class GiaytoList   {
    
    private String maGiayto;
   
    private String tenGiayto;
    
    private String idValidity;
    
    private Date dateModified;

    public GiaytoList() {
    }

    public GiaytoList(String maGiayto) {
        this.maGiayto = maGiayto;
    }

    public String getMaGiayto() {
        return maGiayto;
    }

    public void setMaGiayto(String maGiayto) {
        this.maGiayto = maGiayto;
    }

    public String getTenGiayto() {
        return tenGiayto;
    }

    public void setTenGiayto(String tenGiayto) {
        this.tenGiayto = tenGiayto;
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
 
}
