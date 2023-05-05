package com.hnguigu.erp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MenuDTO {

    private Integer uuid;

    private String name;

    private String url;

    private Long ppuid;

    private String roleuuid;
}
