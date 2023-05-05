package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblSupplier;
import com.hnguigu.erp.entity.TblSupplierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblSupplierMapper {
    int countByExample(TblSupplierExample example);

    int deleteByExample(TblSupplierExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblSupplier record);

    int insertSelective(TblSupplier record);

    List<TblSupplier> selectByExample(TblSupplierExample example);

    TblSupplier selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblSupplier record, @Param("example") TblSupplierExample example);

    int updateByExample(@Param("record") TblSupplier record, @Param("example") TblSupplierExample example);

    int updateByPrimaryKeySelective(TblSupplier record);

    int updateByPrimaryKey(TblSupplier record);
}