package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_jam_info;
import guo.service.IT_weapon_jam_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_jam_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_jam_infoService iT_weapon_jam_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_jam_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_jam_infoSelectAll(){
        return iT_weapon_jam_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_jam_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_jam_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_equip_type = request.getParameter("w_info_equip_type");
        String w_info_show_dimension = request.getParameter("w_info_show_dimension");
        String w_info_last_time = request.getParameter("w_info_last_time");
        String w_info_equip_weight = request.getParameter("w_info_equip_weight");
        String w_info_effect_distance = request.getParameter("w_info_effect_distance");
        String w_info_intension = request.getParameter("w_info_intension");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_jam_info t_weapon_jam_info = new T_weapon_jam_info();
        if(w_info_name!=null){t_weapon_jam_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_jam_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_jam_info.setwInfoModelId(w_info_model_id);}
        if(w_info_equip_type!=null){t_weapon_jam_info.setwInfoEquipType(Integer.valueOf(w_info_equip_type));}
        if(w_info_show_dimension!=null){t_weapon_jam_info.setwInfoShowDimension(Integer.valueOf(w_info_show_dimension));}
        if(w_info_last_time!=null){t_weapon_jam_info.setwInfoLastTime(Integer.valueOf(w_info_last_time));}
        if(w_info_equip_weight!=null){t_weapon_jam_info.setwInfoEquipType(Integer.valueOf(w_info_equip_weight));}
        if(w_info_effect_distance!=null){t_weapon_jam_info.setwInfoEffectDistance(Integer.valueOf(w_info_effect_distance));}
        if(w_info_intension!=null){t_weapon_jam_info.setwInfoIntension(Integer.valueOf(w_info_intension));}
        if(w_info_made!=null){t_weapon_jam_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_jam_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_jam_infoService.insertSelective(t_weapon_jam_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_jam_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_jam_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_equip_type = request.getParameter("w_info_equip_type");
        String w_info_show_dimension = request.getParameter("w_info_show_dimension");
        String w_info_last_time = request.getParameter("w_info_last_time");
        String w_info_equip_weight = request.getParameter("w_info_equip_weight");
        String w_info_effect_distance = request.getParameter("w_info_effect_distance");
        String w_info_intension = request.getParameter("w_info_intension");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_jam_info t_weapon_jam_info = new T_weapon_jam_info();
        t_weapon_jam_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_jam_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_jam_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_jam_info.setwInfoModelId(w_info_model_id);}
        if(w_info_equip_type!=null){t_weapon_jam_info.setwInfoEquipType(Integer.valueOf(w_info_equip_type));}
        if(w_info_show_dimension!=null){t_weapon_jam_info.setwInfoShowDimension(Integer.valueOf(w_info_show_dimension));}
        if(w_info_last_time!=null){t_weapon_jam_info.setwInfoLastTime(Integer.valueOf(w_info_last_time));}
        if(w_info_equip_weight!=null){t_weapon_jam_info.setwInfoEquipType(Integer.valueOf(w_info_equip_weight));}
        if(w_info_effect_distance!=null){t_weapon_jam_info.setwInfoEffectDistance(Integer.valueOf(w_info_effect_distance));}
        if(w_info_intension!=null){t_weapon_jam_info.setwInfoIntension(Integer.valueOf(w_info_intension));}
        if(w_info_made!=null){t_weapon_jam_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_jam_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_jam_infoService.updateByPrimaryKeySelective(t_weapon_jam_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_jam_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_jam_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_jam_info t_weapon_jam_info = iT_weapon_jam_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_jam_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_jam_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_jam_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_jam_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
