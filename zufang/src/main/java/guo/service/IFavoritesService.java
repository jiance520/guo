package guo.service;

import guo.entity.Favorites;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IFavoritesService {
    int deleteByPrimaryKey(String fid);

    int insert(Favorites record);

    int insertSelective(Favorites record);

    List<Map<String,HashMap>> selectFavorites(Map map);

    int updateByPrimaryKeySelective(Favorites record);

    int updateByPrimaryKey(Favorites record);
}