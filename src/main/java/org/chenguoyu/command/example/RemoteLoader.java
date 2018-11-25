package org.chenguoyu.command.example;

import org.chenguoyu.command.command.Command;
import org.chenguoyu.command.command.impl.*;
import org.chenguoyu.command.component.CeilingFan;
import org.chenguoyu.command.component.GarageDoor;
import org.chenguoyu.command.component.Light;
import org.chenguoyu.command.component.Stereo;
import org.chenguoyu.command.example.control.RemoteControl;
import org.chenguoyu.command.example.control.RemoteControlMacroCommand;
import org.chenguoyu.command.example.control.RemoteControlWithUndo;
import org.chenguoyu.command.example.control.SimpleRemoteControl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * RemoteLoader创建许多的命令对象，然后将其加载到遥控器的插槽中。
 * 每个命令对象都封装了某个家电自动化装置的一项请求
 *
 * @author chenguoyu
 * @date 2018-04-14
 * @project headfirst-designpattern
 */
public class RemoteLoader {
    /**
     * 简单的遥控器测试
     */
    @Test
    public void simpleRemoteControlTest() {
        //遥控器就是调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //现在创建了一个电灯对象，此对象也就是请求的接收者
        Light light = new Light();
        //这里创建一个命令，然后将接收者传给他
        Command lightOn = new LightOnCommand(light);
        //把命令传给调用者
        remote.setCommand(lightOn);
        //然后按下模拟按钮
        remote.buttonWasPressed();
    }

    /**
     * 含有两个按钮的简单遥控器 测试
     */
    @Test
    public void twoButtonRemoteControlTest() {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

    /**
     * 遥控器测试
     */
    @Test
    public void remoteControlTest() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Light kitchenLight = new Light("kitchen");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }

    /**
     * 遥控器添加撤销按钮 测试
     */
    @Test
    public void undoCommandTest() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWahPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWahPushed();
    }

    /**
     * 遥控器 按钮有状态时 撤销
     */
    @Test
    public void undoStateTest() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWahPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWahPushed();
    }

    /**
     * 宏命令测试 (一组命令)
     */
    @Test
    public void mocroCommmandTest() {
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        List<Command> partyOn = new ArrayList<>(Arrays.asList(livingRoomLightOn, stereoOnWithCD));
        List<Command> partyOff = new ArrayList<>(Arrays.asList(livingRoomLightOff, stereoOff));

        RemoteControlMacroCommand remoteControl = new RemoteControlMacroCommand();
        remoteControl.setCommand(0, partyOn, partyOff);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- Pushing Macro Undo ---");
        remoteControl.undoButtonWahPushed();
    }
}
