package com.lcl.第十二章.复合模式.例子;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist：" + duck + " just quacked");
    }
}
