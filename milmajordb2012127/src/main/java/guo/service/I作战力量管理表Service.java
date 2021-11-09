package guo.service;

import guo.entity.作战力量管理表;

import java.util.List;
import java.util.Map;

public interface I作战力量管理表Service {
    int deleteByPrimaryKey(Integer id);

    int insert(作战力量管理表 record);

    int insertSelective(作战力量管理表 record);

    作战力量管理表 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(作战力量管理表 record);

    int updateByPrimaryKey(作战力量管理表 record);

    List<作战力量管理表> selectAll();
}
