package com.lcl.第六章.命令模式.接受者;

public class GarageDoor {
    private String type;

    public GarageDoor(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " garage door is on");
    }

    public void off() {
        System.out.println(type + " garage door is off");
    }
}
