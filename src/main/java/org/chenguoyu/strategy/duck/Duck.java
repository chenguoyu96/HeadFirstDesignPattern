package org.chenguoyu.strategy.duck;

import org.chenguoyu.strategy.fly.FlyBehavior;
import org.chenguoyu.strategy.quack.QuackBehavior;

/**
 * 鸭子抽象类
 *
 * @author chenguoyu
 * @date 2018/3/29 0029
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All duck float,even decoys!s");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
