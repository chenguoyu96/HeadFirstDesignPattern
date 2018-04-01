package org.chenguoyu.decorator.coffee;

import org.chenguoyu.decorator.coffee.component.Beverage;
import org.chenguoyu.decorator.coffee.component.DarkRoast;
import org.chenguoyu.decorator.coffee.component.Espresso;
import org.chenguoyu.decorator.coffee.component.HouseBlend;
import org.chenguoyu.decorator.coffee.decorator.Mocha;
import org.chenguoyu.decorator.coffee.decorator.Soy;
import org.chenguoyu.decorator.coffee.decorator.Whip;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
    }
}
