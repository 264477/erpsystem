package com.hnguigu.erp.service.impl;

import com.hnguigu.erp.dto.NameANDTele;
import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath*:applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DeptServiceImplTest {

    @Autowired
    private DeptService deptService;

    @Test
    public void testFindDeptByName() {
        /*NameANDTele nameANDTele = new NameANDTele();
        nameANDTele.setName("%总%");*/
//        List<TblDep> tblDepList = this.deptService.findDeptByName(nameANDTele);
       /* List<TblDep> tblDepList = this.deptService.findByName("%总%");
        System.out.println(tblDepList);*/
    }
}