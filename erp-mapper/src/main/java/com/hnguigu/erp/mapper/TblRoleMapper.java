package com.hnguigu.erp.mapper;

import com.hnguigu.erp.dto.RoleByNameOrCode;
import com.hnguigu.erp.dto.RoleDTO;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblRes;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.entity.TblRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblRoleMapper {

    int countByExample(TblRoleExample example);

    int deleteByExample(TblRoleExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRole record);

    int insertSelective(TblRole record);

    List<TblRole> selectByExample(TblRoleExample example);

    TblRole selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByExample(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByPrimaryKeySelective(TblRole record);

    int updateByPrimaryKey(Long uuid);

    List<TblRole> findRoleByEmpId(Long uuid);

    List<TblRole> findRoleById(Long uuid);

    List<TblRole> findByNameOrCode(RoleByNameOrCode roleByNameOrCode);


    Integer addRole(RoleDTO addRoleDTO);

    List<TblMenu> findAddByNameAndpuuid(Long uuid);

    void deleterolemenu(Integer uuid);

    void deleteroleres(Integer uuid);

    void updateByid(RoleDTO roleDTO);

    void addrolemenu(RoleDTO1 roleDTO1);

    List<TblRes> findAddByRes();
    void addres(RoleDTO1 roleDTO1);

    List<TblRes> query(Long uuid);
}
