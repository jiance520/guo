package guo.action;

import guo.entity.作战力量管理表;
import guo.service.I作战力量管理表Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class 作战力量管理表Controller implements ServletContextAware {
    private ServletContext application;
    @Autowired
    private I作战力量管理表Service i作战力量管理表Service;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/ZZLLSelectAll",produces = "application/json;chart=UTF-8")
    public Object 作战力量管理表SelectAll(){
        return i作战力量管理表Service.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/ZZLLInsert",produces = "application/json;chart=UTF-8")
    public Object 作战力量管理表Insert(HttpServletRequest request){
        String ID = request.getParameter("ID");
        String 力量编号 = request.getParameter("力量编号");
        String 阵营 = request.getParameter("阵营");
        String 名称 = request.getParameter("名称");
        String 描述 = request.getParameter("描述");
        String 作者 = request.getParameter("作者");
        String 编制时间 = request.getParameter("编制时间");

//        String sql = "UPDATE 作战力量管理表 SET 力量编号=?,阵营=?,名称=?,描述=?,作者=?,编制时间=NOW() WHERE ID=?";
//        int i = jdbcUtil.executeUpdate(sql,力量编号,阵营,名称,描述,作者,ID);
        作战力量管理表 obj = new 作战力量管理表();
        if(力量编号!=null){obj.set力量编号(Integer.valueOf(力量编号));}
        if(阵营!=null){obj.set阵营(Integer.valueOf(阵营));}
        if(名称!=null){obj.set名称(名称);}
        if(描述!=null){obj.set描述(描述);}
        if(作者!=null){obj.set作者(作者);}
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        obj.set编制时间(date);
        int i = i作战力量管理表Service.insertSelective(obj);
        return i;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/ZZLLUpdate",produces = "application/json;chart=UTF-8")
    public Object 作战力量管理表Update(HttpServletRequest request) {
        String ID = request.getParameter("ID");
        String 力量编号 = request.getParameter("力量编号");
        String 阵营 = request.getParameter("阵营");
        String 名称 = request.getParameter("名称");
        String 描述 = request.getParameter("描述");
        String 作者 = request.getParameter("作者");
        String 编制时间 = request.getParameter("编制时间");

//        String sql = "UPDATE 作战力量管理表 SET 力量编号=?,阵营=?,名称=?,描述=?,作者=?,编制时间=NOW() WHERE ID=?";
//        int i = jdbcUtil.executeUpdate(sql,力量编号,阵营,名称,描述,作者,ID);
        作战力量管理表 obj = new 作战力量管理表();
        obj.setID(Integer.valueOf(ID));
        if(力量编号!=null){obj.set力量编号(Integer.valueOf(力量编号));}
        if(阵营!=null){obj.set阵营(Integer.valueOf(阵营));}
        if(名称!=null){obj.set名称(名称);}
        if(描述!=null){obj.set描述(描述);}
        if(作者!=null){obj.set作者(作者);}
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        obj.set编制时间(date);
        int i = i作战力量管理表Service.updateByPrimaryKeySelective(obj);
        return i;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/ZZLLSelect",produces = "application/json;chart=UTF-8")
    public Object 作战力量管理表Select(HttpServletRequest request){
        String ID = request.getParameter("ID");
        Integer id1 = null;
        if(ID!=null){
            id1=Integer.valueOf(ID);
        }
        作战力量管理表 obj = i作战力量管理表Service.selectByPrimaryKey(id1);
        return obj;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/ZZLLDelete",produces = "application/json;chart=UTF-8")
    public Object 作战力量管理表Delete(HttpServletRequest request){
        String ID = request.getParameter("ID");
        int i = i作战力量管理表Service.deleteByPrimaryKey(Integer.valueOf(ID));
        return i;
    }
}
