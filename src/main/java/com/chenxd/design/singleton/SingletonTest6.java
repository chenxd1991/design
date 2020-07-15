package com.chenxd.design.singleton;

/**
 * 静态内部类不会随着类的初始化而初始化，可以实现懒加载
 * 静态内部类加载是线程安全的
 * 推荐使用
 */
public class SingletonTest6 {
    private SingletonTest6(){}

    private static class SingletonInstance{
        private static final SingletonTest6 INSTANCE  = new SingletonTest6();
    }

    public static SingletonTest6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
