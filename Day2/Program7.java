package Day2;

import java.util.Scanner;

public class Program7 {
    public static boolean isBouncyNumber(String s) {
        boolean ascending = false;
        boolean descending = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) < s.charAt(i + 1)) {
                descending = true;
            } else if (s.charAt(i) > s.charAt(i + 1)) {
                ascending = true;
            }
        }
        if (ascending && descending) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        if (isBouncyNumber(num)) {
            System.out.println("Given number is Bouncy Number.");
        } else {
            System.out.println("Given number isn't Bouncy Number.");
        }

        sc.close();
    }

}