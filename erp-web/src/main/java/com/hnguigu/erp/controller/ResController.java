package com.hnguigu.erp.controller;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.entity.TblRes;
import com.hnguigu.erp.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maintenance")
public class ResController {

    @Autowired
    private ResService resService;

    //TODO 显示资源维护
    @GetMapping("/resList")
    public String ResFindAll(Model model ,Integer pageNum,Integer pageSize,Integer prePage){

        PageInfo<TblRes> ResName = this.resService.finResByName(pageNum,pageSize);

        model.addAttribute("res",ResName);

        return "Maintain/capital-list";
    }
}
