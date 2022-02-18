package main.problems;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.toArray(new Integer[1])[0];
    }
}
