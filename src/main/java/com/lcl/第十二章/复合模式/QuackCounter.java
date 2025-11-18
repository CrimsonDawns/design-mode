package com.lcl.第十二章.复合模式;

/**
 * 装饰者模式
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;
    private Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }


    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
