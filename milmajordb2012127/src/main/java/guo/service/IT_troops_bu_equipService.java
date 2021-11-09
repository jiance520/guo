package guo.service;

import guo.entity.T_troops_bu_equip;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface IT_troops_bu_equipService {
    int deleteByPrimaryKey(@Param("buId") Integer buId, @Param("buEquipId") Integer buEquipId);

    int insert(T_troops_bu_equip record);

    int insertSelective(T_troops_bu_equip record);

    List<T_troops_bu_equip> selectByPrimaryKey(@Param("buId") Integer buId, @Param("buEquipId") Integer buEquipId);

    int updateByPrimaryKeySelective(T_troops_bu_equip record);

    int updateByPrimaryKey(T_troops_bu_equip record);
}