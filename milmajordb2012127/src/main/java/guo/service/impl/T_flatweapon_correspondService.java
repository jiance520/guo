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
@Service("t_flatweapon_correspondService")
public class T_flatweapon_correspondService implements  IT_flatweapon_correspondService{
    @Autowired
    private T_flatweapon_correspondMapper t_flatweapon_correspondMapper;

    @Override
    public int deleteByPrimaryKey(Integer wFlatId, Integer wWeaponId) {
        return t_flatweapon_correspondMapper.deleteByPrimaryKey(wFlatId, wWeaponId);
    }

    @Override
    public int insert(T_flatweapon_correspond t_flatweapon_correspond) {

        return t_flatweapon_correspondMapper.insert(t_flatweapon_correspond);
    }
    @Override
    public int insertSelective(T_flatweapon_correspond t_flatweapon_correspond) {
        return t_flatweapon_correspondMapper.insertSelective(t_flatweapon_correspond);
    }

    @Override
    public List<T_flatweapon_correspond> selectByPrimaryKey(Integer wFlatId, Integer wWeaponId) {
        return t_flatweapon_correspondMapper.selectByPrimaryKey(wFlatId, wWeaponId);
    }
    @Override
    public int updateByPrimaryKeySelective(T_flatweapon_correspond t_flatweapon_correspond) {
        return t_flatweapon_correspondMapper.updateByPrimaryKeySelective(t_flatweapon_correspond);
    }
    @Override
    public int updateByPrimaryKey(T_flatweapon_correspond t_flatweapon_correspond) {
        return t_flatweapon_correspondMapper.updateByPrimaryKey(t_flatweapon_correspond);
    }
//WithBLOBs
}
