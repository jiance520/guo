package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_artillery_info;
import guo.service.IT_weapon_artillery_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_artillery_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_artillery_infoService iT_weapon_artillery_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_artillery_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_artillery_infoSelectAll(){
        return iT_weapon_artillery_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_artillery_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_artillery_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_artillery_type = request.getParameter("w_info_artillery_type");
        String w_info_artillery_caliber = request.getParameter("w_info_artillery_caliber");
        String w_info_artillery_length = request.getParameter("w_info_artillery_length");
        String w_info_ammo_base = request.getParameter("w_info_ammo_base");
        String w_info_artillery_weight = request.getParameter("w_info_artillery_weight");
        String w_info_cassette_radius = request.getParameter("w_info_cassette_radius");
        String w_info_beam_num = request.getParameter("w_info_beam_num");
        String w_info_max_speed = request.getParameter("w_info_max_speed");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_height_limit = request.getParameter("w_info_height_limit");
        String w_info_circle_limit = request.getParameter("w_info_circle_limit");
        String w_info_direction_limit = request.getParameter("w_info_direction_limit");
        String w_info_bomb_speed = request.getParameter("w_info_bomb_speed");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_artillery_info t_weapon_artillery_info = new T_weapon_artillery_info();
        if(w_info_name!=null){t_weapon_artillery_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_artillery_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_artillery_info.setwInfoModelId(w_info_model_id);}
        if(w_info_artillery_type!=null){t_weapon_artillery_info.setwInfoArtilleryType(Integer.valueOf(w_info_artillery_type));}
        if(w_info_artillery_caliber!=null){t_weapon_artillery_info.setwInfoArtilleryCaliber(Double.valueOf(w_info_artillery_caliber));}
        if(w_info_artillery_length!=null){t_weapon_artillery_info.setwInfoArtilleryLength(Integer.valueOf(w_info_artillery_length));}
        if(w_info_ammo_base!=null){t_weapon_artillery_info.setwInfoAmmoBase(Integer.valueOf(w_info_ammo_base));}
        if(w_info_artillery_weight!=null){t_weapon_artillery_info.setwInfoArtilleryWeight(Double.valueOf(w_info_artillery_weight));}
        if(w_info_cassette_radius!=null){t_weapon_artillery_info.setwInfoCassetteRadius(Double.valueOf(w_info_cassette_radius));}
        if(w_info_beam_num!=null){t_weapon_artillery_info.setwInfoBeamNum(Integer.valueOf(w_info_beam_num));}
        if(w_info_max_speed!=null){t_weapon_artillery_info.setwInfoMaxSpeed(Integer.valueOf(w_info_max_speed));}
        if(w_info_max_shot!=null){t_weapon_artillery_info.setwInfoMaxShot(Double.valueOf(w_info_max_shot));}
        if(w_info_height_limit!=null){t_weapon_artillery_info.setwInfoHeightLimit(Integer.valueOf(w_info_height_limit));}
        if(w_info_circle_limit!=null){t_weapon_artillery_info.setwInfoCircleLimit(Integer.valueOf(w_info_circle_limit));}
        if(w_info_direction_limit!=null){t_weapon_artillery_info.setwInfoDirectionLimit(Integer.valueOf(w_info_direction_limit));}
        if(w_info_bomb_speed!=null){t_weapon_artillery_info.setwInfoBombSpeed(Integer.valueOf(w_info_bomb_speed));}
        if(w_info_made!=null){t_weapon_artillery_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_artillery_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_artillery_infoService.insertSelective(t_weapon_artillery_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_artillery_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_artillery_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_artillery_type = request.getParameter("w_info_artillery_type");
        String w_info_artillery_caliber = request.getParameter("w_info_artillery_caliber");
        String w_info_artillery_length = request.getParameter("w_info_artillery_length");
        String w_info_ammo_base = request.getParameter("w_info_ammo_base");
        String w_info_artillery_weight = request.getParameter("w_info_artillery_weight");
        String w_info_cassette_radius = request.getParameter("w_info_cassette_radius");
        String w_info_beam_num = request.getParameter("w_info_beam_num");
        String w_info_max_speed = request.getParameter("w_info_max_speed");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_height_limit = request.getParameter("w_info_height_limit");
        String w_info_circle_limit = request.getParameter("w_info_circle_limit");
        String w_info_direction_limit = request.getParameter("w_info_direction_limit");
        String w_info_bomb_speed = request.getParameter("w_info_bomb_speed");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_artillery_info t_weapon_artillery_info = new T_weapon_artillery_info();
        t_weapon_artillery_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_artillery_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_artillery_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_artillery_info.setwInfoModelId(w_info_model_id);}
        if(w_info_artillery_type!=null){t_weapon_artillery_info.setwInfoArtilleryType(Integer.valueOf(w_info_artillery_type));}
        if(w_info_artillery_caliber!=null){t_weapon_artillery_info.setwInfoArtilleryCaliber(Double.valueOf(w_info_artillery_caliber));}
        if(w_info_artillery_length!=null){t_weapon_artillery_info.setwInfoArtilleryLength(Integer.valueOf(w_info_artillery_length));}
        if(w_info_ammo_base!=null){t_weapon_artillery_info.setwInfoAmmoBase(Integer.valueOf(w_info_ammo_base));}
        if(w_info_artillery_weight!=null){t_weapon_artillery_info.setwInfoArtilleryWeight(Double.valueOf(w_info_artillery_weight));}
        if(w_info_cassette_radius!=null){t_weapon_artillery_info.setwInfoCassetteRadius(Double.valueOf(w_info_cassette_radius));}
        if(w_info_beam_num!=null){t_weapon_artillery_info.setwInfoBeamNum(Integer.valueOf(w_info_beam_num));}
        if(w_info_max_speed!=null){t_weapon_artillery_info.setwInfoMaxSpeed(Integer.valueOf(w_info_max_speed));}
        if(w_info_max_shot!=null){t_weapon_artillery_info.setwInfoMaxShot(Double.valueOf(w_info_max_shot));}
        if(w_info_height_limit!=null){t_weapon_artillery_info.setwInfoHeightLimit(Integer.valueOf(w_info_height_limit));}
        if(w_info_circle_limit!=null){t_weapon_artillery_info.setwInfoCircleLimit(Integer.valueOf(w_info_circle_limit));}
        if(w_info_direction_limit!=null){t_weapon_artillery_info.setwInfoDirectionLimit(Integer.valueOf(w_info_direction_limit));}
        if(w_info_bomb_speed!=null){t_weapon_artillery_info.setwInfoBombSpeed(Integer.valueOf(w_info_bomb_speed));}
        if(w_info_made!=null){t_weapon_artillery_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_artillery_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_artillery_infoService.updateByPrimaryKeySelective(t_weapon_artillery_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_artillery_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_artillery_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_artillery_info t_weapon_artillery_info = iT_weapon_artillery_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_artillery_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_artillery_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_artillery_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_artillery_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
