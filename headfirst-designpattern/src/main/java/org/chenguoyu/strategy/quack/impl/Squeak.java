package org.chenguoyu.strategy.quack.impl;

import org.chenguoyu.strategy.quack.QuackBehavior;

/**
 * @author chenguoyu
 * @date 2018-03-29
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
