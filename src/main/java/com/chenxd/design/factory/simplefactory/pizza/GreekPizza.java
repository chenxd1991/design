package com.chenxd.design.factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希腊披萨准备材料");
    }
}
