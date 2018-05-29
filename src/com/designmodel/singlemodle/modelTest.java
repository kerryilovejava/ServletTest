package com.designmodel.singlemodle;


import org.junit.Test;

/**
 * @Description:23种设计模式
 * @Author: 5385
 * @Date 2018/5/2
 * @Time 17:34
 */
public class modelTest {

    /**
     * @Description: 单例模式(开发时一般使用饿汉式)
     * @Author: 5385
     * @Date: 2018/5/2
     * @Time: 18:25
     */
    @Test
    public void singletest() {
        //饿汉式
        singleton1 instance1 = singleton1.getInstance();
        singleton1 instance2 = singleton1.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);


        //懒汉式
        singleton2 instance3 = singleton2.getInstance();
        singleton2 instance4 = singleton2.getInstance();
        System.out.println(instance3);
        System.out.println(instance4);
    }
}
