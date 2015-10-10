package com.thread.base;

/**
 * Created by wxl on 2015/10/10.
 * 军队线程
 */
public class ArmyRunnable implements Runnable {
    //volatile保证了线程可以正确的读取其他线程写入的值
    volatile boolean keepRunning=true;
    @Override
    public void run() {
        while(keepRunning){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");

                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
