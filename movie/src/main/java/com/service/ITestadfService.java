package com.service;

import com.entity.Testadf;

import java.util.List;
import java.util.Map;

public interface ITestadfService {
    int deleteByPrimaryKey(Integer rid);

    int insert(Testadf record);

    int insertSelective(Testadf record);

    Testadf selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Testadf record);

    int updateByPrimaryKey(Testadf record);
    List selectTestadfListMap(Map map);
}