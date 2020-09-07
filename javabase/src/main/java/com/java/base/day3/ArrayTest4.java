package com.java.base.day3;

public class ArrayTest4 {
    public static void main(String[] args) {
        //数组的复制
        int[] arr = {1,2,3,5,6};//5,下标0开始
        System.out.println("数组的长度是："+arr.length);
        int[] arr2 = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("数组复制完成");
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("-----------------------");
        //数组的反转
        String[] SArr = new String[]{"jj","dd","mm","BB"};
        System.out.print("变换前");
        for (int i = 0; i <SArr.length  ; i++) {
            System.out.print(SArr[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < SArr.length/2; i++) {
                String temp = SArr[i];
                SArr[i] = SArr[SArr.length-i-1];
                SArr[SArr.length-i-1] = temp;
        }
        System.out.print("变换后");
        for (int i = 0; i < SArr.length ; i++) {
            System.out.print(SArr[i]+" ");
        }

        //遍历
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        String[] a = new String[]{"AA","BB","CC"};
        //查找  字符串用equals比较
        String dest = "BB";
        boolean isFlag =true;
        for (int i = 0; i < a.length; i++) {
            if(a[i].toString().equals("DD")){
                System.out.println("找到了指定的元素"+a[i]);
                isFlag =false;
                break;
            }
        }
        if (isFlag){
            System.out.println("很抱歉，没有找到");
        }





    }
}
//165