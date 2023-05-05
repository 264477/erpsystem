package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.NameANDTele;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblDepExample;
import com.hnguigu.erp.mapper.TblDepMapper;
import com.hnguigu.erp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private TblDepMapper tblDepMapper;

    /**
     * 分页查询全部部门信息
     * @return
     */
    @Override
    public PageInfo<TblDep> findDeptByName(Integer pageNum,Integer pageSize) {
    
        PageInfo<TblDep> pageInfo=new PageInfo<TblDep>();
         TblDepExample tblDepExample = new TblDepExample();
         if(pageNum==null){

             pageNum=1;
         }
         if(pageSize==null){
             pageSize=5;
         }
         //查询部门的总数
        List<TblDep> count = this.tblDepMapper.selectByExample(tblDepExample);
        //分页查询部门
         PageHelper.startPage(pageNum,pageSize);

         List<TblDep> tblDepList = this.tblDepMapper.selectByExample(tblDepExample);

        pageInfo.setPageSize(pageSize);

        pageInfo.setPageNum(pageNum);

        pageInfo.setList(tblDepList);

        pageInfo.setPages(count.size()/pageSize+1);

        pageInfo.setTotal(count.size());

        return pageInfo;
    }

    /**
     * 查询所有部门信息
     * @return
     */
    @Override
    public List<TblDep> findDeptAll() {

         List<TblDep> depList = this.tblDepMapper.findByAll();

        return depList;
    }

    /**
     * 根据id查询部门信息
     * @param uuid
     * @return
     */
    @Override
    public TblDep findDeptById(Long uuid) {

        return this.tblDepMapper.selectByPrimaryKey(uuid);
    }
    /**
     *根据部门名称与电话分页查询
     * @param nameANDTele
     * @return
     */
    @Override
    public PageInfo<TblDep> findDeptByNameOrTele(Integer pageNum,Integer pageSize,NameANDTele nameANDTele) {
        PageInfo<TblDep> pageInfo = new PageInfo<TblDep>();
        if(pageNum==null){
            pageNum=1;
        }
        if(pageSize==null){
            pageSize=5;
        }
        List<TblDep> count = this.tblDepMapper.findByNameOrByTele(nameANDTele);
        PageHelper.startPage(pageNum,pageSize);
        List<TblDep> byNameOrByTele = this.tblDepMapper.findByNameOrByTele(nameANDTele);
        pageInfo.setList(byNameOrByTele);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageNum(pageNum);
        pageInfo.setList(byNameOrByTele);
        pageInfo.setPages(count.size()/pageSize+1);
        pageInfo.setTotal(count.size());

        return pageInfo;
    }
    /**
     * 添加部门
     * @param tblDep
     * @return
     */
    @Override
    public int AddDept(TblDep tblDep) {

         int insertSelective = this.tblDepMapper.insertSelective(tblDep);

         return  insertSelective;

    }
    /**
     * 根据id修改部门
     * @param record
     * @return
     */
    @Override
    public int UpdateDeptById(TblDep record) {

        int updateByPrimaryKeySelective = this.tblDepMapper.updateByPrimaryKeySelective(record);

        return updateByPrimaryKeySelective;

    }

    @Override
    public int delteDeptById(Long uuid) {

        int deleteByPrimaryKey = this.tblDepMapper.deleteByPrimaryKey(uuid);


        return deleteByPrimaryKey;
    }

}
