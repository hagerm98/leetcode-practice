package main.problems;

import java.util.Map;

public class IntToEnglishWords {
    Map<Integer, String> unitsMap = Map.of(
            0, "Zero",
            1, "One",
            2, "Two",
            3, "Three",
            4, "Four",
            5, "Five",
            6, "Six",
            7, "Seven",
            8, "Eight",
            9, "Nine"
    );

    Map<Integer, String> tensMap = Map.of(
            10, "Ten",
            20, "Twenty",
            30, "Thirty",
            40, "Forty",
            50, "Fifty",
            60, "Sixty",
            70, "Seventy",
            80, "Eighty",
            90, "Ninety"
    );

    Map<Integer, String> teenMap = Map.of(
            11, "Eleven",
            12, "Twelve",
            13, "Thirteen",
            14, "Fourteen",
            15, "Fifteen",
            16, "Sixteen",
            17, "Seventeen",
            18, "Eighteen",
            19, "Nineteen"
    );


    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        String result = "";

        int billions = num / 1000000000;
        num -= billions * 1000000000;
        if (billions != 0) {
            result += convertThreeDigitsToEnglish(String.valueOf(billions)) + " Billion";
        }

        int millions = num / 1000000;
        num -= millions * 1000000;
        if (millions != 0) {
            result += " " + convertThreeDigitsToEnglish(String.valueOf(millions)) + " Million";
        }

        int thousands = num / 1000;
        num -= thousands * 1000;
        if (thousands != 0) {
            result += " " + convertThreeDigitsToEnglish(String.valueOf(thousands)) + " Thousand";
        }

        if (num != 0) {
            result += " " + convertThreeDigitsToEnglish(String.valueOf(num));
        }

        return  result.trim();
    }

    private String convertThreeDigitsToEnglish(String n) {
        if (n.length() == 1) {
            return unitsMap.get(Integer.parseInt(n));
        } else if (n.length() == 2) {
            if (n.charAt(0) == '0') {
                return convertThreeDigitsToEnglish(n.substring(1));
            } else if (n.charAt(1) == '0') {
                return tensMap.get(Integer.parseInt(n));
            } else if (n.charAt(0) == '1') {
                return teenMap.get(Integer.parseInt(n));
            } else {
                return (tensMap.get(Integer.parseInt(n.charAt(0) + "0")))
                        + " "
                        + (convertThreeDigitsToEnglish(n.substring(1)));
            }
        } else {
            if (n.substring(1).equals("00")) {
                return (unitsMap.get(Integer.parseInt(String.valueOf(n.charAt(0)))) + " Hundred");
            } else {
                return (unitsMap.get(Integer.parseInt(String.valueOf(n.charAt(0)))))
                    + " Hundred "
                    + convertThreeDigitsToEnglish(n.substring(1));
            }
        }
    }
}
