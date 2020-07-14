package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */

/**
 * 懒汉式 线程安全，效率低
 */
public class SingletonTest4 {
    private SingletonTest4() {
    }

    private static SingletonTest4 singleton;

    public static synchronized SingletonTest4 getInstance() {
        if (singleton == null) {
            singleton = new SingletonTest4();
        }
        return singleton;
    }
}
