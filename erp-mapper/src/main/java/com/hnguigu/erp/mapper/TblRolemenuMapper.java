package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblRolemenu;
import com.hnguigu.erp.entity.TblRolemenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblRolemenuMapper {
    int countByExample(TblRolemenuExample example);

    int deleteByExample(TblRolemenuExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRolemenu record);

    int insertSelective(TblRolemenu record);

    List<TblRolemenu> selectByExample(TblRolemenuExample example);

    TblRolemenu selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRolemenu record, @Param("example") TblRolemenuExample example);

    int updateByExample(@Param("record") TblRolemenu record, @Param("example") TblRolemenuExample example);

    int updateByPrimaryKeySelective(TblRolemenu record);

    int updateByPrimaryKey(TblRolemenu record);
}