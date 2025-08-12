// Problem Statement: Rearrange a distinct integer array into the lexicographically smallest zig zag sequence where the first half is strictly increasing and the second half strictly decreasing.

import java.util.*;

class ZigZagSequence {

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int k = (n + 1) / 2;
        int s = n - k, e = n - 1;
        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            findZigZagSequence(arr, n);
        }
    }
}
