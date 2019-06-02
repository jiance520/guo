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
@Service("yanshouService")
public class YanshouService implements  IYanshouService{
    @Autowired
    private YanshouMapper yanshouMapper;
    @Override
    public int deleteByPrimaryKey(String yid) {

        return yanshouMapper.deleteByPrimaryKey(yid);
    }
    @Override
    public int insert(Yanshou yanshou) {

        return yanshouMapper.insert(yanshou);
    }
    @Override
    public int insertSelective(Yanshou yanshou) {
        return yanshouMapper.insertSelective(yanshou);
    }
    @Override
    public Yanshou selectByPrimaryKey(String yid) {
        return yanshouMapper.selectByPrimaryKey(yid);
    }
    @Override
    public int updateByPrimaryKeySelective(Yanshou yanshou) {
        return yanshouMapper.updateByPrimaryKeySelective(yanshou);
    }
    @Override
    public int updateByPrimaryKey(Yanshou yanshou) {
        return yanshouMapper.updateByPrimaryKey(yanshou);
    }
}
