
package com.lcl.第七章.外观模式;

public class Tuner {
    Amplifier amplifier;

    public Tuner(String description, Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Top-O-Line Tuner on");
    }

    public void off() {
        System.out.println("Top-O-Line Tuner off");
    }

    public void setFrequency(double frequency) {
        System.out.println("Top-O-Line Tuner setting frequency to " + frequency);
    }

    public void setAm() {
        System.out.println("Top-O-Line Tuner setting AM mode");
    }

    public void setFm() {
        System.out.println("Top-O-Line Tuner setting FM mode");
    }

    @Override
    public String toString() {
        return "Top-O-Line Tuner";
    }
}