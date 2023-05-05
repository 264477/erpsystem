package com.hnguigu.erp.entity;

import java.io.Serializable;
import java.util.Objects;

public class TblMenu implements Serializable {
    private Long uuid;

    private String name;

    private String url;

    private Long puuid;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getPuuid() {
        return puuid;
    }

    public void setPuuid(Long puuid) {
        this.puuid = puuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblMenu tblMenu = (TblMenu) o;
        return Objects.equals(uuid, tblMenu.uuid) && Objects.equals(name, tblMenu.name) && Objects.equals(url, tblMenu.url) && Objects.equals(puuid, tblMenu.puuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, url, puuid);
    }
}