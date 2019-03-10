package com.gupao.vip.pattern.singleton.lazy;

/**
 *
 * 懒汉式单例-双重检查锁
 * 比直接加synchronized的懒汉式优化了一点，但加上了synchronized总归会有性能影响
 */
public class LazyDoubleLockSingleton {

    //volatile禁止指令重排序
    private volatile static LazyDoubleLockSingleton instance = null;

    private LazyDoubleLockSingleton() {

    }

    private static LazyDoubleLockSingleton getInstance() {
        //此处判断是防止已经初始化之后获取单例时进入同步锁
        if (instance == null) {
            synchronized (LazyDoubleLockSingleton.class) {
                //此处判断是防止外部并发判断为null时，多次创建实例
                if(instance == null) {
                    return new LazyDoubleLockSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置 lazy 指向刚分配的内存地址
                }
            }
        }
        return instance;
    }
}
