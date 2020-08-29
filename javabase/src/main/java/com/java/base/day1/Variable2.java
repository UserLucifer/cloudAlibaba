package com.java.base.day1;

public class Variable2 {
    public static void main(String[] args) {

/*自动类型的提升
byte -> short -> int -> long -> float -> double
byte 、char、short -> int -> long -> float -> double

    特别：当 byte,char,short三种类型的变量做运算时，结果为Int型。

    当容量小的数据类型的变量与容量大的数据类型的变量做运算时，
    结果自动提升容量大的数据类型。

    向下转型需要强转，强制类型转换，可能会导致精度损失
    比自己大的数据类型自动转换
*/

        byte b1;
        int i1 = 11;
        b1 = (byte) i1;  //Int 向下转型需要强转。
        System.out.println(i1);

        float f1 = 2L;
        double d1 = 3;
        f1 = (float) d1; //  比自己大的数据类型自动转换
        //System.out.print(d1+"\t\n");

        short s1 = 2;
        char c1 = '2';
        int i2;
        i2 = s1+c1;
        System.out.println(i2);
    }

}
