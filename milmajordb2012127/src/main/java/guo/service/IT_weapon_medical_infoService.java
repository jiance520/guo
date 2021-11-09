package guo.service;

import guo.entity.T_weapon_medical_info;

import java.util.List;

public interface IT_weapon_medical_infoService {
    int deleteByPrimaryKey(Integer wInfoId);

    int insert(T_weapon_medical_info record);

    int insertSelective(T_weapon_medical_info record);

    T_weapon_medical_info selectByPrimaryKey(Integer wInfoId);

    int updateByPrimaryKeySelective(T_weapon_medical_info record);

    int updateByPrimaryKey(T_weapon_medical_info record);

    List<T_weapon_medical_info> selectAll();
}