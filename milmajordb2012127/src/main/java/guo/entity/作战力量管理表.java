package guo.entity;

import java.util.Date;

public class 作战力量管理表 {
    private Integer ID;
    private Integer 力量编号;
    private Integer 阵营;
    private String 名称;
    private String 描述;
    private String 作者;
    private Date 编制时间;

    @Override
    public String toString() {
        return "作战力量管理表{" +
                "ID=" + ID +
                ", 力量编号=" + 力量编号 +
                ", 阵营=" + 阵营 +
                ", 名称='" + 名称 + '\'' +
                ", 描述='" + 描述 + '\'' +
                ", 作者='" + 作者 + '\'' +
                ", 编制时间=" + 编制时间 +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer get力量编号() {
        return 力量编号;
    }

    public void set力量编号(Integer 力量编号) {
        this.力量编号 = 力量编号;
    }

    public Integer get阵营() {
        return 阵营;
    }

    public void set阵营(Integer 阵营) {
        this.阵营 = 阵营;
    }

    public String get名称() {
        return 名称;
    }

    public void set名称(String 名称) {
        this.名称 = 名称;
    }

    public String get描述() {
        return 描述;
    }

    public void set描述(String 描述) {
        this.描述 = 描述;
    }

    public String get作者() {
        return 作者;
    }

    public void set作者(String 作者) {
        this.作者 = 作者;
    }

    public Date get编制时间() {
        return 编制时间;
    }

    public void set编制时间(Date 编制时间) {
        this.编制时间 = 编制时间;
    }
}
