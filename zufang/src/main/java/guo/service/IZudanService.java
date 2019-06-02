package guo.service;

import guo.entity.Zudan;

public interface IZudanService {
    int deleteByPrimaryKey(String zdid);

    int insert(Zudan record);

    int insertSelective(Zudan record);

    Zudan selectByPrimaryKey(String zdid);

    int updateByPrimaryKeySelective(Zudan record);

    int updateByPrimaryKey(Zudan record);
}