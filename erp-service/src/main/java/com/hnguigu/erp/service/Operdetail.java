package com.hnguigu.erp.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.erp.dto.OperdetailDTO;
import com.hnguigu.erp.entity.TblOperdetail;
import com.hnguigu.erp.vo.WarehousingVo;

import java.util.List;

public interface Operdetail {

   PageInfo<WarehousingVo> findAllOperdetail(Integer pageNum);


}
