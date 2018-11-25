package org.chenguoyu.command.example.control;

import org.chenguoyu.command.command.Command;
import org.chenguoyu.command.command.impl.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * RemoteControl管理一组命令对象，每个按钮都有一个命令对象。
 * 每当按下按钮，就调用相应的xxButtonWasPushed()方法，间接造成该命令的execute()被调用
 *
 * 遥控器
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class RemoteControl {
    private List<Command> onCommands;
    private List<Command> offCommands;

    public RemoteControl() {
        int length = 7;
        onCommands = new ArrayList<>(length);
        offCommands = new ArrayList<>(length);
        Command noCommand = new NoCommand();
        for (int i = 0; i < length; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.size(); i++) {
            sb.append("[slot " + i + "] " + onCommands.get(i).getClass().getName() + "   " + offCommands.get(i).getClass().getName() + "\n");
        }
        return sb.toString();
    }

}
