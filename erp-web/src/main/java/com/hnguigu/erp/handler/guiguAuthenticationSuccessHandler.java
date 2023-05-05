package com.hnguigu.erp.handler;
import com.hnguigu.erp.dto.TblMenuDTO;
import com.hnguigu.erp.entity.TblMenu;
import com.hnguigu.erp.mapper.TblMenuMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class guiguAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private TblMenuMapper tblMenuMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        List<TblMenuDTO> tblMenuDTOList = new ArrayList<>();
        List<TblMenuDTO> tblMenuDTOList2 = new ArrayList<>();
        String userName = authentication.getName();

        List<TblMenu> tblMenuList = this.tblMenuMapper.findMenuByEmpUserName(userName);
        TblMenuDTO tblMenuDTO = null;
        TblMenuDTO tblMenuDTO2 = null;
        for (TblMenu tblMenu : tblMenuList) {
            Set<TblMenu> menuDTOSet = new HashSet<>();
            if (tblMenu.getUuid() == 1) {
                tblMenuDTO = new TblMenuDTO();
                BeanUtils.copyProperties(tblMenu, tblMenuDTO);
                tblMenuDTOList.add(tblMenuDTO);
                for (TblMenu tblMenu2 : tblMenuList) {
                    if (tblMenu2!=null){
                        if (!menuDTOSet.contains(tblMenu2)) {
                            if (tblMenu2.getPuuid().equals(tblMenu.getUuid())) {
                                menuDTOSet.add(tblMenu2);
                            }
                        }
                    }
                }
                tblMenuDTO.setTblMenuSet(menuDTOSet);
                for (TblMenu tblMenu1 : menuDTOSet) {
                    Set<TblMenu> menuDTOSet2 = new HashSet<>();
                    tblMenuDTO2 = new TblMenuDTO();
                    BeanUtils.copyProperties(tblMenu1, tblMenuDTO2);
                    for (TblMenu tblMenu3 : tblMenuList) {
                        if (tblMenu3!=null){
                            if (tblMenu1.getUuid().equals(tblMenu3.getPuuid())) {
                                menuDTOSet2.add(tblMenu3);
                                tblMenuDTO2.setTblMenuSet(menuDTOSet2);
                            }
                      }
                    }
                    tblMenuDTOList2.add(tblMenuDTO2);
                }
                break;
            }
        }
        HttpSession session = httpServletRequest.getSession();

        session.setAttribute("tblMenuDTOList", tblMenuDTOList);
        session.setAttribute("tblMenuDTOList2", tblMenuDTOList2);
        httpServletRequest.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(httpServletRequest, httpServletResponse);
    }
}

