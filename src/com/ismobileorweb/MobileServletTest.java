package com.ismobileorweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 16:17
 */
@WebServlet("/MobileServletTest")
public class MobileServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean _b = MobileDevice.isMobileDevice(request);
        if (_b) {
            System.out.println("客户端");
        } else {
            System.out.println("web端");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
