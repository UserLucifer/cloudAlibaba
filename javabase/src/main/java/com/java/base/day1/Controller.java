package com.java.base.day1;

public class Controller {
    public static void main(String[] args) {
        /*
         if三种格式
        if(){

        }
        _____
        if(){

        } else {

        }
        _______
        if(){

        }else if(){

        } else {

        }
        ________
        */

    int num =10;
    int num2 =20;
    int num3 = 40;
    int max = 0;
//    if (num > num2 && num > num3){
//        max = num;
//    } else if( num2 > num && num2 > num3 ){
//        max = num2;
//    } else if (num3 > num && num3 > num2) {
//        max = num3;
//    }
//        System.out.println(max);
        //短语与，都为真才返回true,如果第一个是假，后面的就不执行
        if(num >=20 && num >= num3) {
            max = num;
        }else if(num2 >= num && num2 >= num3) {
            max = num2;
        }else {
            max = num3;
        }

        System.out.println(max);

    }
    
}
