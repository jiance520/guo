package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_gun_info;
import guo.service.IT_weapon_gun_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_gun_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_gun_infoService iT_weapon_gun_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_gun_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_gun_infoSelectAll(){
        return iT_weapon_gun_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_gun_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_gun_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_gun_type = request.getParameter("w_info_gun_type");
        String w_info_gun_caliber = request.getParameter("w_info_gun_caliber");
        String w_info_gun_length = request.getParameter("w_info_gun_length");
        String w_info_chamber_length = request.getParameter("w_info_chamber_length");
        String w_info_gun_weight = request.getParameter("w_info_gun_weight");
        String w_info_cassette_capacitance = request.getParameter("w_info_cassette_capacitance");
        String w_info_speed = request.getParameter("w_info_speed");
        String w_info_gunshot = request.getParameter("w_info_gunshot");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_gun_info t_weapon_gun_info = new T_weapon_gun_info();
        if(w_info_name!=null){t_weapon_gun_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_gun_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_gun_info.setwInfoModelId(w_info_model_id);}
        if(w_info_gun_type!=null){t_weapon_gun_info.setwInfoGunType(Integer.valueOf(w_info_gun_type));}
        if(w_info_gun_caliber!=null){t_weapon_gun_info.setwInfoGunCaliber(Double.valueOf(w_info_gun_caliber));}
        if(w_info_gun_length!=null){t_weapon_gun_info.setwInfoGunLength(Integer.valueOf(w_info_gun_length));}
        if(w_info_chamber_length!=null){t_weapon_gun_info.setwInfoChamberLength(Integer.valueOf(w_info_chamber_length));}
        if(w_info_gun_weight!=null){t_weapon_gun_info.setwInfoGunWeight(Double.valueOf(w_info_gun_weight));}
        if(w_info_cassette_capacitance!=null){t_weapon_gun_info.setwInfoCassetteCapacitance(Integer.valueOf(w_info_cassette_capacitance));}
        if(w_info_speed!=null){t_weapon_gun_info.setwInfoSpeed(Integer.valueOf(w_info_speed));}
        if(w_info_gunshot!=null){t_weapon_gun_info.setwInfoGunshot(Integer.valueOf(w_info_gunshot));}
        if(w_info_made!=null){t_weapon_gun_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_gun_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_gun_infoService.insertSelective(t_weapon_gun_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_gun_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_gun_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_gun_type = request.getParameter("w_info_gun_type");
        String w_info_gun_caliber = request.getParameter("w_info_gun_caliber");
        String w_info_gun_length = request.getParameter("w_info_gun_length");
        String w_info_chamber_length = request.getParameter("w_info_chamber_length");
        String w_info_gun_weight = request.getParameter("w_info_gun_weight");
        String w_info_cassette_capacitance = request.getParameter("w_info_cassette_capacitance");
        String w_info_speed = request.getParameter("w_info_speed");
        String w_info_gunshot = request.getParameter("w_info_gunshot");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_gun_info t_weapon_gun_info = new T_weapon_gun_info();
        t_weapon_gun_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_gun_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_gun_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_gun_info.setwInfoModelId(w_info_model_id);}
        if(w_info_gun_type!=null){t_weapon_gun_info.setwInfoGunType(Integer.valueOf(w_info_gun_type));}
        if(w_info_gun_caliber!=null){t_weapon_gun_info.setwInfoGunCaliber(Double.valueOf(w_info_gun_caliber));}
        if(w_info_gun_length!=null){t_weapon_gun_info.setwInfoGunLength(Integer.valueOf(w_info_gun_length));}
        if(w_info_chamber_length!=null){t_weapon_gun_info.setwInfoChamberLength(Integer.valueOf(w_info_chamber_length));}
        if(w_info_gun_weight!=null){t_weapon_gun_info.setwInfoGunWeight(Double.valueOf(w_info_gun_weight));}
        if(w_info_cassette_capacitance!=null){t_weapon_gun_info.setwInfoCassetteCapacitance(Integer.valueOf(w_info_cassette_capacitance));}
        if(w_info_speed!=null){t_weapon_gun_info.setwInfoSpeed(Integer.valueOf(w_info_speed));}
        if(w_info_gunshot!=null){t_weapon_gun_info.setwInfoGunshot(Integer.valueOf(w_info_gunshot));}
        if(w_info_made!=null){t_weapon_gun_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_gun_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_gun_infoService.updateByPrimaryKeySelective(t_weapon_gun_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_gun_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_gun_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_gun_info t_weapon_gun_info = iT_weapon_gun_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_gun_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_gun_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_gun_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_gun_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
