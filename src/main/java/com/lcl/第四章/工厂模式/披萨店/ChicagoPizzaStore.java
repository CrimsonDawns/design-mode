package com.lcl.第四章.工厂模式.披萨店;

import com.lcl.第四章.工厂模式.披萨.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza creatPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
