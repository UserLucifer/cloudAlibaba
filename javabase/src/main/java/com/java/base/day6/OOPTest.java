package com.java.base.day6;

/*
* 堆（heap)
* 这块内存区域唯一目的就是存放对象实例
* 所有对象的实例和数组都早在对上分配
*栈（stack)
* 用于存储局部变量
* 局部变量存放了编译期可知长度的各种基本数据类型
* 对象的的引用，他不等同与对象本身
* 是对象在堆的首地址，方法执行完毕，自动释放。
* 方法区（Method,Area)E
* 用于存储已被虚拟机加载的类信息，常量，静态变量
* ，即时编译器编译后的代码。
*
* */
public class OOPTest {
    String name ;
    int age;
    int sex;

    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("年龄为："+age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
    public static void main(String[] args) {
        OOPTest oopTest = new OOPTest();
        oopTest.name="李";
        oopTest.age=12;
        oopTest.sex=1;

        oopTest.study();
        oopTest.showAge();
        oopTest.addAge(2);
        oopTest.showAge();

        OOPTest oopTest2 = new OOPTest();
        oopTest.name="里";
        oopTest.age=14;
        oopTest.sex=6;

        oopTest.study();
        oopTest.showAge();
        oopTest.addAge(3);
        oopTest.showAge();
    }
}
