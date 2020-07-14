package com.chenxd.design.singleton;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/14
 * @email xiaodong.chen@huixiaoer.com
 * @description
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
    }
}
