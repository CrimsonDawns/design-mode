package com.lcl.第四章.工厂模式.原料工厂;

import com.lcl.第四章.工厂模式.原料.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Clams createClams();

    Pepperoni createPepperoni();
}
