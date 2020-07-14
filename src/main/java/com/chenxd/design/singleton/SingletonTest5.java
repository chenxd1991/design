package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */

/**
 * 懒汉式 双重判断 效率高 推荐
 */
public class SingletonTest5 {
    private SingletonTest5() {
    }

    private static volatile SingletonTest5 singleton;

    public static SingletonTest5 getInstance() {
        if (singleton == null) {
            synchronized (SingletonTest5.class) {
                if (singleton == null) {
                    singleton = new SingletonTest5();
                }
            }
        }
        return singleton;
    }
}
