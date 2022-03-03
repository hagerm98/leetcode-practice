package main.problems;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        List<Integer> ways = new ArrayList<>();
        ways.add(1);
        ways.add(2);

        while(ways.size() < n) {
            ways.add(ways.get(ways.size() - 1) + ways.get(ways.size() - 2));
        }

        return ways.get(ways.size() - 1);
    }
}