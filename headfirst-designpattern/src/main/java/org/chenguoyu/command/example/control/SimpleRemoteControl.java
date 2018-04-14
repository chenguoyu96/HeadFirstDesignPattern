package org.chenguoyu.command.example.control;

import org.chenguoyu.command.command.Command;

/**
 * 简单的遥控器
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl setCommand(Command slot) {
        this.slot = slot;
        return this;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
