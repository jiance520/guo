package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_military_rank;
import guo.service.IT_troops_military_rankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_troops_military_rankController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_military_rankService iT_troops_military_rankService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_military_rankSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_troops_military_rankSelectAll(){
        return iT_troops_military_rankService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_military_rankInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_military_rankInsert(HttpServletRequest request){
        String mrank_id = request.getParameter("mrank_id");
        String mrank_name = request.getParameter("mrank_name");
        String mrank_description = request.getParameter("mrank_description");
        T_troops_military_rank t_troops_military_rank = new T_troops_military_rank();
        if(mrank_name!=null){t_troops_military_rank.setMrankName(mrank_name);}
        if(mrank_description!=null){t_troops_military_rank.setMrankDescription(mrank_description);}
        int i = iT_troops_military_rankService.insertSelective(t_troops_military_rank);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_military_rankUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_military_rankUpdate(HttpServletRequest request){
        String mrank_id = request.getParameter("mrank_id");
        String mrank_name = request.getParameter("mrank_name");
        String mrank_description = request.getParameter("mrank_description");
        T_troops_military_rank t_troops_military_rank = new T_troops_military_rank();
        t_troops_military_rank.setMrankId(Integer.valueOf(mrank_id));
        if(mrank_name!=null){t_troops_military_rank.setMrankName(mrank_name);}
        if(mrank_description!=null){t_troops_military_rank.setMrankDescription(mrank_description);}
        int i = iT_troops_military_rankService.updateByPrimaryKeySelective(t_troops_military_rank);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_military_rankSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_military_rankSelect(HttpServletRequest request){
        String mrank_id = request.getParameter("mrank_id");
        T_troops_military_rank t_troops_military_rank = iT_troops_military_rankService.selectByPrimaryKey(Integer.valueOf(mrank_id));
        return JSON.toJSONString(t_troops_military_rank);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_military_rankDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_military_rankDelete(HttpServletRequest request){
        String mrank_id = request.getParameter("mrank_id");
        int i = iT_troops_military_rankService.deleteByPrimaryKey(Integer.valueOf(mrank_id));
        return JSON.toJSONString(i);
    }
}
