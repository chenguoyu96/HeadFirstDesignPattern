package org.chenguoyu.iterator.example;

import org.chenguoyu.iterator.example.menu.Menu;
import org.chenguoyu.iterator.example.menu.impl.DinerMenu;
import org.chenguoyu.iterator.example.menu.MenuItem;
import org.chenguoyu.iterator.example.menu.impl.PancakeHouseMenu;
import java.util.Iterator;


/**
 * 服务员
 *
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerMenuIterator);
        System.out.println("MENU\n----\nDINNER");
        printMenu(cafeMenuIterator);
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
