package com.designmodel.observermodel.demo;

/**
 * @Description:具体的目标对象,负责把有关状态存入相应的观察者对象中
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 14:31
 */
public class ConcretWeatherSubject extends WeatherSubject {
    //获取天气的内容信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //内容有了,说明天气更新了,通道所有订阅的人
        this.notifyObservers();
    }
}
