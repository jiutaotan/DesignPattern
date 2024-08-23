package creational.singleton;

public class Singleton4 {
    /**
     * 饿汉式
     */
    private static Singleton4 instance = new Singleton4();

    public static Singleton4 getInstance(){
        return instance;
    }
}

