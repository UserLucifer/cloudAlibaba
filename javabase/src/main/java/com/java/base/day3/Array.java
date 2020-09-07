package com.java.base.day3;

public class Array
{
    public static void main(String[] args) {

        //1.数组下标是从0开始的。
        //2.数组元素初始化默认值：
        /*
        整形：0；
        浮点：0.0
        char：0 或'\u0000' 而非 ‘0’
        boolean: false

        引用类型是：null;


        */

        //创建数组的方式
        int [] arr;
        int [] arrs = new int []{1,2,3};
        int [] arrs1 = {1,23,4};
        int [] ars = new int [2];

        //如何获取数组的长度
        System.out.println(arrs.length);

        //如何遍历数组
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        //遍历数组2
        for (int s: arrs
             ) {
            System.out.println(s);
        }





















    }

}
