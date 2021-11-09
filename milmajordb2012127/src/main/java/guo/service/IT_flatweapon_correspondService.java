package guo.service;

import guo.entity.T_flatweapon_correspond;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IT_flatweapon_correspondService {
    int deleteByPrimaryKey(@Param("wFlatId") Integer wFlatId, @Param("wWeaponId") Integer wWeaponId);

    int insert(T_flatweapon_correspond record);

    int insertSelective(T_flatweapon_correspond record);

    List<T_flatweapon_correspond> selectByPrimaryKey(@Param("wFlatId") Integer wFlatId, @Param("wWeaponId") Integer wWeaponId);

    int updateByPrimaryKeySelective(T_flatweapon_correspond record);

    int updateByPrimaryKey(T_flatweapon_correspond record);
}