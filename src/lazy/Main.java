package lazy;

/**
 * Created by alatel01 on 09/01/2018.
 */
public class Main {
    public static final int LIMIT=10;

    public static void main(String[] args) {

        //Singleton s = Singleton.getInstance();
        //System.out.println(s);
        System.out.println(Singleton.getCounter());
        for (int i = 0; i<LIMIT; i++){
            System.out.println(Singleton.getInstance());
        }
        System.out.println(Singleton.getCounter());

    }
}
