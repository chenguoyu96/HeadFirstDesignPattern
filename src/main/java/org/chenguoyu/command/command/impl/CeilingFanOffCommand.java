package org.chenguoyu.command.command.impl;

import org.chenguoyu.command.command.Command;
import org.chenguoyu.command.component.CeilingFan;

/**
 * 利用Command接口，每个动作都被实现成一个简单的命令对象。
 * 命令对象持有对一个厂商类的实例的引用，并实现了一个execute()方法。这个方法会对调用厂商类实例的一个或者多个方法，完成特定的行为。
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
            default:
        }
    }
}
