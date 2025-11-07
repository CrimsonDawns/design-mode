package com.lcl.第七章.外观模式;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }

    public void off() {
        System.out.println("Theater Ceiling Lights off");
    }

    public void dim(int level) {
        System.out.println("Theater Ceiling Lights dimming to " + level + "%");
    }

    @Override
    public String toString() {
        return "Theater Ceiling Lights";
    }
}

