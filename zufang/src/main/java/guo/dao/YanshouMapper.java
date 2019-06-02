package guo.dao;

import guo.entity.Yanshou;
import org.springframework.stereotype.Repository;

@Repository
public interface YanshouMapper {
    int deleteByPrimaryKey(String ysid);

    int insert(Yanshou record);

    int insertSelective(Yanshou record);

    Yanshou selectByPrimaryKey(String ysid);

    int updateByPrimaryKeySelective(Yanshou record);

    int updateByPrimaryKey(Yanshou record);
}