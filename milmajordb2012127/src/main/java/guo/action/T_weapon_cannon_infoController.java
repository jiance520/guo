package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_cannon_info;
import guo.service.IT_weapon_cannon_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_cannon_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_cannon_infoService iT_weapon_cannon_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cannon_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_cannon_infoSelectAll(){
        return iT_weapon_cannon_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cannon_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_cannon_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_cannon_type = request.getParameter("w_info_cannon_type");
        String w_info_cannon_caliber = request.getParameter("w_info_cannon_caliber");
        String w_info_cannon_length = request.getParameter("w_info_cannon_length");
        String w_info_cannon_weight = request.getParameter("w_info_cannon_weight");
        String w_info_slant_space = request.getParameter("w_info_slant_space");
        String w_info_effect_shot = request.getParameter("w_info_effect_shot");
        String w_info_first_speed = request.getParameter("w_info_first_speed");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_height_limit = request.getParameter("w_info_height_limit");
        String w_info_effect_height = request.getParameter("w_info_effect_height");
        String w_info_direction_limit = request.getParameter("w_info_direction_limit");
        String w_info_bomb_speed = request.getParameter("w_info_bomb_speed");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_cannon_info t_weapon_cannon_info = new T_weapon_cannon_info();
        if(w_info_name!=null){t_weapon_cannon_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_cannon_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_cannon_info.setwInfoModelId(w_info_model_id);}
        if(w_info_cannon_type!=null){t_weapon_cannon_info.setwInfoCannonType(Integer.valueOf(w_info_cannon_type));}
        if(w_info_cannon_caliber!=null){t_weapon_cannon_info.setwInfoCannonCaliber(Double.valueOf(w_info_cannon_caliber));}
        if(w_info_cannon_length!=null){t_weapon_cannon_info.setwInfoCannonLength(Double.valueOf(w_info_cannon_length));}
        if(w_info_cannon_weight!=null){t_weapon_cannon_info.setwInfoCannonWeight(Double.valueOf(w_info_cannon_weight));}
        if(w_info_slant_space!=null){t_weapon_cannon_info.setwInfoSlantSpace(Double.valueOf(w_info_slant_space));}
        if(w_info_effect_shot!=null){t_weapon_cannon_info.setwInfoEffectShot(Double.valueOf(w_info_effect_shot));}
        if(w_info_first_speed!=null){t_weapon_cannon_info.setwInfoFirstSpeed(Double.valueOf(w_info_first_speed));}
        if(w_info_max_shot!=null){t_weapon_cannon_info.setwInfoMaxShot(Integer.valueOf(w_info_max_shot));}
        if(w_info_height_limit!=null){t_weapon_cannon_info.setwInfoHeightLimit(Integer.valueOf(w_info_height_limit));}
        if(w_info_effect_height!=null){t_weapon_cannon_info.setwInfoEffectHeight(Integer.valueOf(w_info_effect_height));}
        if(w_info_direction_limit!=null){t_weapon_cannon_info.setwInfoDirectionLimit(Integer.valueOf(w_info_direction_limit));}
        if(w_info_bomb_speed!=null){t_weapon_cannon_info.setwInfoBombSpeed(Integer.valueOf(w_info_bomb_speed));}
        if(w_info_made!=null){t_weapon_cannon_info.setwInfoMade(Integer.valueOf(w_info_made));}
        int i = iT_weapon_cannon_infoService.insertSelective(t_weapon_cannon_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cannon_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_cannon_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_cannon_type = request.getParameter("w_info_cannon_type");
        String w_info_cannon_caliber = request.getParameter("w_info_cannon_caliber");
        String w_info_cannon_length = request.getParameter("w_info_cannon_length");
        String w_info_cannon_weight = request.getParameter("w_info_cannon_weight");
        String w_info_slant_space = request.getParameter("w_info_slant_space");
        String w_info_effect_shot = request.getParameter("w_info_effect_shot");
        String w_info_first_speed = request.getParameter("w_info_first_speed");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_height_limit = request.getParameter("w_info_height_limit");
        String w_info_effect_height = request.getParameter("w_info_effect_height");
        String w_info_direction_limit = request.getParameter("w_info_direction_limit");
        String w_info_bomb_speed = request.getParameter("w_info_bomb_speed");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_cannon_info t_weapon_cannon_info = new T_weapon_cannon_info();
        t_weapon_cannon_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_cannon_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_cannon_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_cannon_info.setwInfoModelId(w_info_model_id);}
        if(w_info_cannon_type!=null){t_weapon_cannon_info.setwInfoCannonType(Integer.valueOf(w_info_cannon_type));}
        if(w_info_cannon_caliber!=null){t_weapon_cannon_info.setwInfoCannonCaliber(Double.valueOf(w_info_cannon_caliber));}
        if(w_info_cannon_length!=null){t_weapon_cannon_info.setwInfoCannonLength(Double.valueOf(w_info_cannon_length));}
        if(w_info_cannon_weight!=null){t_weapon_cannon_info.setwInfoCannonWeight(Double.valueOf(w_info_cannon_weight));}
        if(w_info_slant_space!=null){t_weapon_cannon_info.setwInfoSlantSpace(Double.valueOf(w_info_slant_space));}
        if(w_info_effect_shot!=null){t_weapon_cannon_info.setwInfoEffectShot(Double.valueOf(w_info_effect_shot));}
        if(w_info_first_speed!=null){t_weapon_cannon_info.setwInfoFirstSpeed(Double.valueOf(w_info_first_speed));}
        if(w_info_max_shot!=null){t_weapon_cannon_info.setwInfoMaxShot(Integer.valueOf(w_info_max_shot));}
        if(w_info_height_limit!=null){t_weapon_cannon_info.setwInfoHeightLimit(Integer.valueOf(w_info_height_limit));}
        if(w_info_effect_height!=null){t_weapon_cannon_info.setwInfoEffectHeight(Integer.valueOf(w_info_effect_height));}
        if(w_info_direction_limit!=null){t_weapon_cannon_info.setwInfoDirectionLimit(Integer.valueOf(w_info_direction_limit));}
        if(w_info_bomb_speed!=null){t_weapon_cannon_info.setwInfoBombSpeed(Integer.valueOf(w_info_bomb_speed));}
        if(w_info_made!=null){t_weapon_cannon_info.setwInfoMade(Integer.valueOf(w_info_made));}
        int i = iT_weapon_cannon_infoService.updateByPrimaryKeySelective(t_weapon_cannon_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cannon_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_cannon_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_cannon_info t_weapon_cannon_info = iT_weapon_cannon_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_cannon_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_cannon_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_cannon_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_cannon_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
