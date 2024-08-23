package creational.singleton;

public class Singleton2 {
    /**
     * 懒汉安全式
     * 这种方式虽然保证了线程安全，但是锁的粒度太大了
     * 多线程获取实例时，每个线程都要获取锁
     * 缺点效率太低
     */
    private static Singleton2 singleton2;

    public static synchronized Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
