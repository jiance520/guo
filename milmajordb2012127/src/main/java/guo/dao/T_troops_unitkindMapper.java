package guo.dao;

import guo.entity.T_troops_unitkind;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_troops_unitkindMapper {
    int deleteByPrimaryKey(Integer unitkindId);

    int insert(T_troops_unitkind record);

    int insertSelective(T_troops_unitkind record);

    T_troops_unitkind selectByPrimaryKey(Integer unitkindId);

    int updateByPrimaryKeySelective(T_troops_unitkind record);

    int updateByPrimaryKey(T_troops_unitkind record);

    List<T_troops_unitkind> selectAll();
}