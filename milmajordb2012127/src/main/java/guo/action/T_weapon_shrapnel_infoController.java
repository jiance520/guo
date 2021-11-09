package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_shrapnel_info;
import guo.service.IT_weapon_shrapnel_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_shrapnel_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_shrapnel_infoService iT_weapon_shrapnel_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_shrapnel_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_shrapnel_infoSelectAll(){
        return iT_weapon_shrapnel_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_shrapnel_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_shrapnel_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_shrapnel_type = request.getParameter("w_info_shrapnel_type");
        String w_info_shrapnel_caliber = request.getParameter("w_info_shrapnel_caliber");
        String w_info_shrapnel_weight = request.getParameter("w_info_shrapnel_weight");
        String w_info_shrapnel_speed = request.getParameter("w_info_shrapnel_speed");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_min_shot = request.getParameter("w_info_min_shot");
        String w_info_theory_speed = request.getParameter("w_info_theory_speed");
        String w_info_height_limit = request.getParameter("w_info_height_limit");
        String w_info_direction_limit = request.getParameter("w_info_direction_limit");
        String w_info_cassette_capacitance = request.getParameter("w_info_cassette_capacitance");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");

        T_weapon_shrapnel_info t_weapon_shrapnel_info = new T_weapon_shrapnel_info();
        if(w_info_name!=null){t_weapon_shrapnel_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_shrapnel_info.setTypeId(Double.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_shrapnel_info.setwInfoModelId(w_info_model_id);}
        if(w_info_shrapnel_type!=null){t_weapon_shrapnel_info.setwInfoShrapnelType(Integer.valueOf(w_info_shrapnel_type));}
        if(w_info_shrapnel_caliber!=null){t_weapon_shrapnel_info.setwInfoShrapnelCaliber(Double.valueOf(w_info_shrapnel_caliber));}
        if(w_info_shrapnel_weight!=null){t_weapon_shrapnel_info.setwInfoShrapnelWeight(Double.valueOf(w_info_shrapnel_weight));}
        if(w_info_shrapnel_speed!=null){t_weapon_shrapnel_info.setwInfoShrapnelSpeed(Double.valueOf(w_info_shrapnel_speed));}
        if(w_info_max_shot!=null){t_weapon_shrapnel_info.setwInfoMaxShot(Integer.valueOf(w_info_max_shot));}
        if(w_info_min_shot!=null){t_weapon_shrapnel_info.setwInfoMinShot(Integer.valueOf(w_info_min_shot));}
        if(w_info_theory_speed!=null){t_weapon_shrapnel_info.setwInfoTheorySpeed(Integer.valueOf(w_info_theory_speed));}
        if(w_info_height_limit!=null){t_weapon_shrapnel_info.setwInfoHeightLimit(Integer.valueOf(w_info_height_limit));}
        if(w_info_direction_limit!=null){t_weapon_shrapnel_info.setwInfoDirectionLimit(Integer.valueOf(w_info_direction_limit));}
        if(w_info_cassette_capacitance!=null){t_weapon_shrapnel_info.setwInfoCassetteCapacitance(Integer.valueOf(w_info_cassette_capacitance));}
        if(w_info_made!=null){t_weapon_shrapnel_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_shrapnel_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_shrapnel_infoService.insertSelective(t_weapon_shrapnel_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_shrapnel_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_shrapnel_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_shrapnel_type = request.getParameter("w_info_shrapnel_type");
        String w_info_shrapnel_caliber = request.getParameter("w_info_shrapnel_caliber");
        String w_info_shrapnel_weight = request.getParameter("w_info_shrapnel_weight");
        String w_info_shrapnel_speed = request.getParameter("w_info_shrapnel_speed");
        String w_info_max_shot = request.getParameter("w_info_max_shot");
        String w_info_min_shot = request.getParameter("w_info_min_shot");
        String w_info_theory_speed = request.getParameter("w_info_theory_speed");
        String w_info_height_limit = request.getParameter("w_info_height_limit");
        String w_info_direction_limit = request.getParameter("w_info_direction_limit");
        String w_info_cassette_capacitance = request.getParameter("w_info_cassette_capacitance");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");

        T_weapon_shrapnel_info t_weapon_shrapnel_info = new T_weapon_shrapnel_info();
        t_weapon_shrapnel_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_shrapnel_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_shrapnel_info.setTypeId(Double.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_shrapnel_info.setwInfoModelId(w_info_model_id);}
        if(w_info_shrapnel_type!=null){t_weapon_shrapnel_info.setwInfoShrapnelType(Integer.valueOf(w_info_shrapnel_type));}
        if(w_info_shrapnel_caliber!=null){t_weapon_shrapnel_info.setwInfoShrapnelCaliber(Double.valueOf(w_info_shrapnel_caliber));}
        if(w_info_shrapnel_weight!=null){t_weapon_shrapnel_info.setwInfoShrapnelWeight(Double.valueOf(w_info_shrapnel_weight));}
        if(w_info_shrapnel_speed!=null){t_weapon_shrapnel_info.setwInfoShrapnelSpeed(Double.valueOf(w_info_shrapnel_speed));}
        if(w_info_max_shot!=null){t_weapon_shrapnel_info.setwInfoMaxShot(Integer.valueOf(w_info_max_shot));}
        if(w_info_min_shot!=null){t_weapon_shrapnel_info.setwInfoMinShot(Integer.valueOf(w_info_min_shot));}
        if(w_info_theory_speed!=null){t_weapon_shrapnel_info.setwInfoTheorySpeed(Integer.valueOf(w_info_theory_speed));}
        if(w_info_height_limit!=null){t_weapon_shrapnel_info.setwInfoHeightLimit(Integer.valueOf(w_info_height_limit));}
        if(w_info_direction_limit!=null){t_weapon_shrapnel_info.setwInfoDirectionLimit(Integer.valueOf(w_info_direction_limit));}
        if(w_info_cassette_capacitance!=null){t_weapon_shrapnel_info.setwInfoCassetteCapacitance(Integer.valueOf(w_info_cassette_capacitance));}
        if(w_info_made!=null){t_weapon_shrapnel_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_shrapnel_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_shrapnel_infoService.updateByPrimaryKeySelective(t_weapon_shrapnel_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_shrapnel_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_shrapnel_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_shrapnel_info t_weapon_shrapnel_info = iT_weapon_shrapnel_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_shrapnel_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_shrapnel_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_shrapnel_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_shrapnel_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
