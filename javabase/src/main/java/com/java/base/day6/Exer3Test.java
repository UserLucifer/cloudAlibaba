package com.java.base.day6;



/*
* 匿名对象
* new.XXX()
* 理解：创建对象时候没有指定一个变量；
* */
public class Exer3Test {
    public static void main(String[] args) {

        new Student();
        method(new Student());
    }

    private static void method(Student student) {
        student.name="nihao";
        student.sex=2;
    }

}

class Student{
    String name;
    int sex;
}
