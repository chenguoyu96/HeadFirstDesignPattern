package org.chenguoyu.combination;

import org.chenguoyu.combination.menu.Menu;
import org.chenguoyu.combination.menu.MenuComponent;
import org.chenguoyu.combination.menu.MenuItem;

/**
 * @author chenguoyu
 * @date 2018-04-26
 * @project headfirst-designpattern
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        Menu dinerMenu = new Menu("Diner Menu", "Lunch");
        Menu cafeMenu = new Menu("Cafe Menu", "Dinner");
        Menu dessertMenu = new Menu("Dessert Menu", "Dessert of course");

        Menu allMenus = new Menu("All Menus", "All Menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                1.59));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);

//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
