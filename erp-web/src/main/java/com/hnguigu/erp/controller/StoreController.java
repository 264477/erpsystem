package com.hnguigu.erp.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.TblStoreDTO;
import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.entity.TblStore;
import com.hnguigu.erp.mapper.TblStoreMapper;
import com.hnguigu.erp.service.EmpService;
import com.hnguigu.erp.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class StoreController {

    @Autowired
    private StoreService storeService;
    @Autowired
    private EmpService empService;

    //TODO 显示仓库维护
    @RequestMapping("/storeList")
    public String StoreFindAll(Model model,Integer pageNum, Integer pageSize){

         PageInfo<TblStore> storeServiceAll = this.storeService.findAll(pageNum, pageSize);

        model.addAttribute("storeServiceAll",storeServiceAll);

        return "Maintain/warehouse-list";
    }

    @RequestMapping("/storeByName")
    public String StoreFindByName(Model model,Integer pageNum,Integer pageSize){

         PageInfo<TblStore> storeServiceAll = this.storeService.findByNameAndEmpName(pageNum,pageSize);

         model.addAttribute("storeServiceAll",storeServiceAll);

         return "Maintain/warehouse-list";
    }

    //TODO 跳转仓库添加页面
    @RequestMapping("/ToAddStore")
    public String ToAddStore(Model model){

         List<TblStoreDTO> byEmpName = this.storeService.findByEmpName();
         List< TblEmp> tblEmpList=this.empService.findall();
         model.addAttribute("EmpName",byEmpName);
         model.addAttribute("emplist",tblEmpList);
        return "Maintain/warehouse-add";
    }
    @RequestMapping("/AddStore")
    public String AddStore(TblStore tblStore){

        int addTblStore = this.storeService.AddTblStore(tblStore);

        return "redirect:/maintenance/storeList";
    }

    @RequestMapping("/ToUpdateStore")
    public String ToUpdateStore(Model model,Long uuid){
        TblStore store=this.storeService.querybyid(uuid);
        List< TblEmp> tblEmpList=this.empService.findall();
        model.addAttribute("emplist",tblEmpList);
        model.addAttribute("store",store);
        return "Maintain/warehouse-update";
    }

    @RequestMapping("/UpdateStore")
    public String UpdateStore(TblStore tblStore){

          int updateTblStore = this.storeService.UpdateTblStore(tblStore);

        return "redirect:/maintenance/storeList";

    }
}
