package com.designmodel.singlemodle;

/**
 * @Description:单例模式--饿汉式
 * @Author: 5385
 * @Date 2018/5/2
 * @Time 17:33
 */
public class singleton1 {

    //私有化构造
    private singleton1() {
    }

    private static singleton1 instance = new singleton1();

    public static singleton1 getInstance() {
        return instance;
    }

}
