package com.hnguigu.erp.dto;

import com.hnguigu.erp.entity.TblEmp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TblStoreDTO {

    private String name;

    private String address;

    private Long empuuid;

    private String  empname;
}
