package creational.singleton;

public class Singleton3 {

    /**
     * 懒汉式 volatile + 双重校验
     * 当前线程获取到锁，其他线程阻塞在if判断上，
     * 如果当前线程释放锁后，其他线程获取到锁，会再次创建对象
     * 优点：线程安全，性能高
     */
    private static volatile Singleton3 singleton3;

    public static Singleton3 getInstance(){
        if(singleton3 == null){
            synchronized (Singleton.class){
                if (singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
