package com.java.base.day1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入小雷的成绩");
        while(true){
            try {
                int i = scanner.nextInt();
                if(i  == 100) {
                    System.out.println("奖励你一辆BMW");
                }else if(i >= 80 && i <= 99){
                    System.out.println("奖励你一台Iphonex max");
                }else if(i >=60 && i <= 80){
                    System.out.println("奖励你一个Ipad");
                }else{
                    System.out.println("什么都没有");
                }
            } catch (Exception e) {
                throw  new RuntimeException("你输入了非法的参数");
            }


        }


    }

}
