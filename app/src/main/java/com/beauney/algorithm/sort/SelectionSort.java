package com.beauney.algorithm.sort;

/**
 * 选择排序
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 4, 2, 8, 7, 1, 5};
        System.out.print("排序前：");
        print(arr);

        sort(arr);

        System.out.print("排序后：");
        print(arr);

    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = minPos + 1; j < arr.length; j++) {
                minPos = arr[minPos] < arr[j] ? minPos : j;
            }
            swap(arr, minPos, i);
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
