package org.chenguoyu.command.component;

/**
 * 这些厂商类被用来控制特定的家电自动化装置。
 *
 * @author chenguoyu
 * @date 2018-04-14
 * @project headfirst-designpattern
 */
public class Stereo {
    private String room;

    public Stereo(String room) {
        this.room = room;
    }

    public Stereo() {
        this("");
    }

    public void on() {
        System.out.println(room + " Stereo is on");
    }

    public void off() {
        System.out.println(room + " Stereo is off");
    }

    public void setCd() {
        System.out.println(room + " Stereo is setCd");
    }

    public void setDvd() {
        System.out.println(room + " Stereo is setDvd(");
    }

    public void setVolume() {
        System.out.println(room + " Stereo is setVolume");
    }
}
