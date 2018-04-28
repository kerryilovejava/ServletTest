package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description: filter在访问哪个serlet之前过滤
 * @Author: 5385
 * @Date 2018/4/25
 * @Time 11:12
 */
@WebFilter(urlPatterns = "/ServletTest")
public class filterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器");
    }

    @Override
    public void destroy() {

    }
}
