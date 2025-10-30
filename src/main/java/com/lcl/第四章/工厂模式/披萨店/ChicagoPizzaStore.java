package com.lcl.第四章.工厂模式.披萨店;

import com.lcl.第四章.工厂模式.原料工厂.ChicagoPizzaIngredientFactory;
import com.lcl.第四章.工厂模式.披萨.*;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(ChicagoPizzaIngredientFactory ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredient);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredient);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredient);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredient);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
