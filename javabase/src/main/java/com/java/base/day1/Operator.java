package com.java.base.day1;


/*
    算数运算符

    +、-、*、/、% 、前++、后++、前--、后--。

    赋值运算符

    =

    比较运算符
    ==
    !=
    <
    >
    <=
    >=
    instanceof 检查是否是类的对象


 */

public class Operator {

    public static void main(String[] args) {

        //除：/
        int n1 = 12;
        int n2 = 5;
        int result = n1/n2;
        System.out.println(result);//2  不留余数

        int result2 = n1/n2*n2;
        System.out.println(result2);//10

        double result3 = n1 / n2;
        System.out.println(result3);//2.0 int 类型自动向上转型


        //取余运算  %
        int t1 = 12;
        int t2 = 5;
        int e1 = t1%t2;
        System.out.println(e1);//2  不留余数

        int iq = 2;
        int iw = iq++;//先赋值，在自增
        System.out.println("iq = "+iq + " iw:" +iw);

        int ip = 2;
        int il = ++ip;//先自增，在赋值
        System.out.println("ip = "+ip + " iw:" +il);

        int n9 = 4;
        int n10 = 4;
        boolean d =n9!=n10;
        System.out.println(d);//false



    }

}
