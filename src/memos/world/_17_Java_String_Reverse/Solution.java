package memos.world._17_Java_String_Reverse;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-string-reverse/problem
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String reversed = new StringBuilder(A).reverse().toString();
        System.out.println(A.equalsIgnoreCase(reversed) ? "Yes" : "No");
    }
}
