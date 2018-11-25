package org.chenguoyu.iterator.simple;

import org.chenguoyu.iterator.simple.iterator.Iterator;
import org.chenguoyu.iterator.simple.menu.DinerMenu;
import org.chenguoyu.iterator.simple.menu.MenuItem;
import org.chenguoyu.iterator.simple.menu.PancakeHouseMenu;


/**
 * 服务员
 *
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerMenuIterator);
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
