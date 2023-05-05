package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.EmpFindByMultipleBlurs;
import com.hnguigu.erp.dto.TblEmpDTO;
import com.hnguigu.erp.entity.TblEmp;

import java.util.List;

public interface EmpService {
    //TODO 分页查询员工信息
    PageInfo<TblEmpDTO> list(Integer pageNum,Integer pageSize);

    //TODO 根据员工id查询
    TblEmpDTO findEmpById(Long uuid);

    //TODO 模糊查询所有
    PageInfo<TblEmpDTO> findByMultipleBlurs(Integer pageNum, Integer pageSize, EmpFindByMultipleBlurs empFindByMultipleBlurs);


    List<TblEmp> findDeptById(Long depuuid);

    int AddEmp(TblEmp tblEmp);

    int UpdateEmp(TblEmp record);


    int findempById(Long uuid);

    List<TblEmp> findall();
}
