package creational.build;

import java.util.concurrent.locks.ReentrantLock;

public class JSONObjectSs {
    public static void main(String[] args) {

        Test test = new Test();
        test.show();
        System.out.println(Test.staticName);
        System.out.println(test);

        Test test1 = new Test();
        test1.notShow();
        System.out.println(Test.staticName);
        System.out.println(test1);
        // 静态变量值初始化一次,全局只有一次

        // 而静态内部类，可以当做普通类
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("db")
                .setMaxTotal(10)
                .setMaxIdle(5)
                .setMinIdle(2)
                .build();
        System.out.println(config);

        ReentrantLock lock = new ReentrantLock();
        lock.lock();

        ResourcePoolConfig db = new ResourcePoolConfig.Builder()
                .setName("db").build();
        System.out.println(db);
    }
}
