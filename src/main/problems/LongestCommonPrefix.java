package main.problems;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            commonPrefix = calculateCommonPrefix(commonPrefix, strs[i]);
            if (commonPrefix.isBlank()) {
                break;
            }
        }
        return commonPrefix;
    }

    private String calculateCommonPrefix(String a, String b) {
        String prefix = "";
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                prefix += a.charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }
}
