package com.lcl.第一章.策略模式.嘎嘎叫行为;

public class MuteQuack  implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
