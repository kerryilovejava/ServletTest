package com.designmodel.factorymodle;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description:2种方式获取properties文件,
 * @Author: 5385
 * @Date 2018/6/13
 * @Time 18:04
 */
public class PropertiesReadUtils {
    public Properties getProperties() {
        Properties _properties = new Properties();
//        InputStream _is = PropertiesReadUtils.class.getClassLoader().getResourceAsStream("style.properties"); //文件路径在src下
        InputStream _is = getClass().getResourceAsStream("style.properties");//文件路径和类是在同一级别下
        try {
            _properties.load(_is);
            if (!_properties.isEmpty()) {
                return _properties;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
