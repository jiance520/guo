package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_trajectory_data;
import guo.service.IT_trajectory_dataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_trajectory_dataController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_trajectory_dataService iT_trajectory_dataService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_trajectory_dataSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_trajectory_dataSelectAll(){
        return iT_trajectory_dataService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_trajectory_dataInsert",produces = "application/json;chart=UTF-8")
    public String t_trajectory_dataInsert(HttpServletRequest request){
        String ID = request.getParameter("ID");
        String p_info_fire_distance = request.getParameter("p_info_fire_distance");
        String p_info_GaoJiao = request.getParameter("p_info_GaoJiao");
        String p_info_Cb = request.getParameter("p_info_Cb");
        String p_info_yh = request.getParameter("p_info_yh");
        String Ju10 = request.getParameter("Ju10");
        String p_info_distance_error = request.getParameter("p_info_distance_error");
        String p_info_orientation_error = request.getParameter("p_info_orientation_error");
        String p_info_id = request.getParameter("p_info_id");
        String p_info_name = request.getParameter("p_info_name");
        String p_info_type = request.getParameter("p_info_type");
        T_trajectory_data t_trajectory_data = new T_trajectory_data();
        if(p_info_fire_distance!=null){t_trajectory_data.setpInfoFireDistance(Short.valueOf(p_info_fire_distance));}
        if(p_info_GaoJiao!=null){t_trajectory_data.setpInfoGaojiao(Float.valueOf(p_info_GaoJiao));}
        if(p_info_Cb!=null){t_trajectory_data.setpInfoCb(Float.valueOf(p_info_Cb));}
        if(p_info_yh!=null){t_trajectory_data.setpInfoYh(Short.valueOf(p_info_yh));}
        if(Ju10!=null){t_trajectory_data.setJu10(Float.valueOf(Ju10));}
        if(p_info_distance_error!=null){t_trajectory_data.setpInfoDistanceError(Float.valueOf(p_info_distance_error));}
        if(p_info_orientation_error!=null){t_trajectory_data.setpInfoOrientationError(Float.valueOf(p_info_orientation_error));}
        if(p_info_id!=null){t_trajectory_data.setpInfoId(Integer.valueOf(p_info_id));}
        if(p_info_name!=null){t_trajectory_data.setpInfoName(p_info_name);}
        if(p_info_type!=null){t_trajectory_data.setpInfoType(Short.valueOf(p_info_type));}

        int i = iT_trajectory_dataService.insertSelective(t_trajectory_data);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_trajectory_dataUpdate",produces = "application/json;chart=UTF-8")
    public String t_trajectory_dataUpdate(HttpServletRequest request){
        String ID = request.getParameter("ID");
        String p_info_fire_distance = request.getParameter("p_info_fire_distance");
        String p_info_GaoJiao = request.getParameter("p_info_GaoJiao");
        String p_info_Cb = request.getParameter("p_info_Cb");
        String p_info_yh = request.getParameter("p_info_yh");
        String Ju10 = request.getParameter("Ju10");
        String p_info_distance_error = request.getParameter("p_info_distance_error");
        String p_info_orientation_error = request.getParameter("p_info_orientation_error");
        String p_info_id = request.getParameter("p_info_id");
        String p_info_name = request.getParameter("p_info_name");
        String p_info_type = request.getParameter("p_info_type");
        T_trajectory_data t_trajectory_data = new T_trajectory_data();
        t_trajectory_data.setId(Integer.valueOf(ID));
        if(p_info_fire_distance!=null){t_trajectory_data.setpInfoFireDistance(Short.valueOf(p_info_fire_distance));}
        if(p_info_GaoJiao!=null){t_trajectory_data.setpInfoGaojiao(Float.valueOf(p_info_GaoJiao));}
        if(p_info_Cb!=null){t_trajectory_data.setpInfoCb(Float.valueOf(p_info_Cb));}
        if(p_info_yh!=null){t_trajectory_data.setpInfoYh(Short.valueOf(p_info_yh));}
        if(Ju10!=null){t_trajectory_data.setJu10(Float.valueOf(Ju10));}
        if(p_info_distance_error!=null){t_trajectory_data.setpInfoDistanceError(Float.valueOf(p_info_distance_error));}
        if(p_info_orientation_error!=null){t_trajectory_data.setpInfoOrientationError(Float.valueOf(p_info_orientation_error));}
        if(p_info_id!=null){t_trajectory_data.setpInfoId(Integer.valueOf(p_info_id));}
        if(p_info_name!=null){t_trajectory_data.setpInfoName(p_info_name);}
        if(p_info_type!=null){t_trajectory_data.setpInfoType(Short.valueOf(p_info_type));}
        int i = iT_trajectory_dataService.updateByPrimaryKeySelective(t_trajectory_data);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_trajectory_dataSelect",produces = "application/json;chart=UTF-8")
    public String t_trajectory_dataSelect(HttpServletRequest request){
        String ID = request.getParameter("ID");
        T_trajectory_data t_trajectory_data = iT_trajectory_dataService.selectByPrimaryKey(Integer.valueOf(ID));
        return JSON.toJSONString(t_trajectory_data);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_trajectory_dataDelete",produces = "application/json;chart=UTF-8")
    public String t_trajectory_dataDelete(HttpServletRequest request){
        String ID = request.getParameter("ID");
        int i = iT_trajectory_dataService.deleteByPrimaryKey(Integer.valueOf(ID));
        return JSON.toJSONString(i);
    }
}
