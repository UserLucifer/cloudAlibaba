package com.java.base.day2;

public class ForWhile2 {
    public static void main(String[] args) {

        //打印1-100的所有奇数的和。
        int sum=0;

        for (int i = 1; i <= 100 ; i++) {
            if(i%3!=0){
                sum+=i;
            }
        }
        System.out.println("1-100之间的奇数和是："+sum);


    }
}
