package guo.service.impl;

import guo.dao.TestadfMapper;
import guo.entity.Testadf;
import guo.service.ITestadfService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("testadfService")
public class TestadfService implements ITestadfService {
    @Resource
    private TestadfMapper testadfMapper;
    @Override
    public int deleteByPrimaryKey(Integer tid) {

        return testadfMapper.deleteByPrimaryKey(tid);
    }
    @Override
    public int insert(Testadf testadf) {

        return testadfMapper.insert(testadf);
    }
    @Override
    public int insertSelective(Testadf testadf) {
        return testadfMapper.insertSelective(testadf);
    }
    @Override
    public Testadf selectByPrimaryKey(Integer tid) {
        return testadfMapper.selectByPrimaryKey(tid);
    }
    @Override
    public int updateByPrimaryKeySelective(Testadf testadf) {
        return testadfMapper.updateByPrimaryKeySelective(testadf);
    }
    @Override
    public int updateByPrimaryKey(Testadf testadf) {
        return testadfMapper.updateByPrimaryKey(testadf);
    }

    @Override
    public List selectTestadfListMap(Map map) {
        return testadfMapper.selectTestadfListMap(map);
    }
}
