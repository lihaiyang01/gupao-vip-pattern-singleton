package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;
import org.junit.Test;

public class ThreadLocalSingletonTest {

    @Test
    public void testThreadLocalSingleton() {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

}

}
