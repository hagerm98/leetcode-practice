package main.problems;

public class TrappingRainWater {
    public int trap(int[] height) {

        int result = 0;
        int[] maximumOnLeft = new int[height.length];
        int[] maximumOnRight = new int[height.length];

        maximumOnLeft[0] = 0;
        for (int i = 1; i < height.length; i++) {
            maximumOnLeft[i] = Math.max(height[i - 1], maximumOnLeft[i - 1]);
        }

        maximumOnRight[maximumOnRight.length - 1] = 0;
        for (int i = maximumOnRight.length - 2; i >= 0; i--) {
            maximumOnRight[i] = Math.max(height[i + 1], maximumOnRight[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            int min = Math.min(maximumOnLeft[i], maximumOnRight[i]);
            int waterSquares = min - height[i];

            if (waterSquares > 0) {
                result += waterSquares;
            }
        }
        return result;
    }
}
