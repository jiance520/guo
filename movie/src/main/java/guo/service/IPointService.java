package guo.service;

import guo.entity.Point;

import java.util.List;
import java.util.Map;

public interface IPointService {
    int deleteByPrimaryKey(Integer gid);

    int insert(Point record);

    int insertSelective(Point record);

    Point selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);
    List selectPointListMap(Map map);
}