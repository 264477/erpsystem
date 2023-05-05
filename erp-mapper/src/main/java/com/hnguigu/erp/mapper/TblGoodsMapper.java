package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblGoods;
import com.hnguigu.erp.entity.TblGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGoodsMapper {
    int countByExample(TblGoodsExample example);

    int deleteByExample(TblGoodsExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblGoods record);

    int insertSelective(TblGoods record);

    List<TblGoods> selectByExample(TblGoodsExample example);

    TblGoods selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    int updateByExample(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    int updateByPrimaryKeySelective(TblGoods record);

    int updateByPrimaryKey(TblGoods record);


}