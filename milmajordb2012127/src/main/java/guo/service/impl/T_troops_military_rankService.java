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
@Service("t_troops_military_rankService")
public class T_troops_military_rankService implements  IT_troops_military_rankService{
    @Autowired
    private T_troops_military_rankMapper t_troops_military_rankMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_troops_military_rankMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_troops_military_rank t_troops_military_rank) {

        return t_troops_military_rankMapper.insert(t_troops_military_rank);
    }
    @Override
    public int insertSelective(T_troops_military_rank t_troops_military_rank) {
        return t_troops_military_rankMapper.insertSelective(t_troops_military_rank);
    }
    @Override
    public T_troops_military_rank selectByPrimaryKey(Integer tid) {
        return t_troops_military_rankMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_military_rank t_troops_military_rank) {
        return t_troops_military_rankMapper.updateByPrimaryKeySelective(t_troops_military_rank);
    }
    @Override
    public int updateByPrimaryKey(T_troops_military_rank t_troops_military_rank) {
        return t_troops_military_rankMapper.updateByPrimaryKey(t_troops_military_rank);
    }

    @Override
    public List<T_troops_military_rank> selectAll() {
        return t_troops_military_rankMapper.selectAll();
    }
//WithBLOBs
}
