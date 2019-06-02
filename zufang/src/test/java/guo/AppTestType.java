package guo;

import guo.service.IYuyueService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.io.*;
import java.text.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
@WebAppConfiguration
public class AppTestType {
//    @Resource
//    ITesttypeService iTesttypeService;
    @Resource
    IYuyueService iYuyueService;
    @Test
//    @Transactional
//    @Rollback
    public void selectAll() throws ParseException, IOException, NoSuchFieldException, IllegalAccessException {

//        Testtype testtype = iTesttypeService.selectByPrimaryKey((long)1);
//        File file = new File("C:\\Users\\Administrator\\Pictures\\house.bmp");
//        File fileout = new File("C:\\Users\\Administrator\\Pictures\\houseout.bmp");
//        InputStream inputStream = new FileInputStream(file);
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        int num = inputStream.read();
//        while(num!=-1){
//            byteArrayOutputStream.write(num);
//            num = inputStream.read();
//        }
////        testtype.setLongblob1(byteArrayOutputStream.toByteArray());
//        OutputStream outputStream = new FileOutputStream(fileout);
//        outputStream.write(byteArrayOutputStream.toByteArray());
////        testtype.setMediumblob1(byteArrayOutputStream.toByteArray());
////        testtype.setBlob1(byteArrayOutputStream.toByteArray());
////        testtype.setTinyblob1(byteArrayOutputStream.toByteArray());//不能插入图片。
////        testtype.setVarbinary1(byteArrayOutputStream.toByteArray());//不能插入图片。
////        testtype.setBinary1(byteArrayOutputStream.toByteArray());//不能插入图片。
//        outputStream.flush();
//        byteArrayOutputStream.flush();
//        outputStream.close();
//        inputStream.close();
//        byteArrayOutputStream.close();

//        testtype.setBigint1((long)2);
//        int i = iTesttypeService.insertSelective(testtype);//只要不插入年就成功
//        System.out.println("-----i:"+i);
    }
}
