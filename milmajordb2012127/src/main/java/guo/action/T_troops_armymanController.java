package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_armyman;
import guo.service.IT_troops_armymanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_troops_armymanController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_armymanService iT_troops_armymanService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armymanSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_troops_armymanSelectAll(){
        return iT_troops_armymanService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armymanInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_armymanInsert(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        String armyman_name = request.getParameter("armyman_name");
        String armyman_description = request.getParameter("armyman_description");
        String aw_info_campaign_f = request.getParameter("aw_info_campaign_f");
        String aw_info_unit_type = request.getParameter("aw_info_unit_type");
        String aq_info_unit_level = request.getParameter("aq_info_unit_level");
        String armyman_rank_id = request.getParameter("armyman_rank_id");
        T_troops_armyman t_troops_armyman = new T_troops_armyman();
        if(armyman_name!=null){t_troops_armyman.setArmymanName(armyman_name);}
        if(armyman_description!=null){t_troops_armyman.setArmymanDescription(armyman_description);}
        if(aw_info_campaign_f!=null){t_troops_armyman.setAwInfoCampaignF(Integer.valueOf(aw_info_campaign_f));}
        if(aw_info_unit_type!=null){t_troops_armyman.setAwInfoUnitType(Integer.valueOf(aw_info_unit_type));}
        if(aq_info_unit_level!=null){t_troops_armyman.setAqInfoUnitLevel(Integer.valueOf(aq_info_unit_level));}
        if(armyman_rank_id!=null){t_troops_armyman.setArmymanRankId(Integer.valueOf(armyman_rank_id));}

        int i = iT_troops_armymanService.insertSelective(t_troops_armyman);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armymanUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_armymanUpdate(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        String armyman_name = request.getParameter("armyman_name");
        String armyman_description = request.getParameter("armyman_description");
        String aw_info_campaign_f = request.getParameter("aw_info_campaign_f");
        String aw_info_unit_type = request.getParameter("aw_info_unit_type");
        String aq_info_unit_level = request.getParameter("aq_info_unit_level");
        String armyman_rank_id = request.getParameter("armyman_rank_id");
        T_troops_armyman t_troops_armyman = new T_troops_armyman();
        t_troops_armyman.setArmymanId(Integer.valueOf(armyman_id));
        if(armyman_name!=null){t_troops_armyman.setArmymanName(armyman_name);}
        if(armyman_description!=null){t_troops_armyman.setArmymanDescription(armyman_description);}
        if(aw_info_campaign_f!=null){t_troops_armyman.setAwInfoCampaignF(Integer.valueOf(aw_info_campaign_f));}
        if(aw_info_unit_type!=null){t_troops_armyman.setAwInfoUnitType(Integer.valueOf(aw_info_unit_type));}
        if(aq_info_unit_level!=null){t_troops_armyman.setAqInfoUnitLevel(Integer.valueOf(aq_info_unit_level));}
        if(armyman_rank_id!=null){t_troops_armyman.setArmymanRankId(Integer.valueOf(armyman_rank_id));}
        int i = iT_troops_armymanService.updateByPrimaryKeySelective(t_troops_armyman);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armymanSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_armymanSelect(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        T_troops_armyman t_troops_armyman = iT_troops_armymanService.selectByPrimaryKey(Integer.valueOf(armyman_id));
        return JSON.toJSONString(t_troops_armyman);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armymanDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_armymanDelete(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        int i = iT_troops_armymanService.deleteByPrimaryKey(Integer.valueOf(armyman_id));
        return JSON.toJSONString(i);
    }
}
