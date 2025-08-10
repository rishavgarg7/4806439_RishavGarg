// Problem Statement: Check if the sentence contains every letter of the English alphabet (case-insensitive) and return "pangram" or "not pangram" accordingly.

import java.util.*;

class Pangrams {

    public static String isPangrams(String s) {
        int n = s.length();
        char freq[] = new char[26];
        String lowercasestr = s.toLowerCase();
        for (int i = 0; i < n; i++) {
            if (lowercasestr.charAt(i) != ' ') {
                freq[lowercasestr.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return "not pangram";
            }
        }
        return "pangram";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPangrams(s));
    }
}
