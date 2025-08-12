// Problem Statement: Find the minimum number of page turns needed to reach page p in a book of n pages, counting turns starting from either the front or the back.

import java.util.*;

class DrawingBook {

    public static int pageCount(int n, int p) {
        return Math.min(p / 2, n / 2 - p / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(pageCount(n, p));
    }
}
