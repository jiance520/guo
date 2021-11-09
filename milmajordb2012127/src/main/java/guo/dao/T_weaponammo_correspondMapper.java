package guo.dao;

import guo.entity.T_weaponammo_correspond;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_weaponammo_correspondMapper {
    int deleteByPrimaryKey(@Param("wWeaponId") Integer wWeaponId, @Param("wAmmoId") Integer wAmmoId);

    int insert(T_weaponammo_correspond record);

    int insertSelective(T_weaponammo_correspond record);

    List<T_weaponammo_correspond> selectByPrimaryKey(@Param("wWeaponId") Integer wWeaponId, @Param("wAmmoId") Integer wAmmoId);

    int updateByPrimaryKeySelective(T_weaponammo_correspond record);

    int updateByPrimaryKey(T_weaponammo_correspond record);
}