package com.chenxd.design.factory.simplefactory.order;

import com.chenxd.design.factory.simplefactory.pizza.CheesePizza;
import com.chenxd.design.factory.simplefactory.pizza.GreekPizza;
import com.chenxd.design.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    如果新增披萨需要改动使用方代码，违反开闭原则。
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza;
        String pizzaType;
        do {
            pizzaType = gettype();
            if ("greek".equals(pizzaType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(gettype())) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);


    }

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
