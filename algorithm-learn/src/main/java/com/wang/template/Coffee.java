package com.wang.template;

/**
 * Created by wxl on 2015/10/9.
 *
 * 具体子类，提供了咖啡制备的具体过程
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
