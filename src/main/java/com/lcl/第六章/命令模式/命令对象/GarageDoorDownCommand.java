package com.lcl.第六章.命令模式.命令对象;

import com.lcl.第六章.命令模式.接受者.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
        garageDoor.on();
    }
}
