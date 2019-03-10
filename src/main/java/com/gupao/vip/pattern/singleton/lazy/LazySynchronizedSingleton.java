package com.gupao.vip.pattern.singleton.lazy;

/**
 * 同步锁-性能比较差
 *
 */
public class LazySynchronizedSingleton {

    private static LazySynchronizedSingleton instance = null;

    private LazySynchronizedSingleton() {

    }

    public synchronized static LazySynchronizedSingleton getInstance () {
        if (instance == null) {
            return new LazySynchronizedSingleton();
        }
        return instance;
    }
}
