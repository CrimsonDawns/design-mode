package com.lcl.第三章.装饰者模式.被装饰者;

public class LowCaffeine extends Beverage {

    public LowCaffeine() {
        description = "low caffeine";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
