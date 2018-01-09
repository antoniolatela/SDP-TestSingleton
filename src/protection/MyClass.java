package protection;


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
        StringBuilder str = myClass.getString();
        System.out.println(str);
        str.append(" Thing");
        //str = new StringBuilder("Barney");
        System.out.println(str);
        System.out.println(myClass.getString());

    }

}
