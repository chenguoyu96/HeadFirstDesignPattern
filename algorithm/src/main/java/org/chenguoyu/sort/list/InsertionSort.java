package org.chenguoyu.sort.list;

import org.junit.Test;

import java.util.Calendar;
import java.util.List;

/**
 * Created by 陈国钰 on 2018/3/28 0028.
 */
public class InsertionSort implements Sortable {
    public void sort(List<Integer> arr) {
        insertSort(arr);
    }

    public void insertSort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int k = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(k)) < 0) {
                    k = j;
                }
            }
            SortUtil.swap(arr, i, k);
        }
    }

    @Test
    public void insertSortTest() {
        List<Integer> arr = SortUtil.randomInts(1000,0,10000);
        long before = System.currentTimeMillis();
        insertSort(arr);
        long after = System.currentTimeMillis();
        System.out.println((double) (after-before)/1000);
        SortUtil.outList(arr);
    }
}
