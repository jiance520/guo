package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_blowfire_info;
import guo.service.IT_weapon_blowfire_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_blowfire_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_blowfire_infoService iT_weapon_blowfire_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_blowfire_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_blowfire_infoSelectAll(){
        return iT_weapon_blowfire_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_blowfire_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_blowfire_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_blowfire_type = request.getParameter("w_info_blowfire_type");
        String w_info_max_distance = request.getParameter("w_info_max_distance");
        String w_info_optimal_distance = request.getParameter("w_info_optimal_distance");
        String w_info_cassette_radius = request.getParameter("w_info_cassette_radius");
        String w_info_all_weight = request.getParameter("w_info_all_weight");
        String w_info_oil_weight = request.getParameter("w_info_oil_weight");
        String w_info_prepare_time = request.getParameter("w_info_prepare_time");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        String w_info_footman_firepower = request.getParameter("w_info_footman_firepower");
        String w_info_work_firepower = request.getParameter("w_info_work_firepower");
        String w_info_armor_firepower = request.getParameter("w_info_armor_firepower");
        T_weapon_blowfire_info t_weapon_blowfire_info = new T_weapon_blowfire_info();
        if(w_info_name!=null){t_weapon_blowfire_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_blowfire_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_blowfire_info.setwInfoModelId(w_info_model_id);}
        if(w_info_blowfire_type!=null){t_weapon_blowfire_info.setwInfoBlowfireType(Integer.valueOf(w_info_blowfire_type));}
        if(w_info_max_distance!=null){t_weapon_blowfire_info.setwInfoMaxDistance(Integer.valueOf(w_info_max_distance));}
        if(w_info_optimal_distance!=null){t_weapon_blowfire_info.setwInfoOptimalDistance(Integer.valueOf(w_info_optimal_distance));}
        if(w_info_cassette_radius!=null){t_weapon_blowfire_info.setwInfoCassetteRadius(Double.valueOf(w_info_cassette_radius));}
        if(w_info_all_weight!=null){t_weapon_blowfire_info.setwInfoAllWeight(Double.valueOf(w_info_all_weight));}
        if(w_info_oil_weight!=null){t_weapon_blowfire_info.setwInfoOilWeight(Double.valueOf(w_info_oil_weight));}
        if(w_info_prepare_time!=null){t_weapon_blowfire_info.setwInfoPrepareTime(Integer.valueOf(w_info_prepare_time));}
        if(w_info_made!=null){t_weapon_blowfire_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_blowfire_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        if(w_info_footman_firepower!=null){t_weapon_blowfire_info.setwInfoFootmanFirepower(Integer.valueOf(w_info_footman_firepower));}
        if(w_info_work_firepower!=null){t_weapon_blowfire_info.setwInfoWorkFirepower(Integer.valueOf(w_info_work_firepower));}
        if(w_info_armor_firepower!=null){t_weapon_blowfire_info.setwInfoArmorFirepower(Integer.valueOf(w_info_armor_firepower));}
        int i = iT_weapon_blowfire_infoService.insertSelective(t_weapon_blowfire_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_blowfire_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_blowfire_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_blowfire_type = request.getParameter("w_info_blowfire_type");
        String w_info_max_distance = request.getParameter("w_info_max_distance");
        String w_info_optimal_distance = request.getParameter("w_info_optimal_distance");
        String w_info_cassette_radius = request.getParameter("w_info_cassette_radius");
        String w_info_all_weight = request.getParameter("w_info_all_weight");
        String w_info_oil_weight = request.getParameter("w_info_oil_weight");
        String w_info_prepare_time = request.getParameter("w_info_prepare_time");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        String w_info_footman_firepower = request.getParameter("w_info_footman_firepower");
        String w_info_work_firepower = request.getParameter("w_info_work_firepower");
        String w_info_armor_firepower = request.getParameter("w_info_armor_firepower");
        T_weapon_blowfire_info t_weapon_blowfire_info = new T_weapon_blowfire_info();
        t_weapon_blowfire_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_blowfire_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_blowfire_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_blowfire_info.setwInfoModelId(w_info_model_id);}
        if(w_info_blowfire_type!=null){t_weapon_blowfire_info.setwInfoBlowfireType(Integer.valueOf(w_info_blowfire_type));}
        if(w_info_max_distance!=null){t_weapon_blowfire_info.setwInfoMaxDistance(Integer.valueOf(w_info_max_distance));}
        if(w_info_optimal_distance!=null){t_weapon_blowfire_info.setwInfoOptimalDistance(Integer.valueOf(w_info_optimal_distance));}
        if(w_info_cassette_radius!=null){t_weapon_blowfire_info.setwInfoCassetteRadius(Double.valueOf(w_info_cassette_radius));}
        if(w_info_all_weight!=null){t_weapon_blowfire_info.setwInfoAllWeight(Double.valueOf(w_info_all_weight));}
        if(w_info_oil_weight!=null){t_weapon_blowfire_info.setwInfoOilWeight(Double.valueOf(w_info_oil_weight));}
        if(w_info_prepare_time!=null){t_weapon_blowfire_info.setwInfoPrepareTime(Integer.valueOf(w_info_prepare_time));}
        if(w_info_made!=null){t_weapon_blowfire_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_blowfire_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        if(w_info_footman_firepower!=null){t_weapon_blowfire_info.setwInfoFootmanFirepower(Integer.valueOf(w_info_footman_firepower));}
        if(w_info_work_firepower!=null){t_weapon_blowfire_info.setwInfoWorkFirepower(Integer.valueOf(w_info_work_firepower));}
        if(w_info_armor_firepower!=null){t_weapon_blowfire_info.setwInfoArmorFirepower(Integer.valueOf(w_info_armor_firepower));}
        int i = iT_weapon_blowfire_infoService.updateByPrimaryKeySelective(t_weapon_blowfire_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_blowfire_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_blowfire_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_blowfire_info t_weapon_blowfire_info = iT_weapon_blowfire_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_blowfire_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_blowfire_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_blowfire_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_blowfire_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
