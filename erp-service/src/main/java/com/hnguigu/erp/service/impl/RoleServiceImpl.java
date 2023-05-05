package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.RoleByNameOrCode;
import com.hnguigu.erp.dto.RoleDTO;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.*;

import com.hnguigu.erp.mapper.*;
import com.hnguigu.erp.service.RoleService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private TblRoleMapper tblRoleMapper;

    @Autowired
    private TblRoleresMapper tblRoleresMapper;

    @Autowired
    private TblResMapper tblResMapper;

    @Autowired
    private TblRolemenuMapper tblRolemenuMapper;

    @Autowired
    private TblMenuMapper tblMenuMapper;


    @Override
    public List<TblRole> findRoleByEmpId(Long id) {
        List<TblRole> roleByEmpId = tblRoleMapper.findRoleByEmpId(id);
        return roleByEmpId;
    }

    @Override
    public List<TblRole> findRoleById(Long uuid) {

        List<TblRole> roleById = this.tblRoleMapper.findRoleById(uuid);

        return roleById;

    }


    //TODO 分页查询所有角色
    @Override
    public PageInfo<TblRole> findRoleAll(Integer pageNum, Integer pageSize) {

        PageInfo<TblRole> pageInfo = new PageInfo<TblRole>();

        TblRoleExample tblRoleExample = new TblRoleExample();

        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }
        List<TblRole> count = this.tblRoleMapper.selectByExample(tblRoleExample);
        PageHelper.startPage(pageNum, pageSize);
        List<TblRole> tblRoleList = this.tblRoleMapper.selectByExample(tblRoleExample);

        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setList(tblRoleList);
        pageInfo.setPages(count.size() / pageSize + 1);
        pageInfo.setTotal(count.size());

        return pageInfo;
    }

    //TODO 分页模糊查询角色名称与角色编码
    @Override
    public PageInfo<TblRole> findRoleByNameOrCode(Integer pageNum, Integer pageSize, RoleByNameOrCode roleByNameOrCode) {

        PageInfo<TblRole> pageInfo = new PageInfo<TblRole>();


        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }

        List<TblRole> count = this.tblRoleMapper.findByNameOrCode(roleByNameOrCode);

        PageHelper.startPage(pageNum, pageSize);
        List<TblRole> tblRoleList = this.tblRoleMapper.findByNameOrCode(roleByNameOrCode);

        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setList(tblRoleList);
        pageInfo.setPages(count.size() / pageSize + 1);
        pageInfo.setTotal(count.size());

        return pageInfo;

    }

    //TODO 添加
    @Override
    public void addRole(RoleDTO addRoleDTO) {

        Integer id = this.tblRoleMapper.addRole(addRoleDTO);

        for (String s : addRoleDTO.getRoleuuid().split(",")) {
            if (!ObjectUtils.isEmpty(s)) {
                TblRolemenu tblRolemenu = new TblRolemenu();
                tblRolemenu.setRoleuuid(addRoleDTO.getId().longValue());
                tblRolemenu.setMenuuuid(new Long(s));


                List<TblMenu> tblMenuList=this.tblMenuMapper.findByPuuid(new Long(s));
                this.tblRolemenuMapper.insert(tblRolemenu);
                for (TblMenu tblMenu : tblMenuList){
                    tblRolemenu.setMenuuuid(tblMenu.getUuid());
                    this.tblRolemenuMapper.insert(tblRolemenu);
                }
            }
        }
        for (String s1 : addRoleDTO.getResuuid().split(",")) {
            if (!ObjectUtils.isEmpty(s1)) {
                TblRoleres tblRoleres=new TblRoleres();
                tblRoleres.setRoleuuid(addRoleDTO.getId().longValue());
                tblRoleres.setResuuid(new Long(s1));
                this.tblRoleresMapper.insert(tblRoleres);
            }
        }
    }

    //TODO 根据id查询
    @Override
    public TblRole selectByPrimaryKey(Long uuid) {
        TblRole selectByPrimaryKey = this.tblRoleMapper.selectByPrimaryKey(uuid);
        return selectByPrimaryKey;

    }

    //TODO 根据id修改
    @Override
    public int updateByPrimaryKey(Long uuid) {
        int updateByPrimaryKey = this.tblRoleMapper.updateByPrimaryKey(uuid);
        return updateByPrimaryKey;
    }

    @Override
    public List<TblRole> findall() {
        return this.tblRoleMapper.selectByExample(null);
    }

    @Override
    public List<TblMenu> findAddByNameAndpuuid(Long uuid) {

        return this.tblRoleMapper.findAddByNameAndpuuid(uuid);
    }

    @Override
    public void deleterolemenu(Integer uuid) {

        this.tblRoleMapper.deleterolemenu(uuid);
    }

    @Override
    public void deleteroleres(Integer uuid) {
        this.tblRoleMapper.deleteroleres(uuid);
    }

    @Override
    public void updateByid(RoleDTO roleDTO) {

        this.tblRoleMapper.updateByid(roleDTO);

    }

    @Override
    public void addrolemenus(RoleDTO1 roleDTO1) {

        this.tblRoleMapper.addrolemenu(roleDTO1);

    }

    @Override
    public List<TblRes> findAddByRes() {

         List<TblRes> addByRes = this.tblRoleMapper.findAddByRes();

         return addByRes;
    }

    @Override
    public void addres(RoleDTO1 roleDTO1) {
        this.tblRoleMapper.addres(roleDTO1);
    }

    @Override
    public List<TblRes> findbyid(Long uuid) {
        return this.tblRoleMapper.query(uuid);
    }


}
