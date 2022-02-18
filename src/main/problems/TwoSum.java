package main.problems;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return createArrayOfTwoInts(i, j);
                }
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
