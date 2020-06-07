package b_arrays;

import java.util.HashMap;
import java.util.Map;

// 47 Find the sub array with given sum X (Approach-2)
public class b_48_subarray_given_sum_app2 {

    public static void main(String[] args) {
        int arr[] = {8, 5, -2, 3, 4, -5, 7};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(arr.length);
        int sum = 11;

        int sumSoFar = 0;
        map.put(sumSoFar, 0);
        for (int i = 0; i < arr.length; i++) {
            sumSoFar = sumSoFar + arr[i];
            int diff = sumSoFar - sum;
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff)+1 + " " + (i + 1));
                break;
            } else {
                map.put(sumSoFar, i+1);
            }

        }

    }

}
