
























































package LocalModel;

import java.util.Date;

public class VwTableImportdataApiMasterModel {

    private String idcode;
    private String iddoitac;
    private String tendoitac;
    private String shs;
    private String usd;
    private String cad;
    private String gbp;
    private String vnd;
    private String eur;
    private String aud;
    private String userid;
    private String pass;
    private String keyapi;
    private String datavalue;
    private String status;
    private String signalture;
    private Date ngaytao;
    private String maqlds;
    private Boolean disButtonKiemtra;
    private Boolean disButtonChitiet;
    private String maloaifile;
    private String loaifile;
    private String catchuoi;

    public String getCatchuoi() {
        return catchuoi;
    }

    public void setCatchuoi(String catchuoi) {
        this.catchuoi = catchuoi;
    }

    public String getMaloaifile() {
        return maloaifile;
    }

    public void setMaloaifile(String maloaifile) {
        this.maloaifile = maloaifile;
    }

    public String getLoaifile() {
        return loaifile;
    }

    public void setLoaifile(String loaifile) {
        this.loaifile = loaifile;
    }

    public Boolean getDisButtonChitiet() {
        disButtonChitiet = true;
        if (status.equalsIgnoreCase("C")) {
            disButtonChitiet = false;
        }
        return disButtonChitiet;
    }

    public void setDisButtonChitiet(Boolean disButtonChitiet) {
        this.disButtonChitiet = disButtonChitiet;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getMaqlds() {
        return maqlds;
    }

    public void setMaqlds(String maqlds) {
        this.maqlds = maqlds;
    }

    public String getIddoitac() {
        return iddoitac;
    }

    public void setIddoitac(String iddoitac) {
        this.iddoitac = iddoitac;
    }

    public Boolean getDisButtonKiemtra() {
        disButtonKiemtra = true;
        if (status.equalsIgnoreCase("O")) {
            disButtonKiemtra = false;
        }
        return disButtonKiemtra;
    }

    public void setDisButtonKiemtra(Boolean disButtonKiemtra) {
        this.disButtonKiemtra = disButtonKiemtra;
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getTendoitac() {
        return tendoitac;
    }

    public void setTendoitac(String tendoitac) {
        this.tendoitac = tendoitac;
    }

    public String getShs() {
        return shs;
    }

    public void setShs(String shs) {
        this.shs = shs;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public String getGbp() {
        return gbp;
    }

    public void setGbp(String gbp) {
        this.gbp = gbp;
    }

    public String getVnd() {
        return vnd;
    }

    public void setVnd(String vnd) {
        this.vnd = vnd;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getKeyapi() {
        return keyapi;
    }

    public void setKeyapi(String keyapi) {
        this.keyapi = keyapi;
    }

    public String getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(String datavalue) {
        this.datavalue = datavalue;
    }

    public String getSignalture() {
        return signalture;
    }

    public void setSignalture(String signalture) {
        this.signalture = signalture;
    }
}
