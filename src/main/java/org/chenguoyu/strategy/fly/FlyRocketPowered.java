package org.chenguoyu.strategy.fly;

/**
 * @author chenguoyu
 * @date 2018-03-29
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
