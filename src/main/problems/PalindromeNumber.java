package main.problems;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String s = "" + x;

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
