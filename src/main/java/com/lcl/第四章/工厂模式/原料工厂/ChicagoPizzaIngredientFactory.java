package com.lcl.第四章.工厂模式.原料工厂;

import com.lcl.第四章.工厂模式.原料.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new EggPlant(), new Spinach(), new BlackOlives()};
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
