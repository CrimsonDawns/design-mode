package com.lcl.第七章.外观模式;

public class CdPlayer {
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Top-O-Line CD Player on");
    }

    public void off() {
        System.out.println("Top-O-Line CD Player off");
    }

    public void eject() {
        title = null;
        System.out.println("Top-O-Line CD Player eject");
    }

    public void play(String title) {
        this.title = title;
        System.out.println("Top-O-Line CD Player playing \"" + title + "\"");
    }

    public void stop() {
        System.out.println("Top-O-Line CD Player stopped");
    }

    public void pause() {
        System.out.println("Top-O-Line CD Player paused");
    }

    @Override
    public String toString() {
        return "Top-O-Line CD Player";
    }
}

