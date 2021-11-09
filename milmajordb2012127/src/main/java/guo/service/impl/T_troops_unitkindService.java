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
@Service("t_troops_unitkindService")
public class T_troops_unitkindService implements  IT_troops_unitkindService{
    @Autowired
    private T_troops_unitkindMapper t_troops_unitkindMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_troops_unitkindMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_troops_unitkind t_troops_unitkind) {

        return t_troops_unitkindMapper.insert(t_troops_unitkind);
    }
    @Override
    public int insertSelective(T_troops_unitkind t_troops_unitkind) {
        return t_troops_unitkindMapper.insertSelective(t_troops_unitkind);
    }
    @Override
    public T_troops_unitkind selectByPrimaryKey(Integer tid) {
        return t_troops_unitkindMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_unitkind t_troops_unitkind) {
        return t_troops_unitkindMapper.updateByPrimaryKeySelective(t_troops_unitkind);
    }
    @Override
    public int updateByPrimaryKey(T_troops_unitkind t_troops_unitkind) {
        return t_troops_unitkindMapper.updateByPrimaryKey(t_troops_unitkind);
    }

    @Override
    public List<T_troops_unitkind> selectAll() {
        return t_troops_unitkindMapper.selectAll();
    }
//WithBLOBs
}
