package com.hnguigu.erp.dto;

import com.hnguigu.erp.entity.TblDep;
import com.hnguigu.erp.entity.TblEmp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TblEmpDTO extends TblEmp implements Serializable {

    private static final long serialVersionUID = -2723341183195677433L;

    private TblDep tblDep;

    private String depname;

    private List<TblEmp> empList;






}
