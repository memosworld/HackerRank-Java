package memos.world._14_Java_Strings_Introduction;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes" : "No");
        System.out.printf("%s %s", A.substring(0, 1).toUpperCase() + A.substring(1), B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
