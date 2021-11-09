package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_troops_uint;
import guo.service.IT_troops_uintService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class T_troops_uintController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_troops_uintService iT_troops_uintService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_uintInsert",produces = "application/json;chart=UTF-8")
    public String t_troops_uintInsert(HttpServletRequest request){
        String unit_id = request.getParameter("unit_id");
        String bu_id = request.getParameter("bu_id");
        String unit_is_basic = request.getParameter("unit_is_basic");
        String unit_name = request.getParameter("unit_name");
        String bu_level = request.getParameter("bu_level");
        String bu_unit_type = request.getParameter("bu_unit_type");
        String unit_child_id = request.getParameter("unit_child_id");
        String unit_child_order = request.getParameter("unit_child_order");
        String unit_info_campaign_f = request.getParameter("unit_info_campaign_f");
        String unit_child_name = request.getParameter("unit_child_name");
        T_troops_uint t_troops_uint = new T_troops_uint();
        t_troops_uint.setUnitId(Integer.valueOf(unit_id));
        t_troops_uint.setBuId(Integer.valueOf(bu_id));
        if(unit_is_basic!=null){t_troops_uint.setUnitIsBasic(Byte.valueOf(unit_is_basic));}
        if(unit_name!=null){t_troops_uint.setUnitName(unit_name);}
        if(bu_level!=null){t_troops_uint.setBuLevel(Integer.valueOf(bu_level));}
        if(bu_unit_type!=null){t_troops_uint.setBuUnitType(Integer.valueOf(bu_unit_type));}
        if(unit_child_id!=null){t_troops_uint.setUnitChildName(unit_child_id);}
        if(unit_child_order!=null){t_troops_uint.setUnitChildOrder(Integer.valueOf(unit_child_order));}
        if(unit_info_campaign_f!=null){t_troops_uint.setUnitInfoCampaignF(Integer.valueOf(unit_info_campaign_f));}
        if(unit_child_name!=null){t_troops_uint.setUnitChildName(unit_child_name);}
        int i = iT_troops_uintService.insertSelective(t_troops_uint);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_uintUpdate",produces = "application/json;chart=UTF-8")
    public String t_troops_uintUpdate(HttpServletRequest request){
        String unit_id = request.getParameter("unit_id");
        String bu_id = request.getParameter("bu_id");
        String unit_is_basic = request.getParameter("unit_is_basic");
        String unit_name = request.getParameter("unit_name");
        String bu_level = request.getParameter("bu_level");
        String bu_unit_type = request.getParameter("bu_unit_type");
        String unit_child_id = request.getParameter("unit_child_id");
        String unit_child_order = request.getParameter("unit_child_order");
        String unit_info_campaign_f = request.getParameter("unit_info_campaign_f");
        String unit_child_name = request.getParameter("unit_child_name");
        T_troops_uint t_troops_uint = new T_troops_uint();
        t_troops_uint.setUnitId(Integer.valueOf(unit_id));
        t_troops_uint.setBuId(Integer.valueOf(bu_id));
        if(unit_is_basic!=null){t_troops_uint.setUnitIsBasic(Byte.valueOf(unit_is_basic));}
        if(unit_name!=null){t_troops_uint.setUnitName(unit_name);}
        if(bu_level!=null){t_troops_uint.setBuLevel(Integer.valueOf(bu_level));}
        if(bu_unit_type!=null){t_troops_uint.setBuUnitType(Integer.valueOf(bu_unit_type));}
        if(unit_child_id!=null){t_troops_uint.setUnitChildName(unit_child_id);}
        if(unit_child_order!=null){t_troops_uint.setUnitChildOrder(Integer.valueOf(unit_child_order));}
        if(unit_info_campaign_f!=null){t_troops_uint.setUnitInfoCampaignF(Integer.valueOf(unit_info_campaign_f));}
        if(unit_child_name!=null){t_troops_uint.setUnitChildName(unit_child_name);}
        int i = iT_troops_uintService.updateByPrimaryKeySelective(t_troops_uint);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_uintSelect",produces = "application/json;chart=UTF-8")
    public String t_troops_uintSelect(HttpServletRequest request){
        String unit_id = request.getParameter("unit_id");
        String bu_id = request.getParameter("bu_id");
        String unit_child_id = request.getParameter("unit_child_id");
        String unit_child_order = request.getParameter("unit_child_order");
        Integer id1 = null;
        Integer id2 = null;
        Integer id3 = null;
        Integer id4 = null;
        if(unit_id!=null){
            id1=Integer.valueOf(unit_id);
        }
        if(bu_id!=null){
            id2=Integer.valueOf(bu_id);
        }
        if(unit_child_id!=null){
            id3=Integer.valueOf(unit_child_id);
        }
        if(unit_child_order!=null){
            id4=Integer.valueOf(unit_child_order);
        }
        List<T_troops_uint> t_troops_uint = iT_troops_uintService.selectByPrimaryKey(id1,id2,id3,id4);
        return JSON.toJSONString(t_troops_uint);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_troops_uintDelete",produces = "application/json;chart=UTF-8")
    public String t_troops_uintDelete(HttpServletRequest request){
        String unit_id = request.getParameter("unit_id");
        String bu_id = request.getParameter("bu_id");
        String unit_child_id = request.getParameter("unit_child_id");
        String unit_child_order = request.getParameter("unit_child_order");
        Integer id1 = null;
        Integer id2 = null;
        Integer id3 = null;
        Integer id4 = null;
        if(unit_id!=null){
            id1=Integer.valueOf(unit_id);
        }
        if(bu_id!=null){
            id2=Integer.valueOf(bu_id);
        }
        if(unit_child_id!=null){
            id3=Integer.valueOf(unit_child_id);
        }
        if(unit_child_order!=null){
            id4=Integer.valueOf(unit_child_order);
        }
        int i = iT_troops_uintService.deleteByPrimaryKey(id1,id2,id3,id4);
        return JSON.toJSONString(i);
    }
}
