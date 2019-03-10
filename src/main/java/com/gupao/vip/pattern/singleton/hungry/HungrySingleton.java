package com.gupao.vip.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * 优点：线程安全，执行效率高，没有加线程安全的锁
 * 缺点：类加载时已初始化，浪费空间
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
