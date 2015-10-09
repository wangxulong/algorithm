package com.wang.al;

import java.util.Date;

/**
 * Created by wxl on 2015/10/4.
 * 快速排序
 *基本思想：通过一趟排序将要排序的数据分割成独立的两个部分，其中
 * 一部分的所有数据都比另外一部分的所有数据都要小，然后再按照此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序排序。
 */
public class QuickSort {

    public int[] sort(int arr[],int low,int high){
        int l=low;
        int h=high;
        int povit=arr[low];
        while(l<h){
            while(l<h&&arr[h]>=povit) h--;
            if(l<h){
                int temp = arr[h];
                arr[h]=arr[l];
                arr[l] = temp;
                l++;
            }
            while(l<h&&arr[l]<=povit) l++;
            if(l<h){
                int temp = arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
            }

        }
        if(l>low) sort(arr,low,l-1);
        if(h<high) sort(arr,l+1,high);
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,5,7,3,2,10,11,4};
        long beginTime = new Date().getTime();
        QuickSort quickSort = new QuickSort();
       arr= quickSort.sort(arr,0,arr.length-1);
        System.out.println(new Date().getTime()-beginTime);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
