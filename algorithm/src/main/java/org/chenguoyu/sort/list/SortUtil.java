package org.chenguoyu.sort.list;/**
 * Created by 陈国钰 on 2018/3/28 0028.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenguoyu
 * @describe 排序工具类
 * @date 2018/3/28 0028
 */
public class SortUtil {
    public static <T> void swap(List<T> arr, int a, int b) {
        T temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

    public static <T> void outList(List<T> arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
    }

    public static List<Integer> randomInts(int n, int min, int max) {
        List<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(randomInt(min, max));
        }
        return arr;
    }

    public static int randomInt(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
