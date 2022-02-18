package main.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return createArrayOfTwoInts(map.get(target - nums[i]), i);
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    private int[] createArrayOfTwoInts(int x, int y) {
        int[] a = new int[2];
        a[0] = x;
        a[1] = y;
        return a;
    }
}
