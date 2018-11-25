package org.chenguoyu.strategy.fly.impl;

import org.chenguoyu.strategy.fly.FlyBehavior;

/**
 * @author chenguoyu
 * @date 2018/3/29 0029
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
