// Problem Statement: Convert a 12-hour AM/PM time format to its equivalent 24-hour (military) time format.

import java.util.*;

class TimeConversion {

    public static String converttimeformat(String s) {
        boolean isam = s.contains("AM");
        String ans = "";
        String constantPart = s.substring(2, 8);
        String variablePart = s.substring(0, 2);
        if (isam) {
            if (variablePart.equals("12")) {
                ans = "00" + constantPart;
            } else {
                ans = variablePart + constantPart;
            }
        }
        if (!isam) {
            if (!variablePart.equals("12")) {
                ans = Integer.toString(Integer.parseInt(variablePart) + 12) + constantPart;
            } else {
                ans = variablePart + constantPart;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(converttimeformat(s));
    }
}
