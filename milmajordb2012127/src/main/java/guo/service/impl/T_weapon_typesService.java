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
@Service("t_weapon_typesService")
public class T_weapon_typesService implements  IT_weapon_typesService{
    @Autowired
    private T_weapon_typesMapper t_weapon_typesMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_weapon_typesMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_weapon_types t_weapon_types) {

        return t_weapon_typesMapper.insert(t_weapon_types);
    }
    @Override
    public int insertSelective(T_weapon_types t_weapon_types) {
        return t_weapon_typesMapper.insertSelective(t_weapon_types);
    }
    @Override
    public T_weapon_types selectByPrimaryKey(Integer tid) {
        return t_weapon_typesMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_weapon_types t_weapon_types) {
        return t_weapon_typesMapper.updateByPrimaryKeySelective(t_weapon_types);
    }
    @Override
    public int updateByPrimaryKey(T_weapon_types t_weapon_types) {
        return t_weapon_typesMapper.updateByPrimaryKey(t_weapon_types);
    }

    @Override
    public List<T_weapon_types> selectAll() {
        return t_weapon_typesMapper.selectAll();
    }
//WithBLOBs
}
