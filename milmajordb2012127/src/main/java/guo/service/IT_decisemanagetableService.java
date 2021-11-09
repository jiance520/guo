package guo.service;

import guo.entity.T_decisemanagetable;

import java.util.List;

public interface IT_decisemanagetableService {
    int deleteByPrimaryKey(Integer deciseid);

    int insert(T_decisemanagetable record);

    int insertSelective(T_decisemanagetable record);

    T_decisemanagetable selectByPrimaryKey(Integer deciseid);

    int updateByPrimaryKeySelective(T_decisemanagetable record);

    int updateByPrimaryKey(T_decisemanagetable record);

    List<T_decisemanagetable> selectAll();
}