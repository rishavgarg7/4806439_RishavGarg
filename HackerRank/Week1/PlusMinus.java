// Problem Statement: Calculate and print the ratios of positive, negative, and zero elements in an integer array, each rounded to six decimal places.

import java.util.*;

class PlusMinus {

  static void getCount(int n, int arr[]) {
    int poscnt = 0, negcnt = 0, zerocnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        zerocnt++;
      } else if (arr[i] > 0) {
        poscnt++;
      } else {
        negcnt++;
      }
    }
    System.out.println(
      String.format(
        "%.6f\n%.6f\n%.6f",
        (float) poscnt / (float) n,
        (float) negcnt / (float) n,
        (float) zerocnt / (float) n
      )
    );
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    getCount(n, arr);
  }
}
