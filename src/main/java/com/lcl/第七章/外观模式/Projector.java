package com.lcl.第七章.外观模式;

public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Top-O-Line Projector on");
    }

    public void off() {
        System.out.println("Top-O-Line Projector off");
    }

    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println("Top-O-Line Projector in tv mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return "Top-O-Line Projector";
    }
}

