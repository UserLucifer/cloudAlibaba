package com.java.base.day5;
/*
* 1.Java面向对象学习的三条主线
* 1.Java类及类的成员，属性，方法，构造器，代码块，内部类
* 2。面向对象三大特征：封装，继承，多态、（抽线性）
* 3.其他关键字
* this.super,static final,abstract,interface,package,import
* 面向过程（POP)与面向对象（OOP)
* 二者都是一种思想，面向对象是相对于面向过程而言的。面向过程，强调的是功能行为
* 以函数为最小单位，考虑怎么做。
* 面向对象：将功能封装进对象，强调具备了功能的对象，以类、对象为最小单位，考虑
* 谁来做
* 面向对象更加强调运用人类在日常的思维逻辑中采用的思想和原则，如果抽象，分类，
* 继承，聚合，多态等。
*
* 设计类，就是设计类的成员
*
*   属性 = 成员变量 = field = 域、字段
*   方法 = 成员方法 = 函数 = method
*   创建类的对象 = 类的实例化 = 实例化类
*
*   类和对象的使用（面向对象思想落地实现）
* 1.创建类，设计类的成员
* 创建类的对象
* 通过对象。属性或者对象。方法调用对象的结构
*
* 3.如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性（非static)
*   意味着，如果我们修改了一个对象的属性a，则不影响另外一个对象属性a的值
*
*
* */
public class OOPTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        person.name="ss";
        person1.name="xx";
        System.out.println(person.name);
        System.out.println(person1.name);
        //创建两个对象，修改一个不会影响另一个

    }
}

class Person{

    String name;
    String sex;



}