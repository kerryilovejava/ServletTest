package com.servlet.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name + "===" + age);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name + "===" + age);
        String json = readContentFromStream(request.getInputStream());
        System.out.println(json);

    }

    private static String readContentFromStream(InputStream is) {
        if (is == null) {
            return null;
        }
        BufferedReader _br = null;
        InputStreamReader _isr = null;
        String _tempStr;
        StringBuilder _contentSb = new StringBuilder();
        try {
            _isr = new InputStreamReader(is, "UTF-8");
            _br = new BufferedReader(_isr);
            while ((_tempStr = _br.readLine()) != null) {
                _contentSb.append(_tempStr).append(System.getProperty("line.separator"));
            }
        } catch (Exception ignored) {
        } finally {
            try {
                if (_br != null) {
                    _br.close();
                }
                if (_isr != null) {
                    _isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String _oStr = _contentSb.toString();
        return "".equals(_oStr) ? null : _oStr.trim();
    }
}
