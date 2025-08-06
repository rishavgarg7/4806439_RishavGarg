// Problem Statement: Given five positive integers, find and print the minimum and maximum sums obtained by adding any four of the five numbers.

import java.util.*;

class MiniMaxSum {

    static long getCompleteSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printminmax(int[] arr, long sum) {
        long min = sum, max = 0;
        for (int i = 0; i < 5; i++) {
            long cursum = sum - arr[i];
            min = Math.min(cursum, min);
            max = Math.max(cursum, max);
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = getCompleteSum(arr);
        printminmax(arr, sum);
    }
}
