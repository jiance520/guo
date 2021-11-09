package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("t_trajectory_dataService")
public class T_trajectory_dataService implements  IT_trajectory_dataService{
    @Autowired
    private T_trajectory_dataMapper t_trajectory_dataMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_trajectory_dataMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_trajectory_data t_trajectory_data) {

        return t_trajectory_dataMapper.insert(t_trajectory_data);
    }
    @Override
    public int insertSelective(T_trajectory_data t_trajectory_data) {
        return t_trajectory_dataMapper.insertSelective(t_trajectory_data);
    }
    @Override
    public T_trajectory_data selectByPrimaryKey(Integer tid) {
        return t_trajectory_dataMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_trajectory_data t_trajectory_data) {
        return t_trajectory_dataMapper.updateByPrimaryKeySelective(t_trajectory_data);
    }
    @Override
    public int updateByPrimaryKey(T_trajectory_data t_trajectory_data) {
        return t_trajectory_dataMapper.updateByPrimaryKey(t_trajectory_data);
    }

    @Override
    public List<T_trajectory_data> selectAll() {
        return t_trajectory_dataMapper.selectAll();
    }
//WithBLOBs
}
