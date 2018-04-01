package org.chenguoyu.decorator.coffee.decorator;

import org.chenguoyu.decorator.coffee.component.Beverage;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
