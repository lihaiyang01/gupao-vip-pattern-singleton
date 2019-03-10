package com.gupao.vip.pattern.singleton.test;


import com.gupao.vip.pattern.singleton.hungry.HungrySingleton;
import org.junit.Test;

public class HungrySingletonTest {

    @Test
    public void testHungrySingleton() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
    }

}
