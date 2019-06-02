package guo.dao;

import guo.entity.Favorites;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface FavoritesMapper {
    int deleteByPrimaryKey(String fid);

    int insert(Favorites record);

    int insertSelective(Favorites record);

    List<Map<String,HashMap>> selectFavorites(Map map);

    int updateByPrimaryKeySelective(Favorites record);

    int updateByPrimaryKey(Favorites record);
}