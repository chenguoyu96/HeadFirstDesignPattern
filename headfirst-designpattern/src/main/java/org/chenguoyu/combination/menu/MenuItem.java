package org.chenguoyu.combination.menu;

import org.chenguoyu.combination.iterator.NullIterator;

import java.util.Iterator;

/**
 * @author chenguoyu
 * @date 2018-04-26
 * @project headfirst-designpattern
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("  --" + getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
       return new NullIterator();
    }
}
