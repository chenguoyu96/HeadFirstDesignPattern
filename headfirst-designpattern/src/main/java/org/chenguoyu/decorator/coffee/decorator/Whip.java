package org.chenguoyu.decorator.coffee.decorator;

import org.chenguoyu.decorator.coffee.component.Beverage;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 1.2 + beverage.cost();
    }
}
