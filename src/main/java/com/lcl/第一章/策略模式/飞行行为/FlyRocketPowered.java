package com.lcl.第一章.策略模式.飞行行为;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我依靠火箭飞行");
    }
}
