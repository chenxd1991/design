package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */

/**
 * 单例模式适用于频繁创建或销毁对象时使用
 */
public class SingletonApp {
    public static void main(String[] args) {
        SingletonTest1 singletonTest1 = SingletonTest1.getInstance();
        SingletonTest1 singletonTest2 = SingletonTest1.getInstance();
        System.out.println(singletonTest1 == singletonTest2);
        System.out.println("==============================");
        SingletonTest2 singletonTest3 = SingletonTest2.getInstance();
        SingletonTest2 singletonTest4 = SingletonTest2.getInstance();
        System.out.println(singletonTest3 == singletonTest4);
        System.out.println("==============================");
        SingletonTest3 singletonTest5 = SingletonTest3.getInstance();
        SingletonTest3 singletonTest6 = SingletonTest3.getInstance();
        System.out.println(singletonTest5 == singletonTest6);
        System.out.println("==============================");
        SingletonTest4 singletonTest7 = SingletonTest4.getInstance();
        SingletonTest4 singletonTest8 = SingletonTest4.getInstance();
        System.out.println(singletonTest7 == singletonTest8);
        System.out.println("==============================");
        SingletonTest5 singletonTest9 = SingletonTest5.getInstance();
        SingletonTest5 singletonTest10 = SingletonTest5.getInstance();
        System.out.println(singletonTest9 == singletonTest10);
        System.out.println("==============================");
        SingletonTest6 singletonTes11 = SingletonTest6.getInstance();
        SingletonTest6 singletonTest12 = SingletonTest6.getInstance();
        System.out.println(singletonTes11 == singletonTest12);
        System.out.println("==============================");
        Singleton singletonTes13 = Singleton.INSTANCE;
        Singleton singletonTes14 = Singleton.INSTANCE;
        System.out.println(singletonTes13 == singletonTes14);
    }
}
