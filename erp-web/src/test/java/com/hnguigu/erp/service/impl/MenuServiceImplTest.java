package com.hnguigu.erp.service.impl;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@ContextConfiguration(locations = "classpath*:applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuServiceImplTest {
    @Autowired
    private MenuService menuService;

  /*  @Test
    public void findMenuByAll() {
        final PageInfo<TblMenu> menuByAll = this.menuService.findMenuByAll(1, 5);
        System.out.println(menuByAll);
    }*/
}