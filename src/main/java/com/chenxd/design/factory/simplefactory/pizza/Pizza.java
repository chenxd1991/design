package com.chenxd.design.factory.simplefactory.pizza;

public abstract class Pizza {
    protected String name;

    // 不同披萨有不同的原材料，因此为抽象方法
    public abstract void prepare();
    public void bake(){
        System.out.println(name+"baking");
    }
    public void cut(){
        System.out.println(name+"cutting");
    }
    public void box(){
        System.out.println(name+"boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
