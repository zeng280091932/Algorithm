package com.beauney.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 4, 2, 8, 7, 1, 5};
        System.out.print("排序前：");
        print(arr);

        sort(arr);

        System.out.print("排序后：");
        print(arr);

    }

    static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
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
