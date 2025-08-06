// Problem Statement: Find and return the single integer in the array that occurs only once while all others appear twice.

import java.util.*;

class LonelyInteger {

    public static int getunique(List<Integer> a) {
        int num = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            num ^= a.get(i);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(getunique(a));
    }
}
