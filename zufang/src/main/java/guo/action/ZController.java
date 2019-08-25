package guo.action;

import com.alibaba.fastjson.*;
import guo.entity.Favorites;
import guo.entity.House;
import guo.entity.Userinfo;
import guo.entity.Yuyue;
import guo.service.IFavoritesService;
import guo.service.IHouseService;
import guo.service.IUserinfoService;
import guo.service.IYuyueService;
import guo.service.impl.YuyueService;
import guo.utils.MapToBeanUtil;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Controller
public class ZController implements ServletContextAware {
    private ServletContext application;
    @Resource
    private IUserinfoService iUserinfoService;
    @Resource
    private IHouseService iHouseService;
    @Resource
    private IFavoritesService iFavoritesService;
    @Autowired
    private IYuyueService iYuyueService;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }
    @CrossOrigin//可有可无
    @ResponseBody
    @RequestMapping(value = "selectLogin",produces = "application/json;chart=UTF-8")
    public String selectLogin(HttpServletRequest request,@RequestParam(required=false) Map<String,Map> map) throws InterruptedException, IOException, ServletException {
        System.out.println("-----进入selection:");
        String userid = request.getParameter("AccountNumber");
        String upasswd = request.getParameter("Password");
        System.out.println("-----userid:"+userid);
        System.out.println("-----upasswd:"+upasswd);
        Map hashMap = new HashMap();
        hashMap.put("userid",userid);
        hashMap.put("upasswd",upasswd);
        Userinfo userinfo = iUserinfoService.selectLogin(hashMap);
        System.out.println("-----userinfo:"+userinfo);
        HashMap paramsMap = new HashMap();
        String backjson = null;
        if(userinfo==null){
            backjson = "fail";
            System.out.println("用户名或密码错误");
        }
        else {
            backjson = "success";
            System.out.println("登陆成功");
        }
        paramsMap.put("Result",backjson);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params",paramsMap);
        backjson = JSON.toJSONString(jsonObject);
        return backjson;
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("insertSelective")
    public String insertSelective(HttpServletRequest request,@RequestParam(required = false) Map<String,Object> params ) throws InterruptedException, IOException {
        String userid = request.getParameter("AccountNumber");
        String upasswd = request.getParameter("Password");
        System.out.println("-----AccountNumber:"+userid);
        HashMap paramsMap = new HashMap();
        String backjson = null;
        if(userid!=null&&!"".equals(userid)){
            Userinfo userinfo1 = iUserinfoService.selectByPrimaryKey(userid);
            if(userinfo1!=null){
                backjson = "fail";
                System.out.println("注册失败，帐号已存在");
            }else{
                Userinfo userinfo = new Userinfo();
//                userinfo.setUserid(userid);
//                userinfo.setUpasswd(upasswd);
                String uname = request.getParameter("uname");
                String utel = request.getParameter("utel");
                String ucardid = request.getParameter("ucardid");
                String ustatus = request.getParameter("ustatus");
                String usex = request.getParameter("usex");
                String uemail = request.getParameter("uemail");
                String uztype = request.getParameter("uztype");
                String udistrict = request.getParameter("udistrict");
                String uaddress = request.getParameter("uaddress");
                String umetro = request.getParameter("umetro");
                String ustation = request.getParameter("ustation");
                String uhtype = request.getParameter("uhtype");
                String umianji = request.getParameter("umianji");
                String ufeature = request.getParameter("ufeature");
                if(uname==null||"".equals(uname)){params.put("uname","余风");}
                if(utel==null||"".equals(utel)){params.put("utel","18229951969");}
                if(ucardid==null||"".equals(ucardid)){params.put("ucardid","430903199512223333");}
                if(ustatus==null||"".equals(ustatus)){params.put("ustatus","未认证");}
                if(usex==null||"".equals(usex)){params.put("usex","女");}
                if(uemail==null||"".equals(uemail)){params.put("uemail","xx4@163.com");}
                if(uztype==null||"".equals(uztype)){params.put("uztype","整租");}
                if(udistrict==null||"".equals(udistrict)){params.put("udistrict","岳麓区");}
                if(uaddress==null||"".equals(uaddress)){params.put("uaddress","商学院");}
                if(umetro==null||"".equals(umetro)){params.put("umetro","2");}
                if(ustation==null||"".equals(ustation)){params.put("ustation","溶湾镇");}
                if(uhtype==null||"".equals(uhtype)){params.put("uhtype","一居室");}
                if(umianji==null||"".equals(umianji)){params.put("umianji","60");}
                if(ufeature==null||"".equals(ufeature)){params.put("ufeature","阳台+厨房");}
                MapToBeanUtil.backBean(userinfo,params,true);
                int i = iUserinfoService.insertSelective(userinfo);
                System.out.println("-----i:"+i);
                if(i!=1){
                    backjson = "fail";
                    System.out.println("注册失败");
                }
                else {
                    backjson = "success";
                    System.out.println("注册成功");
                }
            }
        }
        paramsMap.put("Result",backjson);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params",paramsMap);
        backjson = JSON.toJSONString(jsonObject);
        return backjson;
    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("selectHouseList")
    public Object selectHouseList(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params+"  time:"+new Date());
//        params.put("htitle","商学院 小区");
        String htitle = request.getParameter("htitle");
        System.out.println("-----htitle:"+htitle);
        if(htitle!=null){
            String[] arrHtitle = htitle.split(" ");
            System.out.println("-----arrHtitle:"+Arrays.toString(arrHtitle));
            params.put("arrHtitle",arrHtitle);
        }
//        {htitle=小区, hztype=整租, stations=开福寺, hdistrict=开福区}
//        params = new HashMap<>();
//        params.put("houseid",houseid);
//        params.put("htitle","小区");
//        params.put("himg",himg);
//        params.put("mname",mname);
//        params.put("masterid",masterid);
//        params.put("mtel",mtel);
//        params.put("hztype","整租");
//        params.put("hdistrict","开福区");
//        params.put("haddress",haddress);
//        params.put("hmetro",hmetro);
//        params.put("hstation","开福寺");
//        params.put("hdistance",hdistance);
//        params.put("hprice",hprice);
//        params.put("hmianji",hmianji);
//        params.put("hfeature",hfeature);
//        params.put("hdirection",hdirection);
//        params.put("hstatus",hstatus);
//        params.put("hhtype",hhtype);
//        params.put("hfloorage",hfloorage);
//        params.put("hlift",hlift);
//        params.put("hspeizhi",hspeizhi);
//        params.put("hgpeizhi",hgpeizhi);
//        params.put("hother",hother);
//        params.put("hwimg",hwimg);
//        params.put("hkimg",hkimg);
//        params.put("hsimg",hsimg);
//        params.put("hcimg",hcimg);
//        params.put("hpimg",hpimg);
//        params.put("sortType",sortType);
        List list = iHouseService.selectHouseList(params);
        System.out.println("-----list:"+list);
        JSONArray jsonArray = new JSONArray(list);
        return jsonArray;
    }
    @ResponseBody
    @PostMapping("selectByHouseId")
    public Object selectByHouseId(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params+"  time:"+new Date());
        params.put("params","CS/2019/1/12/13975690866/10:15");
        List list = iHouseService.selectHouseList(params);
        System.out.println("-----list:"+list);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params",list.get(0));
        return jsonObject;
    }
    @ResponseBody
    @PostMapping("selectFavorites")
    public Object selectFavorites(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----selectFavorites:"+request.getParameter("userid"));
        System.out.println("-----params:"+params);
//        if(request.getParameter("userid")!=null){
//            params.put("userid","13975690869");
//        }
//        params.put("userid","13975690869");
        List list = iFavoritesService.selectFavorites(params);
        System.out.println("-----test:"+list);
        JSONArray jsonArray = new JSONArray(list);
        return jsonArray;
    }
    @ResponseBody
    @PostMapping("insertFavorite")
    public Object insertFavorite(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----userid:"+request.getParameter("userid"));
        System.out.println("-----houseid:"+request.getParameter("houseid"));
        System.out.println("-----params:"+params);
        String userid = request.getParameter("userid");
        String houseid = request.getParameter("houseid");
        Favorites favorites = new Favorites();
        favorites.setUserid(userid);
        favorites.setHouseid(houseid);
        favorites.setFid(UUID.randomUUID().toString());
//        params.put("userid","123");
//        params.put("houseid","12321");

        HashMap paramsMap = new HashMap();
        String backjson = null;
        System.out.println("-----查询是否存在:");
        List list = iFavoritesService.selectFavorites(params);
        if(!list.isEmpty()){
            backjson = "fail";
            System.out.println("插入失败，收藏已存在");
        }
        else{
            int num = iFavoritesService.insertSelective(favorites);
            if(num<=0){
                backjson = "fail";
                System.out.println("插入失败");
            }
            else {
                backjson = "success";
                System.out.println("插入成功");
            }
        }
        paramsMap.put("Result",backjson);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params",paramsMap);
        return jsonObject;
    }
    @ResponseBody
    @PostMapping("insertYuyue")
    public Object insertYuyue(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params);
        Yuyue yuyue = new Yuyue();
        String backjson = null;
        int num = -1;
        if(params!=null&&!params.isEmpty()){
//            Map map = new HashMap();
//            map.put("userid","13975690866");
//            map.put("yyid","1234");
//            map.put("houseid","CS/2019/3/20/13975690888/18:35");
            String userid = request.getParameter("userid");
            String houseid = request.getParameter("houseid");
            Calendar calendar = Calendar.getInstance();
            //String yyid = UUID.randomUUID().toString();
            String yyid = "CS/"+calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DATE)+"/"+userid+"/"+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE);//CS/2019/4/25/13975690869/22:45
            params.put("yyid",yyid);
            Userinfo userinfo = iUserinfoService.selectByPrimaryKey(userid);
            House house = iHouseService.selectByPrimaryKey(houseid);
            String yttime = calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DATE)+"/"+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE);//2019/4/25/22:45
            String yuname = request.getParameter("yuname");
            String yhtitle = request.getParameter("yhtitle");
            String yhimg = request.getParameter("yhimg");
            String mname = request.getParameter("mname");
            String masterid = request.getParameter("masterid");
            String yktime = request.getParameter("yktime");
            String ystatus = request.getParameter("ystatus");
            if(yuname==null||"".equals(yuname)){params.put("yuname",userinfo.getUname());}
            if(yhtitle==null||"".equals(yhtitle)){params.put("yhtitle",house.getHtitle());}
            if(yhimg==null||"".equals(yhimg)){params.put("yhimg","http://192.168.52.69:8080/zufang/house.jpg");}
            if(mname==null||"".equals(mname)){params.put("mname",house.getMname());}
            if(masterid==null||"".equals(masterid)){params.put("masterid",house.getMasterid());}
            if(yttime==null||"".equals(yttime)){params.put("yttime",yttime);}
            if(yktime==null||"".equals(yktime)){params.put("yktime","明天");}
            if(ystatus==null||"".equals(ystatus)){params.put("ystatus","待通过");}
            List<Map> list = iYuyueService.selectYuyueList(params);
            if(list.isEmpty()){
                MapToBeanUtil.backBean(yuyue,params,true);
                num = iYuyueService.insertSelective(yuyue);
                if(num<=0){
                    backjson = "fail";
                    System.out.println("插入失败");
                }
                else {
                    backjson = "success";
                    System.out.println("插入成功");
                }
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("params",backjson);
                return jsonObject;
            }
            else {
                backjson = "fail";
                System.out.println("插入失败");
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("params",backjson);
                return jsonObject;
            }
        }
        else {
            return null;
        }
    }
    @ResponseBody
    @PostMapping("selectYuyueList")
    public Object selectYuyueList(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params);
        String userid = request.getParameter("userid");
//        params.put("userid","13975690866");
        if(params!=null&&!params.isEmpty()){
            List list = iYuyueService.selectYuyueList(params);
            System.out.println("-----list:"+list);
            JSONArray jsonArray = new JSONArray(list);
            return jsonArray;
        }
        else {
            return null;
        }
    }
    @ResponseBody
    @PostMapping("selectYuyue")
    public Object selectYuyue(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params);
        String yyid = request.getParameter("yyid");
        if(yyid!=null&&!"".equals(yyid)){
            Yuyue yuyue = iYuyueService.selectByPrimaryKey(yyid);
            System.out.println("-----yuyue:"+yuyue);
            if(yuyue!=null){
//                Map map = list.get(0);
                Map map =  MapToBeanUtil.backMap(yuyue);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("params",map);
                return jsonObject;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }
    @ResponseBody
    @PostMapping("updateYuyue")
    public Object updateYuyue(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params);
        Yuyue yuyue = new Yuyue();
        String backjson = null;
        MapToBeanUtil.backBean(yuyue,params,true);
        int num = iYuyueService.updateByPrimaryKeySelective(yuyue);
        if(num<=0){
            backjson = "fail";
            System.out.println("失败");
        }
        else {
            backjson = "success";
            System.out.println("成功");
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params",backjson);
        return jsonObject;
    }
    @ResponseBody
    @PostMapping("updateUserinfo")
    public Object updateUserinfo(HttpServletRequest request,@RequestParam(required=false) Map<String,Object> params){
        System.out.println("-----params:"+params);
        Userinfo userinfo = new Userinfo();
        String backjson = null;
        MapToBeanUtil.backBean(userinfo,params,true);
        int num = iUserinfoService.updateByPrimaryKeySelective(userinfo);
        if(num<=0){
            backjson = "fail";
            System.out.println("失败");
        }
        else {
            backjson = "success";
            System.out.println("成功");
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params",backjson);
        return jsonObject;
    }
    public void select(T iBeanService,String id) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if(id!=null&&!"".equals(id)){
            Method method = iBeanService.getClass().getMethod("selectByPrimaryKey",String.class);
            Object obj = method.invoke(iBeanService,id);
            System.out.println("-----obj:"+obj);
        }
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
    }
}