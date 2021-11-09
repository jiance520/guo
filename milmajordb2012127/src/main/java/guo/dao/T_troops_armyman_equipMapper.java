package guo.dao;

import guo.entity.T_troops_armyman_equip;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_troops_armyman_equipMapper {
    int deleteByPrimaryKey(@Param("armymanId") Integer armymanId, @Param("awEquipId") Integer awEquipId);

    int insert(T_troops_armyman_equip record);

    int insertSelective(T_troops_armyman_equip record);

    List<T_troops_armyman_equip> selectByPrimaryKey(@Param("armymanId") Integer armymanId, @Param("awEquipId") Integer awEquipId);

    int updateByPrimaryKeySelective(T_troops_armyman_equip record);

    int updateByPrimaryKey(T_troops_armyman_equip record);
}