package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("zudanService")
public class ZudanService implements  IZudanService{
    @Autowired
    private ZudanMapper zudanMapper;
    @Override
    public int deleteByPrimaryKey(String zid) {

        return zudanMapper.deleteByPrimaryKey(zid);
    }
    @Override
    public int insert(Zudan zudan) {

        return zudanMapper.insert(zudan);
    }
    @Override
    public int insertSelective(Zudan zudan) {
        return zudanMapper.insertSelective(zudan);
    }
    @Override
    public Zudan selectByPrimaryKey(String zid) {
        return zudanMapper.selectByPrimaryKey(zid);
    }
    @Override
    public int updateByPrimaryKeySelective(Zudan zudan) {
        return zudanMapper.updateByPrimaryKeySelective(zudan);
    }
    @Override
    public int updateByPrimaryKey(Zudan zudan) {
        return zudanMapper.updateByPrimaryKey(zudan);
    }
//WithBLOBs
}
