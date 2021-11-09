package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("t_troops_basic_uintService")
public class T_troops_basic_uintService implements  IT_troops_basic_uintService{
    @Autowired
    private T_troops_basic_uintMapper t_troops_basic_uintMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_troops_basic_uintMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_troops_basic_uint t_troops_basic_uint) {

        return t_troops_basic_uintMapper.insert(t_troops_basic_uint);
    }
    @Override
    public int insertSelective(T_troops_basic_uint t_troops_basic_uint) {
        return t_troops_basic_uintMapper.insertSelective(t_troops_basic_uint);
    }
    @Override
    public T_troops_basic_uint selectByPrimaryKey(Integer tid) {
        return t_troops_basic_uintMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_basic_uint t_troops_basic_uint) {
        return t_troops_basic_uintMapper.updateByPrimaryKeySelective(t_troops_basic_uint);
    }
    @Override
    public int updateByPrimaryKey(T_troops_basic_uint t_troops_basic_uint) {
        return t_troops_basic_uintMapper.updateByPrimaryKey(t_troops_basic_uint);
    }

    @Override
    public List<T_troops_basic_uint> selectAll(Map map) {
        return t_troops_basic_uintMapper.selectAll(map);
    }
//WithBLOBs
}
