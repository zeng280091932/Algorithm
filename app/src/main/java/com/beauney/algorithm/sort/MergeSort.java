package com.beauney.algorithm.sort;

/**
 * 插入排序
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 4, 2, 8, 7, 1, 5};
//        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        System.out.print("排序前：");
        print(arr);

        sort(arr, 0, arr.length - 1);

        System.out.print("排序后：");
        print(arr);

    }

    static void sort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        //分成两半
        int mid = left + (right - left) / 2;
        //左边排序
        sort(arr, left, mid);
        //右边排序
        sort(arr, mid + 1, right);

        merge(arr, left, mid + 1, right);
    }

    static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while (i <= mid && j <= rightBound) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= rightBound) temp[k++] = arr[j++];

        for (int m = 0; m < temp.length; m++) {
            arr[leftPtr + m] = temp[m];
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
