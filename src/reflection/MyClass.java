package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by alatel01 on 09/01/2018.
 */
public class MyClass {
    private int i;
    //StringBuffer is a mutable class
    private StringBuilder s = new StringBuilder("Fred");


    public StringBuilder getString() {
        return new StringBuilder(s);
        //return s;
    }

    public void setString(StringBuilder s) {
        this.s = s;
    }


    public int getItem() {
        return i;
    }

    public void setItem(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Ooo";
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("full class name");
            String s = sc.nextLine();
            Class c  = Class.forName(s);
            System.out.println(myClass.getClass());
            System.out.println(c.getPackage());
            Method[]  methods = c.getMethods();

            for(Method m: methods) {
                System.out.println(m);
            }

            Constructor[] constructors = c.getConstructors();
            for(Constructor con: constructors) {
                System.out.println(con);


                try {
                    Object myClass1 = c.newInstance();
                    System.out.println(myClass1.toString());
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
