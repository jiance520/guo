package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_commandership;
import guo.service.IT_troops_commandershipService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_troops_commandershipController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_commandershipService iT_troops_commandershipService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_commandershipSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_troops_commandershipSelectAll(){
        return iT_troops_commandershipService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_commandershipInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_commandershipInsert(HttpServletRequest request){
        String commandership_name = request.getParameter("commandership_name");
        String commandership_description = request.getParameter("commandership_description");
        T_troops_commandership t_troops_commandership = new T_troops_commandership();
        if(commandership_name!=null){t_troops_commandership.setCommandershipName(commandership_name);}
        if(commandership_description!=null){t_troops_commandership.setCommandershipDescription(commandership_description);}
        int i = iT_troops_commandershipService.insertSelective(t_troops_commandership);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_commandershipUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_commandershipUpdate(HttpServletRequest request){
        String commandership_id = request.getParameter("commandership_id");
        String commandership_name = request.getParameter("commandership_name");
        String commandership_description = request.getParameter("commandership_description");
        T_troops_commandership t_troops_commandership = new T_troops_commandership();
        t_troops_commandership.setCommandershipId(Integer.valueOf(commandership_id));
        if(commandership_name!=null){t_troops_commandership.setCommandershipName(commandership_name);}
        if(commandership_description!=null){t_troops_commandership.setCommandershipDescription(commandership_description);}
        int i = iT_troops_commandershipService.updateByPrimaryKeySelective(t_troops_commandership);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_commandershipSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_commandershipSelect(HttpServletRequest request){
        String commandership_id = request.getParameter("commandership_id");
        T_troops_commandership t_troops_commandership = iT_troops_commandershipService.selectByPrimaryKey(Integer.valueOf(commandership_id));
        return JSON.toJSONString(t_troops_commandership);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_commandershipDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_commandershipDelete(HttpServletRequest request){
        String commandership_id = request.getParameter("commandership_id");
        int i = iT_troops_commandershipService.deleteByPrimaryKey(Integer.valueOf(commandership_id));
        return JSON.toJSONString(i);
    }
}
