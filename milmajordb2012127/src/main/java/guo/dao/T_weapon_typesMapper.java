package guo.dao;

import guo.entity.T_weapon_types;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_weapon_typesMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(T_weapon_types record);

    int insertSelective(T_weapon_types record);

    T_weapon_types selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(T_weapon_types record);

    int updateByPrimaryKey(T_weapon_types record);

    List<T_weapon_types> selectAll();
}