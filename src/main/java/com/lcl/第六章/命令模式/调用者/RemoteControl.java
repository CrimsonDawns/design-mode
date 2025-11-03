package com.lcl.第六章.命令模式.调用者;


import com.lcl.第六章.命令模式.命令对象.Command;
import com.lcl.第六章.命令模式.命令对象.NoCommand;

import java.util.Stack;

public class RemoteControl {
    //用于操控开启的命令
    Command[] onCommands;
    //用于操控关闭命令
    Command[] offCommands;
    //记录最后一次执行的命令
    Stack<Command> undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommand = new Stack<>();

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }


    }

    public void setCommand(Integer slot, Command oncommand, Command offCommand) {
        onCommands[slot] = oncommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(Integer slot) {
        onCommands[slot].execute();
        undoCommand.push(onCommands[slot]);
    }

    public void offButtonWasPushed(Integer slot) {
        offCommands[slot].execute();
        undoCommand.push(onCommands[slot]);
    }

    /**
     * 撤销最后一次命令操作
     */
    public void undoButtonWasPushed() {
        undoCommand.pop().undo();
    }

    /**
     * 撤销指定次数命令操作
     *
     * @param time 撤销次数
     */
    public void undo(Integer time) {
        for (int i = 0; i < time; i++) {
            if (!undoCommand.isEmpty()) {
                undoButtonWasPushed();
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\n--------------Remote Control------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot" + i + "]" +
                    onCommands[i].getClass().getName() + "  " +
                    offCommands[i].getClass().getName() + "\n");
        }

        return sb.toString();
    }
}
