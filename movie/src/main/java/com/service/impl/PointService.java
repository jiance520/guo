package com.service.impl;

import com.dao.*;

import com.entity.*;
import com.service.*;
import com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("pointService")
public class PointService implements  IPointService{
    @Resource
    private PointMapper pointMapper;
    @Override
    public int deleteByPrimaryKey(Integer pid) {
        System.out.println("-----test:");

        return pointMapper.deleteByPrimaryKey(pid);
    }
    @Override
    public int insert(Point point) {

        return pointMapper.insert(point);
    }
    @Override
    public int insertSelective(Point point) {
        return pointMapper.insertSelective(point);
    }
    @Override
    public Point selectByPrimaryKey(Integer pid) {
        return pointMapper.selectByPrimaryKey(pid);
    }
    @Override
    public int updateByPrimaryKeySelective(Point point) {
        return pointMapper.updateByPrimaryKeySelective(point);
    }
    @Override
    public int updateByPrimaryKey(Point point) {
        return pointMapper.updateByPrimaryKey(point);
    }

    @Override
    public List selectPointListMap(Map map) {
        return pointMapper.selectPointListMap(map);
    }
}
