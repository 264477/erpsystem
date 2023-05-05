package com.hnguigu.erp.controller;

import com.hnguigu.erp.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BillController {

    @RequestMapping("bill/buyBillList")
    public String buyBillList(){

        return "";
    }
}
