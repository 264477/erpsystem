package com.hnguigu.erp.controller;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.RoleDTO;
import com.hnguigu.erp.dto.RoleByNameOrCode;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblRes;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.service.MenuService;
import com.hnguigu.erp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;

    // TODO 显示角色维护
    @RequestMapping("/roleList")
    public String RoleFindAll(Model model,Integer pageNum,Integer pageSize,Integer prePage){

         PageInfo<TblRole> roleAll = this.roleService.findRoleAll(pageNum, pageSize);

         model.addAttribute("role",roleAll);

        return "Maintain/role-list";
    }

    // TODO 根据角色名称与角色编码查询
    @RequestMapping("/roleName")
    public String FindRoleByNameAndCode(Model model, Integer pageNum, Integer pageSize, Integer prePage, RoleByNameOrCode roleByNameOrCode){

         PageInfo<TblRole> roleAll = this.roleService.findRoleByNameOrCode(pageNum, pageSize,roleByNameOrCode);

        model.addAttribute("role",roleAll);

        return "Maintain/role-list";
    }
    // TODO 显示角色详情
    @RequestMapping("/roleShow")
    public String findRoleShow(Model model,Long uuid){

         List<TblRole> roleByEmpId = this.roleService.findRoleById(uuid);

         model.addAttribute("role",roleByEmpId);

        return "Maintain/role-show";
    }

    // TODO 跳转添加页面
    @RequestMapping("/ToAddRole")
    public String ToAddRole(Model model){

        List<TblMenu> menulist=this.menuService.findall();

        List<TblRes> addByRes = this.roleService.findAddByRes();

        model.addAttribute("menulist",menulist);
        model.addAttribute("byRes",addByRes);

        return "Maintain/role-add";
    }
    // TODO 添加页面的数据请求
    @RequestMapping("/AddRole/{name}/{code}/{resuuid}/{roleuuid}")
    public String AddRole(@PathVariable String name,@PathVariable String code,@PathVariable String resuuid,@PathVariable String roleuuid){

         RoleDTO roleDTO = new RoleDTO();

         roleDTO.setName(name);

         roleDTO.setCode(code);

         roleDTO.setRoleuuid(roleuuid);

         roleDTO.setResuuid(resuuid);

        this.roleService.addRole(roleDTO);

        return  "redirect:/maintenance/roleList";
    }


    // TODO 跳转修改页面
    @RequestMapping("/ToUpdateRole")
    public String ToUpdateRole(Model model,Long uuid,Authentication authentication){

        String name = authentication.getName();

        List<TblMenu> menulist=this.menuService.findall();

        List<TblRes> addByRes = this.roleService.findAddByRes();
        List<TblRes> list=this.roleService.findbyid(uuid);

         TblRole byPrimaryKey = this.roleService.selectByPrimaryKey(uuid);

        List<TblMenu> addByNameAndpuuid = this.roleService.findAddByNameAndpuuid(uuid);

        StringBuffer stringBuffer = new StringBuffer();

        for (TblMenu m: addByNameAndpuuid) {

            stringBuffer.append(m.getUuid()).append(",");
        }

        for(TblRes r:list){
            stringBuffer.append(r.getUuid()).append(",");
        }
        model.addAttribute("byId",byPrimaryKey);

        model.addAttribute("menulist",menulist);

        model.addAttribute("byRes",addByRes);

        model.addAttribute("ByName",stringBuffer);

        return "Maintain/role-update";
    }

    // TODO 修改页面的请求
    @RequestMapping("UpdateRole")
    public String UpdateRole(Integer uuid,String name,String code,String[] resList,String[] menuidList){


        RoleDTO roleDTO=new RoleDTO();

        roleDTO.setId(uuid);

        roleDTO.setName(name);

        roleDTO.setCode(code);

        roleDTO.setMenulist(menuidList);

        roleDTO.setReslist(resList);

        this.roleService.deleteroleres(uuid);

        this.roleService.deleterolemenu(uuid);

        RoleDTO1 roleDTO1 = new RoleDTO1();
        RoleDTO1 roleDTO2 = new RoleDTO1();
        roleDTO2.setId(uuid);
        roleDTO1.setId(uuid);

        for (String m:menuidList) {

            roleDTO1.setUuid(m);

            this.roleService.addrolemenus(roleDTO1);
        }
        for (String r:resList) {

            roleDTO2.setUuid(r);

            this.roleService.addres(roleDTO2);
        }

        this.roleService.updateByid(roleDTO);

      return "redirect:/maintenance/roleList";
    }

}
