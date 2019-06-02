package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("yuyueService")
public class YuyueService implements  IYuyueService{
    @Autowired
    private YuyueMapper yuyueMapper;
    @Override
    public int deleteByPrimaryKey(String yid) {

        return yuyueMapper.deleteByPrimaryKey(yid);
    }
    @Override
    public int insert(Yuyue yuyue) {

        return yuyueMapper.insert(yuyue);
    }
    @Override
    public int insertSelective(Yuyue yuyue) {
        return yuyueMapper.insertSelective(yuyue);
    }
    @Override
    public Yuyue selectByPrimaryKey(String yid) {
        return yuyueMapper.selectByPrimaryKey(yid);
    }
    @Override
    public int updateByPrimaryKeySelective(Yuyue yuyue) {
        return yuyueMapper.updateByPrimaryKeySelective(yuyue);
    }
    @Override
    public int updateByPrimaryKey(Yuyue yuyue) {
        return yuyueMapper.updateByPrimaryKey(yuyue);
    }

    @Override
    public List<Map> selectYuyueList(Map map) {
        return yuyueMapper.selectYuyueList(map);
    }

}
