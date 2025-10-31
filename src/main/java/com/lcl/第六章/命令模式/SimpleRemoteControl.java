package com.lcl.第六章.命令模式;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttWasPressed() {
        slot.execute();
    }
}
