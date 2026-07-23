package Day2;

import java.util.Scanner;

public class Program8 {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static boolean isMystery(int n) {
        for (int i = 1; i <= n; i++) {
            if (i + reverse(i) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isMystery(num)) {
            System.out.println("Given number is Mystery number.");
        } else {
            System.out.println("Given number isn't Mystery number.");
        }
        sc.close();
    }
}
