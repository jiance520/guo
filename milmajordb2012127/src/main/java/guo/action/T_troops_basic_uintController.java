package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_basic_uint;
import guo.service.IT_troops_basic_uintService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class T_troops_basic_uintController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_basic_uintService iT_troops_basic_uintService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_basic_uintSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_troops_basic_uintSelectAll(HttpServletRequest request){
        String bu_info_campaign_f = request.getParameter("bu_info_campaign_f");
        String bu_level = request.getParameter("bu_level");
        Map map = new HashMap();
        map.put("bu_info_campaign_f",bu_info_campaign_f);
        map.put("bu_level",bu_level);
        return iT_troops_basic_uintService.selectAll(map);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_basic_uintInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_basic_uintInsert(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        String bu_name = request.getParameter("bu_name");
        String bu_level = request.getParameter("bu_level");
        String bu_weave = request.getParameter("bu_weave");
        String bu_info_campaign_f = request.getParameter("bu_info_campaign_f");
        String bu_unit_type = request.getParameter("bu_unit_type");
        String bu_description = request.getParameter("bu_description");
        T_troops_basic_uint t_troops_basic_uint = new T_troops_basic_uint();
        if(bu_name!=null){t_troops_basic_uint.setBuName(bu_name);}
        if(bu_level!=null){t_troops_basic_uint.setBuLevel(Integer.valueOf(bu_level));}
        if(bu_weave!=null){t_troops_basic_uint.setBuWeave(Integer.valueOf(bu_weave));}
        if(bu_info_campaign_f!=null){t_troops_basic_uint.setBuInfoCampaignF(Integer.valueOf(bu_info_campaign_f));}
        if(bu_unit_type!=null){t_troops_basic_uint.setBuUnitType(Integer.valueOf(bu_unit_type));}
        if(bu_description!=null){t_troops_basic_uint.setBuDescription(bu_description);}

        int i = iT_troops_basic_uintService.insertSelective(t_troops_basic_uint);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_basic_uintUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_basic_uintUpdate(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        String bu_name = request.getParameter("bu_name");
        String bu_level = request.getParameter("bu_level");
        String bu_weave = request.getParameter("bu_weave");
        String bu_info_campaign_f = request.getParameter("bu_info_campaign_f");
        String bu_unit_type = request.getParameter("bu_unit_type");
        String bu_description = request.getParameter("bu_description");
        T_troops_basic_uint t_troops_basic_uint = new T_troops_basic_uint();
        t_troops_basic_uint.setBuId(Integer.valueOf(bu_id));
        if(bu_name!=null){t_troops_basic_uint.setBuName(bu_name);}
        if(bu_level!=null){t_troops_basic_uint.setBuLevel(Integer.valueOf(bu_level));}
        if(bu_weave!=null){t_troops_basic_uint.setBuWeave(Integer.valueOf(bu_weave));}
        if(bu_info_campaign_f!=null){t_troops_basic_uint.setBuInfoCampaignF(Integer.valueOf(bu_info_campaign_f));}
        if(bu_unit_type!=null){t_troops_basic_uint.setBuUnitType(Integer.valueOf(bu_unit_type));}
        if(bu_description!=null){t_troops_basic_uint.setBuDescription(bu_description);}
        int i = iT_troops_basic_uintService.updateByPrimaryKeySelective(t_troops_basic_uint);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_basic_uintSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_basic_uintSelect(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        T_troops_basic_uint t_troops_basic_uint = iT_troops_basic_uintService.selectByPrimaryKey(Integer.valueOf(bu_id));
        return JSON.toJSONString(t_troops_basic_uint);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_basic_uintDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_basic_uintDelete(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        int i = iT_troops_basic_uintService.deleteByPrimaryKey(Integer.valueOf(bu_id));
        return JSON.toJSONString(i);
    }
}
