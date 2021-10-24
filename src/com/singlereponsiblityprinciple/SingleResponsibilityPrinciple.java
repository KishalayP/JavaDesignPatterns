package com.singlereponsiblityprinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsibilityPrinciple {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");
        List<Integer> nums = numsInput();

        Collections.sort(nums);
        printList(nums);

    }

    public static List<Integer> numsInput() {

        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < THRESHOLD) {

            String s = scanner.nextLine();
            if (checkInt(s)) {
                int num = Integer.parseInt(s);
                if (checkInt(num)) {
                    nums.add(num);
                }
            }
        }
        scanner.close();
        return nums;

    }

    public static void printList(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }

    public static boolean checkInt(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        return true;
    }

    public static boolean checkInt(int num) {

        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
