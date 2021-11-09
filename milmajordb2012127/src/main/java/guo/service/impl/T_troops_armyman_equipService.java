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
@Service("t_troops_armyman_equipService")
public class T_troops_armyman_equipService implements  IT_troops_armyman_equipService{
    @Autowired
    private T_troops_armyman_equipMapper t_troops_armyman_equipMapper;

    @Override
    public int deleteByPrimaryKey(Integer armymanId, Integer awEquipId) {
        return t_troops_armyman_equipMapper.deleteByPrimaryKey(armymanId, awEquipId);
    }

    @Override
    public int insert(T_troops_armyman_equip t_troops_armyman_equip) {

        return t_troops_armyman_equipMapper.insert(t_troops_armyman_equip);
    }
    @Override
    public int insertSelective(T_troops_armyman_equip t_troops_armyman_equip) {
        return t_troops_armyman_equipMapper.insertSelective(t_troops_armyman_equip);
    }

    @Override
    public List<T_troops_armyman_equip> selectByPrimaryKey(Integer armymanId, Integer awEquipId) {
        return t_troops_armyman_equipMapper.selectByPrimaryKey(armymanId, awEquipId);
    }
    @Override
    public int updateByPrimaryKeySelective(T_troops_armyman_equip t_troops_armyman_equip) {
        return t_troops_armyman_equipMapper.updateByPrimaryKeySelective(t_troops_armyman_equip);
    }
    @Override
    public int updateByPrimaryKey(T_troops_armyman_equip t_troops_armyman_equip) {
        return t_troops_armyman_equipMapper.updateByPrimaryKey(t_troops_armyman_equip);
    }
//WithBLOBs
}
