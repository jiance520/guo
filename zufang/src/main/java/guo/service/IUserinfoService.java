package guo.service;

import guo.entity.Userinfo;

import java.util.Map;

public interface IUserinfoService {
    int deleteByPrimaryKey(String userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    Userinfo selectLogin(Map map);
}