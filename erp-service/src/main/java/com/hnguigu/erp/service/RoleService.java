package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.RoleByNameOrCode;
import com.hnguigu.erp.dto.RoleDTO;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblRes;
import com.hnguigu.erp.entity.TblRole;
import com.mysql.jdbc.log.Log;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RoleService {

    List<TblRole> findRoleByEmpId(Long id);

    List<TblRole> findRoleById(Long uuid);

    PageInfo<TblRole> findRoleAll(Integer pageNum,Integer pageSize);

    PageInfo<TblRole> findRoleByNameOrCode(Integer pageNum, Integer pageSize, RoleByNameOrCode roleByNameOrCode);

    void addRole(RoleDTO addRoleDTO);

    TblRole selectByPrimaryKey(Long uuid);

    int updateByPrimaryKey(Long uuid);

    List<TblRole> findall();

    List<TblMenu> findAddByNameAndpuuid(Long uuid);
    void deleterolemenu(Integer uuid);

    void deleteroleres(Integer uuid);

    void updateByid(RoleDTO roleDTO);

    void addrolemenus(RoleDTO1 roleDTO1);

    List<TblRes> findAddByRes();

    void addres(RoleDTO1 roleDTO1);

    List<TblRes> findbyid(Long uuid);
}
