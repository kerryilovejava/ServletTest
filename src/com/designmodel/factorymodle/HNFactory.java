package com.designmodel.factorymodle;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/6/13
 * @Time 18:56
 */
public class HNFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
