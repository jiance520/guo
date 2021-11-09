package guo.service;

import guo.entity.T_troops_armyman;

import java.util.List;

public interface IT_troops_armymanService {
    int deleteByPrimaryKey(Integer armymanId);

    int insert(T_troops_armyman record);

    int insertSelective(T_troops_armyman record);

    T_troops_armyman selectByPrimaryKey(Integer armymanId);

    int updateByPrimaryKeySelective(T_troops_armyman record);

    int updateByPrimaryKey(T_troops_armyman record);

    List<T_troops_armyman> selectAll();
}