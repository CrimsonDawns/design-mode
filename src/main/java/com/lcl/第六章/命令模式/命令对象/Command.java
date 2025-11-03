package com.lcl.第六章.命令模式.命令对象;

public interface Command {
    //命令执行方法
    void execute();
    //与execute()执行相反的操作
    void undo();
}
