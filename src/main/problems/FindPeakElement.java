package main.problems;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;

        int i = 0, j = nums.length - 1;

        while (i != j) {
            int mid = (i + j) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else {
                if (nums[mid] < nums[mid - 1]) j = mid;
                else i = mid;
            }
        }
        return i;
    }
}
