package com.beauney.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 算法检查
 *
 * @author zengjiantao
 * @since 2020-08-27
 */
public class DataChecker {
    static int[] generateRandomArray() {
        Random random = new Random();
        int arr[] = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    static void check() {
        long start = System.currentTimeMillis();
        boolean same = true;
        for (int times = 0; times < 100; times++) {
            int[] arr = generateRandomArray();
            int[] arr2 = new int[arr.length];
            System.arraycopy(arr, 0, arr2, 0, arr.length);

            Arrays.sort(arr);
//            SelectionSort.sort(arr2);
//            BubbleSort.sort(arr2);
//            InsertionSort.sort(arr2);
//            ShellSort.sort(arr2);
            BetterShellSort.sort(arr2);

            for (int i = 0; i < arr2.length; i++) {
                if (arr[i] != arr2[i]) {
                    same = false;
                }
            }
            System.out.println("第" + times + "次结果：");
            System.out.println(same ? "right" : "wrong");
        }
        System.out.println("最后总结果：");
        System.out.println(same ? "right" : "wrong");
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }

    public static void main(String[] args) {
        check();
    }
}
