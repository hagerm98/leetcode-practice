package main.problems;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>(s.chars().mapToObj(i -> (char) i).toList());
            if (s.length() != set.size()) {
                return false;
            }
        }

        StringBuilder sDiff = new StringBuilder();
        StringBuilder goalDiff = new StringBuilder();
        for (int i = 0; i < s.length() && sDiff.length() <= 2; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                sDiff.append(s.charAt(i));
                goalDiff.append(goal.charAt(i));
            }
        }

        return sDiff.length() == 2 && sDiff.charAt(0) == goalDiff.charAt(1) && sDiff.charAt(1) == goalDiff.charAt(0);

    }
}
