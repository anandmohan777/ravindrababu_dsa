package b_arrays;

import java.util.Arrays;

//80 Sort an array in wave form
public class b_80_sort_array_wave_form {

    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 1; i < arr.length; i = i + 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }

            if (i + 1 < arr.length && arr[i + 1] > arr[i]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
