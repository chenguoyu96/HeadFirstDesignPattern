package org.chenguoyu.command.component;

/**
 * 这些厂商类被用来控制特定的家电自动化装置。
 *
 * @author chenguoyu
 * @date 2018-04-12
 * @project headfirst-designpattern
 */
public class GarageDoor {
    private String room;

    public GarageDoor(String room) {
        this.room = room;
    }

    public GarageDoor() {
        this("");
    }

    public void up() {
        System.out.println(room + " GarageDoor up");
    }

    public void down() {
        System.out.println(room + " GarageDoor is down");
    }

    public void stop() {
        System.out.println(room + " GarageDoor is stop");
    }

    public void lightOn() {
        System.out.println(room + " GarageDoor is lightOn");
    }

    public void lightOff() {
        System.out.println(room + " GarageDoor is lightOff");
    }
}
