package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_flatequip_correspond;
import guo.service.IT_flatequip_correspondService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class T_flatequip_correspondController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_flatequip_correspondService iT_flatequip_correspondService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatequip_correspondInsert",produces = "application/json;chart=UTF-8")
    public String t_flatequip_correspondInsert(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_equip_id = request.getParameter("w_equip_id");
        String w_equip_type = request.getParameter("w_equip_type");
        String w_equip_name = request.getParameter("w_equip_name");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_flatequip_correspond t_flatequip_correspond = new T_flatequip_correspond();
        t_flatequip_correspond.setwFlatId(Integer.valueOf(w_flat_id));
        t_flatequip_correspond.setwEquipId(Integer.valueOf(w_equip_id));
        if(w_equip_type!=null){t_flatequip_correspond.setwEquipType(Integer.valueOf(w_equip_type));}
        if(w_equip_name!=null){t_flatequip_correspond.setwEquipName(w_equip_name);}
        if(w_info_campaign_f!=null){t_flatequip_correspond.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}

        int i = iT_flatequip_correspondService.insertSelective(t_flatequip_correspond);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatequip_correspondUpdate",produces = "application/json;chart=UTF-8")
    public String t_flatequip_correspondUpdate(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_equip_id = request.getParameter("w_equip_id");
        String w_equip_type = request.getParameter("w_equip_type");
        String w_equip_name = request.getParameter("w_equip_name");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_flatequip_correspond t_flatequip_correspond = new T_flatequip_correspond();
        t_flatequip_correspond.setwFlatId(Integer.valueOf(w_flat_id));
        t_flatequip_correspond.setwEquipId(Integer.valueOf(w_equip_id));
        if(w_equip_type!=null){t_flatequip_correspond.setwEquipType(Integer.valueOf(w_equip_type));}
        if(w_equip_name!=null){t_flatequip_correspond.setwEquipName(w_equip_name);}
        if(w_info_campaign_f!=null){t_flatequip_correspond.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_flatequip_correspondService.updateByPrimaryKeySelective(t_flatequip_correspond);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatequip_correspondSelect",produces = "application/json;chart=UTF-8")
    public String t_flatequip_correspondSelect(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_equip_id = request.getParameter("w_equip_id");
        Integer id1 = null;
        Integer id2 = null;
        if(w_flat_id!=null){
            id1=Integer.valueOf(w_flat_id);
        }
        if(w_equip_id!=null){
            id2=Integer.valueOf(w_equip_id);
        }
        List<T_flatequip_correspond> t_flatequip_correspond = iT_flatequip_correspondService.selectByPrimaryKey(id1,id2);
        return JSON.toJSONString(t_flatequip_correspond);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatequip_correspondDelete",produces = "application/json;chart=UTF-8")
    public String t_flatequip_correspondDelete(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_equip_id = request.getParameter("w_equip_id");
        Integer id1 = null;
        Integer id2 = null;
        if(w_flat_id!=null){
            id1=Integer.valueOf(w_flat_id);
        }
        if(w_equip_id!=null){
            id2=Integer.valueOf(w_equip_id);
        }
        int i = iT_flatequip_correspondService.deleteByPrimaryKey(id1,id2);
        return JSON.toJSONString(i);
    }
}
