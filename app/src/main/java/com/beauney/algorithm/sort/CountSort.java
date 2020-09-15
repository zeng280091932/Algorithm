package com.beauney.algorithm.sort;

import java.util.Arrays;

/**
 * 计数排序
 *
 * @author zengjiantao
 * @since 2020-09-15
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};

        int[] result = sort(arr);

        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] array) {
        int[] result = new int[array.length];
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        /*//以下算法部分导致计数排序不够稳定
        for (int i = 0, j = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                result[j++] = i;
            }
        }*/

        //使计数排序为稳定排序方法如下
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println(Arrays.toString(count));

        for (int i = array.length - 1; i >= 0; i--) {
//            result[i] = array[i];
            result[--count[array[i]]] = array[i];
        }

        return result;
    }
}
