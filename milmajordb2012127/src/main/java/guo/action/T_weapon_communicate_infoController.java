package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_communicate_info;
import guo.service.IT_weapon_communicate_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_communicate_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_communicate_infoService iT_weapon_communicate_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_communicate_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_communicate_infoSelectAll(){
        return iT_weapon_communicate_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_communicate_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_communicate_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_communicate_type = request.getParameter("w_info_communicate_type");
        String w_info_max_distance = request.getParameter("w_info_max_distance");
        String w_info_optimal_distance = request.getParameter("w_info_optimal_distance");
        String w_info_work_time = request.getParameter("w_info_work_time");
        String w_info_all_weight = request.getParameter("w_info_all_weight");
        String w_info_antijamming_ablity = request.getParameter("w_info_antijamming_ablity");
        String w_info_use_temperature = request.getParameter("w_info_use_temperature");
        String w_info_use_num = request.getParameter("w_info_use_num");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        String w_info_use_humidity = request.getParameter("w_info_use_humidity");
        T_weapon_communicate_info t_weapon_communicate_info = new T_weapon_communicate_info();
        if(w_info_name!=null){t_weapon_communicate_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_communicate_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_communicate_info.setwInfoModelId(w_info_model_id);}
        if(w_info_communicate_type!=null){t_weapon_communicate_info.setwInfoCommunicateType(Integer.valueOf(w_info_communicate_type));}
        if(w_info_max_distance!=null){t_weapon_communicate_info.setwInfoMaxDistance(Integer.valueOf(w_info_max_distance));}
        if(w_info_optimal_distance!=null){t_weapon_communicate_info.setwInfoOptimalDistance(Integer.valueOf(w_info_optimal_distance));}
        if(w_info_work_time!=null){t_weapon_communicate_info.setwInfoWorkTime(Double.valueOf(w_info_work_time));}
        if(w_info_all_weight!=null){t_weapon_communicate_info.setwInfoAllWeight(Double.valueOf(w_info_all_weight));}
        if(w_info_antijamming_ablity!=null){t_weapon_communicate_info.setwInfoAntijammingAblity(Integer.valueOf(w_info_antijamming_ablity));}
        if(w_info_use_temperature!=null){t_weapon_communicate_info.setwInfoUseTemperature(Integer.valueOf(w_info_use_temperature));}
        if(w_info_use_num!=null){t_weapon_communicate_info.setwInfoUseNum(Integer.valueOf(w_info_use_num));}
        if(w_info_made!=null){t_weapon_communicate_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_communicate_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        if(w_info_use_humidity!=null){t_weapon_communicate_info.setwInfoUseHumidity(Integer.valueOf(w_info_use_humidity));}
        int i = iT_weapon_communicate_infoService.insertSelective(t_weapon_communicate_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_communicate_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_communicate_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_communicate_type = request.getParameter("w_info_communicate_type");
        String w_info_max_distance = request.getParameter("w_info_max_distance");
        String w_info_optimal_distance = request.getParameter("w_info_optimal_distance");
        String w_info_work_time = request.getParameter("w_info_work_time");
        String w_info_all_weight = request.getParameter("w_info_all_weight");
        String w_info_antijamming_ablity = request.getParameter("w_info_antijamming_ablity");
        String w_info_use_temperature = request.getParameter("w_info_use_temperature");
        String w_info_use_num = request.getParameter("w_info_use_num");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        String w_info_use_humidity = request.getParameter("w_info_use_humidity");
        T_weapon_communicate_info t_weapon_communicate_info = new T_weapon_communicate_info();
        t_weapon_communicate_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_communicate_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_communicate_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_communicate_info.setwInfoModelId(w_info_model_id);}
        if(w_info_communicate_type!=null){t_weapon_communicate_info.setwInfoCommunicateType(Integer.valueOf(w_info_communicate_type));}
        if(w_info_max_distance!=null){t_weapon_communicate_info.setwInfoMaxDistance(Integer.valueOf(w_info_max_distance));}
        if(w_info_optimal_distance!=null){t_weapon_communicate_info.setwInfoOptimalDistance(Integer.valueOf(w_info_optimal_distance));}
        if(w_info_work_time!=null){t_weapon_communicate_info.setwInfoWorkTime(Double.valueOf(w_info_work_time));}
        if(w_info_all_weight!=null){t_weapon_communicate_info.setwInfoAllWeight(Double.valueOf(w_info_all_weight));}
        if(w_info_antijamming_ablity!=null){t_weapon_communicate_info.setwInfoAntijammingAblity(Integer.valueOf(w_info_antijamming_ablity));}
        if(w_info_use_temperature!=null){t_weapon_communicate_info.setwInfoUseTemperature(Integer.valueOf(w_info_use_temperature));}
        if(w_info_use_num!=null){t_weapon_communicate_info.setwInfoUseNum(Integer.valueOf(w_info_use_num));}
        if(w_info_made!=null){t_weapon_communicate_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_communicate_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        if(w_info_use_humidity!=null){t_weapon_communicate_info.setwInfoUseHumidity(Integer.valueOf(w_info_use_humidity));}
        int i = iT_weapon_communicate_infoService.updateByPrimaryKeySelective(t_weapon_communicate_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_communicate_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_communicate_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_communicate_info t_weapon_communicate_info = iT_weapon_communicate_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_communicate_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_communicate_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_communicate_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_communicate_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
