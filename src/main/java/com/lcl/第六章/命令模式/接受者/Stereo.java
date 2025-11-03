package com.lcl.第六章.命令模式.接受者;

public class Stereo {
    private Integer volume;
    private String type;

    public Stereo(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " stereo is on");
    }

    public void off() {
        System.out.println(type + " stereo is off");
    }

    public void setCd() {
        System.out.println(type + " stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println(type + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(type + " stereo is set for Radio");
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
        System.out.println(type + " stereo volume set to " + volume);
    }
}