package com.designmodel.factorymodle;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/6/13
 * @Time 18:56
 */
public class MCFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
