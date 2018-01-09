package reflection;


/**
 * Created by alatel01 on 09/01/2018.
 */
public class MyClass {
    private int i;
    private StringBuilder s = new StringBuilder("Fred");


    public StringBuilder getString() {
        return s;
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
        StringBuilder str = myClass.getString();
        System.out.println(str);
        str = new StringBuilder("Barney");
        System.out.println(str);
    }

}
