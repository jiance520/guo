package com.dao;

import com.entity.Point;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PointMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Point record);

    int insertSelective(Point record);

    Point selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);

    List selectPointListMap(Map map);
}