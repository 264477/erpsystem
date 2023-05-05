package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.EmpDTO;
import com.hnguigu.erp.dto.MenuDTO;
import com.hnguigu.erp.dto.RoleDTO1;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblMenuExample;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.entity.TblRolemenu;
import com.hnguigu.erp.mapper.TblMenuMapper;
import com.hnguigu.erp.mapper.TblRolemenuMapper;
import com.hnguigu.erp.service.MenuService;
import com.hnguigu.erp.vo.TblMenuVo;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MenuServiceImpl implements MenuService {
    @Autowired
    private TblMenuMapper tblMenuMapper;

    @Autowired
    private TblRolemenuMapper tblRolemenuMapper;

    @Override
    public List<TblMenu> findMenuByRoleId(Long id) {
        List<TblMenu> menuByRoleId = this.tblMenuMapper.findMenuByRoleId(id);
        return menuByRoleId;
    }

    @Override
    public PageInfo<TblMenuVo> findMenuByAll(Integer pageNum,Integer pageSize,TblMenu tblMenu) {

        PageInfo<TblMenuVo> pageInfo = new PageInfo<TblMenuVo>();

        TblMenuExample tblMenuExample = new TblMenuExample();

         if (pageNum == null){
             pageNum =1;
         }
         if (pageSize == null){
             pageSize = 5;
         }
         List<TblMenuVo> count = this.tblMenuMapper.findMenuAll(tblMenu);

         PageHelper.startPage(pageNum,pageSize);
         List<TblMenuVo> tblMenuList = this.tblMenuMapper.findMenuAll(tblMenu);

         pageInfo.setPageSize(pageSize);

         pageInfo.setPageNum(pageNum);

         pageInfo.setList(tblMenuList);

         pageInfo.setPages(count.size() / pageSize + 1);

         pageInfo.setTotal(count.size());


        return pageInfo;
    }

    @Override
    public List<TblMenuVo> findByMenu() {
        return this.tblMenuMapper.findByMenu();
    }

    @Override
    public TblMenu MenufindByid(Long uuid) {
        return this.tblMenuMapper.selectByPrimaryKey(uuid);
    }

    @Override
    public List<TblMenu> findall() {
        return this.tblMenuMapper.findall();
    }

    @Override
    public List<TblRole> findByRole() {

         List<TblRole> byRole = this.tblMenuMapper.findByRole();

         return byRole;
    }

    @Override
    public void updata(TblMenu tblMenu) {
        this.tblMenuMapper.updateByPrimaryKey(tblMenu);
    }

    @Override
    public void addMenu(MenuDTO menuDTO) {


        this.tblMenuMapper.addMenu(menuDTO);


     /*   Integer  id = this.tblMenuMapper.addMenu(menuDTO);

        for (String m: menuDTO.getRoleuuid().split(",")) {
            if (!ObjectUtils.isEmpty(m)){
                TblRolemenu tblRolemenu = new TblRolemenu();
                tblRolemenu.setRoleuuid(menuDTO.getUuid().longValue());
                tblRolemenu.setMenuuuid(new Long(m));

                List<TblMenu> tblMenuList=this.tblMenuMapper.findByPuuid(new Long(m));
                this.tblRolemenuMapper.insert(tblRolemenu);
                for (TblMenu tblMenu : tblMenuList){
                    tblRolemenu.setMenuuuid(tblMenu.getUuid());
                    this.tblRolemenuMapper.insert(tblRolemenu);
                }
            }
        }*/


    }

/*    @Override
    public void addRoleMenu(RoleDTO1 roleDTO1) {

        this.tblMenuMapper.addRoleMenu(roleDTO1);

    }*/

    @Override
    public PageInfo<TblMenuVo> findMenuByNameAndZiName(Integer pageNum, Integer pageSize) {

        PageInfo<TblMenuVo> pageInfo =new PageInfo<TblMenuVo>();
        return pageInfo;
    }


}
