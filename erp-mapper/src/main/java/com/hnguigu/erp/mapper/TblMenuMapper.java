package com.hnguigu.erp.mapper;

import com.hnguigu.erp.dto.EmpDTO;
import com.hnguigu.erp.dto.MenuDTO;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblMenuExample;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.vo.TblMenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblMenuMapper {

    int countByExample(TblMenuExample example);

    int deleteByExample(TblMenuExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblMenu record);

    int insertSelective(TblMenu record);

    List<TblMenu> selectByExample(TblMenuExample example);

    TblMenu selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblMenu record, @Param("example") TblMenuExample example);

    int updateByExample(@Param("record") TblMenu record, @Param("example") TblMenuExample example);

    int updateByPrimaryKeySelective(TblMenu record);

    int updateByPrimaryKey(TblMenu record);
    List<TblMenu> findMenuByRoleId(long uuid);

    List<TblMenu> findMenuByEmpUserName(String userName);

    List<TblMenuVo> findMenuAll(TblMenu tblMenu);

    List<TblMenuVo> findMenuByNameZiName(String puuid);

    List<TblMenuVo> findByMenu();

    List<TblMenu> findall();

    List<TblMenu> findByPuuid(Long puuid);

    List<TblRole> findByRole();

    Integer addMenu(MenuDTO menuDTO);

   void addRoleMenu(RoleDTO1 roleDTO1);

}
