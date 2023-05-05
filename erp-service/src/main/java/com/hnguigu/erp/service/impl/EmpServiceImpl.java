package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.EmpFindByMultipleBlurs;
import com.hnguigu.erp.dto.TblEmpDTO;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.mapper.TblEmpMapper;
import com.hnguigu.erp.mapper.TblResMapper;
import com.hnguigu.erp.mapper.TblRoleMapper;
import com.hnguigu.erp.service.DeptService;
import com.hnguigu.erp.service.EmpService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private TblEmpMapper tblEmpMapper;

    @Autowired
    private TblRoleMapper tblRoleMapper;

    @Autowired
    private TblResMapper tblResMapper;

    @Autowired
    private DeptService deptService;


    //TODO 分页查询员工所有信息
    @Override
    public PageInfo<TblEmpDTO> list(Integer pageNum, Integer pageSize) {

        PageInfo<TblEmpDTO> pageInfo = new PageInfo<TblEmpDTO>();

        if (pageNum==null){
            pageNum=1;
        }
        if (pageSize==null){
            pageSize=5;
        }
        //TODO 查询员工总共多少条数据
        List<TblEmp> count = tblEmpMapper.findAll();

        PageHelper.startPage(pageNum,pageSize);

        List<TblEmp> empList = tblEmpMapper.findAll();

        List<TblEmpDTO> tblEmpDTOList=new ArrayList<>();

        TblEmpDTO tblEmpDTO =null;

        for (TblEmp tbmemp: empList) {

            TblDep deptByName = this.deptService.findDeptById(tbmemp.getDepuuid());

            tblEmpDTO = new TblEmpDTO();

            BeanUtils.copyProperties(tbmemp,tblEmpDTO);

            tblEmpDTO.setTblDep(deptByName);

            tblEmpDTOList.add(tblEmpDTO);

        }
        PageInfo<TblEmpDTO> tblEmpDTOPageInfo = new PageInfo<>(tblEmpDTOList);

        tblEmpDTOPageInfo.setPageSize(pageSize);

        tblEmpDTOPageInfo.setPageNum(pageNum);

        tblEmpDTOPageInfo.setList(tblEmpDTOList);

        tblEmpDTOPageInfo.setPages(count.size()/pageSize+1);

        tblEmpDTOPageInfo.setTotal(count.size());

        return tblEmpDTOPageInfo;
    }

    //TODO 根据id查询所有员工
    @Override
    public TblEmpDTO findEmpById(Long uuid) {

         return this.tblEmpMapper.selectByPrimaryKey(uuid);

    }


    //TODO 分页条件模糊查询
    @Override
    public PageInfo<TblEmpDTO> findByMultipleBlurs(Integer pageNum, Integer pageSize, EmpFindByMultipleBlurs empFindByMultipleBlurs) {

        PageInfo<TblEmpDTO> pageInfo = new PageInfo<TblEmpDTO>();

        if (pageNum==null){
            pageNum=1;
        }
        if (pageSize==null){
            pageSize=5;
        }
        //TODO 查询员工总共多少条数据
        List<TblEmp> count = tblEmpMapper.findByMultipleBlur(empFindByMultipleBlurs);

        PageHelper.startPage(pageNum,pageSize);

        List<TblEmp> empList = tblEmpMapper.findByMultipleBlur(empFindByMultipleBlurs);

        List<TblEmpDTO> tblEmpDTOList=new ArrayList<>();

        TblEmpDTO tblEmpDTO =null;

        for (TblEmp tbmemp: empList) {

            TblDep deptByName = this.deptService.findDeptById(tbmemp.getDepuuid());

            tblEmpDTO = new TblEmpDTO();

            BeanUtils.copyProperties(tbmemp,tblEmpDTO);

            tblEmpDTO.setTblDep(deptByName);

            tblEmpDTOList.add(tblEmpDTO);

        }
        PageInfo<TblEmpDTO> tblEmpDTOPageInfo = new PageInfo<>(tblEmpDTOList);

        tblEmpDTOPageInfo.setPageSize(pageSize);

        tblEmpDTOPageInfo.setPageNum(pageNum);

        tblEmpDTOPageInfo.setList(tblEmpDTOList);

        tblEmpDTOPageInfo.setPages(count.size()/pageSize+1);

        tblEmpDTOPageInfo.setTotal(count.size());

        return tblEmpDTOPageInfo;
    }

    @Override
    public List<TblEmp> findDeptById(Long depuuid) {

         List<TblEmp> deptById = this.tblEmpMapper.findDeptById(depuuid);

         return  deptById;
    }

    @Override
    public int AddEmp(TblEmp tblEmp) {

        int addEmp = this.tblEmpMapper.add(tblEmp);

        return addEmp;
    }

    @Override
    public int UpdateEmp(TblEmp record) {

        return this.tblEmpMapper.update(record);
    }

    @Override
    public int findempById(Long uuid) {
        return this.tblEmpMapper.deleteByPrimaryKey(uuid);
    }

    @Override
    public List<TblEmp> findall() {
        return this.tblEmpMapper.findAll();
    }

}
