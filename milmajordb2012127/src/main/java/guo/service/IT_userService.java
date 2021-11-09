package guo.service;

import guo.entity.T_user;

public interface IT_userService {
    int deleteByPrimaryKey(Integer uid);

    int insert(T_user record);

    int insertSelective(T_user record);

    T_user selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(T_user record);

    int updateByPrimaryKey(T_user record);

    T_user login(String username, String password);

    T_user selectByUserName(String username);
    int updateByUserName(T_user t_user);
    int deleteByUserName(String username);
}