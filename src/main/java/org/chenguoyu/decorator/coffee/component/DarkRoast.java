package org.chenguoyu.decorator.coffee.component;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.09;
    }
}
