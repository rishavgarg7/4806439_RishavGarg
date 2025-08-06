// Problem Statement: Given a list of 32-bit unsigned integers, flip all the bits of each and return the result as unsigned integers.

import java.util.*;

class FlippingBits {

    public static long flipBits(long n) {
        String nbits = Long.toBinaryString(n);
        int nbitslen = nbits.length();
        String bit = "11111111111111111111111111111111";

        StringBuilder flippedbits = new StringBuilder(bit);
        for (int i = 0; i < nbitslen; i++) {
            flippedbits.setCharAt(i + (32 - nbitslen), nbits.charAt(i) == '0' ? '1' : '0');
        }
        return Long.parseUnsignedLong(flippedbits.toString(), 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            long n = sc.nextLong();
            System.out.println(flipBits(n));
        }
    }
}
