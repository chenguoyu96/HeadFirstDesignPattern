package org.chenguoyu.iterator.example;

import org.chenguoyu.iterator.example.menu.Menu;
import org.chenguoyu.iterator.example.menu.MenuItem;

import java.util.Iterator;
import java.util.List;


/**
 * 服务员
 *
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class WaitressPro {
    private List<Menu> menus;


    public WaitressPro(List<Menu> menus) {
        this.menus = menus;
    }


    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu
                    = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
