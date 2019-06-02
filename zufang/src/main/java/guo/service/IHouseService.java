package guo.service;

import guo.entity.House;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IHouseService {
    int deleteByPrimaryKey(String houseid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(String houseid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
    List<Map<String,HashMap>> selectHouseList(Map<String,Object> map);
}
