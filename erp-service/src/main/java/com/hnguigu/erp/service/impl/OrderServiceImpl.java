package com.hnguigu.erp.service.impl;

import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblOrder;
import com.hnguigu.erp.mapper.TblEmpMapper;
import com.hnguigu.erp.mapper.TblMenuMapper;
import com.hnguigu.erp.mapper.TblOrderMapper;
import com.hnguigu.erp.service.EmpService;
import com.hnguigu.erp.service.MenuService;
import com.hnguigu.erp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private TblOrderMapper tblOrderMapper;

    @Autowired
    private EmpService empService;


  /*  @Override
    public List<TblOrder> findOrderList() {
        List<TblOrder> orderList = this.tblOrderMapper.findAll();
        return orderList;
    }*/
}
