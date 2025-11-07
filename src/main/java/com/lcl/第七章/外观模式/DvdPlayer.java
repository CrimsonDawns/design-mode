package com.lcl.第七章.外观模式;

public class DvdPlayer {
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void eject() {
        movie = null;
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Top-O-Line DVD Player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped \"" + movie + "\"");
    }

    public void pause() {
        System.out.println("Top-O-Line DVD Player paused \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println("Top-O-Line DVD Player set two channel audio");
    }

    public void setSurroundAudio() {
        System.out.println("Top-O-Line DVD Player set surround audio");
    }

    @Override
    public String toString() {
        return "Top-O-Line DVD Player";
    }
}

