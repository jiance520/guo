package guo.service;

import guo.entity.T_trajectory_data;

import java.util.List;

public interface IT_trajectory_dataService {
    int deleteByPrimaryKey(Integer id);

    int insert(T_trajectory_data record);

    int insertSelective(T_trajectory_data record);

    T_trajectory_data selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_trajectory_data record);

    int updateByPrimaryKey(T_trajectory_data record);

    List<T_trajectory_data> selectAll();
}