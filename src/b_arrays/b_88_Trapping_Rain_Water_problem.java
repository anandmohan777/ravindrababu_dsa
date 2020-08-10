package b_arrays;

import java.util.Arrays;

//88 Trapping Rain Water problem Algorithm
public class b_88_Trapping_Rain_Water_problem {

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 1, 0, 3, 1, 0, 2};
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        left[0] = arr[0];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        for (int i = 0; i < arr.length; i++) {
            int value = Math.min(left[i], right[i]);
            System.out.print(" " + Math.abs(value - arr[i]));
        }
    }

}
