package com.lcl.第二章.观察者模式;

import com.lcl.第二章.观察者模式.主题.WeatherData;
import com.lcl.第二章.观察者模式.观察者.CurrentConditionsDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
    }
}