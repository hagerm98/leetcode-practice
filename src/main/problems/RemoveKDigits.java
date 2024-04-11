package main.problems;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {

        StringBuilder result = new StringBuilder();
        int counter = 0;

        if (num.length() == k) {
            return "0";
        }

        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) > num.charAt(i+1) && counter < k && num.charAt(i) != '0') {
                counter += 1;
                while (!result.isEmpty()
                        && result.charAt(result.length()-1) > num.charAt(i+1)
                        && counter < k) {
                    result.deleteCharAt(result.length() - 1);
                    counter += 1;
                }
            } else {
                result.append(num.charAt(i));
            }
        }

        result.append(num.charAt(num.length() - 1));

        String resultString = result
                .substring(0, result.length() - (k - counter))
                .replaceFirst("^0*", "");

        if (resultString.isEmpty()) {
            return "0";
        }

        return resultString;
    }
}
