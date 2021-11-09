package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("t_troops_bu_equipService")
public class T_troops_bu_equipService implements  IT_troops_bu_equipService{
    @Autowired
    private T_troops_bu_equipMapper t_troops_bu_equipMapper;
    @Override
    public int deleteByPrimaryKey(Integer buId, Integer buEquipId) {
        return t_troops_bu_equipMapper.deleteByPrimaryKey(buId, buEquipId);
    }

    @Override
    public int insert(T_troops_bu_equip t_troops_bu_equip) {

        return t_troops_bu_equipMapper.insert(t_troops_bu_equip);
    }
    @Override
    public int insertSelective(T_troops_bu_equip t_troops_bu_equip) {
        return t_troops_bu_equipMapper.insertSelective(t_troops_bu_equip);
    }

    @Override
    public List<T_troops_bu_equip> selectByPrimaryKey(Integer buId, Integer buEquipId) {
        return t_troops_bu_equipMapper.selectByPrimaryKey(buId, buEquipId);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_bu_equip t_troops_bu_equip) {
        return t_troops_bu_equipMapper.updateByPrimaryKeySelective(t_troops_bu_equip);
    }
    @Override
    public int updateByPrimaryKey(T_troops_bu_equip t_troops_bu_equip) {
        return t_troops_bu_equipMapper.updateByPrimaryKey(t_troops_bu_equip);
    }
//WithBLOBs
}
