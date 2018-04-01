package org.chenguoyu.decorator.coffee.decorator;

import org.chenguoyu.decorator.coffee.component.Beverage;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
