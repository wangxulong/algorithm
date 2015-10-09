package com.wang.template;

/**
 * Created by wxl on 2015/10/9.
 */
class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用80度水泡茶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected boolean isWantsCondiments(){
        return false;
    }
}
