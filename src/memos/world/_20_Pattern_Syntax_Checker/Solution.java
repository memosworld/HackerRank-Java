package memos.world._20_Pattern_Syntax_Checker;

import java.util.Scanner;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
