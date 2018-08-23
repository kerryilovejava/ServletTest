package com.enumdemo;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/8/16
 * @Time 17:42
 */
public enum Enum1 {
    NAME(1),
    AGE(2);

    int value;

    Enum1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println(Enum1.NAME.value);
        System.out.println(Enum1.NAME.getValue());
        System.out.println(Enum1.AGE.value);
        System.out.println(Enum1.AGE.getValue());
    }
}

