package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblOrderdetail;
import com.hnguigu.erp.entity.TblOrderdetailExample;
import com.hnguigu.erp.vo.WarehousingVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblOrderdetailMapper {
    int countByExample(TblOrderdetailExample example);

    int deleteByExample(TblOrderdetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblOrderdetail record);

    int insertSelective(TblOrderdetail record);

    List<TblOrderdetail> selectByExample(TblOrderdetailExample example);

    TblOrderdetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblOrderdetail record, @Param("example") TblOrderdetailExample example);

    int updateByExample(@Param("record") TblOrderdetail record, @Param("example") TblOrderdetailExample example);

    int updateByPrimaryKeySelective(TblOrderdetail record);

    int updateByPrimaryKey(TblOrderdetail record);

   List<WarehousingVo> findOrderdetailANDOrder();

   int findCount();
}