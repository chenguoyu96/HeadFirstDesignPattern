package org.chenguoyu.command.example.control;

import org.chenguoyu.command.command.Command;
import org.chenguoyu.command.command.impl.NoCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * RemoteControl管理一组命令对象，每个按钮都有一个命令对象。
 * 每当按下按钮，就调用相应的xxButtonWasPushed()方法，间接造成该命令的execute()被调用
 * <p>
 * 宏命令遥控器
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class RemoteControlMacroCommand {
    private List<List<Command>> onCommands;
    private List<List<Command>> offCommands;
    private List<Command> undoCommands;

    public RemoteControlMacroCommand() {
        int length = 7;
        onCommands = new ArrayList<>(length);
        offCommands = new ArrayList<>(length);
        Command noCommand = new NoCommand();
        List<Command> noCommands = new ArrayList<>(Arrays.asList(noCommand));
        for (int i = 0; i < length; i++) {
            onCommands.add(noCommands);
            offCommands.add(noCommands);
        }
    }

    public void setCommand(int slot, List<Command> onCommand, List<Command> offCommand) {
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
        undoCommands = new ArrayList<>(onCommand.size());
    }

    public void onButtonWasPushed(int slot) {
        for (Command command : onCommands.get(slot)) {
            command.execute();
            undoCommands.add(command);
        }
        Collections.reverse(undoCommands);
    }

    public void offButtonWasPushed(int slot) {
        for (Command command : offCommands.get(slot)) {
            command.execute();
            undoCommands.add(command);
        }
        Collections.reverse(undoCommands);
    }

    public void undoButtonWahPushed() {
        for (Command undoCommand : undoCommands) {
            undoCommand.undo();
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.size(); i++) {
            sb.append("[slot " + i + "] \n");
            for (Command command : onCommands.get(i)) {
                sb.append("\t" + command.getClass().getName() + "   " + command.getClass().getName() + "\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
