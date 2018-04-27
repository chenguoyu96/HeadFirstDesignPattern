package org.chenguoyu.iterator.simple.iterator.impl;


import org.chenguoyu.iterator.simple.iterator.Iterator;
import org.chenguoyu.iterator.simple.menu.MenuItem;

/**
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        boolean flag = true;
        if (position >= items.length || items[position] == null) {
            flag = false;
        }
        return flag;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
