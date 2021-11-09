package guo.service;

import guo.entity.T_weapon_blowfire_info;

import java.util.List;

public interface IT_weapon_blowfire_infoService {
    int deleteByPrimaryKey(Integer wInfoId);

    int insert(T_weapon_blowfire_info record);

    int insertSelective(T_weapon_blowfire_info record);

    T_weapon_blowfire_info selectByPrimaryKey(Integer wInfoId);

    int updateByPrimaryKeySelective(T_weapon_blowfire_info record);

    int updateByPrimaryKey(T_weapon_blowfire_info record);

    List<T_weapon_blowfire_info> selectAll();
}