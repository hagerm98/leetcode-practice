package main.problems;

public class StrictlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                count++;
                if (i > 1 && nums[i - 2] >= nums[i]){
                    if (i < nums.length - 1 && nums[i - 1] >= nums[i + 1]) {
                        count++;
                    }
                }

                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
