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
@Service("t_troops_commandershipService")
public class T_troops_commandershipService implements  IT_troops_commandershipService{
    @Autowired
    private T_troops_commandershipMapper t_troops_commandershipMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_troops_commandershipMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_troops_commandership t_troops_commandership) {

        return t_troops_commandershipMapper.insert(t_troops_commandership);
    }
    @Override
    public int insertSelective(T_troops_commandership t_troops_commandership) {
        return t_troops_commandershipMapper.insertSelective(t_troops_commandership);
    }
    @Override
    public T_troops_commandership selectByPrimaryKey(Integer tid) {
        return t_troops_commandershipMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_commandership t_troops_commandership) {
        return t_troops_commandershipMapper.updateByPrimaryKeySelective(t_troops_commandership);
    }
    @Override
    public int updateByPrimaryKey(T_troops_commandership t_troops_commandership) {
        return t_troops_commandershipMapper.updateByPrimaryKey(t_troops_commandership);
    }

    @Override
    public List<T_troops_commandership> selectAll() {
        return t_troops_commandershipMapper.selectAll();
    }
//WithBLOBs
}
