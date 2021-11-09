package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_vehicle_flat_info;
import guo.service.IT_weapon_vehicle_flat_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_vehicle_flat_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_vehicle_flat_infoService iT_weapon_vehicle_flat_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_vehicle_flat_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_vehicle_flat_infoSelectAll(){
        return iT_weapon_vehicle_flat_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_vehicle_flat_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_vehicle_flat_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_flat_type = request.getParameter("w_info_flat_type");
        String w_info_weght = request.getParameter("w_info_weght");
        String w_info_load_num = request.getParameter("w_info_load_num");
        String w_info_land_max_speed = request.getParameter("w_info_land_max_speed");
        String w_info_land_max_journey = request.getParameter("w_info_land_max_journey");
        String w_info_water_depth = request.getParameter("w_info_water_depth");
        String w_info_grade_power = request.getParameter("w_info_grade_power");
        String W_info_lean_grade = request.getParameter("W_info_lean_grade");
        String w_info_moat_width = request.getParameter("w_info_moat_width");
        String w_info_obstacle_height = request.getParameter("w_info_obstacle_height");
        String w_info_water_max_speed = request.getParameter("w_info_water_max_speed");
        String w_info_water_max_sail = request.getParameter("w_info_water_max_sail");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_vehicle_flat_info t_weapon_vehicle_flat_info = new T_weapon_vehicle_flat_info();
        if(w_info_name!=null){t_weapon_vehicle_flat_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_vehicle_flat_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_vehicle_flat_info.setwInfoModelId(w_info_model_id);}
        if(w_info_flat_type!=null){t_weapon_vehicle_flat_info.setwInfoFlatType(Integer.valueOf(w_info_flat_type));}
        if(w_info_weght!=null){t_weapon_vehicle_flat_info.setwInfoWeght(Double.valueOf(w_info_weght));}
        if(w_info_load_num!=null){t_weapon_vehicle_flat_info.setwInfoLoadNum(Integer.valueOf(w_info_load_num));}
        if(w_info_land_max_speed!=null){t_weapon_vehicle_flat_info.setwInfoLandMaxSpeed(Integer.valueOf(w_info_land_max_speed));}
        if(w_info_land_max_journey!=null){t_weapon_vehicle_flat_info.setwInfoLandMaxJourney(Integer.valueOf(w_info_land_max_journey));}
        if(w_info_water_depth!=null){t_weapon_vehicle_flat_info.setwInfoWaterDepth(Double.valueOf(w_info_water_depth));}
        if(w_info_grade_power!=null){t_weapon_vehicle_flat_info.setwInfoGradePower(Integer.valueOf(w_info_grade_power));}
        if(W_info_lean_grade!=null){t_weapon_vehicle_flat_info.setwInfoLeanGrade(Integer.valueOf(W_info_lean_grade));}
        if(w_info_moat_width!=null){t_weapon_vehicle_flat_info.setwInfoMoatWidth(Double.valueOf(w_info_moat_width));}
        if(w_info_obstacle_height!=null){t_weapon_vehicle_flat_info.setwInfoObstacleHeight(Double.valueOf(w_info_obstacle_height));}
        if(w_info_water_max_speed!=null){t_weapon_vehicle_flat_info.setwInfoLandMaxSpeed(Integer.valueOf(w_info_water_max_speed));}
        if(w_info_water_max_sail!=null){t_weapon_vehicle_flat_info.setwInfoWaterMaxSail(Integer.valueOf(w_info_water_max_sail));}
        if(w_info_made!=null){t_weapon_vehicle_flat_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_vehicle_flat_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_vehicle_flat_infoService.insertSelective(t_weapon_vehicle_flat_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_vehicle_flat_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_vehicle_flat_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_flat_type = request.getParameter("w_info_flat_type");
        String w_info_weght = request.getParameter("w_info_weght");
        String w_info_load_num = request.getParameter("w_info_load_num");
        String w_info_land_max_speed = request.getParameter("w_info_land_max_speed");
        String w_info_land_max_journey = request.getParameter("w_info_land_max_journey");
        String w_info_water_depth = request.getParameter("w_info_water_depth");
        String w_info_grade_power = request.getParameter("w_info_grade_power");
        String W_info_lean_grade = request.getParameter("W_info_lean_grade");
        String w_info_moat_width = request.getParameter("w_info_moat_width");
        String w_info_obstacle_height = request.getParameter("w_info_obstacle_height");
        String w_info_water_max_speed = request.getParameter("w_info_water_max_speed");
        String w_info_water_max_sail = request.getParameter("w_info_water_max_sail");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_vehicle_flat_info t_weapon_vehicle_flat_info = new T_weapon_vehicle_flat_info();
        t_weapon_vehicle_flat_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_vehicle_flat_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_vehicle_flat_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_vehicle_flat_info.setwInfoModelId(w_info_model_id);}
        if(w_info_flat_type!=null){t_weapon_vehicle_flat_info.setwInfoFlatType(Integer.valueOf(w_info_flat_type));}
        if(w_info_weght!=null){t_weapon_vehicle_flat_info.setwInfoWeght(Double.valueOf(w_info_weght));}
        if(w_info_load_num!=null){t_weapon_vehicle_flat_info.setwInfoLoadNum(Integer.valueOf(w_info_load_num));}
        if(w_info_land_max_speed!=null){t_weapon_vehicle_flat_info.setwInfoLandMaxSpeed(Integer.valueOf(w_info_land_max_speed));}
        if(w_info_land_max_journey!=null){t_weapon_vehicle_flat_info.setwInfoLandMaxJourney(Integer.valueOf(w_info_land_max_journey));}
        if(w_info_water_depth!=null){t_weapon_vehicle_flat_info.setwInfoWaterDepth(Double.valueOf(w_info_water_depth));}
        if(w_info_grade_power!=null){t_weapon_vehicle_flat_info.setwInfoGradePower(Integer.valueOf(w_info_grade_power));}
        if(W_info_lean_grade!=null){t_weapon_vehicle_flat_info.setwInfoLeanGrade(Integer.valueOf(W_info_lean_grade));}
        if(w_info_moat_width!=null){t_weapon_vehicle_flat_info.setwInfoMoatWidth(Double.valueOf(w_info_moat_width));}
        if(w_info_obstacle_height!=null){t_weapon_vehicle_flat_info.setwInfoObstacleHeight(Double.valueOf(w_info_obstacle_height));}
        if(w_info_water_max_speed!=null){t_weapon_vehicle_flat_info.setwInfoLandMaxSpeed(Integer.valueOf(w_info_water_max_speed));}
        if(w_info_water_max_sail!=null){t_weapon_vehicle_flat_info.setwInfoWaterMaxSail(Integer.valueOf(w_info_water_max_sail));}
        if(w_info_made!=null){t_weapon_vehicle_flat_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_vehicle_flat_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_vehicle_flat_infoService.updateByPrimaryKeySelective(t_weapon_vehicle_flat_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_vehicle_flat_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_vehicle_flat_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_vehicle_flat_info t_weapon_vehicle_flat_info = iT_weapon_vehicle_flat_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_vehicle_flat_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_vehicle_flat_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_vehicle_flat_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_vehicle_flat_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
