package org.chenguoyu.command.component;

/**
 * 这些厂商类被用来控制特定的家电自动化装置。
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class Light {
    private String room;

    public Light(String room) {
        this.room = room;
    }

    public Light() {
        this("");
    }

    public void on() {
        System.out.println(room + " Light is On");
    }

    public void off() {
        System.out.println(room + " Light is Off");
    }
}
