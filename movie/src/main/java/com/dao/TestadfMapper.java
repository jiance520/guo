package com.dao;

import com.entity.Testadf;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TestadfMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Testadf record);

    int insertSelective(Testadf record);

    Testadf selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Testadf record);

    int updateByPrimaryKey(Testadf record);
    List selectTestadfListMap(Map map);
}