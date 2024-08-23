package creational.singleton;

public class Singleton {
    /**
     * 懒汉不安全
     * 所谓的懒汉是指在第一次调用的时候才创建实例，但是由于Java的线程安全机制
     * 当多个线程同时调用getInstance()方法时，可能会创建多个实例，所以这种模式是不安全的。
     */
    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


