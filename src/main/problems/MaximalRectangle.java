package main.problems;

public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {

        int[][] verticalSum = new int[matrix.length][matrix[0].length];

        int maxRectArea = 0;

        for (int i = matrix.length - 1; i >= 0; i--) { // For Each Row starting end

            // For each element in row populate vertical sum
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix.length - 1) {
                    verticalSum[i][j] = Integer.parseInt(String.valueOf(matrix[i][j]));
                } else {
                    if (matrix[i][j] != '0') {
                        verticalSum[i][j] = Integer.parseInt(String.valueOf(matrix[i][j]))
                                + verticalSum[i + 1][j];
                    } else {
                        verticalSum[i][j] = 0;
                    }
                }
            }


            for (int k = 0; k < verticalSum[i].length; k++) {
                int maxContiguousSum = 0;
                int maxContiguousLength = 0;
                int minContiguousValue = Integer.MAX_VALUE;
                for (int j = k; j < verticalSum[i].length; j++) {
                    if (verticalSum[i][j] == 0) {
                        maxContiguousSum = 0;
                        maxContiguousLength = 0;
                        minContiguousValue = Integer.MAX_VALUE;
                        continue;
                    }

                    maxContiguousLength += 1;
                    minContiguousValue = Math.min(minContiguousValue, verticalSum[i][j]);
                    maxContiguousSum = Math.max(maxContiguousSum, maxContiguousLength * minContiguousValue);

                    maxRectArea = Math.max(maxRectArea, maxContiguousSum);
                }
            }
        }

        return maxRectArea;
    }
}
