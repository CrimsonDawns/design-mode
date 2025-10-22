package com.lcl.第三章.装饰者模式.被装饰者;

public class DeepRoasted extends Beverage {

    public DeepRoasted() {
        description = "deep roasted";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
