package b_arrays;

import java.util.Arrays;

//76 Rotate the array of size n by d elements Approach-4
public class b_76_Rotate_array_by_d_elements_app4 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int d = 3;

        for (int i = 0, j = d - 1; i < j; i++, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = d, j = arr.length-1; i < j; i++, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0, j = arr.length-1; i < j; i++, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
