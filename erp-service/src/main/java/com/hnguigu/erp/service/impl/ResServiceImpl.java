package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.entity.TblRes;
import com.hnguigu.erp.entity.TblResExample;
import com.hnguigu.erp.mapper.TblResMapper;
import com.hnguigu.erp.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResServiceImpl implements ResService {

    @Autowired
    private TblResMapper tblResMapper;


    @Override
    public PageInfo<TblRes> finResByName(Integer pageNum, Integer pageSize) {

        PageInfo<TblRes> pageInfo = new PageInfo<TblRes>();

        TblResExample tblResExample = new TblResExample();

        if (pageNum == null){
            pageNum = 1;
        }
        if (pageSize == null){
            pageSize =5;
        }

        List<TblRes> count = this.tblResMapper.selectByExample(tblResExample);

        PageHelper.startPage(pageNum,pageSize);
        List<TblRes> tblResList = this.tblResMapper.selectByExample(tblResExample);

        pageInfo.setPageSize(pageSize);

        pageInfo.setPageNum(pageNum);

        pageInfo.setList(tblResList);

        pageInfo.setPages(count.size()/pageSize+1);

        pageInfo.setTotal(count.size());

        return pageInfo;
    }
}
