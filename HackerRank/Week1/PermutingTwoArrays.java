// Problem Statement: Check if there exists a permutation of two arrays A and B such that for all i, A[i] + B[i] >= k.

import java.util.*;

class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        int n = A.size();
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                A.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                B.add(sc.nextInt());
            }
            System.out.println(twoArrays(k, A, B));

        }
    }
}
