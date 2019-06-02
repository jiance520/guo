package guo.service;

import guo.entity.Yanshou;

public interface IYanshouService {
    int deleteByPrimaryKey(String ysid);

    int insert(Yanshou record);

    int insertSelective(Yanshou record);

    Yanshou selectByPrimaryKey(String ysid);

    int updateByPrimaryKeySelective(Yanshou record);

    int updateByPrimaryKey(Yanshou record);
}