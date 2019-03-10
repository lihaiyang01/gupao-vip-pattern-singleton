package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.register.EnumSingleton;
import org.junit.Test;

public class EnumSingletonTest {

    @Test
    public void testEnumSingleton() {

        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println(instance);
    }
}
