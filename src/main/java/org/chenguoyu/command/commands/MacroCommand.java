package org.chenguoyu.command.commands;

import org.chenguoyu.command.command.Command;

import java.util.List;

/**
 * 宏命令(一组命令)
 *
 * @author chenguoyu
 * @date 2018-04-14
 * @project headfirst-designpattern
 */
public class MacroCommand implements Command {
    private List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
