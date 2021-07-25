package memos.world._16_Java_Substring_Comparisons;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-compare/problem
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            smallest = sub.compareTo(smallest) < 0 ? sub : smallest;
            largest = sub.compareTo(largest) > 0 ? sub : largest;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
