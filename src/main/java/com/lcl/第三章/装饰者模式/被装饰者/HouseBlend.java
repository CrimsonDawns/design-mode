package com.lcl.第三章.装饰者模式.被装饰者;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "house-blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
