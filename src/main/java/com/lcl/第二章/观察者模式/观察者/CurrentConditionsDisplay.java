package com.lcl.第二章.观察者模式.观察者;

import com.lcl.第二章.观察者模式.主题.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 最近温度和湿度显示出来
     */
    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and" +
                humidity + "% humidity");
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
