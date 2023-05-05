package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.TblStoreDTO;
import com.hnguigu.erp.entity.TblStore;
import com.hnguigu.erp.mapper.TblStoreMapper;
import com.hnguigu.erp.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {

    @Autowired
    private TblStoreMapper tblStoreMapper;
    @Override
    public PageInfo<TblStore> findAll(Integer pageNum, Integer pageSize) {

        PageInfo<TblStore> pageInfo = new PageInfo<TblStore>();

        if (pageNum==null){
            pageNum = 1;
        }
        if (pageSize==null){
            pageSize =5;
        }

        List<TblStore> count = this.tblStoreMapper.findByAll();

        PageHelper.startPage(pageNum,pageSize);
        List<TblStore> byAll = this.tblStoreMapper.findByAll();

        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setList(byAll);
        pageInfo.setPages(count.size()/pageSize+1);
        pageInfo.setTotal(count.size());

        return pageInfo;
    }

    @Override
    public List<TblStoreDTO> findByEmpName() {

         List<TblStoreDTO> empName = this.tblStoreMapper.findByEmpName();

         return empName;
    }

    @Override
    public PageInfo<TblStore> findByNameAndEmpName(Integer pageNum, Integer pageSize) {

        PageInfo<TblStore> pageInfo = new PageInfo<TblStore>();

        if (pageNum==null){
            pageNum = 1;
        }
        if (pageSize==null){
            pageSize =5;
        }

        List<TblStore> count = this.tblStoreMapper.findByNameAndEmpName();

        PageHelper.startPage(pageNum,pageSize);
        List<TblStore> byNameAndEmpName = this.tblStoreMapper.findByNameAndEmpName();

        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setList(byNameAndEmpName);
        pageInfo.setPages(count.size()/pageSize+1);
        pageInfo.setTotal(count.size());

        return pageInfo;
    }

    @Override
    public int AddTblStore(TblStore tblStore) {

         int insert = this.tblStoreMapper.insert(tblStore);
        return insert;
    }

    @Override
    public int UpdateTblStore(TblStore tblStore) {

         int updateByPrimaryKey = this.tblStoreMapper.updateById(tblStore);

        return updateByPrimaryKey;
    }

    @Override
    public TblStore querybyid(Long uuid) {
        return this.tblStoreMapper.findbyid(uuid);
    }

}
