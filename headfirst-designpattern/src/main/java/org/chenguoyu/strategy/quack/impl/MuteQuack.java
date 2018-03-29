package org.chenguoyu.strategy.quack.impl;

import org.chenguoyu.strategy.quack.QuackBehavior;

/**
 * @author chenguoyu
 * @date 2018/3/29 0029
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
