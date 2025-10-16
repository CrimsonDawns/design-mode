package com.lcl.第一章.策略模式.鸭子类;

import com.lcl.第一章.策略模式.嘎嘎叫行为.QuackBehavior;
import com.lcl.第一章.策略模式.飞行行为.FlyBehavior;

public abstract class Duck {

    //嘎嘎叫行为
    public QuackBehavior quackBehavior;
    //飞行行为
    public FlyBehavior flyBehavior;

    public Duck() {
    }

    /**
     * 鸭子类不亲自处理呱呱和飞行具体实现，而是交给实现 QuackBehavior FlyBehavior 这两个接口的类
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float,even decoys");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
