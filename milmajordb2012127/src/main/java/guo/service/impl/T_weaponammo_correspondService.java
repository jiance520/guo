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
@Service("t_weaponammo_correspondService")
public class T_weaponammo_correspondService implements  IT_weaponammo_correspondService{
    @Autowired
    private T_weaponammo_correspondMapper t_weaponammo_correspondMapper;

    @Override
    public int deleteByPrimaryKey(Integer wWeaponId, Integer wAmmoId) {
        return t_weaponammo_correspondMapper.deleteByPrimaryKey(wWeaponId, wAmmoId);
    }

    @Override
    public int insert(T_weaponammo_correspond t_weaponammo_correspond) {

        return t_weaponammo_correspondMapper.insert(t_weaponammo_correspond);
    }
    @Override
    public int insertSelective(T_weaponammo_correspond t_weaponammo_correspond) {
        return t_weaponammo_correspondMapper.insertSelective(t_weaponammo_correspond);
    }

    @Override
    public List<T_weaponammo_correspond> selectByPrimaryKey(Integer wWeaponId, Integer wAmmoId) {
        return t_weaponammo_correspondMapper.selectByPrimaryKey(wWeaponId, wAmmoId);
    }

    @Override
    public int updateByPrimaryKeySelective(T_weaponammo_correspond t_weaponammo_correspond) {
        return t_weaponammo_correspondMapper.updateByPrimaryKeySelective(t_weaponammo_correspond);
    }
    @Override
    public int updateByPrimaryKey(T_weaponammo_correspond t_weaponammo_correspond) {
        return t_weaponammo_correspondMapper.updateByPrimaryKey(t_weaponammo_correspond);
    }
//WithBLOBs
}
