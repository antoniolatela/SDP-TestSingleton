/**
 * Created by alatel01 on 09/01/2018.
 */
public class Singleton {
    private static int i;
    private static Singleton singleton;

    //private block the creation on new object
    private Singleton(){
        //associate i at class level
        Singleton.i++;
    }

    //should be static to avoid the creation og a new object
    public static Singleton getInstance (){
        if (singleton == null) {
            singleton = new Singleton();
        }
            return singleton;
    }

    public static int getCounter(){
        return i;
    }

    @Override
    public String toString(){
        return this.getClass().toString() + " " + i;
    }
}
