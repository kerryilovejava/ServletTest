package com.designmodel.observermodel;

/**
 * @Description:具体观察者对象,实现更新的方法,使自身的状态和目标的状态保持一致
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 14:34
 */
public class ConcretObserver implements Observer {
    //观察者的状态
    private String observerStatus;

    //获取目标类的状态同步到观察者的状态中
    @Override
    public void update(Subject subject) {
        observerStatus = ((ConcretSubject) subject).getSubjectStatus();
    }
}
