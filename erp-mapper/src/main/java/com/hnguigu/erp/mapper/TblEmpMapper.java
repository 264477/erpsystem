package com.hnguigu.erp.mapper;

import com.hnguigu.erp.dto.EmpDTO;
import com.hnguigu.erp.dto.EmpFindByMultipleBlurs;
import com.hnguigu.erp.dto.TblEmpDTO;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.entity.TblEmpExample;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.vo.TblMenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblEmpMapper {

    int countByExample(TblEmpExample example);

    int deleteByExample(TblEmpExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblEmp record);

    int insertSelective(TblEmp record);

    List<TblEmp> selectByExample(TblEmpExample example);

    TblEmpDTO selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByExample(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByPrimaryKeySelective(TblEmp record);

    int updateByPrimaryKey(TblEmp record);

    TblEmp findByName(String userName);
    List<TblEmp> findAll();

    List<TblEmp> findByMultipleBlur(EmpFindByMultipleBlurs empFindByMultipleBlurs);

    List<TblEmp> findDeptById(Long depuuid);
    int add(TblEmp tblEmp);

    int update(TblEmp record);
}