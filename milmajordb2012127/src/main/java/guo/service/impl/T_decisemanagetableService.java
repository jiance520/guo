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
@Service("t_decisemanagetableService")
public class T_decisemanagetableService implements  IT_decisemanagetableService {
    @Autowired
    private T_decisemanagetableMapper t_decisemanagetableMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_decisemanagetableMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_decisemanagetable t_decisemanagetable) {

        return t_decisemanagetableMapper.insert(t_decisemanagetable);
    }
    @Override
    public int insertSelective(T_decisemanagetable t_decisemanagetable) {
        return t_decisemanagetableMapper.insertSelective(t_decisemanagetable);
    }
    @Override
    public T_decisemanagetable selectByPrimaryKey(Integer tid) {
        return t_decisemanagetableMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_decisemanagetable t_decisemanagetable) {
        return t_decisemanagetableMapper.updateByPrimaryKeySelective(t_decisemanagetable);
    }
    @Override
    public int updateByPrimaryKey(T_decisemanagetable t_decisemanagetable) {
        return t_decisemanagetableMapper.updateByPrimaryKey(t_decisemanagetable);
    }

    @Override
    public List<T_decisemanagetable> selectAll() {
        return t_decisemanagetableMapper.selectAll();
    }
//WithBLOBs
}
