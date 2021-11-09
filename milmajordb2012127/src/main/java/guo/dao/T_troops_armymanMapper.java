package guo.dao;

import guo.entity.T_troops_armyman;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_troops_armymanMapper {
    int deleteByPrimaryKey(Integer armymanId);

    int insert(T_troops_armyman record);

    int insertSelective(T_troops_armyman record);

    T_troops_armyman selectByPrimaryKey(Integer armymanId);

    int updateByPrimaryKeySelective(T_troops_armyman record);

    int updateByPrimaryKey(T_troops_armyman record);

    List<T_troops_armyman> selectAll();
}