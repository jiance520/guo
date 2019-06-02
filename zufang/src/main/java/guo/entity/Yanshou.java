package guo.entity;

public class Yanshou {
    private String ysid;

    private String yuname;

    private String userid;

    private String yutel;

    private String yhtitle;

    private String houseid;

    private String yhimg;

    private String ytime;

    private String ystatus;

    public String getYsid() {
        return ysid;
    }

    public void setYsid(String ysid) {
        this.ysid = ysid == null ? null : ysid.trim();
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

    public String getYutel() {
        return yutel;
    }

    public void setYutel(String yutel) {
        this.yutel = yutel == null ? null : yutel.trim();
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

    public String getYtime() {
        return ytime;
    }

    public void setYtime(String ytime) {
        this.ytime = ytime == null ? null : ytime.trim();
    }

    public String getYstatus() {
        return ystatus;
    }

    public void setYstatus(String ystatus) {
        this.ystatus = ystatus == null ? null : ystatus.trim();
    }
}