package com.java.base.day1;

public class StringTest {
    /*
    * String引用数据类型。
    *
    * */

    public static void main(String[] args) {

        String s1 = "String类型";
        String[] s = s1.split("r");//切割方法
//        for (String x:s
//             ) {
//            System.out.println(x);
//        }
        for (int i = 0; i < s.length ; i++) {
            System.out.println(s[i]);
        }




    }





}
