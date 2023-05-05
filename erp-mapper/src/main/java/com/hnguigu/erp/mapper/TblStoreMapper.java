package com.hnguigu.erp.mapper;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.TblStoreDTO;
import com.hnguigu.erp.entity.TblStore;
import com.hnguigu.erp.entity.TblStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblStoreMapper {
    int countByExample(TblStoreExample example);

    int deleteByExample(TblStoreExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblStore record);

    int insertSelective(TblStore record);

    List<TblStore> selectByExample(TblStoreExample example);

    TblStore selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblStore record, @Param("example") TblStoreExample example);

    int updateByExample(@Param("record") TblStore record, @Param("example") TblStoreExample example);

    int updateByPrimaryKeySelective(TblStore record);

    int updateByPrimaryKey(Long uuid);

    int updateById(TblStore tblStore);

    List<TblStore> findByAll();

    List<TblStoreDTO> findByEmpName();


    TblStore findbyid(Long uuid);

    List<TblStore> findByNameAndEmpName();


}