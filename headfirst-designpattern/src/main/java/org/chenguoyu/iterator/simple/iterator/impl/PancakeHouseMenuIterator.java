package org.chenguoyu.iterator.simple.iterator.impl;

import org.chenguoyu.iterator.simple.iterator.Iterator;
import org.chenguoyu.iterator.simple.menu.MenuItem;

import java.util.ArrayList;


/**
 * @author chenguoyu
 * @date 2018-04-23
 * @project headfirst-designpattern
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        boolean flag = true;
        if (position >= items.size() || items.get(position) == null) {
            flag = false;
        }
        return flag;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
