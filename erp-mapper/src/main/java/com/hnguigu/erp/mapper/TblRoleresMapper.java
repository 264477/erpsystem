package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblRoleres;
import com.hnguigu.erp.entity.TblRoleresExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblRoleresMapper {
    int countByExample(TblRoleresExample example);

    int deleteByExample(TblRoleresExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRoleres record);

    int insertSelective(TblRoleres record);

    List<TblRoleres> selectByExample(TblRoleresExample example);

    TblRoleres selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRoleres record, @Param("example") TblRoleresExample example);

    int updateByExample(@Param("record") TblRoleres record, @Param("example") TblRoleresExample example);

    int updateByPrimaryKeySelective(TblRoleres record);

    int updateByPrimaryKey(TblRoleres record);
}