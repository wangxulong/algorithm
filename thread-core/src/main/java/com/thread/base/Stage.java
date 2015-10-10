package com.thread.base;

/**
 * Created by wxl on 2015/10/10.
 */
public class Stage extends Thread {

    public void run(){
        ArmyRunnable armySui = new ArmyRunnable();
        ArmyRunnable armyRenMin = new ArmyRunnable();

        Thread sui = new Thread(armySui,"隋朝军队-----");
        Thread renMin = new Thread(armyRenMin,"农民军队");

        //启动线程
        sui.start();
        renMin.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("双方正在激烈斗争，杀出个程咬金。。");
        Thread mrChen = new KeyPerson();
        mrChen.setName("程咬金");
        System.out.println("使得百姓安居乐业。");


        armySui.keepRunning =false;
        armyRenMin.keepRunning=false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //历史人物
        mrChen.start();
        try {
            mrChen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            renMin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Stage().start();
    }
}
