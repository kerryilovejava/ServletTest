package com.ismobileorweb;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 16:08
 */
public class MobileDevice {
    public static boolean isMobileDevice(HttpServletRequest request) {

        String ua = request.getParameter("ua");

        if (StringUtils.hasText(ua))
            return "ios".equals(ua) || "android".equals(ua);
        else {
            String userAgent = request.getHeader("User-Agent");
            return userAgent.matches(".*Android.*") || userAgent.matches(".*iPhone.*") || userAgent.matches(".*iPad.*");
        }
    }
}
