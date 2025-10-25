package com.lcl.第四章.工厂模式.披萨店;

import com.lcl.第四章.工厂模式.原料工厂.NYPizzaIngredientFactory;
import com.lcl.第四章.工厂模式.披萨.*;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(NYPizzaIngredientFactory ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * Pizza工厂方法
     *
     * @param type
     * @return
     */
    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredient);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredient);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredient);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredient);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
