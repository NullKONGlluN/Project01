package kong.java;

import kong.bena.Customer;

import java.util.ArrayList;

/**
 * @author NulluN
 * @create 2019-03-29 10:31
 */
public class TemplatesTest {

    private static final Customer CUS = new Customer();
    public static final int NUM = 1;
    public static final int NUM2 = 2;
    public static final String  = "a";
    public static final int NUM = 1;
    public static final int NUM = 2;
    public static final String str2 = "b";
    private int id; // 客户id
    private String name; // 客户姓名

    
    public void testUpdat(){
        //
    }

    public static void main(String[] args) {
        
        System.out.println("hello!");
        String args1 = "a";
        System.out.println("args1 = [" + args1 + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args1 = " + args1);
        int num = 1;
        int num2 = 2;
        System.out.println("num = " + num);
        System.out.println("num = " + num);
        String[] arr = new String[]{"Tom","Jerry","HanMeiMei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        if (list == null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
    }

}
