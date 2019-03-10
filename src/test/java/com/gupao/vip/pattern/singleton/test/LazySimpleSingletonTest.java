package com.gupao.vip.pattern.singleton.test;


import com.gupao.vip.pattern.singleton.hungry.HungrySingleton;
import com.gupao.vip.pattern.singleton.lazy.LazySimpleSingleton;
import org.junit.Test;

public class LazySimpleSingletonTest {

    @Test
    public void testLazySimpleSingleton() {
        SingletonThread thread1 = new SingletonThread();
        SingletonThread thread2 = new SingletonThread();
        thread1.start();
        thread2.start();
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "--" + instance);
    }

}
