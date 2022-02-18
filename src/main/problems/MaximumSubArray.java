package main.problems;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int newSum = 0;
            for (int j = i; j < nums.length; j++) {
                newSum += nums[j];
                if (newSum > maxSum) {
                    maxSum = newSum;
                }
            }
        }
        return maxSum;
    }
}