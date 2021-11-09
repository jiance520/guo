package guo.dao;

import guo.entity.T_trajectory_data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_trajectory_dataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(T_trajectory_data record);

    int insertSelective(T_trajectory_data record);

    T_trajectory_data selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_trajectory_data record);

    int updateByPrimaryKey(T_trajectory_data record);

    List<T_trajectory_data> selectAll();
}