// Problem Statement: Given a square matrix, calculate the absolute difference between the sums of its diagonals.

import java.util.*;

class DiagonalDifference {

    public static int getDiagonalDifference(List<List<Integer>> arr) {
        int n = arr.size(), leftdiagsum = 0, rightdiagsum = 0;
        for (int i = 0; i < n; i++) {
            leftdiagsum += arr.get(i).get(i);
            rightdiagsum += arr.get(i).get(n - i - 1);
        }
        return Math.abs(leftdiagsum - rightdiagsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
        }
        System.out.println(getDiagonalDifference(arr));
    }
}
