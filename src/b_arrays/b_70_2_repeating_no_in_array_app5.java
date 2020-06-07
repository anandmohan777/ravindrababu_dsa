package b_arrays;

import java.util.HashMap;
import java.util.Map;

// 70 Find the two repeating elements in a given array Approach-5
public class b_70_2_repeating_no_in_array_app5 {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 3,6,6};

        for (int i = 0; i < arr.length; i++) {

            int abs = Math.abs(arr[i]);
            if (arr[abs] < 0) {
                System.out.println("repeating number " + abs);
            } else {
                arr[abs] = -arr[abs];
            }
        }
    }
}
