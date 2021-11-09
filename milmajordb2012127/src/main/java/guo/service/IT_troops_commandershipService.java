package guo.service;

import guo.entity.T_troops_commandership;

import java.util.List;

public interface IT_troops_commandershipService {
    int deleteByPrimaryKey(Integer commandershipId);

    int insert(T_troops_commandership record);

    int insertSelective(T_troops_commandership record);

    T_troops_commandership selectByPrimaryKey(Integer commandershipId);

    int updateByPrimaryKeySelective(T_troops_commandership record);

    int updateByPrimaryKey(T_troops_commandership record);

    List<T_troops_commandership> selectAll();
}