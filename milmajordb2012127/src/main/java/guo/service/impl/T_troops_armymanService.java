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
@Service("t_troops_armymanService")
public class T_troops_armymanService implements  IT_troops_armymanService{
    @Autowired
    private T_troops_armymanMapper t_troops_armymanMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_troops_armymanMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_troops_armyman t_troops_armyman) {

        return t_troops_armymanMapper.insert(t_troops_armyman);
    }
    @Override
    public int insertSelective(T_troops_armyman t_troops_armyman) {
        return t_troops_armymanMapper.insertSelective(t_troops_armyman);
    }
    @Override
    public T_troops_armyman selectByPrimaryKey(Integer tid) {
        return t_troops_armymanMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_armyman t_troops_armyman) {
        return t_troops_armymanMapper.updateByPrimaryKeySelective(t_troops_armyman);
    }
    @Override
    public int updateByPrimaryKey(T_troops_armyman t_troops_armyman) {
        return t_troops_armymanMapper.updateByPrimaryKey(t_troops_armyman);
    }

    @Override
    public List<T_troops_armyman> selectAll() {
        return t_troops_armymanMapper.selectAll();
    }
//WithBLOBs
}
