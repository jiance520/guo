package guo.dao;

import guo.entity.T_weapon_shrapnel_info;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_weapon_shrapnel_infoMapper {
    int deleteByPrimaryKey(Integer wInfoId);

    int insert(T_weapon_shrapnel_info record);

    int insertSelective(T_weapon_shrapnel_info record);

    T_weapon_shrapnel_info selectByPrimaryKey(Integer wInfoId);

    int updateByPrimaryKeySelective(T_weapon_shrapnel_info record);

    int updateByPrimaryKey(T_weapon_shrapnel_info record);

    List<T_weapon_shrapnel_info> selectAll();
}