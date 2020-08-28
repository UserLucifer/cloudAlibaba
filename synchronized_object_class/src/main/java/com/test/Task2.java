package com.test;

/*
* 对象锁，和类锁的区别
* synchronized加到static方法前是给class枷锁，就是类锁，而
* synchronized加到非静态方法前就是给对象上锁
* 对象锁和类锁是不同的锁，所以多个线程同时执行这2个不同锁的方法时，是异步的。
* */

/*
* Task2三个方法
 * doLongTimeTaskA和doLongTimeTaskB是类锁
 * ，而doLongTimeTaskC是对象锁。
* */
public class Task2 {
    //类锁
    public synchronized static void doLongTimeTaskA() {
        System.out.println("name = " + Thread.currentThread().getName() + " , begin");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("name = " + Thread.currentThread().getName() + ", end");
    }

    //类锁
    public synchronized static void doLogTimeTaskB() {
        System.out.println(" name = " + Thread.currentThread().getName() + ", begin");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("name = " + Thread.currentThread().getName() + ", end");
    }

    //对象锁
    public synchronized void doLongTimeTaskC() {
        System.out.println(" name = " + Thread.currentThread().getName() + ", begin");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" name = " + Thread.currentThread().getName() + ", end");
    }

    //main
    public static void main(String[] args) {


        /*Task2 mTask2 = new Task2();
        ThreadA ta = new ThreadA(mTask2); //类锁
        ThreadB tb = new ThreadB(mTask2); //类锁
        ThreadC tc = new ThreadC(mTask2); //对象所
        ta.setName("A");
        tb.setName("B");
        tc.setName("C");

        ta.start();
        tb.start();
        tc.start();*/

        System.out.println("----------------------------修改了Thread A 和 Thread B");

        Task2 mTaska = new Task2();
        Task2 mTaskb = new Task2();
        ThreadA ta = new ThreadA(mTaska);
        ThreadB tb = new ThreadB(mTaskb);
        ta.setName("A");
        tb.setName("B");
        ta.start();
        tb.start();
    }

}

class ThreadA extends Thread {
    private Task2 mTask2;
    public ThreadA(Task2 tk) {
        mTask2 = tk;
    }
    public void run () {
        //mTask2.doLongTimeTaskC();
        mTask2.doLongTimeTaskA();
    }
}


class ThreadB extends Thread{

    private Task2 mTask2;

    public ThreadB(Task2 tk){
        mTask2 = tk;
    }

    public void run() {
        //mTask2.doLongTimeTaskC();
        mTask2.doLongTimeTaskA();
    }
}

class ThreadC extends Thread {

    private Task2 mTask2;

    public ThreadC(Task2 tk) {
        mTask2 = tk;
    }

    public void run() {
        mTask2.doLongTimeTaskC();
    }
}
