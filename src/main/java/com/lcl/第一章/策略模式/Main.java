package com.lcl.第一章.策略模式;

import com.lcl.第一章.策略模式.飞行行为.FlyRocketPowered;
import com.lcl.第一章.策略模式.鸭子类.Duck;
import com.lcl.第一章.策略模式.鸭子类.MallardDuck;
import com.lcl.第一章.策略模式.鸭子类.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        //实现鸭子飞行
        mallardDuck.performFly();
        //鸭子呱呱叫
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
