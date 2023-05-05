package com.hnguigu.erp.controller;


import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.EmpDTO;
import com.hnguigu.erp.dto.EmpFindByMultipleBlurs;
import com.hnguigu.erp.dto.TblEmpDTO;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.service.DeptService;
import com.hnguigu.erp.service.EmpService;
import com.hnguigu.erp.service.ResService;
import com.hnguigu.erp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/maintenance")
public class EmpController {

    @Autowired
    private EmpService empService;

    @Autowired
    private ResService resService;

    @Autowired
    private DeptService deptService;
    @Autowired
    private RoleService roleService;


    //TODO 显示员工维护
    @RequestMapping("/empList")
    public String EmpFindAll(Model model,Integer pageNum,Integer pageSize,Integer prePage){

        //TODO 查询所有员工信息
        PageInfo<TblEmpDTO> tblEmpList = this.empService.list(pageNum,pageSize);

        List<TblDep> deptAll = this.deptService.findDeptAll();

        model.addAttribute("deptAll",deptAll);

        model.addAttribute("emp",tblEmpList);

        return "Maintain/emp-list";
    }

    //TODO 模糊查询
    @RequestMapping("/EmpByMultipleBlur")

    public String EmpFindByMultipleBlur(Model model, Integer pageNum, Integer pageSize, Integer prePage, EmpFindByMultipleBlurs empFindByMultipleBlurs){

        PageInfo<TblEmpDTO> tblEmpList = this.empService.findByMultipleBlurs(pageNum, pageSize, empFindByMultipleBlurs);
        List<TblDep> deptAll = this.deptService.findDeptAll();

        model.addAttribute("deptAll",deptAll);

         model.addAttribute("emp",tblEmpList);

        return "Maintain/emp-list";
    }

    //TODO 查询详情
    @RequestMapping("/empShow")
    public String EmpFindShow(Model model,Long uuid){

         TblEmpDTO empById = this.empService.findEmpById(uuid);
        model.addAttribute("emp",empById);

        return "Maintain/emp-show";

    }
    //TODO 跳转到添加页面
    @RequestMapping("/ToAddEmp")
    public String ToAddEmp(Model model) {
         List<TblDep> deptAll = this.deptService.findDeptAll();
        List<TblRole> rolelist=this.roleService.findall();
        model.addAttribute("deptlist",deptAll);
        model.addAttribute("rolelist",rolelist);
        return "Maintain/emp-add";
    }
    @RequestMapping("/AddEmp")
    public String AddEmp(TblEmp tblEmp){

        int addEmp = this.empService.AddEmp(tblEmp);

        return "redirect:/maintenance/empList";
    }

    //TODO 跳转到修改页面
    @RequestMapping("/ToUpdateEmp")
    public String ToUpdateEmp(Model model,Long uuid){
        final TblEmpDTO emp = this.empService.findEmpById(uuid);
        final List<TblDep> deptAll = this.deptService.findDeptAll();
        List<TblRole> rolelist=this.roleService.findall();
        model.addAttribute("deptlist",deptAll);
        model.addAttribute("rolelist",rolelist);
        model.addAttribute("emp",emp);
        return "Maintain/emp-update";
    }
    @RequestMapping("/UpdateEmp")
    public  String UpdateEmp(TblEmp tblEmp){
        final int i = this.empService.UpdateEmp(tblEmp);

        return "redirect:/maintenance/empList";
    }@RequestMapping("/deleteEmp")
    public  String deleteEmp(Long uuid){
        final int deptById = this.empService.findempById(uuid);
        System.out.println(deptById);
        return "redirect:/maintenance/empList";
    }

}
