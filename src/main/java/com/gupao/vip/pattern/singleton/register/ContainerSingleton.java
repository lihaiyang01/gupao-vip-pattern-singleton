package com.gupao.vip.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 * 优点：管理多个单例实例
 * 缺点：非线程安全，需要做同步处理
 */
public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {

    }

    public static Object getBean(String name) {
        synchronized (ioc) {
            if (!ioc.containsKey(name)) {
                Object o = null;
                try {
                    o = Class.forName(name).newInstance();
                    ioc.put(name, o);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
                return o;
            } else {
                return ioc.get(name);
            }
        }
    }

}
