package com.java.base.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int i1 = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int i2 = scanner.nextInt();
        int[] array = {i,i1,i2};
        Arrays.sort(array);
        for (int s1: array
             ) {
            System.out.println(s1);
        }



    }
}
