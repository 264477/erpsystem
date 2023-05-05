package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.entity.TblRes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface ResService {

    PageInfo<TblRes> finResByName(Integer pageNum , Integer pageSize);
}
