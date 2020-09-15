package com.beauney.algorithm.sort;

/**
 * 插入排序
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 4, 2, 8, 7, 1, 5, 10};
//        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        System.out.print("排序前：");
        print(arr);

        sort(arr, 0, arr.length - 1);

        System.out.print("排序后：");
        print(arr);

    }

    static void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) {
            return;
        }
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid-1);
        sort(arr, mid + 1, rightBound);
    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }

            while (left <= right && arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                swap(arr, left, right);
            }
        }

        swap(arr, left, rightBound);
        return left;
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
