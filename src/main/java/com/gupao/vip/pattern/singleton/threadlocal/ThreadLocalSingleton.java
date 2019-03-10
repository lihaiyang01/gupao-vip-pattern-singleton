package com.gupao.vip.pattern.singleton.threadlocal;

/**
 * threadlocal式
 * 线程内只会生成一个实例
 */
public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> local = new ThreadLocal<ThreadLocalSingleton>()
            {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    public static ThreadLocalSingleton getInstance() {
        return local.get();
    }

}
