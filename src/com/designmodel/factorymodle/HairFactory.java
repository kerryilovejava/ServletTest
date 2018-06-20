package com.designmodel.factorymodle;

import java.util.Properties;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/6/13
 * @Time 17:54
 */
public class HairFactory {
    public static HairInterface getHairStyle(String key) {
        try {
            Properties _properties = new PropertiesReadUtils().getProperties();
            HairInterface hair = (HairInterface) Class.forName((String) _properties.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
