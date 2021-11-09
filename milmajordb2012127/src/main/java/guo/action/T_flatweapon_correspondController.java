package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_flatweapon_correspond;
import guo.service.IT_flatweapon_correspondService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class T_flatweapon_correspondController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_flatweapon_correspondService iT_flatweapon_correspondService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatweapon_correspondInsert",produces = "application/json;chart=UTF-8")
    public String t_flatweapon_correspondInsert(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_weapon_id = request.getParameter("w_weapon_id");
        String w_weapon_type = request.getParameter("w_weapon_type");
        String w_weapon_name = request.getParameter("w_weapon_name");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_flatweapon_correspond t_flatweapon_correspond = new T_flatweapon_correspond();
        t_flatweapon_correspond.setwFlatId(Integer.valueOf(w_flat_id));
        t_flatweapon_correspond.setwWeaponId(Integer.valueOf(w_weapon_id));
        if(w_weapon_type!=null){t_flatweapon_correspond.setwWeaponType(Integer.valueOf(w_weapon_type));}
        if(w_weapon_name!=null){t_flatweapon_correspond.setwWeaponName(w_weapon_name);}
        if(w_info_campaign_f!=null){t_flatweapon_correspond.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}

        int i = iT_flatweapon_correspondService.insertSelective(t_flatweapon_correspond);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatweapon_correspondUpdate",produces = "application/json;chart=UTF-8")
    public String t_flatweapon_correspondUpdate(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_weapon_id = request.getParameter("w_weapon_id");
        String w_weapon_type = request.getParameter("w_weapon_type");
        String w_weapon_name = request.getParameter("w_weapon_name");
        String w_info_campaign_f = request.getParameter("w_info_campaign_f");
        T_flatweapon_correspond t_flatweapon_correspond = new T_flatweapon_correspond();
        t_flatweapon_correspond.setwFlatId(Integer.valueOf(w_flat_id));
        t_flatweapon_correspond.setwWeaponId(Integer.valueOf(w_weapon_id));
        if(w_weapon_type!=null){t_flatweapon_correspond.setwWeaponType(Integer.valueOf(w_weapon_type));}
        if(w_weapon_name!=null){t_flatweapon_correspond.setwWeaponName(w_weapon_name);}
        if(w_info_campaign_f!=null){t_flatweapon_correspond.setwInfoCampaignF(Integer.valueOf(w_info_campaign_f));}
        int i = iT_flatweapon_correspondService.updateByPrimaryKeySelective(t_flatweapon_correspond);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatweapon_correspondSelect",produces = "application/json;chart=UTF-8")
    public String t_flatweapon_correspondSelect(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_weapon_id = request.getParameter("w_weapon_id");
        Integer id1 = null;
        Integer id2 = null;
        if(w_flat_id!=null){
            id1 = Integer.valueOf(w_flat_id);
        }
        if(w_weapon_id!=null){
            id2 = Integer.valueOf(w_weapon_id);
        }
        List<T_flatweapon_correspond> t_flatweapon_correspond = iT_flatweapon_correspondService.selectByPrimaryKey(id1,id2);
        return JSON.toJSONString(t_flatweapon_correspond);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_flatweapon_correspondDelete",produces = "application/json;chart=UTF-8")
    public String t_flatweapon_correspondDelete(HttpServletRequest request){
        String w_flat_id = request.getParameter("w_flat_id");
        String w_weapon_id = request.getParameter("w_weapon_id");
        Integer id1 = null;
        Integer id2 = null;
        if(w_flat_id!=null){
            id1 = Integer.valueOf(w_flat_id);
        }
        if(w_weapon_id!=null){
            id2 = Integer.valueOf(w_weapon_id);
        }
        int i = iT_flatweapon_correspondService.deleteByPrimaryKey(id1,id2);
        return JSON.toJSONString(i);
    }
}
