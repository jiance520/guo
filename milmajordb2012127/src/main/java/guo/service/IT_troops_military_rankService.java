package guo.service;

import guo.entity.T_troops_military_rank;

import java.util.List;

public interface IT_troops_military_rankService {
    int deleteByPrimaryKey(Integer mrankId);

    int insert(T_troops_military_rank record);

    int insertSelective(T_troops_military_rank record);

    T_troops_military_rank selectByPrimaryKey(Integer mrankId);

    int updateByPrimaryKeySelective(T_troops_military_rank record);

    int updateByPrimaryKey(T_troops_military_rank record);

    List<T_troops_military_rank> selectAll();
}