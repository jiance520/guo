package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_decisemanagetable;
import guo.service.IT_decisemanagetableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class T_decisemanagetableController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_decisemanagetableService iT_decisemanagetableService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_decisemanagetableSelectAll",produces = "application/json;chart=UTF-8")
    public Object t_decisemanagetableSelectAll(){
        return iT_decisemanagetableService.selectAll();
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_decisemanagetableInsert",produces = "application/json;chart=UTF-8")
    public String t_decisemanagetableInsert(HttpServletRequest request){
        String deciseID = request.getParameter("deciseID");
        String deciseName = request.getParameter("deciseName");
        String redblueF = request.getParameter("redblueF");
        String deciseAuthorName = request.getParameter("deciseAuthorName");
        T_decisemanagetable t_decisemanagetable = new T_decisemanagetable();
        if(deciseName!=null){t_decisemanagetable.setDecisename(deciseName);}
        if(redblueF!=null){t_decisemanagetable.setRedbluef(Integer.valueOf(redblueF));}
        if(deciseAuthorName!=null){t_decisemanagetable.setDeciseauthorname(deciseAuthorName);}



        int i = iT_decisemanagetableService.insertSelective(t_decisemanagetable);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_decisemanagetableUpdate",produces = "application/json;chart=UTF-8")
    public String t_decisemanagetableUpdate(HttpServletRequest request){
        String deciseID = request.getParameter("deciseID");
        String deciseName = request.getParameter("deciseName");
        String redblueF = request.getParameter("redblueF");
        String deciseAuthorName = request.getParameter("deciseAuthorName");
        T_decisemanagetable t_decisemanagetable = new T_decisemanagetable();
        t_decisemanagetable.setDeciseid(Integer.valueOf(deciseID));
        if(deciseName!=null){t_decisemanagetable.setDecisename(deciseName);}
        if(redblueF!=null){t_decisemanagetable.setRedbluef(Integer.valueOf(redblueF));}
        if(deciseAuthorName!=null){t_decisemanagetable.setDeciseauthorname(deciseAuthorName);}
        int i = iT_decisemanagetableService.updateByPrimaryKeySelective(t_decisemanagetable);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_decisemanagetableSelect",produces = "application/json;chart=UTF-8")
    public String t_decisemanagetableSelect(HttpServletRequest request){
        String deciseID = request.getParameter("deciseID");
        T_decisemanagetable t_decisemanagetable = iT_decisemanagetableService.selectByPrimaryKey(Integer.valueOf(deciseID));
        return JSON.toJSONString(t_decisemanagetable);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_decisemanagetableDelete",produces = "application/json;chart=UTF-8")
    public String t_decisemanagetableDelete(HttpServletRequest request){
        String deciseID = request.getParameter("deciseID");
        int i = iT_decisemanagetableService.deleteByPrimaryKey(Integer.valueOf(deciseID));
        return JSON.toJSONString(i);
    }
}
