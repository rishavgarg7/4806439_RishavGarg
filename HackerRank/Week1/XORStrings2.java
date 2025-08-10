// Problem Statement: Given two binary strings of equal length, return a new string representing their bitwise XOR.

import java.util.*;

class XORStrings2 {

    public static String stringsXOR(String s, String t) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                ans.append('0');
            } else {
                ans.append('1');
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(stringsXOR(s, t));
    }
}
