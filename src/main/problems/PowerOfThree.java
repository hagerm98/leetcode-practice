package main.problems;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {

        if (n == 1) {
            return true;
        } else if (n % 3 == 0 && n != 0) {
            return isPowerOfThree(n / 3);
        }
        return false;
    }
}
