package com.java.base.day3;


/*
   二维数组：
   规定：二位数组分外层数组的元素，内层数组的元素
   int[][] arr = new int[4][3];
   外层：arr[0],arr[1]等；
   内层：arr[o][o],arr[1][2]等。


   数组 元素的默认初始化值
   针对于初始化方式1， int[][] arr = new int [3][3]
   外层初始化：地址值
   内层初始化：以一维数组初始化相同；

   二：int[][] arr = new int[3][]
   外层元素：null
   内层元素：不能调用，报错 //空指针

 */

public class Array4 {
    public static void main(String[] args) {

        int [] arr = new int[4];
        System.out.println(arr[1]); //int 初始值 0

        double[] arr2 = new double[2];
        System.out.println(arr2[1]);

        char[] arr3 = new char[2];
        System.out.println("char的初始值："+arr3[1]+"__");






    }
}
