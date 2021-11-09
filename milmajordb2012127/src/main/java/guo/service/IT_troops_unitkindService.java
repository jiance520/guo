package guo.service;

import guo.entity.T_troops_unitkind;

import java.util.List;

public interface IT_troops_unitkindService {
    int deleteByPrimaryKey(Integer unitkindId);

    int insert(T_troops_unitkind record);

    int insertSelective(T_troops_unitkind record);

    T_troops_unitkind selectByPrimaryKey(Integer unitkindId);

    int updateByPrimaryKeySelective(T_troops_unitkind record);

    int updateByPrimaryKey(T_troops_unitkind record);

    List<T_troops_unitkind> selectAll();
}