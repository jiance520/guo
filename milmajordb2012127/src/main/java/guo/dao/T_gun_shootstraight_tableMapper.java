package guo.dao;

import guo.entity.T_gun_shootstraight_table;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_gun_shootstraight_tableMapper {
    int deleteByPrimaryKey(Integer serialnumber);

    int insert(T_gun_shootstraight_table record);

    int insertSelective(T_gun_shootstraight_table record);

    T_gun_shootstraight_table selectByPrimaryKey(Integer serialnumber);

    int updateByPrimaryKeySelective(T_gun_shootstraight_table record);

    int updateByPrimaryKey(T_gun_shootstraight_table record);

    List<T_gun_shootstraight_table> selectAll();
}