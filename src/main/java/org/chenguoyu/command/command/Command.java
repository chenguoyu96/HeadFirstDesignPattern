package org.chenguoyu.command.command;

/**
 * 所有的遥控器命令都实现这个Command接口，此接口中包含了一个方法，也就是execute()。
 * 命令封装了某个特定厂商类的一组动作，遥控器可以通过调用execute()方法，执行这些动作。
 *
 * @author chenguoyu
 * @date 2018-04-12
 */
public interface Command {
    void execute();

    /**
     * 撤销
     */
    void undo();
}
