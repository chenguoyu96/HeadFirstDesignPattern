package org.chenguoyu.decorator.coffee.decorator;

import org.chenguoyu.decorator.coffee.component.Beverage;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 2.2 + beverage.cost();
    }
}
