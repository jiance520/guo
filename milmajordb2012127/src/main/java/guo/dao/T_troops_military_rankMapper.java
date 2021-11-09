package guo.dao;

import guo.entity.T_troops_military_rank;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_troops_military_rankMapper {
    int deleteByPrimaryKey(Integer mrankId);

    int insert(T_troops_military_rank record);

    int insertSelective(T_troops_military_rank record);

    T_troops_military_rank selectByPrimaryKey(Integer mrankId);

    int updateByPrimaryKeySelective(T_troops_military_rank record);

    int updateByPrimaryKey(T_troops_military_rank record);

    List<T_troops_military_rank> selectAll();
}