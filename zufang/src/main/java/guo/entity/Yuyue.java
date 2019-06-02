package guo.entity;

public class Yuyue {
    private String yyid;

    private String yuname;

    private String userid;

    private String yhtitle;

    private String houseid;

    private String yhimg;

    private String mname;

    private String masterid;

    private String yttime;

    private String yktime;

    private String ystatus;

    public String getYyid() {
        return yyid;
    }

    public void setYyid(String yyid) {
        this.yyid = yyid == null ? null : yyid.trim();
    }

    public String getYuname() {
        return yuname;
    }

    public void setYuname(String yuname) {
        this.yuname = yuname == null ? null : yuname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getYhtitle() {
        return yhtitle;
    }

    public void setYhtitle(String yhtitle) {
        this.yhtitle = yhtitle == null ? null : yhtitle.trim();
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid == null ? null : houseid.trim();
    }

    public String getYhimg() {
        return yhimg;
    }

    public void setYhimg(String yhimg) {
        this.yhimg = yhimg == null ? null : yhimg.trim();
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

    public String getYttime() {
        return yttime;
    }

    public void setYttime(String yttime) {
        this.yttime = yttime == null ? null : yttime.trim();
    }

    public String getYktime() {
        return yktime;
    }

    public void setYktime(String yktime) {
        this.yktime = yktime == null ? null : yktime.trim();
    }

    @Override
    public String toString() {
        return "Yuyue{" +
                "yyid='" + yyid + '\'' +
                ", yuname='" + yuname + '\'' +
                ", userid='" + userid + '\'' +
                ", yhtitle='" + yhtitle + '\'' +
                ", houseid='" + houseid + '\'' +
                ", yhimg='" + yhimg + '\'' +
                ", mname='" + mname + '\'' +
                ", masterid='" + masterid + '\'' +
                ", yttime='" + yttime + '\'' +
                ", yktime='" + yktime + '\'' +
                ", ystatus='" + ystatus + '\'' +
                '}';
    }

    public String getYstatus() {
        return ystatus;
    }

    public void setYstatus(String ystatus) {
        this.ystatus = ystatus == null ? null : ystatus.trim();
    }
}