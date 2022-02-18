package main;

import main.problems.TwoSum;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        TwoSum ts = new TwoSum();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter list numbers separated by spaces: ");
        String line = sc.nextLine();

        String[] numsStrings = line.split(" ");

        int[] nums = new int[numsStrings.length];

        for (int i = 0; i < numsStrings.length; i++) {
            nums[i] = Integer.parseInt(numsStrings[i]);
        }

        System.out.println("Please Enter target: ");
        int target = sc.nextInt();

        int[] result = ts.twoSum(nums, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");

    }
}

