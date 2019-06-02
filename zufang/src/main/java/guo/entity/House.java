package guo.entity;

public class House {
    private String houseid;

    private String htitle;

    private String himg;

    private String mname;

    private String masterid;

    private String mtel;

    private String hztype;

    private String hdistrict;

    private String haddress;

    private String hmetro;

    private String hstation;

    private String hdistance;

    private String hprice;

    private String hmianji;

    private String hfeature;

    private String hdirection;

    private String hstatus;

    private String hhtype;

    private String hfloorage;

    private String hlift;

    private String hspeizhi;

    private String hgpeizhi;

    private String hother;

    private String hwimg;

    private String hkimg;

    private String hsimg;

    private String hcimg;

    private String hpimg;

    @Override
    public String toString() {
        return "House{" +
                "houseid='" + houseid + '\'' +
                ", htitle='" + htitle + '\'' +
                ", himg='" + himg + '\'' +
                ", mname='" + mname + '\'' +
                ", masterid='" + masterid + '\'' +
                ", mtel='" + mtel + '\'' +
                ", hztype='" + hztype + '\'' +
                ", hdistrict='" + hdistrict + '\'' +
                ", haddress='" + haddress + '\'' +
                ", hmetro='" + hmetro + '\'' +
                ", hstation='" + hstation + '\'' +
                ", hdistance='" + hdistance + '\'' +
                ", hprice='" + hprice + '\'' +
                ", hmianji='" + hmianji + '\'' +
                ", hfeature='" + hfeature + '\'' +
                ", hdirection='" + hdirection + '\'' +
                ", hstatus='" + hstatus + '\'' +
                ", hhtype='" + hhtype + '\'' +
                ", hfloorage='" + hfloorage + '\'' +
                ", hlift='" + hlift + '\'' +
                ", hspeizhi='" + hspeizhi + '\'' +
                ", hgpeizhi='" + hgpeizhi + '\'' +
                ", hother='" + hother + '\'' +
                ", hwimg='" + hwimg + '\'' +
                ", hkimg='" + hkimg + '\'' +
                ", hsimg='" + hsimg + '\'' +
                ", hcimg='" + hcimg + '\'' +
                ", hpimg='" + hpimg + '\'' +
                '}';
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid == null ? null : houseid.trim();
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle == null ? null : htitle.trim();
    }

    public String getHimg() {
        return himg;
    }

    public void setHimg(String himg) {
        this.himg = himg == null ? null : himg.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid == null ? null : masterid.trim();
    }

    public String getMtel() {
        return mtel;
    }

    public void setMtel(String mtel) {
        this.mtel = mtel == null ? null : mtel.trim();
    }

    public String getHztype() {
        return hztype;
    }

    public void setHztype(String hztype) {
        this.hztype = hztype == null ? null : hztype.trim();
    }

    public String getHdistrict() {
        return hdistrict;
    }

    public void setHdistrict(String hdistrict) {
        this.hdistrict = hdistrict == null ? null : hdistrict.trim();
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress == null ? null : haddress.trim();
    }

    public String getHmetro() {
        return hmetro;
    }

    public void setHmetro(String hmetro) {
        this.hmetro = hmetro == null ? null : hmetro.trim();
    }

    public String getHstation() {
        return hstation;
    }

    public void setHstation(String hstation) {
        this.hstation = hstation == null ? null : hstation.trim();
    }

    public String getHdistance() {
        return hdistance;
    }

    public void setHdistance(String hdistance) {
        this.hdistance = hdistance == null ? null : hdistance.trim();
    }

    public String getHprice() {
        return hprice;
    }

    public void setHprice(String hprice) {
        this.hprice = hprice == null ? null : hprice.trim();
    }

    public String getHmianji() {
        return hmianji;
    }

    public void setHmianji(String hmianji) {
        this.hmianji = hmianji == null ? null : hmianji.trim();
    }

    public String getHfeature() {
        return hfeature;
    }

    public void setHfeature(String hfeature) {
        this.hfeature = hfeature == null ? null : hfeature.trim();
    }

    public String getHdirection() {
        return hdirection;
    }

    public void setHdirection(String hdirection) {
        this.hdirection = hdirection == null ? null : hdirection.trim();
    }

    public String getHstatus() {
        return hstatus;
    }

    public void setHstatus(String hstatus) {
        this.hstatus = hstatus == null ? null : hstatus.trim();
    }

    public String getHhtype() {
        return hhtype;
    }

    public void setHhtype(String hhtype) {
        this.hhtype = hhtype == null ? null : hhtype.trim();
    }

    public String getHfloorage() {
        return hfloorage;
    }

    public void setHfloorage(String hfloorage) {
        this.hfloorage = hfloorage == null ? null : hfloorage.trim();
    }

    public String getHlift() {
        return hlift;
    }

    public void setHlift(String hlift) {
        this.hlift = hlift == null ? null : hlift.trim();
    }

    public String getHspeizhi() {
        return hspeizhi;
    }

    public void setHspeizhi(String hspeizhi) {
        this.hspeizhi = hspeizhi == null ? null : hspeizhi.trim();
    }

    public String getHgpeizhi() {
        return hgpeizhi;
    }

    public void setHgpeizhi(String hgpeizhi) {
        this.hgpeizhi = hgpeizhi == null ? null : hgpeizhi.trim();
    }

    public String getHother() {
        return hother;
    }

    public void setHother(String hother) {
        this.hother = hother == null ? null : hother.trim();
    }

    public String getHwimg() {
        return hwimg;
    }

    public void setHwimg(String hwimg) {
        this.hwimg = hwimg == null ? null : hwimg.trim();
    }

    public String getHkimg() {
        return hkimg;
    }

    public void setHkimg(String hkimg) {
        this.hkimg = hkimg == null ? null : hkimg.trim();
    }

    public String getHsimg() {
        return hsimg;
    }

    public void setHsimg(String hsimg) {
        this.hsimg = hsimg == null ? null : hsimg.trim();
    }

    public String getHcimg() {
        return hcimg;
    }

    public void setHcimg(String hcimg) {
        this.hcimg = hcimg == null ? null : hcimg.trim();
    }

    public String getHpimg() {
        return hpimg;
    }

    public void setHpimg(String hpimg) {
        this.hpimg = hpimg == null ? null : hpimg.trim();
    }
}