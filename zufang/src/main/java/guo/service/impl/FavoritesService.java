package guo.service.impl;

import guo.dao.*;

import guo.entity.*;
import guo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "guo.dao")
@Service("favoritesService")
public class FavoritesService implements  IFavoritesService{
    @Autowired
    private FavoritesMapper favoritesMapper;

    @Override
    public int deleteByPrimaryKey(String fid) {
        return favoritesMapper.deleteByPrimaryKey(fid);
    }
    @Override
    public int insert(Favorites favorites) {

        return favoritesMapper.insert(favorites);
    }
    @Override
    public int insertSelective(Favorites favorites) {
        return favoritesMapper.insertSelective(favorites);
    }
    @Override
    public List<Map<String,HashMap>> selectFavorites(Map map) {
        return favoritesMapper.selectFavorites(map);
    }
    @Override
    public int updateByPrimaryKeySelective(Favorites favorites) {
        return favoritesMapper.updateByPrimaryKeySelective(favorites);
    }
    @Override
    public int updateByPrimaryKey(Favorites favorites) {
        return favoritesMapper.updateByPrimaryKey(favorites);
    }
}
