package com.lcl.第十二章.复合模式.例子;

/**
 * 创建鸭家族的工厂方法
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallarDuck();

    public abstract Quackable createRedHeadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
