package test;

public class SpitTest {
    public static void main(String[] args) {
        String string = "sr1.db1.tb1.df1;sr2.db2.tb2.df2;";
        //先用;进行分割
        System.out.println(string.matches("(.*)"));
    }
}
