package com.hnguigu.erp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TblEmp {
    private Long uuid;
    //用户名
    private String username;
    //用户密码
    private String pwd;
    //真实姓名
    private String name;
    //邮箱
    private String email;
    //电话
    private String tele;
    //地址
    private String address;

    private Integer gender;

    private Long birthday;

    private Long depuuid;

    private Long lastlogintime;

    private String lastloginip;

    private Integer logintimes;

//    public Long getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(Long uuid) {
//        this.uuid = uuid;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username == null ? null : username.trim();
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd == null ? null : pwd.trim();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name == null ? null : name.trim();
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email == null ? null : email.trim();
//    }
//
//    public String getTele() {
//        return tele;
//    }
//
//    public void setTele(String tele) {
//        this.tele = tele == null ? null : tele.trim();
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address == null ? null : address.trim();
//    }
//
//    public Integer getGender() {
//        return gender;
//    }
//
//    public void setGender(Integer gender) {
//        this.gender = gender;
//    }
//
//    public Long getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Long birthday) {
//        this.birthday = birthday;
//    }
//
//    public Long getDepuuid() {
//        return depuuid;
//    }
//
//    public void setDepuuid(Long depuuid) {
//        this.depuuid = depuuid;
//    }
//
//    public Long getLastlogintime() {
//        return lastlogintime;
//    }
//
//    public void setLastlogintime(Long lastlogintime) {
//        this.lastlogintime = lastlogintime;
//    }
//
//    public String getLastloginip() {
//        return lastloginip;
//    }
//
//    public void setLastloginip(String lastloginip) {
//        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
//    }
//
//    public Integer getLogintimes() {
//        return logintimes;
//    }
//
//    public void setLogintimes(Integer logintimes) {
//        this.logintimes = logintimes;
//    }
}