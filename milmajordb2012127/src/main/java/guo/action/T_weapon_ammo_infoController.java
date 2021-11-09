package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_ammo_info;
import guo.service.IT_weapon_ammo_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_ammo_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_ammo_infoService iT_weapon_ammo_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_ammo_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_ammo_infoSelectAll(){
        return iT_weapon_ammo_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_ammo_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_ammo_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_shot_length = request.getParameter("w_info_shot_length");
        String w_info_shot_weight = request.getParameter("w_info_shot_weight");
        String w_info_detonator_weight = request.getParameter("w_info_detonator_weight");
        String w_info_explode_radius = request.getParameter("w_info_explode_radius");
        String w_info_kill_radius = request.getParameter("w_info_kill_radius");
        String w_info_rift_thickness = request.getParameter("w_info_rift_thickness");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        String w_info_footman_firepower = request.getParameter("w_info_footman_firepower");
        String w_info_armor_firepower = request.getParameter("w_info_armor_firepower");
        String w_info_air_firepower = request.getParameter("w_info_air_firepower");
        String w_info_work_firepower = request.getParameter("w_info_work_firepower");

        T_weapon_ammo_info t_weapon_ammo_info = new T_weapon_ammo_info();
        if(w_info_name!=null){t_weapon_ammo_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_ammo_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_ammo_info.setwInfoModelId(w_info_model_id);}
        if(w_info_shot_length!=null){t_weapon_ammo_info.setwInfoShotLength(Integer.valueOf(w_info_shot_length));}
        if(w_info_shot_weight!=null){t_weapon_ammo_info.setwInfoShotWeight(Double.valueOf(w_info_shot_weight));}
        if(w_info_detonator_weight!=null){t_weapon_ammo_info.setwInfoDetonatorWeight(Double.valueOf(w_info_detonator_weight));}
        if(w_info_explode_radius!=null){t_weapon_ammo_info.setwInfoExplodeRadius(Double.valueOf(w_info_explode_radius));}
        if(w_info_kill_radius!=null){t_weapon_ammo_info.setwInfoKillRadius(Double.valueOf(w_info_kill_radius));}
        if(w_info_rift_thickness!=null){t_weapon_ammo_info.setwInfoRiftThickness(Integer.valueOf(w_info_rift_thickness));}
        if(w_info_made!=null){t_weapon_ammo_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_ammo_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        if(w_info_footman_firepower!=null){t_weapon_ammo_info.setwInfoFootmanFirepower(Double.valueOf(w_info_footman_firepower));}
        if(w_info_armor_firepower!=null){t_weapon_ammo_info.setwInfoArmorFirepower(Double.valueOf(w_info_armor_firepower));}
        if(w_info_air_firepower!=null){t_weapon_ammo_info.setwInfoAirFirepower(Double.valueOf(w_info_air_firepower));}
        if(w_info_work_firepower!=null){t_weapon_ammo_info.setwInfoWorkFirepower(Double.valueOf(w_info_work_firepower));}
        int i = iT_weapon_ammo_infoService.insertSelective(t_weapon_ammo_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_ammo_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_ammo_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_shot_length = request.getParameter("w_info_shot_length");
        String w_info_shot_weight = request.getParameter("w_info_shot_weight");
        String w_info_detonator_weight = request.getParameter("w_info_detonator_weight");
        String w_info_explode_radius = request.getParameter("w_info_explode_radius");
        String w_info_kill_radius = request.getParameter("w_info_kill_radius");
        String w_info_rift_thickness = request.getParameter("w_info_rift_thickness");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        String w_info_footman_firepower = request.getParameter("w_info_footman_firepower");
        String w_info_armor_firepower = request.getParameter("w_info_armor_firepower");
        String w_info_air_firepower = request.getParameter("w_info_air_firepower");
        String w_info_work_firepower = request.getParameter("w_info_work_firepower");

        T_weapon_ammo_info t_weapon_ammo_info = new T_weapon_ammo_info();
        t_weapon_ammo_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_ammo_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_ammo_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_ammo_info.setwInfoModelId(w_info_model_id);}
        if(w_info_shot_length!=null){t_weapon_ammo_info.setwInfoShotLength(Integer.valueOf(w_info_shot_length));}
        if(w_info_shot_weight!=null){t_weapon_ammo_info.setwInfoShotWeight(Double.valueOf(w_info_shot_weight));}
        if(w_info_detonator_weight!=null){t_weapon_ammo_info.setwInfoDetonatorWeight(Double.valueOf(w_info_detonator_weight));}
        if(w_info_explode_radius!=null){t_weapon_ammo_info.setwInfoExplodeRadius(Double.valueOf(w_info_explode_radius));}
        if(w_info_kill_radius!=null){t_weapon_ammo_info.setwInfoKillRadius(Double.valueOf(w_info_kill_radius));}
        if(w_info_rift_thickness!=null){t_weapon_ammo_info.setwInfoRiftThickness(Integer.valueOf(w_info_rift_thickness));}
        if(w_info_made!=null){t_weapon_ammo_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_ammo_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        if(w_info_footman_firepower!=null){t_weapon_ammo_info.setwInfoFootmanFirepower(Double.valueOf(w_info_footman_firepower));}
        if(w_info_armor_firepower!=null){t_weapon_ammo_info.setwInfoArmorFirepower(Double.valueOf(w_info_armor_firepower));}
        if(w_info_air_firepower!=null){t_weapon_ammo_info.setwInfoAirFirepower(Double.valueOf(w_info_air_firepower));}
        if(w_info_work_firepower!=null){t_weapon_ammo_info.setwInfoWorkFirepower(Double.valueOf(w_info_work_firepower));}
        int i = iT_weapon_ammo_infoService.updateByPrimaryKeySelective(t_weapon_ammo_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_ammo_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_ammo_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_ammo_info t_weapon_ammo_info = iT_weapon_ammo_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_ammo_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_ammo_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_ammo_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_ammo_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
