package org.chenguoyu.combination;

import org.chenguoyu.combination.menu.MenuComponent;

import java.util.Iterator;

/**
 * @author chenguoyu
 * @date 2018-04-26
 * @project headfirst-designpattern
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) { }
        }
    }
}
