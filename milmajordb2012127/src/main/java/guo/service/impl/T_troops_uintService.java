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
@Service("t_troops_uintService")
public class T_troops_uintService implements  IT_troops_uintService{
    @Autowired
    private T_troops_uintMapper t_troops_uintMapper;

    @Override
    public int deleteByPrimaryKey(Integer unitId, Integer buId, Integer unitChildId, Integer unitChildOrder) {
        return t_troops_uintMapper.deleteByPrimaryKey(unitId, buId, unitChildId, unitChildOrder);
    }
    @Override
    public int insert(T_troops_uint t_troops_uint) {

        return t_troops_uintMapper.insert(t_troops_uint);
    }
    @Override
    public int insertSelective(T_troops_uint t_troops_uint) {
        return t_troops_uintMapper.insertSelective(t_troops_uint);
    }

    @Override
    public List<T_troops_uint> selectByPrimaryKey(Integer unitId, Integer buId, Integer unitChildId, Integer unitChildOrder) {
        return t_troops_uintMapper.selectByPrimaryKey(unitId, buId, unitChildId, unitChildOrder);
    }

    @Override
    public int updateByPrimaryKeySelective(T_troops_uint t_troops_uint) {
        return t_troops_uintMapper.updateByPrimaryKeySelective(t_troops_uint);
    }
    @Override
    public int updateByPrimaryKey(T_troops_uint t_troops_uint) {
        return t_troops_uintMapper.updateByPrimaryKey(t_troops_uint);
    }
//WithBLOBs
}
