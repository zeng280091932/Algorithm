package com.beauney.algorithm.sort;

/**
 * 优化间隔序列后希尔排序
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class BetterShellSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        System.out.print("排序前：");
        print(arr);

        sort(arr);

        System.out.print("排序后：");
        print(arr);

    }

    static void sort(int[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = 3 * h + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        swap(arr, j, j - gap);
                    }
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
