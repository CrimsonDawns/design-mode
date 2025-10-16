package com.lcl.第一章.策略模式.飞行行为;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("实现鸭子飞行");
    }
}
