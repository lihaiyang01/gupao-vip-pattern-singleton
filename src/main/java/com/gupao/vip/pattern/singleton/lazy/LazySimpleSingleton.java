package com.gupao.vip.pattern.singleton.lazy;

/**
 * 懒汉式单例-线程不安全
 * 加锁之后性能受到影响
 * 优点：当使用时才初始化，节省空间
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getInstance () {
        if (instance == null) {
            return new LazySimpleSingleton();
        }
        return instance;
    }

}
