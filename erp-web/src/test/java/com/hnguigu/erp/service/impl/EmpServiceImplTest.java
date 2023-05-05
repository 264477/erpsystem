package com.hnguigu.erp.service.impl;

import com.hnguigu.erp.dto.EmpFindByMultipleBlurs;
import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.mapper.TblEmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@ContextConfiguration(locations = "classpath*:applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmpServiceImplTest {
        @Autowired
        private TblEmpMapper tblEmpMapper;
    @Test
    public void findByMultipleBlurs() {
        EmpFindByMultipleBlurs emp=new EmpFindByMultipleBlurs();
        final List<TblEmp> byMultipleBlur = this.tblEmpMapper.findByMultipleBlur(emp);
        System.out.println(byMultipleBlur);
    }
}