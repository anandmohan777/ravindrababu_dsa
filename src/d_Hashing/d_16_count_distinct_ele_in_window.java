package d_Hashing;

import java.util.HashMap;

public class d_16_count_distinct_ele_in_window {

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 30, 40, 10};
        int window = 3;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        int printCount = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (window == i || i > window) {
                System.out.print(printCount + " ");

                Integer count = hash.get(arr[i - window]);
                if (count % 2 != 0) {
                    --printCount;
                }

                hash.put(arr[i - window], hash.get(arr[i - window]) - 1);
            }

            if (i < arr.length && hash.containsKey(arr[i]) && hash.get(arr[i]) > 0) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else if (i < arr.length) {
                hash.put(arr[i], 1);
                ++printCount;
            }


        }
    }
}
