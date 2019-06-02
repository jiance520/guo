package guo.service;

import guo.entity.Yuyue;

import java.util.List;
import java.util.Map;

public interface IYuyueService {
    int deleteByPrimaryKey(String yyid);

    int insert(Yuyue record);

    int insertSelective(Yuyue record);

    Yuyue selectByPrimaryKey(String yyid);

    int updateByPrimaryKeySelective(Yuyue record);

    int updateByPrimaryKey(Yuyue record);
    List<Map> selectYuyueList(Map map);
}