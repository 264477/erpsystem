package com.hnguigu.erp.controller;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.NameANDTele;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.service.DeptService;
import com.hnguigu.erp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/maintenance")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private EmpService empService;
    private String sb="";

    //TODO 显示部门维护
    @RequestMapping("/depList")
    public String DeptFindAll(Model model,Integer pageNum,Integer pageSize,Integer prePage){

         PageInfo<TblDep> deptByName = this.deptService.findDeptByName(pageNum,pageSize);

         model.addAttribute("dept",deptByName);
         model.addAttribute("r",sb);

         return "Maintain/dept-list";
    }

    //TODO 根据部门名称与电话查询
    @RequestMapping("/depByName")
    public String DeptFindByName(Model model,Integer pageNum,Integer pageSize,Integer prePage,NameANDTele nameANDTele){

         PageInfo<TblDep> deptByName = deptService.findDeptByNameOrTele(pageNum,pageSize,nameANDTele);

          model.addAttribute("dept", deptByName);

          return "Maintain/dept-list";
    }

    //TODO 显示部门详情
    @RequestMapping("/depShow")
    public String DeptFindShowById(Model model, Long uuid){

        TblDep deptById = this.deptService.findDeptById(uuid);

        model.addAttribute("dept",deptById);

        return "Maintain/dept-show";
    }

    //TODO 跳转到添加部门页面
    @RequestMapping("/toAddDep")
    public String ToAddDept(){
        return "Maintain/dept-add";
    }


    //TODO 添加部门的数据请求
    @RequestMapping("/addDept")
    public String AddDept(TblDep tblDep){

        System.out.println("addDept==="+tblDep);

        deptService.AddDept(tblDep);

        return "redirect:/maintenance/depList";
    }

    //TODO 跳转到修改页面
    @RequestMapping("/ToUpdate")
    public String ToUpdate(Long uuid,Model model){

         TblDep deptById = this.deptService.findDeptById(uuid);

         model.addAttribute("updateDep",deptById);

        return "Maintain/dept-update";
    }

    //TODO 修改部门信息
    @RequestMapping("/UpdateDep")
    public String UpdateDept(TblDep tblDep){

        System.out.println("UpdateDep==="+tblDep);

        this.deptService.UpdateDeptById(tblDep);

        return "redirect:/maintenance/depList";

    }

    @RequestMapping("/deleteDep")
    public String DeleteDept(Model model,Long uuid, HttpServletRequest request){
         List<TblEmp> tblEmpList = this.empService.findDeptById(uuid);
         if (tblEmpList.size()>0){
             sb="该部门下有员工不能删除";
         }else{
            sb="删除成功";
             this.deptService.delteDeptById(uuid);
         }
        return "redirect:/maintenance/depList";
           }


}
