package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("t_userService")
public class T_userService implements  IT_userService{
    @Autowired
    private T_userMapper t_userMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_userMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_user t_user) {

        return t_userMapper.insert(t_user);
    }
    @Override
    public int insertSelective(T_user t_user) {
        return t_userMapper.insertSelective(t_user);
    }
    @Override
    public T_user selectByPrimaryKey(Integer tid) {
        return t_userMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_user t_user) {
        return t_userMapper.updateByPrimaryKeySelective(t_user);
    }
    @Override
    public int updateByPrimaryKey(T_user t_user) {
        return t_userMapper.updateByPrimaryKey(t_user);
    }

    @Override
    public T_user login(String username, String password) {
        return t_userMapper.login(username, password);
    }

    @Override
    public T_user selectByUserName(String username) {
        return t_userMapper.selectByUserName(username);
    }

    @Override
    public int updateByUserName(T_user t_user) {
        return t_userMapper.updateByUserName(t_user);
    }

    @Override
    public int deleteByUserName(String username) {
        return t_userMapper.deleteByUserName(username);
    }
//WithBLOBs
}
