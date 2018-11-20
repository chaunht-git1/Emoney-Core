 
package Model;

import java.util.Date;

 
public class Dktaosolieucn {
    
    private Date ngatao;
    private String chinhanh;
    private String nhanvien;

   
    
    public Dktaosolieucn(Date ngatao, String chinhanh, String nhanvien) {
        this.ngatao = ngatao;
        this.chinhanh = chinhanh;
        this.nhanvien = nhanvien;
    }
    
    
    
    

    public Date getNgatao() {
        return ngatao;
    }

    public void setNgatao(Date ngatao) {
        this.ngatao = ngatao;
    }

    public String getChinhanh() {
        return chinhanh;
    }

    public void setChinhanh(String chinhanh) {
        this.chinhanh = chinhanh;
    }

    public String getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(String nhanvien) {
        this.nhanvien = nhanvien;
    }
    
    
    
    
}
