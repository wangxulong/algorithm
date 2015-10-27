package com.wang.rsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/27 0027.
 */
public class RSAUtil {

    public static long getPrime(Long num){
        List<Long> allPrime = new ArrayList<Long>();
        for(long i=0l;i<=num;i++){
            if(isPrime(i)){
                allPrime.add(i);
            }
        }
        if(allPrime.size()>0){
            int index = (int)(Math.random()*allPrime.size());
            return allPrime.get(index);
        }

        return 0L;
    }

    public static boolean isPrime(long num){
        if(num<4L) return false;
       for(long i=2;i<=num/2;i++){
           if(num%i==0) return false;
       }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(getPrime(100L));
    }
}
