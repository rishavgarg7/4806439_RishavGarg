// Problem Statement: Count how many contiguous subarrays of length m in the chocolate bar sum to Ron's birth day d.

import java.util.*;

class SubarrayDivision1 {

    public static int birthday(List<Integer> s, int d, int m) {
        int n = s.size(), ans = 0, sum = 0;
        if (m > n) {
            return ans;
        }
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        if (sum == d) {
            ans++;
        }
        for (int i = m; i < n; i++) {
            sum = sum + s.get(i) - s.get(i - m);
            if (sum == d) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(birthday(s, d, m));
    }
}
