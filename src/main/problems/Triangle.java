package main.problems;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 0; i < triangle.size() - 1; i++) {
            int nextSumVal = Integer.MAX_VALUE;
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i + 1).set(j, Math.min(triangle.get(i).get(j) + triangle.get(i + 1).get(j), nextSumVal));
                nextSumVal = triangle.get(i).get(j) + triangle.get(i+1).get(j+1);
            }
            triangle.get(i+1).set(triangle.get(i+1).size()-1, nextSumVal);
        }
        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        int minimum = Integer.MAX_VALUE;
        for (Integer val : lastRow) {
            if (val < minimum) {
                minimum = val;
            }
        }
        return minimum;
    }
}
