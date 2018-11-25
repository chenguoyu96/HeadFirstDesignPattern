package org.chenguoyu.iterator.example;

import org.chenguoyu.iterator.example.menu.impl.CafeMenu;
import org.chenguoyu.iterator.example.menu.impl.DinerMenu;
import org.chenguoyu.iterator.example.menu.impl.PancakeHouseMenu;

/**
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
