package com.designmodel.observermodel.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:目标对象,它知道观察它的观察者,并提供注册(添加)和删除观察的接口
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 14:28
 */
public class WeatherSubject {
    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    //添加订阅天气的人
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //删除订阅天气的人
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知所有订阅天气的人
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
