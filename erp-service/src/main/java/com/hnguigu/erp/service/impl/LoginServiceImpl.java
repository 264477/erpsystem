package com.hnguigu.erp.service.impl;

import com.hnguigu.erp.entity.TblEmp;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.entity.TblRole;
import com.hnguigu.erp.mapper.TblEmpMapper;

import com.hnguigu.erp.service.LoginService;
import com.hnguigu.erp.service.MenuService;
import com.hnguigu.erp.service.RoleService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.*;

@Service(value = "loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TblEmpMapper tblEmpMapper;

    @Autowired
    private MenuService menuService;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
        UserDetails userDetails = null;
        if (StringUtils.isEmpty(userName)) {
            throw new NullPointerException("");
        }
        TblEmp tblEmp = this.tblEmpMapper.findByName(userName);

        List<TblRole> roleList = this.roleService.findRoleByEmpId(tblEmp.getUuid());

        Set<TblMenu> tblMenuSet = new HashSet<>();
        for (TblRole tblRole : roleList) {
            List<TblMenu> menuList = this.menuService.findMenuByRoleId(tblRole.getUuid());
            CollectionUtils.addAll(tblMenuSet, menuList.iterator());
        }

        for (TblRole tblRole : roleList) {
            grantedAuthorities.add(new SimpleGrantedAuthority(tblRole.getName()));
        }

        for (TblMenu tblMenu : tblMenuSet) {
            grantedAuthorities.add(new SimpleGrantedAuthority(tblMenu.getUrl()));
        }
        userDetails = new User(userName, tblEmp.getPwd(), grantedAuthorities);
        return userDetails;
    }
}
