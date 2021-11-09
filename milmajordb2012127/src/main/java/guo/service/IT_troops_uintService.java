package guo.service;

import guo.entity.T_troops_uint;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IT_troops_uintService {
    int deleteByPrimaryKey(@Param("unitId") Integer unitId, @Param("buId") Integer buId, @Param("unitChildId") Integer unitChildId, @Param("unitChildOrder") Integer unitChildOrder);

    int insert(T_troops_uint record);

    int insertSelective(T_troops_uint record);

    List<T_troops_uint> selectByPrimaryKey(@Param("unitId") Integer unitId, @Param("buId") Integer buId, @Param("unitChildId") Integer unitChildId, @Param("unitChildOrder") Integer unitChildOrder);

    int updateByPrimaryKeySelective(T_troops_uint record);

    int updateByPrimaryKey(T_troops_uint record);
}