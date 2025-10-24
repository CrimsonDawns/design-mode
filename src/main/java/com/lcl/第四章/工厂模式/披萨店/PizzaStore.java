package com.lcl.第四章.工厂模式.披萨店;

import com.lcl.第四章.工厂模式.披萨.Pizza;

public abstract class PizzaStore {
    /**
     * 工厂方法，用于创建各种不同的披萨对象
     * @param type 添加的配料
     * @return 披萨对象
     */
    public abstract Pizza creatPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = creatPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
