package com.lcl.第六章.命令模式;

import com.lcl.第六章.命令模式.命令对象.*;
import com.lcl.第六章.命令模式.接受者.CeilingFan;
import com.lcl.第六章.命令模式.接受者.GarageDoor;
import com.lcl.第六章.命令模式.接受者.Light;
import com.lcl.第六章.命令模式.接受者.Stereo;
import com.lcl.第六章.命令模式.调用者.RemoteControl;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoom = new Light("Living Room");
        Light kitchen = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoom);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoom);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchen);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchen);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
