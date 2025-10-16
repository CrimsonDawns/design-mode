package com.lcl.第一章.策略模式.鸭子类;

import com.lcl.第一章.策略模式.嘎嘎叫行为.Quack;
import com.lcl.第一章.策略模式.飞行行为.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
