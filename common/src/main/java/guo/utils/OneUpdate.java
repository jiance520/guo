package guo.utils;

import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

//必须放在utils文件夹，否则手动修改必须保证所有文件夹名规范，dao,service,才能使用此工具
//@Component
//@Configuration构造函数的入参，必须用存在的属性？
//@PropertySource("classpath:/application.properties")自定义配置文件
public class OneUpdate{
    private String jarName = "";//mysql-connector-java-5.1.20.jar
    private String propertiesName="";//application.properties
    private String resourcesPath="";//D:\workspace\idea\guo\zufang\src\main\resources
    private String jarLocation="";//D:\workspace\idea\guo\zufang\src\main\resources\mybatisGenerator\mysql-connector-java-5.1.20.jar
    @Value("${spring.datasource.driver-class-name}")
    private String driverClass="";//com.mysql.jdbc.Driver
    @Value("${spring.datasource.url}")
    private String connectionURL="";//jdbc:mysql://localhost:3306/src?characterEncoding=utf8
    private String javaModelGenerator="";//guo.entity
    private String javaTargetProject="";//D:/workspace/idea/guo/zufang/src/main/java
    private String sqlMapGenerator="";//resources.mapper
    private String sqlTargetProject="";//D:/workspace/idea/guo/zufang/src/main
    private String clientGenerator="";//guo.dao
    private String clientTargetProject="";//D:/workspace/idea/guo/zufang/src/main/java
    @Value("${spring.datasource.username}")//只有在项目运行时才能获取？
    private String userId="";//root
    @Value("${spring.datasource.password}")
    private String password="";//root
    @Value("${server.servlet.context-path}")
    private String projectName = "";//zufang,工程名不一定是数据库名，所以generator.xml要检查。
    private String generatorPath = "";//D:\workspace\idea\guo\zufang\src\main\resources\mybatisGenerator\
    private String jarMybatis = "mybatis-generator-core-1.3.2.jar";
    private boolean flagDel = false;//重构是否删除原来的dao、entity、mapper.xml。false不删除
    private String cmd = "";//"cmd /k start D:\\workspace\\idea\\guo\\zufang\\src\\main\\resources\\mybatisGenerator\\run.bat";
    private String comName = "";//guo 、com
    private String daoFolderName = "";//dao
    private String daoLastName = "";//Dao、Mapper
    private String entityName = "entity";//entity，这个必须填写，不能为空
    private String iServiceFolderName = "";//service
    private String serviceFolderName = "";//impl
    private String tableName = "";//tableName=entity,区分大小写，Testtype。
    private String[] tableNameArr = null;
    //oneUpdateURL=file:/D:/workspace/idea/guo/zufang/target/classes/guo/utils/
    private URL oneUpdateURL = OneUpdate.class.getResource("");//当前类所在的本地URL。
    private String daoPath = "";//D:\workspace\idea\guo\zufang\src\main\java\guo\dao
    private String iServicePath = "";//D:\workspace\idea\guo\zufang\src\main\java\guo\service
    private String servicePath = "";//D:\workspace\idea\guo\zufang\src\main\java\guo\service\impl
    //private String daoPackageName = comName+"."+daoFolderName;//guo.dao;
    //private String iServicePackageName = comName+"."+iServiceFolderName;;//guo.service
    //private String servicePackageName = comName+"."+serviceFolderName;//guo.service.impl
    public OneUpdate(String propertiesName,String jarName,String daoFolderName,String daoLastName,String iServiceFolderName,String serviceFolderName,boolean flagDel,Object... tableNames){
        if(this.propertiesName==null||"".equals(this.propertiesName)){
            this.propertiesName=propertiesName;
        }
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream(this.propertiesName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(this.userId==null||"".equals(this.userId)){
            userId = properties.getProperty("spring.datasource.username");
        }
        if(this.password==null||"".equals(this.password)){
            password = properties.getProperty("spring.datasource.password");
        }
        if(this.driverClass==null||"".equals(this.driverClass)){
            driverClass = properties.getProperty("spring.datasource.driver-class-name");
        }
        if(this.connectionURL==null||"".equals(this.connectionURL)){
            connectionURL = properties.getProperty("spring.datasource.url");
        }

        if(this.daoFolderName==null||"".equals(this.daoFolderName)){this.daoFolderName =daoFolderName;}
        if(this.daoLastName==null||"".equals(this.daoLastName)){this.daoLastName =daoLastName;}
        if(this.iServiceFolderName==null||"".equals(this.iServiceFolderName)){this.iServiceFolderName=iServiceFolderName;}
        if(this.serviceFolderName==null||"".equals(this.serviceFolderName)){this.serviceFolderName =serviceFolderName;}
        if(tableNames[0].toString().contains("\n")){
            String tableStr = tableNames[0].toString();
            String dataStr = null;
            if(tableStr.contains(".")){
                dataStr = tableStr.substring(0,tableStr.indexOf("."));
                tableStr = tableStr.replaceAll(dataStr+".","");
            }
            tableStr = tableStr.replace(" ", "");//去空格
            if(!Pattern.compile("[a-z]+").matcher(tableStr).find()){
                tableStr = tableStr.toLowerCase();//如果字符串全是大写，则全转小写
            }
            String[] tableArr = tableStr.split("\n");
            for (int i = 0; i <tableArr.length ; i++) {
                tableArr[i]=StringIndex.upFirstWord(tableArr[i]);
            }
            this.tableNameArr = tableArr;
            this.tableName = tableArr[0];
        }
        else {
            if(this.tableName==null){
                setTableName(tableNames[0].toString());
            }
            if(this.tableNameArr==null){
                this.tableNameArr = new String[tableNames.length];
                for (int i = 0; i <tableNames.length ; i++) {
                    this.tableNameArr[i]=StringIndex.upFirstWord(tableNames[i].toString());
                }
            }
        }
        String oneUpdatePath = this.oneUpdateURL.toString();
        System.out.println("oneUpdateURLStr:"+oneUpdatePath);
        oneUpdatePath=oneUpdatePath.replaceAll("file:/","");
        oneUpdatePath=oneUpdatePath.replaceAll("target/classes","src/main/java");
        //oneUpdatePath=D:/workspace/idea/guo/zufang/src/main/java/guo/utils/
        String utils = StringIndex.substringLastIndexOf(oneUpdatePath,"/",1,2);
        if(this.daoPath==null||"".equals(this.daoPath)){
            this.daoPath = oneUpdatePath.replaceAll(utils, daoFolderName);
            System.out.println("-----daoPath:"+this.daoPath);
        }
        if(this.projectName==null||"".equals(this.projectName)){
            this.projectName=StringIndex.substringLastIndexOf(this.daoPath,"/",6,7);
            //this.projectName=properties.getProperty("server.servlet.context-path");
        }
        if(this.comName==null||"".equals(this.comName)){
            this.comName = StringIndex.substringLastIndexOf(oneUpdatePath,"/",2,3);
        }
        if(this.iServicePath==null||"".equals(this.iServicePath)){
            this.iServicePath = oneUpdatePath.replaceAll(utils, iServiceFolderName);
            System.out.println("-----iServicePath:"+this.iServicePath);
        }
        if(this.servicePath==null||"".equals(this.servicePath)){
            this.servicePath = oneUpdatePath.replaceAll(utils, iServiceFolderName +"/"+ serviceFolderName);
            System.out.println("-----servicePath:"+this.servicePath);
        }
        if(this.generatorPath==null||"".equals(this.generatorPath)){
            String javacomutils = StringIndex.substringLastIndexOf(oneUpdatePath,"/",1,4);
            this.generatorPath = oneUpdatePath.replaceAll(javacomutils, "resources/mybatisGenerator");
            //D:\workspace\idea\guo\zufang\src\main\resources\mybatisGenerator\generator.xml
            System.out.println("-----generatorPath:"+generatorPath);
        }
        if(this.jarName==null||"".equals(this.jarName)){
            this.jarName=jarName;
        }
        if(this.jarLocation==null||"".equals(this.jarLocation)){
            this.jarLocation=this.generatorPath+this.jarName;
            System.out.println("-----jarLocation:"+this.jarLocation);
        }
//        if(this.jarName.contains("mysql")){
//            this.driverClass="com.mysql.jdbc.Driver";
//            this.connectionURL="jdbc:mysql://localhost:3306/"+this.projectName+"?characterEncoding=utf8";
//        }
//        else if(this.jarName.contains("ojdbc")||this.jarName.contains("oracle")){
//            this.driverClass="oracle.jdbc.driver.OracleDriver";
//            this.connectionURL="jdbc:oracle:thin:@localhost:1521:orcl";
//        }
//        else {
//            System.out.println("-----输入的jarName不规范:");
//        }
        if(this.javaModelGenerator==null||"".equals(this.javaModelGenerator)){
            this.javaModelGenerator=this.comName+"."+entityName;
        }
        if(this.javaTargetProject==null||"".equals(this.javaTargetProject)){
            int index = StringIndex.lastIndexOf(oneUpdatePath,"/",3);
            this.javaTargetProject=oneUpdatePath.substring(0,index);
            System.out.println("-----javaTargetProject:"+this.javaTargetProject);
        }
        if(this.sqlMapGenerator==null||"".equals(this.sqlMapGenerator)){
            this.sqlMapGenerator="resources.mapper";
        }
        if(this.sqlTargetProject==null||"".equals(this.sqlTargetProject)){
            int index = StringIndex.lastIndexOf(oneUpdatePath,"/",4);
            this.sqlTargetProject=oneUpdatePath.substring(0,index);
            System.out.println("-----sqlTargetProject:"+this.sqlTargetProject);
        }
        if(this.clientGenerator==null||"".equals(this.clientGenerator)){
            this.clientGenerator=comName+"."+this.daoFolderName;
        }
        if(this.clientTargetProject==null||"".equals(this.clientTargetProject)){
            int index = StringIndex.lastIndexOf(oneUpdatePath,"/",3);
            this.clientTargetProject=oneUpdatePath.substring(0,index);
            System.out.println("-----clientTargetProject:"+this.clientTargetProject);
        }
        if(this.resourcesPath==null||"".equals(this.resourcesPath)){
            //oneUpdatePath=D:/workspace/idea/guo/zufang/src/main/java/guo/utils/
            int index=StringIndex.lastIndexOf(oneUpdatePath,"/",4);
            this.resourcesPath = oneUpdatePath.substring(0,index+1)+"resources/";
            System.out.println("-----resourcesPath:"+resourcesPath);
        }
        if(this.cmd==null||"".equals(this.cmd)){
            this.cmd = "cmd /c start "+generatorPath+"run.bat";
            //this.cmd = "cmd /c start "+generatorPath+"run.bat";//c表示执行命令后关闭窗口，关闭无效，使用exit加在了run.bat后,或者直接在bat文件里手动添加一个exit。
            //命令可直接执行，也可以放在bat批量文件处理。
            //只打开文件exec("start .//a.doc");
        }
        this.flagDel = flagDel;
        System.out.println("-----userid:"+this.userId);
        System.out.println("-----cmd:"+this.cmd);
    }

    public void setTableName(String tableName) {
        //tableName = tableName.substring(0,1).toUpperCase()+tableName.substring(1);
        if(Character.isLowerCase(tableName.charAt(0))){//如果首字母是小写，则改为大写
            tableName = StringIndex.upFirstWord(tableName);
        }
        this.tableName = tableName;
    }
//    public void setDaoPackageName(String daoPackageName) {
//        this.daoPackageName = daoPackageName;
//    }
//    public void setiServicePackageName(String iServicePackageName) {
//        this.iServicePackageName = iServicePackageName;
//    }
//    public void setServicePackageName(String servicePackageName) {
//        this.servicePackageName = servicePackageName;
//    }
//    public String getDaoPackageName(){
//        if(daoPackageName==null||"".equals(daoPackageName)){
//            String classStr = OneUpdate.class.getName();//guo.utils.OneUpdate
//            classStr=classStr.substring(0,classStr.lastIndexOf(".")-1);
//            classStr = classStr.replaceAll(classStr.substring(classStr.indexOf(".")+1), daoFolderName);
//            this.daoPackageName = classStr;
//            System.out.println("-----daoPackageName:"+daoPackageName);
//        }
//        return daoPackageName;
//    }
//    public String getIServicePackageName(){
//        if(iServicePackageName==null||"".equals(iServicePackageName)){
//            String classStr = OneUpdate.class.getName();//guo.utils.OneUpdate
//            classStr=classStr.substring(0,classStr.lastIndexOf(".")-1);
//            classStr = classStr.replaceAll(classStr.substring(classStr.indexOf(".")+1), iServiceFolderName);
//            this.iServicePackageName = classStr;
//            System.out.println("-----iServicePackageName:"+iServicePackageName);
//        }
//        return iServicePackageName;
//    }
//    public String getServicePackageName(){
//        if(servicePackageName==null||"".equals(servicePackageName)){
//            String classStr = OneUpdate.class.getName();//guo.utils.OneUpdate
//            classStr=classStr.substring(0,classStr.lastIndexOf(".")-1);
//            classStr = classStr.replaceAll(classStr.substring(classStr.indexOf(".")+1), iServiceFolderName +"."+ serviceFolderName);
//            this.servicePackageName = classStr;
//            System.out.println("-----servicePackageName:"+servicePackageName);
//        }
//        return servicePackageName;
//    }

    //配置generator.xml中的tableName
    public void generator(){
        String tableObj ="       <table schema=\"user\" tableName=\"table\"\n" +
                "            domainObjectName=\"Table\" enableCountByExample=\"false\"\n" +
                "            enableUpdateByExample=\"false\" enableDeleteByExample=\"false\"  \n" +
                "            enableSelectByExample=\"false\" selectByExampleQueryId=\"false\">\n" +
                "       </table>  ";

        File daoFolderFile = new File(daoPath);
        String[] mapperFileStrArr = daoFolderFile.list();/*返回所有的dao文件名*///TesttypeMapper.java,
        List<String> tableList = new ArrayList<String>();
        boolean flag = false;
        //判断是否则重构实体,默认false，不删除重构
        if(flagDel){
            //删除指定dao文件
            for(String tableNamei:tableNameArr){
                File tempFile = new File(daoPath+tableNamei+daoLastName+".java");
                if(tempFile!=null){
                    tempFile.delete();
                }
            }
            //删除指定entity文件
            for(String tableNamei:tableNameArr){
                File tempFile = new File(StringIndex.substringRegExpRight(daoPath,"/",2)+"/"+entityName+"/"+tableNamei+".java");
                if(tempFile!=null){
                    tempFile.delete();
                }
            }
            //删除指定的mapper.xml
            for(String tableNamei:tableNameArr){
                File tempFile = new File(resourcesPath+"/"+"mapper"+"/"+tableNamei+daoLastName+".xml");
                if(tempFile!=null){
                    tempFile.delete();
                }
            }
        }
//        else {
//            for (String tablej:tableNameArr) {
//                //判断要修改的实体，是否已生成
//                for (String mapperi:mapperFileStrArr) {
//                    if ((tablej.toLowerCase() + daoLastName.toLowerCase() + ".java").equals(mapperi.toLowerCase())) {
//                        flag = true;
//                        break;
//                    }
//                }
//                if(!flag){
//                    tableList.add(tablej);
//                }
//                else {
//                    flag = false;
//                }
//            }
//            StringBuffer stringBuffer = new StringBuffer();
//            String tableStr = null;
//            for (int i = 0; i <tableList.size() ; i++) {
//                tableObj = tableObj.replaceAll("schema=\"\\S+\" ", "schema=\""+projectName+"\" ");
//                tableObj = tableObj.replaceAll("tableName=\"\\S+\"", "tableName=\""+tableList.get(i)+"\"");
//                tableStr = tableList.get(i).substring(0,1).toUpperCase()+tableList.get(i).substring(1);//截取第一个大写，再拼接，再替换
//                tableObj = tableObj.replaceAll("domainObjectName=\"\\S+\" ", "domainObjectName=\""+tableStr+"\" ");
//                stringBuffer.append("\n"+tableObj);
//            }
//        }
        StringBuffer stringBuffer = new StringBuffer();
        String tableStr = null;
        for (int i = 0; i <tableNameArr.length ; i++) {
            tableObj = tableObj.replaceAll("schema=\"\\S+\" ", "schema=\""+projectName+"\" ");
            tableObj = tableObj.replaceAll("tableName=\"\\S+\"", "tableName=\""+tableNameArr[i]+"\"");
            tableStr = tableNameArr[i].substring(0,1).toUpperCase()+tableNameArr[i].substring(1);//截取第一个大写，再拼接，再替换
            tableObj = tableObj.replaceAll("domainObjectName=\"\\S+\" ", "domainObjectName=\""+tableStr+"\" ");
            stringBuffer.append("\n"+tableObj);
        }
        System.out.println("stringBuffer"+stringBuffer);

        //FileInputStream fileInputStream = null;
        //FileOutputStream fileOutputStream = null;
        //BufferedInputStream bufferedInputStream = null;
        //BufferedOutputStream bufferedOutputStream = null;
        //不能用字节流，因为要文本替换
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        //D:\workspace\idea\guo\zufang\src\main\resources\mybatisGenerator\generator.xml
        File generatorFile = new File(generatorPath+"generator.xml");
        StringBuffer generatorXml = new StringBuffer();
        try {
            fileReader = new FileReader(generatorFile);
            bufferedReader = new BufferedReader(fileReader);
            int unicode = bufferedReader.read();
            while (unicode!=-1){
                generatorXml.append((char)unicode);
                unicode = bufferedReader.read();
            }
            String generatorXmlStr = generatorXml.toString();
            generatorXmlStr = generatorXmlStr.replaceAll("location=\"[\\u4e00-\\u9fa5\\w\\.-:-/\\\\]+\\.jar\"","location=\""+jarLocation+"\"");
            generatorXmlStr = generatorXmlStr.replaceAll("driverClass=\"[\\w\\.]+Driver","driverClass=\""+driverClass);
            generatorXmlStr = generatorXmlStr.replaceAll("connectionURL=\"[\\w\\.-_:=/\\\\]+\" userId","connectionURL=\""+connectionURL+"\" userId");
            generatorXmlStr = generatorXmlStr.replaceAll("<javaModelGenerator[\\s]+targetPackage=\"[\\w\\./]*+\"[\\s]+targetProject=\"[\\u4e00-\\u9fa5\\w\\.-_:/\\\\]+\">","<javaModelGenerator targetPackage=\""+javaModelGenerator+"\" targetProject=\""+javaTargetProject+"\">");
            generatorXmlStr = generatorXmlStr.replaceAll("<sqlMapGenerator[\\s]+targetPackage=\"[\\w\\./]*+\"[\\s]+targetProject=\"[\\u4e00-\\u9fa5\\w\\.-_:/\\\\]+\">","<sqlMapGenerator targetPackage=\""+sqlMapGenerator+"\" targetProject=\""+sqlTargetProject+"\">");
            generatorXmlStr = generatorXmlStr.replaceAll("<javaClientGenerator[\\s]+targetPackage=\"[\\w\\./]*+\"[\\s]+targetProject=\"[\\u4e00-\\u9fa5\\w\\.-_:/\\\\]+\" type=\"XMLMAPPER\">","<javaClientGenerator targetPackage=\""+clientGenerator+"\" targetProject=\""+clientTargetProject+"\" type=\"XMLMAPPER\">");
            generatorXmlStr = generatorXmlStr.replaceAll("<table[\\s\\w=\">]+</table>","");
            generatorXmlStr = generatorXmlStr.replaceAll("javaClientGenerator>\\s+","javaClientGenerator>\n"+stringBuffer.toString()+"\n");
            //System.out.println("-----generatorXmlStr:"+generatorXmlStr);
            fileWriter = new FileWriter(generatorFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(generatorXmlStr);
            fileWriter.flush();
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();

            File runFile = new File(generatorPath+"run.bat");
            fileReader=new FileReader(runFile);
            bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBufferRun = new StringBuffer();
            int unicode2 = bufferedReader.read();
            while (unicode2!=-1){
                stringBufferRun.append((char)unicode2);
                unicode2=bufferedReader.read();
            }
            String runBatStr = stringBufferRun.toString();
            runBatStr = runBatStr.replaceAll("java[\\s\\w-\\.:/\n]*-overwrite[\\sa-z\n]*","java -jar "+generatorPath+jarMybatis+" -configfile "+generatorPath+"generator.xml -overwrite\nexit");
            System.out.println("-----runBatStr:"+runBatStr);
            fileWriter = new FileWriter(runFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(runBatStr);
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //调用自动生成器run.bat,也可以调用.exe,cmd后直接写路径，不要加前缀参数
    public void runbat(){
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            //cmd 中有特殊符号时，使用exec(String[] arr);
//            InputStream inputStream = process.getInputStream();
//            int c=inputStream.read();
//            StringBuffer stringBuffer = new StringBuffer();
//            while (c!=-1){//这个会挂起，不能执行后面的代码,等待命令？
//                stringBuffer.append((char)c);
//                c = inputStream.read();
//            }
//            System.out.println("-----cmdRun:");
//            inputStream.close();
//            process.waitFor();//要在这之前读取文件流,
        } catch (IOException e) {
            e.printStackTrace();
        }
        //执行java *.jar提示没有主体清单属性，pom.xml增加以下内容？可有可无！自己引用的mybatis.jar错了。
//        <plugin>
//          <groupId>org.springframework.boot</groupId>
//          <artifactId>spring-boot-maven-plugin</artifactId>
//        </plugin>
    }
    //dao生成iservice,
    public void mapperToIService(Object... tableNames){
        if(tableName==null){
            if(tableNames[0]!=null){
                setTableName(tableNames[0].toString());
            }
        }
        if(tableNameArr==null){
            tableNameArr = new String[tableNames.length];
            for (int i = 0; i <tableNames.length ; i++) {
                tableNameArr[i]=StringIndex.upFirstWord(tableNames[i].toString());
            }
        }
        File daoFolderFile = new File(daoPath);
        //File iServiceFolderFile = new File(daoPath.substring(0,daoPath.length()-4) + "\\service");
        File iServiceFolderFile = new File(iServicePath);
        iServiceFolderFile.mkdirs();
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        StringBuffer stringBuffer = null;
        String[] mapperFileStrArr = daoFolderFile.list();/*返回所有的文件名*///TesttypeMapper.java,
        System.out.println("-----mapperFileStrArr:"+ Arrays.toString(mapperFileStrArr));
        boolean flag = false;
        for (int j = 0; j <tableNameArr.length; j++) {
            for (int i = 0; i <mapperFileStrArr.length ; i++) {
                if((tableNameArr[j].toLowerCase()+daoLastName.toLowerCase()+".java").equals(mapperFileStrArr[i].toLowerCase())){
                    try {
                        flag = true;
                        tableName=tableNameArr[j];
                        File mapperFile = new File(daoFolderFile.getCanonicalPath() + "\\" + mapperFileStrArr[i]);//daoFolderFile.getCanonicalPath()=dapPath
                        if(mapperFile.isFile()){
                            System.out.println("mapperFile是文件不是文件夹");
                            fileReader = new FileReader(mapperFile);
                            bufferedReader = new BufferedReader(fileReader);
                            stringBuffer = new StringBuffer();
                            //String str = bufferedReader.readLine();/*使用行读取，后面的操作也必须全以行来操作*/
                            int unicode = bufferedReader.read();//读入硬盘文件里的一个字符，返回unicode编码。读取到末尾返回-1。
                            while (unicode != -1) {
                                stringBuffer.append((char) unicode);
                                //System.out.println(stringBuffer);//可以用%c输出数字对应的字符(System.out.printf("c%",num))
                                unicode = bufferedReader.read();//读取文件的下一个字符。
                            }

                            File iServiceFile = null;
                            String daoStr = stringBuffer.toString();
                            String importStr = "import org.springframework.stereotype.Repository;";
                            String repositoryStr = "@Repository";
                            //修改daoStr
                            daoStr = daoStr.replaceAll("\\s*public","\n"+importStr+"\n\n"+repositoryStr+"\npublic");
                            fileWriter = new FileWriter(mapperFile);
                            bufferedWriter = new BufferedWriter(fileWriter);
                            bufferedWriter.write(daoStr);
                            bufferedWriter.flush();
                            fileWriter.flush();

                            //---------------------------dao生成iservice,这里执行相关的替换----------------------------
                            //tableName = mapperFileStrArr[i].substring(0,mapperFileStrArr[i].length()-11);
                            //setTableName(tableName);
                            //tableName = this.tableName;

                            //替换dao中的内容
                            daoStr = daoStr.replaceAll(tableName+ daoLastName,"I"+tableName+"Service");
                            daoStr = daoStr.replaceAll(daoFolderName,iServiceFolderName);
                            int indexImport = daoStr.indexOf(importStr);
                            int indexRep = daoStr.indexOf(repositoryStr);
                            if(daoStr.contains(importStr)){
                                daoStr=daoStr.replaceAll("\\s*"+importStr+"\\s*","\n");
                            }
                            if(daoStr.contains(repositoryStr)){
                                daoStr=daoStr.replaceAll("\\s*"+repositoryStr,"\n");
                            }
                            stringBuffer= new StringBuffer(daoStr);

                            //--------------------------这里执行相关的替换----------------------------
                            //iServiceFile = new File(daoPath.substring(0,daoPath.length()-4) + "\\service\\" + "I"+tableName+"Service.java");
                            iServiceFile = new File(iServicePath + "\\" + "I"+tableName+"Service.java");
                            System.out.println("-----iServiceFile:"+iServiceFile.toString());
                            fileWriter = new FileWriter(iServiceFile);
                            bufferedWriter = new BufferedWriter(fileWriter);
                            bufferedWriter.write(daoStr);//自带创建文件功能，但不能创建文件夹
                            bufferedWriter.flush();
                            fileWriter.flush();
                        }
                        else {
                            System.out.println("mapperFile是文件夹不是文件");
                        }
                        break;
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if(!flag){
                System.out.println("指定的dao文件不存在");
            }
            else {
                flag = false;
            }
        }
        try{
            if(bufferedWriter!=null){
                bufferedWriter.close();
            }
            if(fileWriter!=null){
                fileWriter.close();
            }
            if(bufferedReader!=null){
                bufferedReader.close();
            }
            if(fileReader!=null){
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //iservice生成service
    public void iServiceToService(Object... tableNames){
        if(tableName==null){
            if(tableNames[0]!=null){
                setTableName(tableNames[0].toString());
            }
        }
        if(tableNameArr==null){
            tableNameArr = new String[tableNames.length];
            for (int i = 0; i <tableNames.length ; i++) {
                tableNameArr[i]=StringIndex.upFirstWord(tableNames[i].toString());
            }
        }
        File iServiceFolderFile = new File(iServicePath);
        File serviceFolderFile = new File(servicePath);
        serviceFolderFile.mkdirs();
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        StringBuffer stringBuffer = null;
        String[] iServiceFileStrArr = iServiceFolderFile.list();/*返回所有的文件名*/
        //File[] fileList = file.listFiles();//返回所有的文件对象    //getName()获取文件名
        System.out.println("-----iServiceFileStrArr:"+ Arrays.toString(iServiceFileStrArr));
        boolean flag = false;
        for (int j = 0; j <tableNameArr.length ; j++) {
            for (int i = 0; i < iServiceFileStrArr.length; i++) {
                if(("i"+tableNameArr[j].toLowerCase()+"service.java").equals(iServiceFileStrArr[i].toLowerCase())){
                    try {
                        flag = true;
                        tableName=tableNameArr[j];
                        File iServiceFile = new File(iServiceFolderFile.getCanonicalPath() + "\\" + iServiceFileStrArr[i]);
                        if (iServiceFile.isFile()) {//判断是否是文件
                            System.out.println("-----这是文件:" + iServiceFileStrArr[i]);
                            //读入文件
                            fileReader = new FileReader(iServiceFile);
                            bufferedReader = new BufferedReader(fileReader);
                            stringBuffer = new StringBuffer();
                            //String str = bufferedReader.readLine();/*使用行读取，后面的操作也必须全以行来操作*/
                            int unicode = bufferedReader.read();//读入硬盘文件里的一个字符，返回unicode编码。读取到末尾返回-1。
                            while (unicode != -1) {
                                stringBuffer.append((char) unicode);
                                //System.out.println(stringBuffer);//可以用%c输出数字对应的字符(System.out.printf("c%",num))
                                unicode = bufferedReader.read();//读取文件的下一个字符。
                            }
                            int indexLong = stringBuffer.toString().indexOf("Long");
                            int indexInteger = stringBuffer.toString().indexOf("Integer");
                            int indexBlob = stringBuffer.toString().indexOf("WithBLOBs");
                            //---------------------------这里执行相关的替换----------------------------
                            //tableName =iServiceFileStrArr[i].substring(0,iServiceFileStrArr[i].length()-12).substring(1);
                            //setTableName(tableName);
                            //tableName = this.tableName;
                            File serviceFile = null;
                            //String string = ServiceModel.servieReplace(tableName);
                            String string = servieReplace(tableName);
                            if(indexLong>0){
                                string = string.replaceAll("Integer","Long");
                            }
                            if(indexInteger<0&&indexLong<0){
                                string = string.replaceAll("Integer","String");
                            }
                            //如果iservice中有updateByPrimaryKeyWithBLOBs，则在impl中也增加
                            if(indexBlob>0){
                                int indexWithBLOBs = StringIndex.patternIndexOf(string,"WithBLOBs");
                                if(indexWithBLOBs>0){
                                    String addStr = "    @Override\n" +
                                            "    public int updateByPrimaryKeyWithBLOBs("+tableName+" "+StringIndex.lowerFirstWord(tableName)+") {\n" +
                                            "        return "+StringIndex.lowerFirstWord(tableName)+daoLastName+".updateByPrimaryKeyWithBLOBs("+StringIndex.lowerFirstWord(tableName)+");\n" +
                                            "    }\n";
                                    string = string.replaceAll("//WithBLOBs\n",addStr);
                                }
                            }
                            stringBuffer = new StringBuffer(string);
                            System.out.println("-----iServiceFileStrArr[i]:"+iServiceFileStrArr[i]);
                            System.out.println("-----tableName:"+tableName);//Testtype
                            System.out.println("-----stringBuffer:\n"+stringBuffer);
                            //---------------------------这里执行相关的替换----------------------------
                            //输出文件
                            serviceFile = new File(iServiceFolderFile.getCanonicalPath() + "\\"+serviceFolderName+"\\" + tableName+"Service.java");
                            System.out.println("-----serviceFile:"+serviceFile.toString());
                            fileWriter = new FileWriter(serviceFile);
                            bufferedWriter = new BufferedWriter(fileWriter);
                            bufferedWriter.write(stringBuffer.toString());//自带创建文件功能，但不能创建文件夹

                            bufferedWriter.flush();
                            fileWriter.flush();
                        }
                        if (iServiceFile.isDirectory()) {
                            System.out.println("-----这是文件夹:" + iServiceFileStrArr[i]);
                        }
                        break;
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if(!flag){
                System.out.println("指定的iService文件不存在");
            }
            else {
                flag = false;
            }
        }
        try {
            if(bufferedWriter!=null){
                bufferedWriter.close();
            }
            if(fileWriter!=null){
                fileWriter.close();
            }
            if(bufferedReader!=null){
                bufferedReader.close();
            }
            if(fileReader!=null){
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //replaceModel
    public String  servieReplace(String tableName){
        setTableName(tableName);
        tableName = this.tableName;
        String string = "package "+comName+"."+iServiceFolderName+"."+serviceFolderName+";\n" +
                "\n" +
                "import "+comName+"."+daoFolderName+".Manager"+ daoLastName +";\n" +
                "import "+comName+"."+entityName+".Manager;\n" +
                "import "+comName+"."+iServiceFolderName+".IManagerService;\n" +
                "import org.mybatis.spring.annotation.MapperScan;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.stereotype.Service;\n" +
                "import org.springframework.transaction.annotation.Transactional;\n" +
                "\n" +
                "@Transactional\n" +
                "@MapperScan(basePackages = \""+comName+"."+daoFolderName+"\")\n" +
                "@Service(\"managerService\")\n" +
                "public class ManagerService implements  IManagerService{\n" +
                "    @Autowired\n" +
                "    private ManagerMapper managerMapper;\n" +
                "    @Override\n" +
                "    public int deleteByPrimaryKey(Integer mid) {\n" +
                "\n" +
                "        return managerMapper.deleteByPrimaryKey(mid);\n" +
                "    }\n" +
                "    @Override\n" +
                "    public int insert(Manager manager) {\n" +
                "\n" +
                "        return managerMapper.insert(manager);\n" +
                "    }\n" +
                "    @Override\n" +
                "    public int insertSelective(Manager manager) {\n" +
                "        return managerMapper.insertSelective(manager);\n" +
                "    }\n" +
                "    @Override\n" +
                "    public Manager selectByPrimaryKey(Integer mid) {\n" +
                "        return managerMapper.selectByPrimaryKey(mid);\n" +
                "    }\n" +
                "    @Override\n" +
                "    public int updateByPrimaryKeySelective(Manager manager) {\n" +
                "        return managerMapper.updateByPrimaryKeySelective(manager);\n" +
                "    }\n" +
                "    @Override\n" +
                "    public int updateByPrimaryKey(Manager manager) {\n" +
                "        return managerMapper.updateByPrimaryKey(manager);\n" +
                "    }\n" +
                "//WithBLOBs\n"+
                "}\n";
        StringBuffer stringBuffer = new StringBuffer(string);

        String oldTableName = "Manager";//截取ManagerService中的Manager
        String strServiceBack = "";//要返回的已被替换的文件内容
        String oldTableNameLowerCase = oldTableName.toLowerCase();
        String tableNameToLowerCase = tableName.toLowerCase();/*小写*/
//        String objectBeanService = objectToLowerCase+"Service";
//        String objectClassService = object+"Service";
//        String objectInterfaceService = "I"+tableName+"Service";
        String oldTableNameMapper = oldTableName+ daoLastName;
        String oldTableNamemapper = oldTableNameLowerCase+ daoLastName;
        String objectMapper = tableName+ daoLastName;
        String objectmapper = tableNameToLowerCase+ daoLastName;
        String strServiceRead = stringBuffer.toString();//读取的文件的内容
//        String strServiceReadid = strServiceRead.substring(0,1)+"id";
        String objectId = tableNameToLowerCase.substring(0,1)+"id";
        int index = strServiceRead.indexOf("private");
        if(index==-1){
            int index2 = strServiceRead.indexOf("Service {");
            strServiceRead = strServiceRead.substring(0,index2+9)+"\n\t@Autowired\n\tprivate "+objectMapper+" "+objectmapper+";"+strServiceRead.substring(index2+9);
            strServiceRead = strServiceRead.replaceAll(comName+"."+daoFolderName+".\\S+;",comName+"."+daoFolderName+".*;\n");
            strServiceRead = strServiceRead.replaceAll(comName+"."+entityName+".\\S+;\n",comName+"."+entityName+".*;\n");
            strServiceRead = strServiceRead.replaceAll("import "+comName+"."+iServiceFolderName+".\\S+;\n","import "+comName+"."+iServiceFolderName+".*;\n");
            strServiceRead = strServiceRead.replaceAll("@Service(\"\\S*\")","@Service(\""+tableNameToLowerCase+"Service\")");
            strServiceRead = strServiceRead.replaceAll("public class \\S+ implements \\S+Service","public class "+tableName+"Service implements"+" I"+tableName+"Service");
            strServiceRead = strServiceRead.replaceAll("private \\S+ \\S+;","private "+objectMapper+" "+objectmapper+";");
            strServiceRead = strServiceRead.replaceAll(" \\S*id\\)\\s*\\{"," "+objectId+") {");
            strServiceRead = strServiceRead.replaceAll("\\(\\S*id\\)","("+objectId+")");
            strServiceRead = strServiceRead.replaceAll("return \\S*"+daoLastName+".","return "+objectmapper+".");
            strServiceRead = strServiceRead.replaceAll("return \\S*Dao.","return "+objectmapper+".");
            strServiceRead = strServiceRead.replaceAll("return 0;","return "+objectmapper+".;");
            strServiceRead = strServiceRead.replaceAll("return null;","return "+objectmapper+".;");
            strServiceRead = strServiceRead.replaceAll(oldTableNameMapper,objectMapper);
            strServiceRead = strServiceRead.replaceAll(oldTableNamemapper,objectmapper);
            strServiceRead = strServiceRead.replaceAll(oldTableName,tableName);
            strServiceBack = strServiceRead.replaceAll(oldTableNameLowerCase,tableNameToLowerCase);
//            System.out.println("strServiceBack:\n"+strServiceBack);
        }
        else {
            strServiceRead = strServiceRead.replaceAll(comName+"."+daoFolderName+".\\S+;",comName+"."+daoFolderName+".*;\n");
            strServiceRead = strServiceRead.replaceAll(comName+"."+entityName+".\\S+;\n",comName+"."+entityName+".*;\n");
            strServiceRead = strServiceRead.replaceAll("import "+comName+"."+iServiceFolderName+".\\S+;\n","import "+comName+"."+iServiceFolderName+".*;\n");
            strServiceRead = strServiceRead.replaceAll("@Service(\"\\S*\")","@Service(\""+tableNameToLowerCase+"Service\")");
            strServiceRead = strServiceRead.replaceAll("public class \\S+ implements \\S+Service","public class "+tableName+"Service implements"+" I"+tableName+"Service");
            strServiceRead = strServiceRead.replaceAll("private \\S+ \\S+;","private "+objectMapper+" "+objectmapper+";");
            strServiceRead = strServiceRead.replaceAll(" \\S*id\\)\\s*\\{"," "+objectId+") {");
            strServiceRead = strServiceRead.replaceAll("\\(\\S*id\\)","("+objectId+")");
            strServiceRead = strServiceRead.replaceAll("return \\S*"+daoLastName+".","return "+objectmapper+".");
            strServiceRead = strServiceRead.replaceAll("return \\S*Dao.","return "+objectmapper+".");
            strServiceRead = strServiceRead.replaceAll("return 0;","return "+objectmapper+".;");
            strServiceRead = strServiceRead.replaceAll("return null;","return "+objectmapper+".;");
            strServiceRead = strServiceRead.replaceAll(oldTableNameMapper,objectMapper);
            strServiceRead = strServiceRead.replaceAll(oldTableNamemapper,objectmapper);
            strServiceRead = strServiceRead.replaceAll(oldTableName,tableName);
            strServiceBack = strServiceRead.replaceAll(oldTableNameLowerCase,tableNameToLowerCase);
//            System.out.println("strServiceBack:\n"+strServiceBack);
        }
        return strServiceBack;
    }
    //依次调用所需步骤的方法
    public void runFun(){
        if(flagDel){
            generator();//生成配置文件,每次的table不一样，所以每次都要生成
            runbat();//重新生成实体类
        }
        try {
            Thread.sleep(1000);//程序更新需要时间？使用join()无效！否则mapperFileStrArr获取不到generator()删除的daoMapper.java
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mapperToIService();
        iServiceToService();
    }
    public static void main(String[] args){
        //手动配置好application.properties
        //String daoFolderName,String daoLastName,String serviceFolderName,Object... tableNames
        String tableStr="t_decisemanagetable";
        //执行前，必须先生成target,否则无法获取路径
        OneUpdate oneUpdate = new OneUpdate("application.properties","mysql-connector-java-5.1.20.jar", "dao","Mapper", "service","impl",true,tableStr);
//        oneUpdate.mapperToIService();
//        oneUpdate.iServiceToService();
        oneUpdate.runFun();//最后输出-----serviceFile，表示运行成功
    }
}
