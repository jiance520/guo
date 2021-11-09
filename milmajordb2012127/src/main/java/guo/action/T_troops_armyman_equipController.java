package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_armyman_equip;
import guo.service.IT_troops_armyman_equipService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class T_troops_armyman_equipController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_armyman_equipService iT_troops_armyman_equipService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armyman_equipInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_armyman_equipInsert(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        String aw_equip_id = request.getParameter("aw_equip_id");
        String aw_equip_name = request.getParameter("aw_equip_name");
        String aw_equip_number = request.getParameter("aw_equip_number");
        String aw_equip_type = request.getParameter("aw_equip_type");
        T_troops_armyman_equip t_troops_armyman_equip = new T_troops_armyman_equip();
        t_troops_armyman_equip.setArmymanId(Integer.valueOf(armyman_id));
        t_troops_armyman_equip.setAwEquipId(Integer.valueOf(aw_equip_id));
        if(aw_equip_name!=null){t_troops_armyman_equip.setAwEquipName(aw_equip_name);}
        if(aw_equip_number!=null){t_troops_armyman_equip.setAwEquipNumber(Integer.valueOf(aw_equip_number));}
        if(aw_equip_type!=null){t_troops_armyman_equip.setAwEquipType(Integer.valueOf(aw_equip_type));}
        int i = iT_troops_armyman_equipService.insertSelective(t_troops_armyman_equip);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armyman_equipUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_armyman_equipUpdate(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        String aw_equip_id = request.getParameter("aw_equip_id");
        String aw_equip_name = request.getParameter("aw_equip_name");
        String aw_equip_number = request.getParameter("aw_equip_number");
        String aw_equip_type = request.getParameter("aw_equip_type");
        T_troops_armyman_equip t_troops_armyman_equip = new T_troops_armyman_equip();
        t_troops_armyman_equip.setArmymanId(Integer.valueOf(armyman_id));
        t_troops_armyman_equip.setAwEquipId(Integer.valueOf(aw_equip_id));
        if(aw_equip_name!=null){t_troops_armyman_equip.setAwEquipName(aw_equip_name);}
        if(aw_equip_number!=null){t_troops_armyman_equip.setAwEquipNumber(Integer.valueOf(aw_equip_number));}
        if(aw_equip_type!=null){t_troops_armyman_equip.setAwEquipType(Integer.valueOf(aw_equip_type));}
        int i = iT_troops_armyman_equipService.updateByPrimaryKeySelective(t_troops_armyman_equip);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armyman_equipSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_armyman_equipSelect(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        String aw_equip_id = request.getParameter("aw_equip_id");
        Integer id1 = null;
        Integer id2 = null;
        if(armyman_id!=null){
            id1=Integer.valueOf(armyman_id);
        }
        if(aw_equip_id!=null){
            id2=Integer.valueOf(aw_equip_id);
        }
        List<T_troops_armyman_equip> t_troops_armyman_equip = iT_troops_armyman_equipService.selectByPrimaryKey(id1,id2);
        return JSON.toJSONString(t_troops_armyman_equip);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_armyman_equipDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_armyman_equipDelete(HttpServletRequest request){
        String armyman_id = request.getParameter("armyman_id");
        String aw_equip_id = request.getParameter("aw_equip_id");
        int i = iT_troops_armyman_equipService.deleteByPrimaryKey(Integer.valueOf(armyman_id),Integer.valueOf(aw_equip_id));
        return JSON.toJSONString(i);
    }
}
