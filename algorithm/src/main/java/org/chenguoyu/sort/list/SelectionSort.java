package org.chenguoyu.sort.list;

import org.junit.Test;

import java.util.List;

/**
 * @author chenguoyu
 * @describe 选择排序
 * @date
 */
public class SelectionSort implements Sortable {
    public void sort(List<Integer> arr) {
        selectionSort(arr);
    }
    public void selectionSort(List<Integer> arr) {
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
        List<Integer> arr = SortUtil.randomInts(10000, 0, 10000);
        selectionSort(arr);
        SortUtil.outList(arr);
    }
}
