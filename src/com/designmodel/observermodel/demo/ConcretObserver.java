package com.designmodel.observermodel.demo;

/**
 * @Description:具体观察者对象,实现更新的方法,使自身的状态和目标的状态保持一致
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 14:34
 */
public class ConcretObserver implements Observer {
    //观察者的名字
    private String observerName;
    //天气的内容情况
    private String weatherContent;
    //提醒的内容
    private String remindThing;

    //获取目标类的状态同步到观察者的状态中
    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcretWeatherSubject) subject).getWeatherContent();
        System.out.println(observerName + "," + weatherContent + "," + remindThing);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
