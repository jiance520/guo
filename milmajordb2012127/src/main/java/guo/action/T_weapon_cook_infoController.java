package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_cook_info;
import guo.service.IT_weapon_cook_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_cook_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_cook_infoService iT_weapon_cook_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cook_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_cook_infoSelectAll(){
        return iT_weapon_cook_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cook_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_cook_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_cook_info t_weapon_cook_info = new T_weapon_cook_info();
        if(w_info_name!=null){t_weapon_cook_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_cook_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_cook_info.setwInfoModelId(w_info_model_id);}
        if(w_info_made!=null){t_weapon_cook_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_cook_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_cook_infoService.insertSelective(t_weapon_cook_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cook_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_cook_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_cook_info t_weapon_cook_info = new T_weapon_cook_info();
        t_weapon_cook_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_cook_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_cook_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_cook_info.setwInfoModelId(w_info_model_id);}
        if(w_info_made!=null){t_weapon_cook_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_cook_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_cook_infoService.updateByPrimaryKeySelective(t_weapon_cook_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cook_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_cook_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_cook_info t_weapon_cook_info = iT_weapon_cook_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_cook_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cook_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_cook_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_cook_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
