package com.chenxd.design.singleton;

/**
 * 枚举实现单例
 * 可以避免多线程，同时可以防止反序列化重写创建对象
 */
public enum Singleton {
    INSTANCE;
}
