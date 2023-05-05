package com.hnguigu.erp.mapper;

import com.hnguigu.erp.entity.TblOperdetail;
import com.hnguigu.erp.entity.TblOperdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblOperdetailMapper {
    int countByExample(TblOperdetailExample example);

    int deleteByExample(TblOperdetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblOperdetail record);

    int insertSelective(TblOperdetail record);

    List<TblOperdetail> selectByExample(TblOperdetailExample example);

    TblOperdetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblOperdetail record, @Param("example") TblOperdetailExample example);

    int updateByExample(@Param("record") TblOperdetail record, @Param("example") TblOperdetailExample example);

    int updateByPrimaryKeySelective(TblOperdetail record);

    int updateByPrimaryKey(TblOperdetail record);
}