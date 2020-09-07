package com.java.base.day6;


/*
* 关于变量的复制
* 如果变量是基本数据类型，此时赋值的是变量所保存的数据值
* 如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值
*
* */
public class MethodArgs {

    public static void main(String[] args) {

        MethodArgs methodArgs = new MethodArgs();
        methodArgs.show("222");
        methodArgs.show("QQ","WW","RR");

    }

    public void show(int i){

    }

    public void show(String ... str){
         System.out.println("...Str1111");
        for (int i = 0; i < str.length ; i++) {
            System.out.println(str[i]);
        }
    }

}
