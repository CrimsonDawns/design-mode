package com.lcl.第三章.装饰者模式.被装饰者;

public abstract class Beverage {
    public String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
