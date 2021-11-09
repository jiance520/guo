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
@Service("t_flatequip_correspondService")
public class T_flatequip_correspondService implements  IT_flatequip_correspondService{
    @Autowired
    private T_flatequip_correspondMapper t_flatequip_correspondMapper;

    @Override
    public int deleteByPrimaryKey(Integer wFlatId, Integer wEquipId) {
        return t_flatequip_correspondMapper.deleteByPrimaryKey(wFlatId, wEquipId);
    }

    @Override
    public int insert(T_flatequip_correspond t_flatequip_correspond) {

        return t_flatequip_correspondMapper.insert(t_flatequip_correspond);
    }
    @Override
    public int insertSelective(T_flatequip_correspond t_flatequip_correspond) {
        return t_flatequip_correspondMapper.insertSelective(t_flatequip_correspond);
    }

    @Override
    public List<T_flatequip_correspond> selectByPrimaryKey(Integer wFlatId, Integer wEquipId) {
        return t_flatequip_correspondMapper.selectByPrimaryKey(wFlatId, wEquipId);
    }

    @Override
    public int updateByPrimaryKeySelective(T_flatequip_correspond t_flatequip_correspond) {
        return t_flatequip_correspondMapper.updateByPrimaryKeySelective(t_flatequip_correspond);
    }
    @Override
    public int updateByPrimaryKey(T_flatequip_correspond t_flatequip_correspond) {
        return t_flatequip_correspondMapper.updateByPrimaryKey(t_flatequip_correspond);
    }
//WithBLOBs
}
