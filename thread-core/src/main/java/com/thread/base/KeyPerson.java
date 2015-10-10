package com.thread.base;

/**
 * Created by wxl on 2015/10/10.
 */
public class KeyPerson extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始了战斗");
        for(int i=0;i<9;i++){
            System.out.println(Thread.currentThread().getName()+"激烈厮杀，攻击随军。。。");
        }

        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
