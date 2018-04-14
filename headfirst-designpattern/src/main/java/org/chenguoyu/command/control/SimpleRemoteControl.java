package org.chenguoyu.command.control;

import org.chenguoyu.command.command.Command;

/**
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
