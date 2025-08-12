// Problem Statement: Count how many pairs of matching socks are in the array by grouping socks by color and summing the integer division of their counts by two.

import java.util.*;

class SalesbyMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        List<Integer> ele = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ele.contains(ar.get(i))) {
                ele.remove(Integer.valueOf(ar.get(i)));
                pairs++;
            } else {
                ele.add(ar.get(i));
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }
        System.out.println(sockMerchant(n, ar));
    }
}
