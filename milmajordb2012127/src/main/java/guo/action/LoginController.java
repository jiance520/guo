package guo.action;

import com.alibaba.fastjson.JSON;
import guo.entity.T_user;
import guo.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IT_userService it_userService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_userLogin",produces = "application/json;chart=UTF-8")
    public String t_userLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        T_user login = it_userService.login(username, password);
        return JSON.toJSONString(login);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_userInsert",produces = "application/json;chart=UTF-8")
    public String t_userInsert(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        T_user t_user = new T_user();
        t_user.setUsername(username);
        t_user.setPassword((password));
        T_user t_user1 = it_userService.selectByUserName(username);
        if(t_user1==null){
            int i = it_userService.insert(t_user);
            return JSON.toJSONString(i);
        }
        else {
            return JSON.toJSONString(0);
        }
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_userUpdate",produces = "application/json;chart=UTF-8")
    public String t_userUpdate(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        T_user t_user = new T_user();
        t_user.setUsername(username);
        t_user.setPassword(password);
        int i = it_userService.updateByUserName(t_user);
        return JSON.toJSONString(i);
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/t_userDelete",produces = "application/json;chart=UTF-8")
    public String t_userDelete(HttpServletRequest request){
        String username = request.getParameter("username");
        int i = it_userService.deleteByUserName(username);
        return JSON.toJSONString(i);
    }
public static void main(String[] args) throws Exception {

    }
}
