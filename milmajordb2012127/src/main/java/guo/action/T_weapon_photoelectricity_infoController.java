package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_photoelectricity_info;
import guo.service.IT_weapon_photoelectricity_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_photoelectricity_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_photoelectricity_infoService iT_weapon_photoelectricity_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_photoelectricity_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_photoelectricity_infoSelectAll(){
        return iT_weapon_photoelectricity_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_photoelectricity_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_photoelectricity_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_equip_type = request.getParameter("w_info_equip_type");
        String w_info_move_velocity = request.getParameter("w_info_move_velocity");
        String w_info_work_time = request.getParameter("w_info_work_time");
        String w_info_effect_distance = request.getParameter("w_info_effect_distance");
        String w_info_antijamming_ablity = request.getParameter("w_info_antijamming_ablity");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_photoelectricity_info t_weapon_photoelectricity_info = new T_weapon_photoelectricity_info();
        if(w_info_name!=null){t_weapon_photoelectricity_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_photoelectricity_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_photoelectricity_info.setwInfoModelId(w_info_model_id);}
        if(w_info_equip_type!=null){t_weapon_photoelectricity_info.setwInfoEquipType(Integer.valueOf(w_info_equip_type));}
        if(w_info_move_velocity!=null){t_weapon_photoelectricity_info.setwInfoMoveVelocity(Integer.valueOf(w_info_move_velocity));}
        if(w_info_work_time!=null){t_weapon_photoelectricity_info.setwInfoWorkTime(Integer.valueOf(w_info_work_time));}
        if(w_info_effect_distance!=null){t_weapon_photoelectricity_info.setwInfoEffectDistance(Integer.valueOf(w_info_effect_distance));}
        if(w_info_antijamming_ablity!=null){t_weapon_photoelectricity_info.setwInfoAntijammingAblity(Integer.valueOf(w_info_antijamming_ablity));}
        if(w_info_made!=null){t_weapon_photoelectricity_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_photoelectricity_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_photoelectricity_infoService.insertSelective(t_weapon_photoelectricity_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_photoelectricity_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_photoelectricity_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_equip_type = request.getParameter("w_info_equip_type");
        String w_info_move_velocity = request.getParameter("w_info_move_velocity");
        String w_info_work_time = request.getParameter("w_info_work_time");
        String w_info_effect_distance = request.getParameter("w_info_effect_distance");
        String w_info_antijamming_ablity = request.getParameter("w_info_antijamming_ablity");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_photoelectricity_info t_weapon_photoelectricity_info = new T_weapon_photoelectricity_info();
        t_weapon_photoelectricity_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_photoelectricity_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_photoelectricity_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_photoelectricity_info.setwInfoModelId(w_info_model_id);}
        if(w_info_equip_type!=null){t_weapon_photoelectricity_info.setwInfoEquipType(Integer.valueOf(w_info_equip_type));}
        if(w_info_move_velocity!=null){t_weapon_photoelectricity_info.setwInfoMoveVelocity(Integer.valueOf(w_info_move_velocity));}
        if(w_info_work_time!=null){t_weapon_photoelectricity_info.setwInfoWorkTime(Integer.valueOf(w_info_work_time));}
        if(w_info_effect_distance!=null){t_weapon_photoelectricity_info.setwInfoEffectDistance(Integer.valueOf(w_info_effect_distance));}
        if(w_info_antijamming_ablity!=null){t_weapon_photoelectricity_info.setwInfoAntijammingAblity(Integer.valueOf(w_info_antijamming_ablity));}
        if(w_info_made!=null){t_weapon_photoelectricity_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_photoelectricity_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_photoelectricity_infoService.updateByPrimaryKeySelective(t_weapon_photoelectricity_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_photoelectricity_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_photoelectricity_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_photoelectricity_info t_weapon_photoelectricity_info = iT_weapon_photoelectricity_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_photoelectricity_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_photoelectricity_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_photoelectricity_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_photoelectricity_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
