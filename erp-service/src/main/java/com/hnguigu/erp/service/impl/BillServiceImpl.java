package com.hnguigu.erp.service.impl;

import com.hnguigu.erp.entity.TblOrder;
import com.hnguigu.erp.service.BillService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BillServiceImpl implements BillService {
    @Override
    public List<TblOrder> Queryorder() {
        return null;
    }
}
