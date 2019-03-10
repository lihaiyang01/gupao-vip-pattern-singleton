package com.gupao.vip.pattern.singleton.lazy;

import java.io.Serializable;

/**
 * 序列化-反序列化导致生成多个实例
 * 通过重写readResolve方法可以避免
 */
public class SeriableSingleton implements Serializable {
    private static SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton() {

    }

    public static SeriableSingleton getInstance(){
        return instance;
    }

    private SeriableSingleton readResolve() {
        return instance;
    }
}
