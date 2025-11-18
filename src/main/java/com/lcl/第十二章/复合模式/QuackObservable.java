package com.lcl.第十二章.复合模式;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
