package guo.service.impl;

import guo.dao.HouseMapper;
import guo.entity.House;
import guo.service.IHouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("houseService")
public class HouseService implements IHouseService{
    @Resource
    private HouseMapper houseMapper;
    @Override
    public int deleteByPrimaryKey(String houseid) {
        return houseMapper.deleteByPrimaryKey(houseid);
    }

    @Override
    public int insert(House record) {
        return houseMapper.insert(record);
    }

    @Override
    public int insertSelective(House record) {
        return houseMapper.insertSelective(record);
    }

    @Override
    public House selectByPrimaryKey(String houseid) {
        return houseMapper.selectByPrimaryKey(houseid);
    }

    @Override
    public int updateByPrimaryKeySelective(House record) {
        return houseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return houseMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map<String, HashMap>> selectHouseList(Map<String, Object> map) {
        return houseMapper.selectHouseList(map);
    }
}
