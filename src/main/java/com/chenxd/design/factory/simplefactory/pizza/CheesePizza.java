package com.chenxd.design.factory.simplefactory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("奶酪披萨准备材料");
    }
}
