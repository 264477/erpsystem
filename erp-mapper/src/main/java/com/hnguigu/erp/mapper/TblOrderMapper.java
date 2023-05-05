package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblOrder;

import com.hnguigu.erp.entity.TblOrderExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TblOrderMapper {

    int countByExample(TblOrderExample example);

    int deleteByExample(TblOrderExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblOrder record);

    int insertSelective(TblOrder record);

    List<TblOrder> selectByExample(TblOrderExample example);

    TblOrder selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblOrder record, @Param("example") TblOrderExample example);

    int updateByExample(@Param("record") TblOrder record, @Param("example") TblOrderExample example);

    int updateByPrimaryKeySelective(TblOrder record);

    int updateByPrimaryKey(TblOrder record);

}