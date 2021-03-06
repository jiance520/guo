package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("userinfoService")
public class UserinfoService implements  IUserinfoService{
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public int deleteByPrimaryKey(String uid) {

        return userinfoMapper.deleteByPrimaryKey(uid);
    }
    @Override
    public int insert(Userinfo userinfo) {

        return userinfoMapper.insert(userinfo);
    }
    @Override
    public int insertSelective(Userinfo userinfo) {
        return userinfoMapper.insertSelective(userinfo);
    }
    @Override
    public Userinfo selectByPrimaryKey(String uid) {
        return userinfoMapper.selectByPrimaryKey(uid);
    }
    @Override
    public int updateByPrimaryKeySelective(Userinfo userinfo) {
        return userinfoMapper.updateByPrimaryKeySelective(userinfo);
    }
    @Override
    public int updateByPrimaryKey(Userinfo userinfo) {
        return userinfoMapper.updateByPrimaryKey(userinfo);
    }

    @Override
    public Userinfo selectLogin(Map map) {
        return userinfoMapper.selectLogin(map);
    }
}
