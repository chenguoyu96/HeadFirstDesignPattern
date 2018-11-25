package org.chenguoyu.command.command.impl;

import org.chenguoyu.command.command.Command;
import org.chenguoyu.command.component.GarageDoor;

/**
 * 利用Command接口，每个动作都被实现成一个简单的命令对象。
 * 命令对象持有对一个厂商类的实例的引用，并实现了一个execute()方法。这个方法会对调用厂商类实例的一个或者多个方法，完成特定的行为。
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
