package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_types;
import guo.service.IT_weapon_typesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_typesController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_typesService iT_weapon_typesService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_typesSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_typesSelectAll(){
        return iT_weapon_typesService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_typesInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_typesInsert(HttpServletRequest request){
        String type_id = request.getParameter("type_id");
        String type_name = request.getParameter("type_name");
        String type_parent_id = request.getParameter("type_parent_id");
        String type_parent_name = request.getParameter("type_parent_name");
        String type_decsribe = request.getParameter("type_decsribe");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_types t_weapon_types = new T_weapon_types();
        if(type_name!=null){t_weapon_types.setTypeName(type_name);}
        if(type_parent_id!=null){t_weapon_types.setTypeParentId(Integer.valueOf(type_parent_id));}
        if(type_parent_name!=null){t_weapon_types.setTypeParentName(type_parent_name);}
        if(type_decsribe!=null){t_weapon_types.setTypeDecsribe(type_decsribe);}
        if(w_info_campaign_f!=null){t_weapon_types.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_typesService.insertSelective(t_weapon_types);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_typesUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_typesUpdate(HttpServletRequest request){
        String type_id = request.getParameter("type_id");
        String type_name = request.getParameter("type_name");
        String type_parent_id = request.getParameter("type_parent_id");
        String type_parent_name = request.getParameter("type_parent_name");
        String type_decsribe = request.getParameter("type_decsribe");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_types t_weapon_types = new T_weapon_types();
        t_weapon_types.setTypeId(Integer.valueOf(type_id));
        if(type_name!=null){t_weapon_types.setTypeName(type_name);}
        if(type_parent_id!=null){t_weapon_types.setTypeParentId(Integer.valueOf(type_parent_id));}
        if(type_parent_name!=null){t_weapon_types.setTypeParentName(type_parent_name);}
        if(type_decsribe!=null){t_weapon_types.setTypeDecsribe(type_decsribe);}
        if(w_info_campaign_f!=null){t_weapon_types.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_typesService.updateByPrimaryKeySelective(t_weapon_types);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_typesSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_typesSelect(HttpServletRequest request){
        String type_id = request.getParameter("type_id");
        T_weapon_types t_weapon_types = iT_weapon_typesService.selectByPrimaryKey(Integer.valueOf(type_id));
        return JSON.toJSONString(t_weapon_types);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_typesDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_typesDelete(HttpServletRequest request){
        String type_id = request.getParameter("type_id");
        int i = iT_weapon_typesService.deleteByPrimaryKey(Integer.valueOf(type_id));
        return JSON.toJSONString(i);
    }
}
