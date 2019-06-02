package guo.dao;

import guo.entity.Yuyue;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YuyueMapper {
    int deleteByPrimaryKey(String yyid);

    int insert(Yuyue record);

    int insertSelective(Yuyue record);

    Yuyue selectByPrimaryKey(String yyid);

    int updateByPrimaryKeySelective(Yuyue record);

    int updateByPrimaryKey(Yuyue record);

    List<Map> selectYuyueList(Map map);
}