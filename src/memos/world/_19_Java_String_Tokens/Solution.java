package memos.world._19_Java_String_Tokens;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-string-tokens/problem
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String s = scan.nextLine();
            String[] tokens = s.trim().split("[^A-Za-z]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}
