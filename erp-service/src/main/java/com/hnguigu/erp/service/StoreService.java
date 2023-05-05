package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.TblStoreDTO;
import com.hnguigu.erp.entity.TblStore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface StoreService {

    PageInfo<TblStore> findAll(Integer pageNum,Integer pageSize);

    List<TblStoreDTO> findByEmpName();

    PageInfo<TblStore> findByNameAndEmpName(Integer pageNum,Integer pageSize);

    int AddTblStore(TblStore tblStore);

    int UpdateTblStore(TblStore tblStore);


    TblStore querybyid(Long uuid);
}
