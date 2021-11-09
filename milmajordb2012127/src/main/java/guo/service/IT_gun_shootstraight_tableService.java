package guo.service;

import guo.entity.T_gun_shootstraight_table;

import java.util.List;

public interface IT_gun_shootstraight_tableService {
    int deleteByPrimaryKey(Integer serialnumber);

    int insert(T_gun_shootstraight_table record);

    int insertSelective(T_gun_shootstraight_table record);

    T_gun_shootstraight_table selectByPrimaryKey(Integer serialnumber);

    int updateByPrimaryKeySelective(T_gun_shootstraight_table record);

    int updateByPrimaryKey(T_gun_shootstraight_table record);

    List<T_gun_shootstraight_table> selectAll();
}