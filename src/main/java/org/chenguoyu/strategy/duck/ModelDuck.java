package org.chenguoyu.strategy.duck;

import org.chenguoyu.strategy.fly.impl.FlyNoWay;
import org.chenguoyu.strategy.fly.impl.FlyWithWings;
import org.chenguoyu.strategy.quack.impl.Quack;

/**
 * @author chenguoyu
 * @date 2018-03-29
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am model duck");
    }
}
