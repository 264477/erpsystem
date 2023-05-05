package com.hnguigu.erp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDTO {
    private Integer id;
    private String name;
    private String code;
    private String roleuuid;

    private String resuuid;

    private String[] reslist;

    private String[] menulist;
}
