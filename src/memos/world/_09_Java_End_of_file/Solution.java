package memos.world._09_Java_End_of_file;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/java-end-of-file/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 0;
        while (scanner.hasNext()) {
            System.out.println(++line + " " + scanner.nextLine());
        }
    }
}