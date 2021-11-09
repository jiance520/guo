package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_weaponammo_correspond;
import guo.service.IT_weaponammo_correspondService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class T_weaponammo_correspondController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_weaponammo_correspondService iT_weaponammo_correspondService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weaponammo_correspondInsert",produces = "application/json;chart=UTF-8")
    public String t_weaponammo_correspondInsert(HttpServletRequest request){
        String w_weapon_id = request.getParameter("w_weapon_id");
        String w_ammo_id = request.getParameter("w_ammo_id");
        String w_ammo_type = request.getParameter("w_ammo_type");
        String w_ammo_name = request.getParameter("w_ammo_name");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weaponammo_correspond t_weaponammo_correspond = new T_weaponammo_correspond();
        t_weaponammo_correspond.setwWeaponId(Integer.valueOf(w_weapon_id));
        t_weaponammo_correspond.setwAmmoId(Integer.valueOf(w_ammo_id));
        if(w_ammo_type!=null){t_weaponammo_correspond.setwAmmoType(Integer.valueOf(w_ammo_type));}
        if(w_ammo_name!=null){t_weaponammo_correspond.setwAmmoName(w_ammo_name);}
        if(w_info_campaign_f!=null){t_weaponammo_correspond.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}



        int i = iT_weaponammo_correspondService.insertSelective(t_weaponammo_correspond);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weaponammo_correspondUpdate",produces = "application/json;chart=UTF-8")
    public String t_weaponammo_correspondUpdate(HttpServletRequest request){
        String w_weapon_id = request.getParameter("w_weapon_id");
        String w_ammo_id = request.getParameter("w_ammo_id");
        String w_ammo_type = request.getParameter("w_ammo_type");
        String w_ammo_name = request.getParameter("w_ammo_name");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_weaponammo_correspond t_weaponammo_correspond = new T_weaponammo_correspond();
        t_weaponammo_correspond.setwWeaponId(Integer.valueOf(w_weapon_id));
        t_weaponammo_correspond.setwAmmoId(Integer.valueOf(w_ammo_id));
        if(w_ammo_type!=null){t_weaponammo_correspond.setwAmmoType(Integer.valueOf(w_ammo_type));}
        if(w_ammo_name!=null){t_weaponammo_correspond.setwAmmoName(w_ammo_name);}
        if(w_info_campaign_f!=null){t_weaponammo_correspond.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_weaponammo_correspondService.updateByPrimaryKeySelective(t_weaponammo_correspond);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weaponammo_correspondSelect",produces = "application/json;chart=UTF-8")
    public String t_weaponammo_correspondSelect(HttpServletRequest request){
        String w_weapon_id = request.getParameter("w_weapon_id");
        String w_ammo_id = request.getParameter("w_ammo_id");
        Integer id1 = null;
        Integer id2 = null;
        if(w_weapon_id!=null){
            id1=Integer.valueOf(w_weapon_id);
        }
        if(w_ammo_id!=null){
            id2=Integer.valueOf(w_ammo_id);
        }
        List<T_weaponammo_correspond> t_weaponammo_correspond = iT_weaponammo_correspondService.selectByPrimaryKey(id1,id2);
        return JSON.toJSONString(t_weaponammo_correspond);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_weaponammo_correspondDelete",produces = "application/json;chart=UTF-8")
    public String t_weaponammo_correspondDelete(HttpServletRequest request){
        String w_weapon_id = request.getParameter("w_weapon_id");
        String w_ammo_id = request.getParameter("w_ammo_id");
        Integer id1 = null;
        Integer id2 = null;
        if(w_weapon_id!=null){
            id1=Integer.valueOf(w_weapon_id);
        }
        if(w_ammo_id!=null){
            id2=Integer.valueOf(w_ammo_id);
        }
        int i = iT_weaponammo_correspondService.deleteByPrimaryKey(id1,id2);
        return JSON.toJSONString(i);
    }
}
