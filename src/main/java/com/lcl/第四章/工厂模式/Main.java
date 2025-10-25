package com.lcl.第四章.工厂模式;

import com.lcl.第四章.工厂模式.原料工厂.ChicagoPizzaIngredientFactory;
import com.lcl.第四章.工厂模式.原料工厂.NYPizzaIngredientFactory;
import com.lcl.第四章.工厂模式.披萨.Pizza;
import com.lcl.第四章.工厂模式.披萨店.ChicagoPizzaStore;
import com.lcl.第四章.工厂模式.披萨店.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore(new NYPizzaIngredientFactory());
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore(new ChicagoPizzaIngredientFactory());

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());


        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
