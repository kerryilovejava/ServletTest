package com.designmodel.observermodel;

/**
 * @Description:具体的目标对象,负责把有关状态存入相应的观察者对象中
 * @Author: 5385
 * @Date 2018/6/20
 * @Time 14:31
 */
public class ConcretSubject extends Subject {
    //目标对象状态
    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
        this.notifyObservers();
    }
}
