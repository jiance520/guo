package guo.dao;

import guo.entity.Userinfo;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    Userinfo selectLogin(Map map);
}