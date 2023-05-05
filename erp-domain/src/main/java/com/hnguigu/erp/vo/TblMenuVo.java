package com.hnguigu.erp.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TblMenuVo {
    private Long uuid;

    private String name;

    private String url;

    private String puuid;
}
