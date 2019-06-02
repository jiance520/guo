package guo.utils;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Component
public class MapToBeanUtil {
    //对于数字是什么类型，必须先手动指定，才能判断。字符串解析parse为指定封装类型
    //支持Map中的字符串和Object。
    //返回的bean对象，不一定有值，可能是一个空对象。
    //复制一个对象的所有属性值给另一个对象BeanUtils.copyProperties(testtype,bean);，不能复制map。
    //不能转换泛型，List,Map,数组等其它类型，只转换数据库的类型。

    //Map转实体，接收前端的map，存入实体，用于插入表中,方法的判断是针对字符串，对于非字符串原类型，直接使用field.set(bean,objectValue);！
    public static <T> Object backBean(T bean,Map<String,Object> params){
        try {
            for(HashMap.Entry<String,Object> entry:params.entrySet()){
                String attrKey = entry.getKey();//bigint1=field.getName();
                Object objectValue = entry.getValue();//11，默认全是String
                if(objectValue!=null){
                    //System.out.println("-----entry.getKey:"+attrKey);
                    //System.out.println("-----objectValue:"+objectValue.toString());
                    Field field = bean.getClass().getDeclaredField(attrKey);//公私有字段,不包括继承字段
                    if(field!=null){
                        field.setAccessible(true);//设置可以访问和修改私有属性，包括final?
                        //System.out.println("-----field.getName():"+field.getName());
                        //System.out.println("-----fieldType.getSimpleName():"+fieldType.getSimpleName());//不能用于类型转换(short)1
                        //Object fieldParam = field.get(bean);//属性值不能为空才能返回其Object类型，再使用instanceof判断。
                        field.set(bean, attrBean(bean,attrKey,objectValue));
                        field.setAccessible(false);
                    }
                }
            }
        }
        catch (NoSuchFieldException e){
            System.out.println("-----params的key不在bean中");
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.getMessage();
        }
        return bean;
    }
    //实体对象bean转Map，接收前端的对象转存到map，用于模糊查询和传jsonObject.put("params",map);给前端
    public static <T> Map backMap(T bean) {
        Map map  = new HashMap();
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                map.put(field.getName(),field.get(bean));
                field.setAccessible(false);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                System.out.println("-----出现错误，返回null");
                return null;
            }
        }
        return map;
    }
    //对单个参数objectValue，参数变量名attrKey和类变量名进行系统类型判断，能转换字符串，或没匹配到返回原型T objectValue。
    public static <T> Object attrBean(T bean, String attrKey, T objectValue) {

        if(objectValue!=null&&attrKey!=null&&!"".equals(attrKey)&&!"".equals(objectValue)){
            Field field = null;
            try {
                field = bean.getClass().getDeclaredField(attrKey);
                Class fieldType = field.getType();
                if(fieldType.getSimpleName().equals("String")){
                    return (String)objectValue;
                }
                else if(fieldType.getSimpleName().equals("Integer")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Integer.parseInt(value);
                    }
                    else if (objectValue instanceof Integer) {//经过instanceof才能强转。
                        return (Integer)objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Boolean")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Boolean.parseBoolean(value);
                    }
                    else if (objectValue instanceof Boolean) {
                        return (Boolean)objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Long")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Long.parseLong(value);
                    }
                    else if (objectValue instanceof Long) {
                        return (Long)objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Double")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Double.parseDouble(value);
                    }
                    else if (objectValue instanceof Double) {
                        return (Double) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Float")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Float.parseFloat(value);
                    }
                    else if (objectValue instanceof Float) {
                        return (Float) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Date")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return StrToDate.dateFormat(value,"20",true);
                    }
                    else if (objectValue instanceof Date) {
                        return (Date) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("BigDecimal")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return new BigDecimal(value);
                    }
                    else if (objectValue instanceof BigDecimal) {
                        return (BigDecimal) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Short")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Short.parseShort(value);
                    }
                    else if (objectValue instanceof Short) {
                        return (Short) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else if(fieldType.getSimpleName().equals("Byte")){
                    if (objectValue instanceof String) {
                        String value = (String) objectValue;
                        return Byte.parseByte(value);
                    }
                    else if (objectValue instanceof Byte) {
                        return (Byte) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
//            if(fieldType.getSimpleName().equals("class java.lang.byte[]")){
                else if(fieldType.getSimpleName().equals("byte[]")){
                    if (objectValue instanceof String) {
                        //直接byte[] bytes = objectValue.toString().getBytes();可能编码后乱码
                        //byte[] bytes = objectValue.toString().getBytes("utf-8");编码后，字节长度增加了，标记编码格式，并且抛异常
                        //推荐以下jdk7开始，无以上问题
                        return objectValue.toString().getBytes(StandardCharsets.UTF_8);//
                    }
                    else if (objectValue instanceof byte[]) {
                        return (byte[]) objectValue;
                    }
                    else{
                        System.out.println("-----类型不匹配:"+fieldType.getSimpleName()+"!="+objectValue.toString());
                        return null;
                    }
                }
                else {
                    System.out.println("-----没有匹配到，返回原型:"+objectValue.toString());
                    return objectValue;
                }
            }
            catch (NoSuchFieldException e){
                System.out.println("-----attrKey不在bean中");
                return null;
            }
        }
        else {
            return null;
        }
    }
    public static void main(String[] args){
//       Testtype testtype = new Testtype();
//       Map<String,Object> params = new HashMap<>();
//       House house = new House();
//       house.setHaddress("地址");
//        params.put("house",house);
//        params.put("bigint1","1");
//        params.put("integer1",12345678);
//        params.put("tint1",13);
//        params.put("mediumint1",12345678);
//        params.put("smallint1",(short)14);//数字默认是int，要转型
//        params.put("tinyint1","123");
//        params.put("numeric1","123.123");
//        params.put("decimal1","123.123");
//        params.put("double1","123.123");
//        params.put("real1","123.123");
//        params.put("float1","123.123");
//        params.put("timestamp1","Mon May 06 14:41:28 CST 2019");
//        params.put("datetime1","Mon May 06 14:41:28 CST 2019");
//        params.put("year1","Tue Jan 01 00:00:00 CST 2019");
//        params.put("date1","Mon May 06 00:00:00 CST 2019");
//        params.put("time1","Thu Jan 01 14:41:28 CST 1970");
//        params.put("varchar1","varchar");
//        params.put("char1","char");
//        params.put("tinytext1","tinytext");
//        params.put("bit1","true");
//        params.put("longtext1","longtext");
//        params.put("mediumtext1","mediumtext");
//        params.put("text1","text");
//        params.put("longblob1","0101");
//        params.put("mediumblob1","[48, 49, 49, 49]");
//        params.put("blob1","[49, 48, 48, 48]");
//        params.put("tinyblob1","[49, 48, 48, 49]");
//        params.put("varbinary1","[49, 48, 49, 48]");
//        params.put("binary1","[49, 48, 49, 49, 0, 0, 0, 0]");
//        Object object = MapToBeanUtil.backBean(testtype,params);
//        if(object instanceof Testtype){
//            Testtype testtype1 = (Testtype) MapToBeanUtil.backBean(testtype,params);
//            System.out.println("-----Map转bean成功:"+testtype1);
//        }
//        else{
//            System.out.println("-----Map转bean失败");
//        }
//        Map map = MapToBeanUtil.backMap(object);
//        System.out.println("-----map:"+map);
    }
}
