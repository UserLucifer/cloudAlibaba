package com.java.base.day4;


import java.util.Arrays;

/*
        Arrays Tool Class
* */
public class Arrays1 {
    public static void main(String[] args) {

    //1.boolean equals(int[]a,int[]b);判断两个数组是否相等；
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{2,1,3,4};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);
    //2.String toString(int a);输出数组信息
        String s = Arrays.toString(arr1);
        System.out.println(s);

    //3.void fill(int[]a,int val)将制定值填充到数组之中
        Arrays.fill(arr1,20);
        System.out.println(Arrays.toString(arr1));

    //4.void.sort(int[]a)；对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    //int binarySearch(int[]a,int key);二分查找
        int[] arr3 = {2,5,7,4,6,9,6,5};
        int i = Arrays.binarySearch(arr3, 5);
        if(i>=0){
            System.out.println(i);
        }else {
            System.out.println("未找到");
        }


    }
}
