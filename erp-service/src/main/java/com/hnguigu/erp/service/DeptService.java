package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.NameANDTele;
import com.hnguigu.erp.entity.TblDep;

import java.util.List;


public interface DeptService {

    //TODO 分页查询所有部门信息
    PageInfo<TblDep> findDeptByName(Integer pageNum, Integer pageSize);

    //TODO 查询所有
    List<TblDep> findDeptAll();

    //TODO 根据id查询部门信息
    TblDep findDeptById(Long uuid);

    //TODO 根据部门名称查询与电话
    PageInfo<TblDep> findDeptByNameOrTele(Integer pageNum, Integer pageSize,NameANDTele nameANDTele);

    //TODO 添加部门
    int AddDept(TblDep tblDep);

    //TODO 修改部门
    int UpdateDeptById(TblDep record);

    int delteDeptById(Long uuid);

}
