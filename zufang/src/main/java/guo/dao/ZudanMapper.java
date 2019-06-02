package guo.dao;

import guo.entity.Zudan;
import org.springframework.stereotype.Repository;

@Repository
public interface ZudanMapper {
    int deleteByPrimaryKey(String zdid);

    int insert(Zudan record);

    int insertSelective(Zudan record);

    Zudan selectByPrimaryKey(String zdid);

    int updateByPrimaryKeySelective(Zudan record);

    int updateByPrimaryKey(Zudan record);
}