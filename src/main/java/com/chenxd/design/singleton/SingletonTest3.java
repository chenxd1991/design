package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */

/**
 * 懒汉式 线程不安全
 */
public class SingletonTest3 {
    private SingletonTest3() {
    }

    private static SingletonTest3 singleton;

    public static SingletonTest3 getInstance() {
        if (singleton == null) {
            singleton = new SingletonTest3();
        }
        return singleton;
    }
}
