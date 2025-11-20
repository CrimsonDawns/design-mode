package com.lcl.第十二章.复合模式.例子;

/**
 * 鸭子工厂方法具体实现
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new MallDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
