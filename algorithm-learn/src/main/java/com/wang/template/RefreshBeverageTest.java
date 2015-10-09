package com.wang.template;

import org.junit.Test;

/**
 * Created by wxl on 2015/10/9.
 */

public class RefreshBeverageTest {
    @Test
    public void coffeeTest(){
        System.out.println("准备咖啡");
        RefreshBeverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();
        System.out.println("咖啡完成");
    }

    @Test
    public void teaTest(){
        System.out.println("准备茶");
        RefreshBeverage tea = new Tea();
        tea.prepareBeverageTemplate();
        System.out.println("茶完成");
    }
}
