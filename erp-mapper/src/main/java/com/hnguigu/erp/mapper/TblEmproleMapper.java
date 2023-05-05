package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblEmprole;
import com.hnguigu.erp.entity.TblEmproleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblEmproleMapper {
    int countByExample(TblEmproleExample example);

    int deleteByExample(TblEmproleExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblEmprole record);

    int insertSelective(TblEmprole record);

    List<TblEmprole> selectByExample(TblEmproleExample example);

    TblEmprole selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblEmprole record, @Param("example") TblEmproleExample example);

    int updateByExample(@Param("record") TblEmprole record, @Param("example") TblEmproleExample example);

    int updateByPrimaryKeySelective(TblEmprole record);

    int updateByPrimaryKey(TblEmprole record);
}