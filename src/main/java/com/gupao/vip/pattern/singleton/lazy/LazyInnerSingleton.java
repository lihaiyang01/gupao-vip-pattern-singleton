package com.gupao.vip.pattern.singleton.lazy;

/**
 * 静态内部类单例
 * 优点：当调用时才加载内部类，节省空间，避免了线程安全问题
 *
 */
public class LazyInnerSingleton {

    private LazyInnerSingleton() {
        //此处判断是否已经实例化，若是不允许生成多个实例，为了防止反射调用构造器创建实例
        if(LazyHolder.LAZY_INSTANCE != null) {
            try {
                throw new Exception("不能重新生成多个实例");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final LazyInnerSingleton getInstance() {
        return LazyHolder.LAZY_INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyInnerSingleton LAZY_INSTANCE = new LazyInnerSingleton();
    }

}
