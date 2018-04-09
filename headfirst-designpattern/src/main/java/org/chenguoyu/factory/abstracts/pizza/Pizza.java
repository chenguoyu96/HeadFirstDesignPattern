package org.chenguoyu.factory.abstracts.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenguoyu
 * @date 2018-04-02
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough..." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.print(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
