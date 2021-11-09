package guo.service;

import guo.entity.T_weapon_gun_info;

import java.util.List;

public interface IT_weapon_gun_infoService {
    int deleteByPrimaryKey(Integer wInfoId);

    int insert(T_weapon_gun_info record);

    int insertSelective(T_weapon_gun_info record);

    T_weapon_gun_info selectByPrimaryKey(Integer wInfoId);

    int updateByPrimaryKeySelective(T_weapon_gun_info record);

    int updateByPrimaryKey(T_weapon_gun_info record);

    List<T_weapon_gun_info> selectAll();
}