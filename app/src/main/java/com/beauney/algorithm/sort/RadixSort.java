package com.beauney.algorithm.sort;

import java.util.Arrays;

/**
 * 基数排序
 *
 * @author zengjiantao
 * @since 2020-09-15
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {421, 240, 115, 532, 305, 430, 124};

        int[] result = sort(arr);

        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < 3; i++) {
            int division = (int) Math.pow(10, i);
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / division % 10;
                count[num]++;
            }

            for (int j = 1; j < count.length; j++) {
                count[j] = count[j] + count[j - 1];
            }

            for (int j = arr.length - 1; j >= 0; j--) {
//            result[i] = array[i];
                int num = arr[j] / division % 10;
                result[--count[num]] = arr[j];
            }

            System.arraycopy(result, 0, arr, 0, arr.length);
            Arrays.fill(count, 0);
        }

        return result;
    }
}
