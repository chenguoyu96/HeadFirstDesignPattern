package org.chenguoyu.decorator.coffee.component;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
