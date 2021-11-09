package guo.service;

import guo.entity.T_weapon_types;

import java.util.List;

public interface IT_weapon_typesService {
    int deleteByPrimaryKey(Integer typeId);

    int insert(T_weapon_types record);

    int insertSelective(T_weapon_types record);

    T_weapon_types selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(T_weapon_types record);

    int updateByPrimaryKey(T_weapon_types record);

    List<T_weapon_types> selectAll();
}