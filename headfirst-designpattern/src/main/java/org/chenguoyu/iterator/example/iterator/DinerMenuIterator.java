package org.chenguoyu.iterator.example.iterator;


import org.chenguoyu.iterator.example.menu.MenuItem;

import java.util.Iterator;

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

    @Override
    public void remove() {
        if (position < 0) {
            throw new IllegalStateException("You can not remove an item until you have done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
