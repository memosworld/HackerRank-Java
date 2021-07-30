package memos.world._25_Java_BigDecimal;

import java.math.BigDecimal;
import java.util.*;

// https://www.hackerrank.com/challenges/java-bigdecimal/problem
class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, Comparator.comparing(BigDecimal::new, Comparator.reverseOrder()));

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
