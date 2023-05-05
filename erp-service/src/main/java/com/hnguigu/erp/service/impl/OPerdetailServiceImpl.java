package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.OperdetailDTO;
import com.hnguigu.erp.entity.*;
import com.hnguigu.erp.mapper.*;
import com.hnguigu.erp.service.Operdetail;
import com.hnguigu.erp.vo.WarehousingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class OPerdetailServiceImpl implements Operdetail {

    @Autowired
    private TblOrderdetailMapper orderdetailMapper;

    @Override
    public PageInfo<WarehousingVo> findAllOperdetail(Integer pageNum) {

        //每页大小
        Integer pageSize =3;
        if (pageNum == null || pageNum == 0){
            pageNum = 1;
        }
        //查询总数量
        List<WarehousingVo> count = this.orderdetailMapper.findOrderdetailANDOrder();

        PageHelper.startPage(pageNum,pageSize);
        List<WarehousingVo> orderdetailANDOrder = this.orderdetailMapper.findOrderdetailANDOrder();
        //装分页数据
        PageInfo<WarehousingVo> listPageInfo = new PageInfo<>();
        listPageInfo.setPageSize(pageSize);
        listPageInfo.setPageNum(pageNum);
        listPageInfo.setList(orderdetailANDOrder);
        listPageInfo.setPages(count.size()/pageSize+1);
        listPageInfo.setTotal(count.size());
        return listPageInfo;
    }
}
