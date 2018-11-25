package org.chenguoyu.strategy;

import org.chenguoyu.strategy.duck.Duck;
import org.chenguoyu.strategy.duck.MallardDuck;
import org.chenguoyu.strategy.duck.ModelDuck;
import org.chenguoyu.strategy.fly.FlyRocketPowered;
import org.junit.Test;

/**
 * @author chenguoyu
 * @date 2018-03-29
 */
public class MiniDuckSimulator {
    @Test
    public  void mallardDuckTest() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }

    @Test
    public void modelDuckTest(){
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
