package org.chenguoyu.strategy.duck;

import org.chenguoyu.strategy.fly.impl.FlyWithWings;
import org.chenguoyu.strategy.quack.impl.Quack;

/**
 * @author chenguoyu
 * @date 2018-03-29
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am read Mallard duck");
    }


}
