package com.lcl.第六章.命令模式;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setSlot(lightOn);
        remote.buttWasPressed();

        remote.setSlot(garageDoorOpen);
        remote.buttWasPressed();
    }
}
