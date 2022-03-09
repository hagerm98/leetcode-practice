package main.problems;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            }
        }
        return s.length() == i;
    }
}