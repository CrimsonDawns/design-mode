package com.lcl.第七章.适配器模式;

import java.util.Random;

/**
 * Turkey 目标接口
 */
public class DuckAdapter implements Turkey {
    //被适配者
    private Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
