package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */

/**
 * 饿汉式
 */
public class SingletonTest1 {
    private SingletonTest1() {
    }

    private static final SingletonTest1 singleton = new SingletonTest1();

    public static SingletonTest1 getInstance() {
        return singleton;
    }
}


