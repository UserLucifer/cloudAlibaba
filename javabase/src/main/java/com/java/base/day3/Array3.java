package com.java.base.day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array3 {



    /*
    * 二维数组，数组一旦初始化文成，长度就确定
    * */

    public static void main(String[] args) {
        //1.二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};
        //静态
        int[][] arr1 = new int[][]{{1,2,3},{3,4}};
        //动态1
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        //正确
        int[] arr5[] = {{2,2},{23,4}};

        //如何调用数组指定的位置的元素；
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);

        //如何获取数组的长度
        System.out.println(arr5.length);
        //如何遍历二维数组
        for (int i = 0; i < arr5.length ; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.println(arr5[i][j]);
            }
        }

    }
//151







}
