package com;

import com.service.IPointService;
import com.service.ITestadfService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class TestPt {
    @Resource
    IPointService iPointService;
    @Resource
    ITestadfService iTestadfService;
    @Test
    @Transactional
    @Rollback
    public void test(){
        HashMap map = new HashMap();
//        map.put("name","山");
        map.put("rid",1);
//        System.out.println("-----test:"+iPointService.selectPointListMap(map));
        System.out.println("-----test:"+iTestadfService.selectTestadfListMap(map));
    }
}
