package org.chenguoyu.decorator.coffee.component;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
