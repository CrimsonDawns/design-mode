package com.lcl.第十二章.复合模式;

/**
 * 工厂方法具体实现
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
