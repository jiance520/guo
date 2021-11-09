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
@Service("t_gun_shootstraight_tableService")
public class T_gun_shootstraight_tableService implements  IT_gun_shootstraight_tableService{
    @Autowired
    private T_gun_shootstraight_tableMapper t_gun_shootstraight_tableMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_gun_shootstraight_tableMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_gun_shootstraight_table t_gun_shootstraight_table) {

        return t_gun_shootstraight_tableMapper.insert(t_gun_shootstraight_table);
    }
    @Override
    public int insertSelective(T_gun_shootstraight_table t_gun_shootstraight_table) {
        return t_gun_shootstraight_tableMapper.insertSelective(t_gun_shootstraight_table);
    }
    @Override
    public T_gun_shootstraight_table selectByPrimaryKey(Integer tid) {
        return t_gun_shootstraight_tableMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_gun_shootstraight_table t_gun_shootstraight_table) {
        return t_gun_shootstraight_tableMapper.updateByPrimaryKeySelective(t_gun_shootstraight_table);
    }
    @Override
    public int updateByPrimaryKey(T_gun_shootstraight_table t_gun_shootstraight_table) {
        return t_gun_shootstraight_tableMapper.updateByPrimaryKey(t_gun_shootstraight_table);
    }

    @Override
    public List<T_gun_shootstraight_table> selectAll() {
        return t_gun_shootstraight_tableMapper.selectAll();
    }
//WithBLOBs
}
