package guo.service;

import guo.entity.T_troops_basic_uint;

import java.util.List;
import java.util.Map;

public interface IT_troops_basic_uintService {
    int deleteByPrimaryKey(Integer buId);

    int insert(T_troops_basic_uint record);

    int insertSelective(T_troops_basic_uint record);

    T_troops_basic_uint selectByPrimaryKey(Integer buId);

    int updateByPrimaryKeySelective(T_troops_basic_uint record);

    int updateByPrimaryKey(T_troops_basic_uint record);

    List<T_troops_basic_uint> selectAll(Map map);
}