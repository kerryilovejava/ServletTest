package com.initservlet;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/*
     * @Description:  initServlet在项目刚启动的时候就开始加载
     * @Author:  5385
     * @Date:  2018/4/25
     * @Time:  11:31
*/
@WebServlet(displayName = "InitServlet", name = "InitServlet", urlPatterns = {"/InitServlet"}, loadOnStartup = 1)
public class InitServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 6150096519262309286L;

    public InitServlet() {
        super();
    }

    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) throws ServletException {
        System.out.println("servlet的init");

    }

}
