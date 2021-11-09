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
@Service("t_weapon_ammo_infoService")
public class T_weapon_ammo_infoService implements  IT_weapon_ammo_infoService{
    @Autowired
    private T_weapon_ammo_infoMapper t_weapon_ammo_infoMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_weapon_ammo_infoMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_weapon_ammo_info t_weapon_ammo_info) {

        return t_weapon_ammo_infoMapper.insert(t_weapon_ammo_info);
    }
    @Override
    public int insertSelective(T_weapon_ammo_info t_weapon_ammo_info) {
        return t_weapon_ammo_infoMapper.insertSelective(t_weapon_ammo_info);
    }
    @Override
    public T_weapon_ammo_info selectByPrimaryKey(Integer tid) {
        return t_weapon_ammo_infoMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_weapon_ammo_info t_weapon_ammo_info) {
        return t_weapon_ammo_infoMapper.updateByPrimaryKeySelective(t_weapon_ammo_info);
    }
    @Override
    public int updateByPrimaryKey(T_weapon_ammo_info t_weapon_ammo_info) {
        return t_weapon_ammo_infoMapper.updateByPrimaryKey(t_weapon_ammo_info);
    }

    @Override
    public List<T_weapon_ammo_info> selectAll() {
        return t_weapon_ammo_infoMapper.selectAll();
    }
//WithBLOBs
}
