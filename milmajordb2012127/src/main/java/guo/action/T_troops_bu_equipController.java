package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_bu_equip;
import guo.service.IT_troops_bu_equipService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
public class T_troops_bu_equipController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_bu_equipService iT_troops_bu_equipService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_bu_equipInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_bu_equipInsert(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        String bu_equip_id = request.getParameter("bu_equip_id");
        String bu_equip_name = request.getParameter("bu_equip_name");
        String bu_equip_type = request.getParameter("bu_equip_type");
        String bu__equip_number = request.getParameter("bu__equip_number");
        T_troops_bu_equip t_troops_bu_equip = new T_troops_bu_equip();
        t_troops_bu_equip.setBuId(Integer.valueOf(bu_id));
        t_troops_bu_equip.setBuEquipId(Integer.valueOf(bu_equip_id));
        if(bu_equip_name!=null){t_troops_bu_equip.setBuEquipName(bu_equip_name);}
        if(bu_equip_type!=null){t_troops_bu_equip.setBuEquipType(Integer.valueOf(bu_equip_type));}
        if(bu__equip_number!=null){t_troops_bu_equip.setBuEquipNumber(Integer.valueOf(bu__equip_number));}
        int i = iT_troops_bu_equipService.insertSelective(t_troops_bu_equip);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_bu_equipUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_bu_equipUpdate(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        String bu_equip_id = request.getParameter("bu_equip_id");
        String bu_equip_name = request.getParameter("bu_equip_name");
        String bu_equip_type = request.getParameter("bu_equip_type");
        String bu__equip_number = request.getParameter("bu__equip_number");
        T_troops_bu_equip t_troops_bu_equip = new T_troops_bu_equip();
        t_troops_bu_equip.setBuId(Integer.valueOf(bu_id));
        t_troops_bu_equip.setBuEquipId(Integer.valueOf(bu_equip_id));
        if(bu_equip_name!=null){t_troops_bu_equip.setBuEquipName(bu_equip_name);}
        if(bu_equip_type!=null){t_troops_bu_equip.setBuEquipType(Integer.valueOf(bu_equip_type));}
        if(bu__equip_number!=null){t_troops_bu_equip.setBuEquipNumber(Integer.valueOf(bu__equip_number));}

        int i = iT_troops_bu_equipService.updateByPrimaryKeySelective(t_troops_bu_equip);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_bu_equipSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_bu_equipSelect(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        String bu_equip_id = request.getParameter("bu_equip_id");
        Integer id1 = null;
        Integer id2 = null;
        if(bu_id!=null){
            id1=Integer.valueOf(bu_id);
        }
        if(bu_equip_id!=null){
            id2=Integer.valueOf(bu_equip_id);
        }
        List<T_troops_bu_equip> t_troops_bu_equip = iT_troops_bu_equipService.selectByPrimaryKey(id1,id2);
        return JSON.toJSONString(t_troops_bu_equip);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_bu_equipDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_bu_equipDelete(HttpServletRequest request){
        String bu_id = request.getParameter("bu_id");
        String bu_equip_id = request.getParameter("bu_equip_id");
        Integer id1 = null;
        Integer id2 = null;
        if(bu_id!=null){
            id1=Integer.valueOf(bu_id);
        }
        if(bu_equip_id!=null){
            id2=Integer.valueOf(bu_equip_id);
        }
        int i = iT_troops_bu_equipService.deleteByPrimaryKey(id1,id2);
        return JSON.toJSONString(i);
    }
}
