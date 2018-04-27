package org.chenguoyu.iterator.simple;

import org.chenguoyu.iterator.simple.menu.DinerMenu;
import org.chenguoyu.iterator.simple.menu.PancakeHouseMenu;

/**
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
