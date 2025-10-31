package com.lcl.第六章.命令模式;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setSlot(lightOn);
        remote.buttWasPressed();
    }
}
