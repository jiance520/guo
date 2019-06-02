package com;

import com.service.IPointService;
import com.service.impl.PointService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.HashMap;

//springboot自带tomcat插件，所以启动springboot，只需要在启动类上加注解@SpringBootApplication。
@SpringBootApplication
//@MapperScan(basePackages = "com.dao")//重点，实列化Bean，只有扫描了dao，才能实例化mapper调用mapper.xml里面的方法！也可以在application.xml配置扫描。eclipse中用，加在idea中会有警告，
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}