package com.hnguigu.erp.mapper;


import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.NameANDTele;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblDepExample;
import com.hnguigu.erp.entity.TblEmp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TblDepMapper {
    int countByExample(TblDepExample example);

    int deleteByExample(TblDepExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblDep record);

    int insertSelective(TblDep record);

    List<TblDep> selectByExample(TblDepExample example);

    TblDep selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblDep record, @Param("example") TblDepExample example);

    int updateByExample(@Param("record") TblDep record, @Param("example") TblDepExample example);

    int updateByPrimaryKeySelective(TblDep record);

    int updateByPrimaryKey(TblDep record);

    List<TblDep> findByNameOrByTele(NameANDTele nameANDTele);


    List<TblDep> findByAll();


}