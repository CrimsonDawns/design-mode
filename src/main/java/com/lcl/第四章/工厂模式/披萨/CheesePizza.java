package com.lcl.第四章.工厂模式.披萨;

import com.lcl.第四章.工厂模式.原料工厂.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredient;

    public CheesePizza(PizzaIngredientFactory ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public void prepare() {
        System.out.println("preparing" + name);
        dough = ingredient.createDough();
        sauce = ingredient.createSauce();
        cheese = ingredient.createCheese();
    }
}
