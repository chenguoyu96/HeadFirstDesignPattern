package org.chenguoyu.decorator.coffee.component;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
