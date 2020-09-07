package com.java.base.day3;

public class ArrayTest {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,5}};
        int sum = 0;//记录总和

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("总和为："+sum);


    }
}
