package main.problems;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
                if (height[j] >= height[i]) {
                    break;
                }
            }
        }
        return maxArea;
    }
}