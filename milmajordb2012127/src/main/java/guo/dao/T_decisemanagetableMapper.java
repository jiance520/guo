package guo.dao;

import guo.entity.T_decisemanagetable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_decisemanagetableMapper {
    int deleteByPrimaryKey(Integer deciseid);

    int insert(T_decisemanagetable record);

    int insertSelective(T_decisemanagetable record);

    T_decisemanagetable selectByPrimaryKey(Integer deciseid);

    int updateByPrimaryKeySelective(T_decisemanagetable record);

    int updateByPrimaryKey(T_decisemanagetable record);

    List<T_decisemanagetable> selectAll();
}