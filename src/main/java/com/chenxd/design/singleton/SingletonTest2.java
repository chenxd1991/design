package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */

/**
 * 饿汉式变形
 */
public class SingletonTest2 {
    private SingletonTest2() {
    }

    private static SingletonTest2 singleton;

    static {
        singleton = new SingletonTest2();
    }

    public static SingletonTest2 getInstance() {
        return singleton;
    }
}

