package memos.world._18_Java_Anagrams;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-anagrams/problem
public class Solution {
    static boolean isAnagram(String a, String b) {
        return sort(a).equals(sort(b));
    }

    static String sort(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
