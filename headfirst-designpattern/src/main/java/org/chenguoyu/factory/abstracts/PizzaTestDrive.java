package org.chenguoyu.factory.abstracts;


import org.chenguoyu.factory.abstracts.pizza.Pizza;
import org.chenguoyu.factory.abstracts.store.PizzaStore;
import org.chenguoyu.factory.abstracts.store.impl.NYPizzaStore;

/**
 * @author chenguoyu
 * @date 2018-04-09
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }
}
