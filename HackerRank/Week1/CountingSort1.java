// Problem Statement: Use a frequency array to count occurrences of each value, then print each value according to its frequency in sorted order.

import java.util.*;

class CountingSort1 {

    public static List<Integer> getCountingSort(List<Integer> arr) {
        int n = arr.size();
        List<Integer> ans = new ArrayList<>(Collections.nCopies(100, 0));
        for (int i = 0; i < n; i++) {
            int ele = arr.get(i);
            ans.set(ele, ans.get(ele) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> ans = getCountingSort(arr);
        for (int i = 0; i < 100; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
