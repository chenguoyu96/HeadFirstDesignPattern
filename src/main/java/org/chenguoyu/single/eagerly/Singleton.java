package org.chenguoyu.single.eagerly;

/**
 * 饿汉模式
 *
 * @author chenguoyu
 * @date 2018-04-11
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    /**
     * 如果创建和运行方面的负担不重，急切的方式也能保证多线程下只有一个实例
     */
    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
