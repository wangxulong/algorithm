package com.wang.al;

import java.util.Date;

/**
 * Created by wxl on 2015/10/4.
 * ��������
 *����˼�룺ͨ��һ������Ҫ��������ݷָ�ɶ������������֣�����
 * һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС��Ȼ���ٰ��մ˷����������������ݷֱ���п�������
 * ����������̿��Եݹ���У��Դ˴ﵽ�������ݱ����������
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
