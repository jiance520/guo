package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weapon_defendchem_info;
import guo.service.IT_weapon_defendchem_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_weapon_defendchem_infoController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weapon_defendchem_infoService iT_weapon_defendchem_infoService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_defendchem_infoSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_weapon_defendchem_infoSelectAll(){
        return iT_weapon_defendchem_infoService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_defendchem_infoInsert",produces = "application/json;chart=UTF-8")
    public String t_weapon_defendchem_infoInsert(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_defendchem_type = request.getParameter("w_info_defendchem_type");
        String w_info_observa_distance = request.getParameter("w_info_observa_distance");
        String w_info_observa_measure = request.getParameter("w_info_observa_measure");
        String w_info_work_time = request.getParameter("w_info_work_time");
        String w_info_all_weight = request.getParameter("w_info_all_weight");
        String w_info_measure_distance = request.getParameter("w_info_measure_distance");
        String w_info_measure_range = request.getParameter("w_info_measure_range");
        String w_info_load = request.getParameter("w_info_load");
        String w_info_reaction_time = request.getParameter("w_info_reaction_time");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_defendchem_info t_weapon_defendchem_info = new T_weapon_defendchem_info();
        if(w_info_name!=null){t_weapon_defendchem_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_defendchem_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_defendchem_info.setwInfoModelId(w_info_model_id);}
        if(w_info_defendchem_type!=null){t_weapon_defendchem_info.setwInfoDefendchemType(Integer.valueOf(w_info_defendchem_type));}
        if(w_info_observa_distance!=null){t_weapon_defendchem_info.setwInfoObservaDistance(Integer.valueOf(w_info_observa_distance));}
        if(w_info_observa_measure!=null){t_weapon_defendchem_info.setwInfoObservaMeasure(Double.valueOf(w_info_observa_measure));}
        if(w_info_work_time!=null){t_weapon_defendchem_info.setwInfoWorkTime(Double.valueOf(w_info_work_time));}
        if(w_info_all_weight!=null){t_weapon_defendchem_info.setwInfoAllWeight(Double.valueOf(w_info_all_weight));}
        if(w_info_measure_distance!=null){t_weapon_defendchem_info.setwInfoMeasureDistance(Integer.valueOf(w_info_measure_distance));}
        if(w_info_measure_range!=null){t_weapon_defendchem_info.setwInfoMeasureRange(Double.valueOf(w_info_measure_range));}
        if(w_info_load!=null){t_weapon_defendchem_info.setwInfoLoad(Double.valueOf(w_info_load));}
        if(w_info_reaction_time!=null){t_weapon_defendchem_info.setwInfoReactionTime(Integer.valueOf(w_info_reaction_time));}
        if(w_info_made!=null){t_weapon_defendchem_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_defendchem_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_defendchem_infoService.insertSelective(t_weapon_defendchem_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_defendchem_infoUpdate",produces = "application/json;chart=UTF-8")
    public String t_weapon_defendchem_infoUpdate(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String type_id = request.getParameter("type_id");
        String w_info_model_id = request.getParameter("w_info_model_id");
        String w_info_defendchem_type = request.getParameter("w_info_defendchem_type");
        String w_info_observa_distance = request.getParameter("w_info_observa_distance");
        String w_info_observa_measure = request.getParameter("w_info_observa_measure");
        String w_info_work_time = request.getParameter("w_info_work_time");
        String w_info_all_weight = request.getParameter("w_info_all_weight");
        String w_info_measure_distance = request.getParameter("w_info_measure_distance");
        String w_info_measure_range = request.getParameter("w_info_measure_range");
        String w_info_load = request.getParameter("w_info_load");
        String w_info_reaction_time = request.getParameter("w_info_reaction_time");
        String w_info_made = request.getParameter("w_info_made");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weapon_defendchem_info t_weapon_defendchem_info = new T_weapon_defendchem_info();
        t_weapon_defendchem_info.setwInfoId(Integer.valueOf(w_info_id));
        if(w_info_name!=null){t_weapon_defendchem_info.setwInfoName(w_info_name);}
        if(type_id!=null){t_weapon_defendchem_info.setTypeId(Integer.valueOf(type_id));}
        if(w_info_model_id!=null){t_weapon_defendchem_info.setwInfoModelId(w_info_model_id);}
        if(w_info_defendchem_type!=null){t_weapon_defendchem_info.setwInfoDefendchemType(Integer.valueOf(w_info_defendchem_type));}
        if(w_info_observa_distance!=null){t_weapon_defendchem_info.setwInfoObservaDistance(Integer.valueOf(w_info_observa_distance));}
        if(w_info_observa_measure!=null){t_weapon_defendchem_info.setwInfoObservaMeasure(Double.valueOf(w_info_observa_measure));}
        if(w_info_work_time!=null){t_weapon_defendchem_info.setwInfoWorkTime(Double.valueOf(w_info_work_time));}
        if(w_info_all_weight!=null){t_weapon_defendchem_info.setwInfoAllWeight(Double.valueOf(w_info_all_weight));}
        if(w_info_measure_distance!=null){t_weapon_defendchem_info.setwInfoMeasureDistance(Integer.valueOf(w_info_measure_distance));}
        if(w_info_measure_range!=null){t_weapon_defendchem_info.setwInfoMeasureRange(Double.valueOf(w_info_measure_range));}
        if(w_info_load!=null){t_weapon_defendchem_info.setwInfoLoad(Double.valueOf(w_info_load));}
        if(w_info_reaction_time!=null){t_weapon_defendchem_info.setwInfoReactionTime(Integer.valueOf(w_info_reaction_time));}
        if(w_info_made!=null){t_weapon_defendchem_info.setwInfoMade(Integer.valueOf(w_info_made));}
        if(w_info_campaign_f!=null){t_weapon_defendchem_info.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weapon_defendchem_infoService.updateByPrimaryKeySelective(t_weapon_defendchem_info);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_defendchem_infoSelect",produces = "application/json;chart=UTF-8")
    public String t_weapon_defendchem_infoSelect(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        T_weapon_defendchem_info t_weapon_defendchem_info = iT_weapon_defendchem_infoService.selectByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(t_weapon_defendchem_info);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weapon_defendchem_infoDelete",produces = "application/json;chart=UTF-8")
    public String t_weapon_defendchem_infoDelete(HttpServletRequest request){
        String w_info_id = request.getParameter("w_info_id");
        int i = iT_weapon_defendchem_infoService.deleteByPrimaryKey(Integer.valueOf(w_info_id));
        return JSON.toJSONString(i);
    }
}
