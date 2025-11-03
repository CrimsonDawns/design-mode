package com.lcl.第六章.命令模式.命令对象;

import com.lcl.第六章.命令模式.接受者.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
