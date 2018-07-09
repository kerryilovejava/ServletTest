package com.designmodel;


import com.designmodel.factorymodle.*;
import com.designmodel.observermodel.demo.ConcretObserver;
import com.designmodel.observermodel.demo.ConcretWeatherSubject;
import com.designmodel.singlemodle.singleton1;
import com.designmodel.singlemodle.singleton2;
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

    /**
     * 方法描述：工厂模式
     *
     * @return void
     * @author: 5385
     * @date: 2018/6/13  17:58
     */
    @Test
    public void factorymodle() {
        HairInterface _hairLeft = HairFactory.getHairStyle("left");
        _hairLeft.draw();
        HairInterface _hairRight = HairFactory.getHairStyle("right");
        _hairRight.draw();
        HairInterface _hairOther = HairFactory.getHairStyle("ss");
        _hairRight.draw();
    }

    /**
     * 方法描述：抽象工厂模式
     *
     * @return void
     * @author: 5385
     * @date: 2018/6/13  17:58
     */
    @Test
    public void factorymodle1() {
        HNFactory _hnFactory = new HNFactory();
        _hnFactory.getBoy().drawBoy();
        _hnFactory.getGirl().drawGirl();

        MCFactory _mcFactory = new MCFactory();
        _mcFactory.getBoy().drawBoy();
        _mcFactory.getGirl().drawGirl();


    }

    /**
     * 方法描述：观察者模式
     *
     * @param []
     * @return void
     * @author: 5385
     * @date: 2018/6/20  15:32
     */
    @Test
    public void observerModel() {
        //创建目标对象
        ConcretWeatherSubject _weather = new ConcretWeatherSubject();

        //创建观察者
        ConcretObserver _observerGirl = new ConcretObserver();
        _observerGirl.setObserverName("女朋友");
        _observerGirl.setRemindThing("约会");

        ConcretObserver _observerMum = new ConcretObserver();
        _observerMum.setObserverName("老妈");
        _observerMum.setRemindThing("逛街");

        //相互观察者
        _weather.attach(_observerGirl);
        _weather.attach(_observerMum);

        //目标发布天气
        _weather.setWeatherContent("天气晴朗");
    }
}
