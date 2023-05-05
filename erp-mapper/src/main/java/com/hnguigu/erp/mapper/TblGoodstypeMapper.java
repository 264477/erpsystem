package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblGoodstype;
import com.hnguigu.erp.entity.TblGoodstypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGoodstypeMapper {
    int countByExample(TblGoodstypeExample example);

    int deleteByExample(TblGoodstypeExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblGoodstype record);

    int insertSelective(TblGoodstype record);

    List<TblGoodstype> selectByExample(TblGoodstypeExample example);

    TblGoodstype selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblGoodstype record, @Param("example") TblGoodstypeExample example);

    int updateByExample(@Param("record") TblGoodstype record, @Param("example") TblGoodstypeExample example);

    int updateByPrimaryKeySelective(TblGoodstype record);

    int updateByPrimaryKey(TblGoodstype record);
}