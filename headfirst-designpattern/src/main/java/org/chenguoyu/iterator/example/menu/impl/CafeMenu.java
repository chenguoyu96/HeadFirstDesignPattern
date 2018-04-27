package org.chenguoyu.iterator.example.menu.impl;

import org.chenguoyu.iterator.example.menu.Menu;
import org.chenguoyu.iterator.example.menu.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author chenguoyu
 * @date 2018-04-24
 * @project headfirst-designpattern
 */
public class CafeMenu implements Menu<MenuItem> {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99);

        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);

        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

//    public Map<String, MenuItem> getItems(){
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
