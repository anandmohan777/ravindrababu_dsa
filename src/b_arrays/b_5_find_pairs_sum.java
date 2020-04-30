package b_arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class b_5_find_pairs_sum {

    public static void main(String[] args) {
        int[] array = { 1, 2, 6, 3, 7, 9 };
        int sum = 9;

        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int firstPair = array[i];
            int secondpair = sum - firstPair;
            if (temp.contains(secondpair)) {
                System.out.println(firstPair + " : " + secondpair);
            } else {
                temp.add(firstPair);
            }

        }

    }

}
