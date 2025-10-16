package com.lcl.第一章.策略模式.鸭子类;

import com.lcl.第一章.策略模式.嘎嘎叫行为.Quack;
import com.lcl.第一章.策略模式.飞行行为.FlyNoWay;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
