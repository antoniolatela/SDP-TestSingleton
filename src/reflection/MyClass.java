package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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
            Class c  = Class.forName("reflection.MyClass");
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
                    MyClass myClass1 = (MyClass) c.newInstance();
                    System.out.println(myClass1.getString());
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
