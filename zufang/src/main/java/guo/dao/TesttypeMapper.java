package guo.dao;

import guo.entity.Testtype;
import org.springframework.stereotype.Repository;

@Repository
public interface TesttypeMapper {
    int deleteByPrimaryKey(Long bigint1);

    int insert(Testtype record);

    int insertSelective(Testtype record);

    Testtype selectByPrimaryKey(Long bigint1);

    int updateByPrimaryKeySelective(Testtype record);

    int updateByPrimaryKeyWithBLOBs(Testtype record);

    int updateByPrimaryKey(Testtype record);
}