package com.hnguigu.erp.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WarehousingVo {

    //订单号
    private String orderNumber;

    //跟单人编号
    private String merchandiserName;

    //种类编号
    private Integer speciesId;

}
