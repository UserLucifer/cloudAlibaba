package com.java.base.day2;

public class ForWhile {

/*
for(1:2:4){
    3
}
执行过程：1 2 3 4 -2-3-4-2-3-4
*/
    public static void main(String[] args) {

//        int num = 1;
//        for (System.out.println("a"); num<=3; System.out.println("b"),num++) {
//            System.out.println("b");
//        }
//

        for (int i = 0; i < 150 ; i++) {
            System.out.println("当前的I的值是: "+i);
            if(i%3==0){
                System.out.println("foo");
            }else if (i % 5 == 0) {
                System.out.println("biz");
            }else if( i % 7 ==0 ){
                System.out.println("baz");
            }
        }
    }

}
