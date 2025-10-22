package com.lcl.第三章.装饰者模式.装饰者;

import com.lcl.第三章.装饰者模式.被装饰者.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
