package guo.service;

import guo.entity.T_flatequip_correspond;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IT_flatequip_correspondService {
    int deleteByPrimaryKey(@Param("wFlatId") Integer wFlatId, @Param("wEquipId") Integer wEquipId);

    int insert(T_flatequip_correspond record);

    int insertSelective(T_flatequip_correspond record);

    List<T_flatequip_correspond> selectByPrimaryKey(@Param("wFlatId") Integer wFlatId, @Param("wEquipId") Integer wEquipId);

    int updateByPrimaryKeySelective(T_flatequip_correspond record);

    int updateByPrimaryKey(T_flatequip_correspond record);
}