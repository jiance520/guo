package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_gun_shootstraight_table;
import guo.service.IT_gun_shootstraight_tableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_gun_shootstraight_tableController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_gun_shootstraight_tableService iT_gun_shootstraight_tableService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_gun_shootstraight_tableSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_gun_shootstraight_tableSelectAll(){
        return iT_gun_shootstraight_tableService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_gun_shootstraight_tableInsert",produces = "application/json;chart=UTF-8")
    public String t_gun_shootstraight_tableInsert(HttpServletRequest request){
        String SerialNumber = request.getParameter("SerialNumber");
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String w_info_fire_distance = request.getParameter("w_info_fire_distance");
        String w_info_fire_way = request.getParameter("w_info_fire_way");
        String w_info_target_type = request.getParameter("w_info_target_type");
        String w_info_hit_probability = request.getParameter("w_info_hit_probability");
        String w_info_hit_probability_switch = request.getParameter("w_info_hit_probability_switch");
        T_gun_shootstraight_table t_gun_shootstraight_table = new T_gun_shootstraight_table();
        if(w_info_id!=null){t_gun_shootstraight_table.setwInfoId(Integer.valueOf(w_info_id));}
        if(w_info_name!=null){t_gun_shootstraight_table.setwInfoName(w_info_name);}
        if(w_info_fire_distance!=null){t_gun_shootstraight_table.setwInfoFireDistance(Integer.valueOf(w_info_fire_distance));}
        if(w_info_fire_way!=null){t_gun_shootstraight_table.setwInfoFireWay(Integer.valueOf(w_info_fire_way));}
        if(w_info_target_type!=null){t_gun_shootstraight_table.setwInfoTargetType(Integer.valueOf(w_info_target_type));}
        if(w_info_hit_probability!=null){t_gun_shootstraight_table.setwInfoHitProbability(Double.valueOf(w_info_hit_probability));}
        if(w_info_hit_probability_switch!=null){t_gun_shootstraight_table.setwInfoHitProbabilitySwitch(Double.valueOf(w_info_hit_probability_switch));}
        int i = iT_gun_shootstraight_tableService.insertSelective(t_gun_shootstraight_table);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_gun_shootstraight_tableUpdate",produces = "application/json;chart=UTF-8")
    public String t_gun_shootstraight_tableUpdate(HttpServletRequest request){
        String SerialNumber = request.getParameter("SerialNumber");
        String w_info_id = request.getParameter("w_info_id");
        String w_info_name = request.getParameter("w_info_name");
        String w_info_fire_distance = request.getParameter("w_info_fire_distance");
        String w_info_fire_way = request.getParameter("w_info_fire_way");
        String w_info_target_type = request.getParameter("w_info_target_type");
        String w_info_hit_probability = request.getParameter("w_info_hit_probability");
        String w_info_hit_probability_switch = request.getParameter("w_info_hit_probability_switch");
        T_gun_shootstraight_table t_gun_shootstraight_table = new T_gun_shootstraight_table();
        t_gun_shootstraight_table.setSerialnumber(Integer.valueOf(SerialNumber));
        if(w_info_id!=null){t_gun_shootstraight_table.setwInfoId(Integer.valueOf(w_info_id));}
        if(w_info_name!=null){t_gun_shootstraight_table.setwInfoName(w_info_name);}
        if(w_info_fire_distance!=null){t_gun_shootstraight_table.setwInfoFireDistance(Integer.valueOf(w_info_fire_distance));}
        if(w_info_fire_way!=null){t_gun_shootstraight_table.setwInfoFireWay(Integer.valueOf(w_info_fire_way));}
        if(w_info_target_type!=null){t_gun_shootstraight_table.setwInfoTargetType(Integer.valueOf(w_info_target_type));}
        if(w_info_hit_probability!=null){t_gun_shootstraight_table.setwInfoHitProbability(Double.valueOf(w_info_hit_probability));}
        if(w_info_hit_probability_switch!=null){t_gun_shootstraight_table.setwInfoHitProbabilitySwitch(Double.valueOf(w_info_hit_probability_switch));}
        int i = iT_gun_shootstraight_tableService.updateByPrimaryKeySelective(t_gun_shootstraight_table);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_gun_shootstraight_tableSelect",produces = "application/json;chart=UTF-8")
    public String t_gun_shootstraight_tableSelect(HttpServletRequest request){
        String SerialNumber = request.getParameter("SerialNumber");
        T_gun_shootstraight_table t_gun_shootstraight_table = iT_gun_shootstraight_tableService.selectByPrimaryKey(Integer.valueOf(SerialNumber));
        return JSON.toJSONString(t_gun_shootstraight_table);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_gun_shootstraight_tableDelete",produces = "application/json;chart=UTF-8")
    public String t_gun_shootstraight_tableDelete(HttpServletRequest request){
        String SerialNumber = request.getParameter("SerialNumber");
        int i = iT_gun_shootstraight_tableService.deleteByPrimaryKey(Integer.valueOf(SerialNumber));
        return JSON.toJSONString(i);
    }
}
