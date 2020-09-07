package com.java.base.day4;

import java.util.Collections;
import java.util.Map;

/*
*
* 冒泡排序
* */
public class Array1 {
    public static void main(String[] args) {

    int[] arr = new int[]{43,32,76,-98,0,64,44,-21,32,99};


        for (int i = 0; i < arr.length - 1 ; i++) {

            for (int j = 0; j < arr.length -1 - i ; j++) {

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }





    }
}
