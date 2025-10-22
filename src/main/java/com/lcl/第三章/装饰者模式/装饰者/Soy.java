package com.lcl.第三章.装饰者模式.装饰者;

import com.lcl.第三章.装饰者模式.被装饰者.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
