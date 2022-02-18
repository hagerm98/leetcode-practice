package main.problems;

public class MaximumSubArrayKadane {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
