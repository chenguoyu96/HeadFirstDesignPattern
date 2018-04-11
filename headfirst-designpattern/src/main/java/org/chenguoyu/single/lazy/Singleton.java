package org.chenguoyu.single.lazy;

/**
 * 懒汉模式
 *
 * @author chenguoyu
 * @date 2018-04-11
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * 多线程情况下无法保证只产生一个实例
     * synchronized 可以保证只有一个实例，但是只有在第一次执行该方法时才需要同步。之后的每次调用都是累赘
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
