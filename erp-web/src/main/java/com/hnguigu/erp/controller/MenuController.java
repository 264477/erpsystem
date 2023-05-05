package com.hnguigu.erp.controller;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.MenuDTO;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.service.MenuService;
import com.hnguigu.erp.service.RoleService;
import com.hnguigu.erp.vo.TblMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class MenuController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private RoleService roleService;
    //TODO 显示菜单维护
    @RequestMapping(value = "/menuList")
    public String MenuFindAll(Model model, Integer pageNum, Integer pageSize, Integer prePage, @ModelAttribute TblMenu tblMenu){

        PageInfo<TblMenuVo> menuByName = this.menuService.findMenuByAll(pageNum, pageSize,tblMenu);

        List<TblMenuVo> tblMenuVoList=this.menuService.findByMenu();
        model.addAttribute("menu",menuByName);
        model.addAttribute("tblMenuVoList",tblMenuVoList);
        model.addAttribute("tblMenu",tblMenu);
        return "Maintain/menu-list";
    }


    @RequestMapping("/ToAddMenu")
    public String ToAddMenu(Model model){
       /*  List<TblRole> findall = this.roleService.findall();*/

        List<TblMenu> menulist=this.menuService.findall();

        model.addAttribute("menulist",menulist);
       /* model.addAttribute("rolelist",findall);*/
        return "Maintain/menu-add";
    }
    @RequestMapping("/AddMenu")
    public String AddMenu(Model model,MenuDTO menuDTO){

 /*        MenuDTO menuDTO = new MenuDTO();

         menuDTO.setName(name);

         menuDTO.setUrl(url);

         menuDTO.setPpuid(puuid);

         menuDTO.setRoleuuid(roleuuid);*/


         this.menuService.addMenu(menuDTO);

        return "redirect:/maintenance/menuList";
    }

    @RequestMapping("/ToUpdateMenu")
    public String ToUpdateMenu(Model model,Long uuid){
        TblMenu menu=this.menuService.MenufindByid(uuid);
        List<TblMenu> menulist=this.menuService.findall();
         List<TblRole> findall = this.roleService.findall();
        model.addAttribute("rolelist",findall);
        model.addAttribute("menu",menu);
        model.addAttribute("menulist",menulist);
        return "Maintain/menu-update";
    }
    @RequestMapping("/updatemenu")
    public String updatemenu(TblMenu tblMenu){
        this.menuService.updata(tblMenu);
        return "Maintain/menu-list";
    }

}
