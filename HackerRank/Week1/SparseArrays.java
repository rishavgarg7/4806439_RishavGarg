// Problem Statement: For each query string, count and return how many times it appears in the list of input strings.

import java.util.*;

class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            if (hm.containsKey(strings.get(i))) {
                hm.put(strings.get(i), hm.get(strings.get(i)) + 1);
            } else {
                hm.put(strings.get(i), 1);
            }
        }
        for (int i = 0; i < queries.size(); i++) {
            if (hm.containsKey(queries.get(i))) {
                ans.add(hm.get(queries.get(i)));
            } else {
                ans.add(0);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stringssize = sc.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < stringssize; i++) {
            strings.add(sc.next());
        }
        int queriessize = sc.nextInt();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < queriessize; i++) {
            queries.add(sc.next());
        }
        List<Integer> ans = matchingStrings(strings, queries);
        for (int i = 0; i < queriessize; i++) {
            System.out.println(ans.get(i));
        }

    }
}
