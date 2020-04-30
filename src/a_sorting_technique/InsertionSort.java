package a_sorting_technique;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = { 9, 6, 5, 0, 8, 2, 7, 1, 3 };
        System.out.println(Arrays.toString(insertionSort(a)));

    }

    public static int[] insertionSort(int a[]) {

        if (a.length < 2)
            return a;

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                --j;
            }

            a[j + 1] = key;

        }
        return a;

    }
}
