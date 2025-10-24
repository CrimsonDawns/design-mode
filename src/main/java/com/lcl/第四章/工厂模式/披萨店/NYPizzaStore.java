package com.lcl.第四章.工厂模式.披萨店;

import com.lcl.第四章.工厂模式.披萨.*;

public class NYPizzaStore extends PizzaStore {
    /**
     * Pizza工厂方法
     *
     * @param type
     * @return
     */
    @Override
    public Pizza creatPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
