package com.lcl.第二章.观察者模式.主题;

import com.lcl.第二章.观察者模式.观察者.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
