package com.wang.template;

/**
 * Created by wxl on 2015/10/9.
 * 抽象基类，为所有子类提供一个算法框架
 *
 * 提神饮料
 */
public abstract class  RefreshBeverage {

    /**
     * 封装了所有子类共同遵循的的算法框架
     */
    public final void prepareBeverageTemplate(){
        //步骤一 将水煮沸
        boilWater();
        //步骤二 泡制饮料
        brew();
        //3 将饮料倒入杯中
        pourInCup();
        //4.添加调味料
        if(isWantsCondiments()) addCondiments();
    }

    /**
     * 基本方法，将水煮沸
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }
    //泡制饮料
    protected abstract void brew();
    private void pourInCup(){
        System.out.println("将饮料倒入杯中");
    };
    //添加调味料
    protected abstract void addCondiments();

    /**
     * Hook，钩子函数，提供一个默认的或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * @return
     */
    protected boolean isWantsCondiments(){
        return true;
    }
}
