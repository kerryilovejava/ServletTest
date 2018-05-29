package com.designmodel.singlemodle;

/**
 * @Description:单例模式--懒汉式
 * @Author: 5385
 * @Date 2018/5/2
 * @Time 17:33
 */
public class singleton2 {

    private singleton2() {
    }

    private static singleton2 instance;

    public static singleton2 getInstance() {
        if (instance == null) {
            instance = new singleton2();
        }
        return instance;
    }

}
