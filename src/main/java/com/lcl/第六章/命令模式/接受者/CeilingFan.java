package com.lcl.第六章.命令模式.接受者;

public class CeilingFan {
    private String type;

    public CeilingFan(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " ceiling fan is on");
    }

    public void off() {
        System.out.println(type + " ceiling fan is off");
    }
}
