package com.getProperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/9/7.
 */
public class demo1 {
    public static void main(String[] args) {
        Properties _pro = getSrcPro();
        String name = _pro.getProperty("name");
        System.out.println(name);
    }

    /**
     * 获取src下的文件(任意)
     *
     * @return
     */
    private static Properties getSrcPro() {
        InputStream _is = null;
        Properties _oProperties = new Properties();
//        _is = demo1.class.getClassLoader().getResourceAsStream("demo1.properties");
        _is = demo1.class.getClassLoader().getResourceAsStream("\\com\\getProperties\\demo2.properties");
        try {
            _oProperties.load(_is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return _oProperties;
    }


}