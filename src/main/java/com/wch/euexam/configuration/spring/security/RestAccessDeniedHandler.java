package com.wch.euexam.configuration.spring.security;


import com.wch.euexam.base.SystemCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @version 3.5.0
 * @description: 没权限
 * Copyright (C), 2020-2021, wch
 * @date 2021/12/25 9:45
 * @author WCH
 */
@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        RestUtil.response(httpServletResponse, SystemCode.AccessDenied);
    }
}
