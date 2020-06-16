package test;


class Example {

    String testString = new String("good");
    char[] testCharArray = {'a','b','c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.testString,ex.testCharArray);
        System.out.println(ex.testString);
        System.out.println(ex.testCharArray);
    }

    private void change(String testString, char[] testCharArray) {
        testString = "hhhhhh";
        testCharArray[0] = 'w';
    }

}

public class Test1 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
    }

}
