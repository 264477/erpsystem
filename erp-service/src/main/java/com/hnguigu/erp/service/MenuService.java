package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.EmpDTO;
import com.hnguigu.erp.dto.MenuDTO;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.vo.TblMenuVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface MenuService {
    List<TblMenu> findMenuByRoleId(Long id);

    PageInfo<TblMenuVo> findMenuByAll(Integer pageNum, Integer pageSize,TblMenu tblMenu);

    PageInfo<TblMenuVo>findMenuByNameAndZiName(Integer pageNum,Integer pageSize);

    List<TblMenuVo> findByMenu();

    TblMenu MenufindByid(Long uuid);

    List<TblMenu> findall();

    List<TblRole> findByRole();

    void updata(TblMenu tblMenu);

    void addMenu(MenuDTO menuDTO);

  /*  void addRoleMenu(RoleDTO1 roleDTO1);*/
}
