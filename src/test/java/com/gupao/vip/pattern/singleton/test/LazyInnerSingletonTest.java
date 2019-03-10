package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.LazyInnerSingleton;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerSingletonTest {

    @Test
    public void testLazyInnerSingleton() {

        /*LazyInnerSingleton instance = LazyInnerSingleton.getInstance();
        System.out.println(instance);
        //反射情况下破坏了单例，重新生成了对象
        Class<LazyInnerSingleton> lazyInnerSingletonClass = LazyInnerSingleton.class;
        try {
            Constructor<LazyInnerSingleton> declaredConstructor = lazyInnerSingletonClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazyInnerSingleton lazyInnerSingleton = declaredConstructor.newInstance(null);
            System.out.println(lazyInnerSingleton);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/
        LazyInnerSingleton.getA();
        LazyInnerSingleton instance = LazyInnerSingleton.getInstance();
    }

}
