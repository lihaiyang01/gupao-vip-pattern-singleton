package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.LazySimpleSingleton;

public class SingletonThread extends Thread {

    @Override
    public void run() {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "--" + instance);
    }
}
