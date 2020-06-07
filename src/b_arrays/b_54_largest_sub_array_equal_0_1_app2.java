package b_arrays;

import java.util.HashMap;
import java.util.Map;

// 54 Find the largest sub array with equal number of 0's and 1's (Approach - 2)
public class b_54_largest_sub_array_equal_0_1_app2 {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0};
        int[] temp = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int u = 0;
        int size = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                temp[i] = (temp[i] == 0 ? -1 : 1);
            } else {
                temp[i] = temp[i - 1] + (temp[i] == 0 ? -1 : 1);
            }

            if (!map.containsKey(temp[i])) {
                map.put(temp[i], i);
            } else {
                int tempDiff = i - map.get(temp[i]);
                if (tempDiff > size) {
                    l = map.get(temp[i]);
                    u = i;
                    size = tempDiff;
                }

            }

        }

        System.out.println((size - 1) + " " + (l + 2) + " " + (u + 1));


    }

}
