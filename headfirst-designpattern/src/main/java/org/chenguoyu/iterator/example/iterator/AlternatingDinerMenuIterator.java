package org.chenguoyu.iterator.example.iterator;

import org.chenguoyu.iterator.example.menu.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @author chenguoyu
 * @date 2018-04-24
 * @project headfirst-designpattern
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items, int position) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        this.position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
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
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
