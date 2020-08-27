package com.beauney.algorithm.sort;

/**
 * 插入排序
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 4, 2, 8, 7, 1, 5};
        System.out.print("排序前：");
        print(arr);

        sort(arr);

        System.out.print("排序后：");
        print(arr);

    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
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
