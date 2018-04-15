package org.chenguoyu.adapter.duck.impl;

import org.chenguoyu.adapter.duck.Duck;

/**
 * @author chenguoyu
 * @date 2018-04-15
 * @project headfirst-designpattern
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
