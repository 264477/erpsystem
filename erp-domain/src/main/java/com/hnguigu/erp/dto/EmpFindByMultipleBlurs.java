package com.hnguigu.erp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpFindByMultipleBlurs {

    private String username;

    private String pwd;

    private String name;

    private String email;

    private String tele;

    private String address;

    private Integer gender;

    private Long birthday;

    private String depuuid;

    private Long lastlogintime;

    private String lastloginip;

    private Integer logintimes;

}
