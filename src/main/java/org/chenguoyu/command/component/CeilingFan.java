package org.chenguoyu.command.component;

/**
 * 这些厂商类被用来控制特定的家电自动化装置。
 *
 * @author chenguoyu
 * @date 2018-04-14
 * @project headfirst-designpattern
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;


    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public CeilingFan() {
        this("");
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " CeilingFan high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " CeilingFan medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " CeilingFan low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " CeilingFan off");
    }

    public int getSpeed() {
        return speed;
    }
}
