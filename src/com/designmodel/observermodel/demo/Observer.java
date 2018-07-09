package com.designmodel.observermodel.demo;

/**
 * @Description:这是一个观察者接口,定义一个更新的接口给那些有目标发生改变的时候被通知的对象
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 14:34
 */
public interface Observer {
    public void update(WeatherSubject subject);
}
