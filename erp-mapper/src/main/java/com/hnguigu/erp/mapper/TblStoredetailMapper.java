package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblStoredetail;
import com.hnguigu.erp.entity.TblStoredetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblStoredetailMapper {
    int countByExample(TblStoredetailExample example);

    int deleteByExample(TblStoredetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblStoredetail record);

    int insertSelective(TblStoredetail record);

    List<TblStoredetail> selectByExample(TblStoredetailExample example);

    TblStoredetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblStoredetail record, @Param("example") TblStoredetailExample example);

    int updateByExample(@Param("record") TblStoredetail record, @Param("example") TblStoredetailExample example);

    int updateByPrimaryKeySelective(TblStoredetail record);

    int updateByPrimaryKey(TblStoredetail record);
}