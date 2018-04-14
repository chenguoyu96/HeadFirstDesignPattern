package org.chenguoyu.command.command.impl;

import org.chenguoyu.command.command.Command;
import org.chenguoyu.command.component.Light;

/**
 * 利用Command接口，每个动作都被实现成一个简单的命令对象。
 * 命令对象持有对一个厂商类的实例的引用，并实现了一个execute()方法。这个方法会对调用厂商类实例的一个或者多个方法，完成特定的行为。
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project HeadFirst-DesignPattern
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
