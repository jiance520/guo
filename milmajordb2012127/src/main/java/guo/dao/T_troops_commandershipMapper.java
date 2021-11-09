package guo.dao;

import guo.entity.T_troops_commandership;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_troops_commandershipMapper {
    int deleteByPrimaryKey(Integer commandershipId);

    int insert(T_troops_commandership record);

    int insertSelective(T_troops_commandership record);

    T_troops_commandership selectByPrimaryKey(Integer commandershipId);

    int updateByPrimaryKeySelective(T_troops_commandership record);

    int updateByPrimaryKey(T_troops_commandership record);

    List<T_troops_commandership> selectAll();
}