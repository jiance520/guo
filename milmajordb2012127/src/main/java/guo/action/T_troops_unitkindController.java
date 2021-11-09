package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_unitkind;
import guo.service.IT_troops_unitkindService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_troops_unitkindController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_unitkindService iT_troops_unitkindService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_unitkindSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_troops_unitkindSelectAll(){
        return iT_troops_unitkindService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_unitkindInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_unitkindInsert(HttpServletRequest request){
        String unitkind_id = request.getParameter("unitkind_id");
        String unitkind_name = request.getParameter("unitkind_name");
        T_troops_unitkind t_troops_unitkind = new T_troops_unitkind();
        if(unitkind_name!=null){t_troops_unitkind.setUnitkindName(unitkind_name);}
        int i = iT_troops_unitkindService.insertSelective(t_troops_unitkind);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_unitkindUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_unitkindUpdate(HttpServletRequest request){
        String unitkind_id = request.getParameter("unitkind_id");
        String unitkind_name = request.getParameter("unitkind_name");
        T_troops_unitkind t_troops_unitkind = new T_troops_unitkind();
        t_troops_unitkind.setUnitkindId(Integer.valueOf(unitkind_id));
        if(unitkind_name!=null){t_troops_unitkind.setUnitkindName(unitkind_name);}
        int i = iT_troops_unitkindService.updateByPrimaryKeySelective(t_troops_unitkind);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_unitkindSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_unitkindSelect(HttpServletRequest request){
        String unitkind_id = request.getParameter("unitkind_id");
        T_troops_unitkind t_troops_unitkind = iT_troops_unitkindService.selectByPrimaryKey(Integer.valueOf(unitkind_id));
        return JSON.toJSONString(t_troops_unitkind);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_unitkindDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_unitkindDelete(HttpServletRequest request){
        String unitkind_id = request.getParameter("unitkind_id");
        int i = iT_troops_unitkindService.deleteByPrimaryKey(Integer.valueOf(unitkind_id));
        return JSON.toJSONString(i);
    }
}
