package com.hnguigu.erp.dto;

import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.entity.TblGoods;
import com.hnguigu.erp.entity.TblOperdetail;
import com.hnguigu.erp.entity.TblOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OperdetailDTO extends TblOperdetail {

    //用户
    private List<TblEmp> tblEmpList;

    //商品
    private List<TblGoods> tblGoodsList;

    private List<TblOrder> orders;

    private List<TblOperdetail> operdetails;


}
