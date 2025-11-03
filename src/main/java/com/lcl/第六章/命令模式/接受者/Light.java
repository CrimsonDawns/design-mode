package com.lcl.第六章.命令模式.接受者;

public class Light {
    private String type;

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + "is on");
    }


   public void off() {
        System.out.println(type + "is off");
    }
}