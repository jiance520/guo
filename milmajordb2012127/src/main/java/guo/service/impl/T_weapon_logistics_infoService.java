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
@Service("t_weapon_logistics_infoService")
public class T_weapon_logistics_infoService implements  IT_weapon_logistics_infoService{
    @Autowired
    private T_weapon_logistics_infoMapper t_weapon_logistics_infoMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return t_weapon_logistics_infoMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(T_weapon_logistics_info t_weapon_logistics_info) {

        return t_weapon_logistics_infoMapper.insert(t_weapon_logistics_info);
    }
    @Override
    public int insertSelective(T_weapon_logistics_info t_weapon_logistics_info) {
        return t_weapon_logistics_infoMapper.insertSelective(t_weapon_logistics_info);
    }
    @Override
    public T_weapon_logistics_info selectByPrimaryKey(Integer tid) {
        return t_weapon_logistics_infoMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(T_weapon_logistics_info t_weapon_logistics_info) {
        return t_weapon_logistics_infoMapper.updateByPrimaryKeySelective(t_weapon_logistics_info);
    }
    @Override
    public int updateByPrimaryKey(T_weapon_logistics_info t_weapon_logistics_info) {
        return t_weapon_logistics_infoMapper.updateByPrimaryKey(t_weapon_logistics_info);
    }

    @Override
    public List<T_weapon_logistics_info> selectAll() {
        return t_weapon_logistics_infoMapper.selectAll();
    }
//WithBLOBs
}
