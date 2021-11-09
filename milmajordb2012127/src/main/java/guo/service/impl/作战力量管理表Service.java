package guo.service.impl;

import guo.dao.作战力量管理表Mapper;
import guo.entity.作战力量管理表;
import guo.service.I作战力量管理表Service;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan("guo.dao")
@Service("作战力量管理表Service")
public class 作战力量管理表Service implements I作战力量管理表Service {
    @Autowired
    private guo.dao.作战力量管理表Mapper 作战力量管理表Mapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 作战力量管理表Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(作战力量管理表 record) {
        return 作战力量管理表Mapper.insert(record);
    }

    @Override
    public int insertSelective(作战力量管理表 record) {
        return 作战力量管理表Mapper.insertSelective(record);
    }

    @Override
    public 作战力量管理表 selectByPrimaryKey(Integer id) {
        return 作战力量管理表Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(作战力量管理表 record) {
        return 作战力量管理表Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(作战力量管理表 record) {
        return 作战力量管理表Mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<作战力量管理表> selectAll() {
        return 作战力量管理表Mapper.selectAll();
    }
}
