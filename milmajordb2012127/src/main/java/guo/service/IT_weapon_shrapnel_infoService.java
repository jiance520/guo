package guo.service;

import guo.entity.T_weapon_shrapnel_info;

import java.util.List;

public interface IT_weapon_shrapnel_infoService {
    int deleteByPrimaryKey(Integer wInfoId);

    int insert(T_weapon_shrapnel_info record);

    int insertSelective(T_weapon_shrapnel_info record);

    T_weapon_shrapnel_info selectByPrimaryKey(Integer wInfoId);

    int updateByPrimaryKeySelective(T_weapon_shrapnel_info record);

    int updateByPrimaryKey(T_weapon_shrapnel_info record);

    List<T_weapon_shrapnel_info> selectAll();
}