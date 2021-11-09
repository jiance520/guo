package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_missile_info;
import guo.service.IT_weapon_missile_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_missile_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_missile_infoService iT_weapon_missile_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_missile_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_missile_infoSelectAll(){
        return iT_weapon_missile_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_missile_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_missile_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_missile_type = request.getParameter("w_info_missile_type");
        String w_info_missile_length = request.getParameter("w_info_missile_length");
        String w_info_missile_weight = request.getParameter("w_info_missile_weight");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_min_shot = request.getParameter("w_info_min_shot");
        String w_info_missile_speed = request.getParameter("w_info_missile_speed");
        String w_info_kill_probability = request.getParameter("w_info_kill_probability");
        String w_info_reaction_time = request.getParameter("w_info_reaction_time");
        String w_info_prepare_time = request.getParameter("w_info_prepare_time");
        String w_info_speed = request.getParameter("w_info_speed");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_missile_info t_weapon_missile_info = new T_weapon_missile_info();
        if(w_info_name!=null){t_weapon_missile_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_missile_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_missile_info.setwInfoModelId(w_info_model_id);}
        if(w_info_missile_type!=null){t_weapon_missile_info.setwInfoMissileType(Integer.valueOf(w_info_missile_type));}
        if(w_info_missile_length!=null){t_weapon_missile_info.setwInfoMissileLength(Double.valueOf(w_info_missile_length));}
        if(w_info_missile_weight!=null){t_weapon_missile_info.setwInfoMissileWeight(Double.valueOf(w_info_missile_weight));}
        if(w_info_max_shot!=null){t_weapon_missile_info.setwInfoMaxShot(Integer.valueOf(w_info_max_shot));}
        if(w_info_min_shot!=null){t_weapon_missile_info.setwInfoMinShot(Integer.valueOf(w_info_min_shot));}
        if(w_info_missile_speed!=null){t_weapon_missile_info.setwInfoMissileSpeed(Double.valueOf(w_info_missile_speed));}
        if(w_info_kill_probability!=null){t_weapon_missile_info.setwInfoKillProbability(Integer.valueOf(w_info_kill_probability));}
        if(w_info_reaction_time!=null){t_weapon_missile_info.setwInfoReactionTime(Integer.valueOf(w_info_reaction_time));}
        if(w_info_prepare_time!=null){t_weapon_missile_info.setwInfoPrepareTime(Integer.valueOf(w_info_prepare_time));}
        if(w_info_speed!=null){t_weapon_missile_info.setwInfoSpeed(Double.valueOf(w_info_speed));}
        if(w_info_made!=null){t_weapon_missile_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_missile_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_missile_infoService.insertSelective(t_weapon_missile_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_missile_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_missile_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_missile_type = request.getParameter("w_info_missile_type");
        String w_info_missile_length = request.getParameter("w_info_missile_length");
        String w_info_missile_weight = request.getParameter("w_info_missile_weight");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_min_shot = request.getParameter("w_info_min_shot");
        String w_info_missile_speed = request.getParameter("w_info_missile_speed");
        String w_info_kill_probability = request.getParameter("w_info_kill_probability");
        String w_info_reaction_time = request.getParameter("w_info_reaction_time");
        String w_info_prepare_time = request.getParameter("w_info_prepare_time");
        String w_info_speed = request.getParameter("w_info_speed");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_missile_info t_weapon_missile_info = new T_weapon_missile_info();
        t_weapon_missile_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_missile_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_missile_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_missile_info.setwInfoModelId(w_info_model_id);}
        if(w_info_missile_type!=null){t_weapon_missile_info.setwInfoMissileType(Integer.valueOf(w_info_missile_type));}
        if(w_info_missile_length!=null){t_weapon_missile_info.setwInfoMissileLength(Double.valueOf(w_info_missile_length));}
        if(w_info_missile_weight!=null){t_weapon_missile_info.setwInfoMissileWeight(Double.valueOf(w_info_missile_weight));}
        if(w_info_max_shot!=null){t_weapon_missile_info.setwInfoMaxShot(Integer.valueOf(w_info_max_shot));}
        if(w_info_min_shot!=null){t_weapon_missile_info.setwInfoMinShot(Integer.valueOf(w_info_min_shot));}
        if(w_info_missile_speed!=null){t_weapon_missile_info.setwInfoMissileSpeed(Double.valueOf(w_info_missile_speed));}
        if(w_info_kill_probability!=null){t_weapon_missile_info.setwInfoKillProbability(Integer.valueOf(w_info_kill_probability));}
        if(w_info_reaction_time!=null){t_weapon_missile_info.setwInfoReactionTime(Integer.valueOf(w_info_reaction_time));}
        if(w_info_prepare_time!=null){t_weapon_missile_info.setwInfoPrepareTime(Integer.valueOf(w_info_prepare_time));}
        if(w_info_speed!=null){t_weapon_missile_info.setwInfoSpeed(Double.valueOf(w_info_speed));}
        if(w_info_made!=null){t_weapon_missile_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_missile_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_missile_infoService.updateByPrimaryKeySelective(t_weapon_missile_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_missile_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_missile_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_missile_info t_weapon_missile_info = iT_weapon_missile_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_missile_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_missile_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_missile_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_missile_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
