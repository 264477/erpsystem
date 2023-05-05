package com.hnguigu.erp.controller;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.NumberANDpeople;
import com.hnguigu.erp.dto.OperdetailDTO;
import com.hnguigu.erp.entity.TblOperdetail;
import com.hnguigu.erp.mapper.TblOperdetailMapper;
import com.hnguigu.erp.service.Operdetail;
import com.hnguigu.erp.vo.WarehousingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/warehouse")
public class Inventory {

    @Autowired
    private Operdetail operdetail;

    @GetMapping("/findAll")
    public String warehousingfindAll(Model model,Integer prePage){
        PageInfo<WarehousingVo> warehousingVoPageInfo = this.operdetail.findAllOperdetail(prePage);
        model.addAttribute("warehousingVoPageInfo",warehousingVoPageInfo);
        return  "user-list";
    }

    @PostMapping("/findBynumberANDpeople")
    public String  findBynumberANDpeople(NumberANDpeople numberANDpeople){
        System.out.println(numberANDpeople);
        return null;
    }

}
