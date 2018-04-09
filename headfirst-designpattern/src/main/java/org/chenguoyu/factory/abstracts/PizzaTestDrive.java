package org.chenguoyu.factory.abstracts;

import org.chenguoyu.factory.abstracts.pizza.Pizza;
import org.chenguoyu.factory.abstracts.store.ChicagoStylePizzaStore;
import org.chenguoyu.factory.abstracts.store.NYStylePizzaStore;

/**
 * @author chenguoyu
 * @date 2018-04-09
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
