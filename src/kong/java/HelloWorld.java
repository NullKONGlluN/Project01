package kong.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public HelloWorld() {
    }

    public HelloWorld(int a) {
        this.a = a;
    }

    private static final int INITIAL_SIZE = 10;

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        //region Description
        System.out.println("hello world!!!");
        System.out.println("hello world!!!");
        ArrayList arrayList1 = new ArrayList();
        //endregion
        /*ArrayList list = null;
        synchronized ()*/
        Date date = new Date();
        arrayList1.add(0, 123);
        arrayList1.add(0,456);
        System.out.println(arrayList1);
        System.out.println("hello world!!!");
    }

    public void say() {
        try (FileInputStream fis = new FileInputStream("hello.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
