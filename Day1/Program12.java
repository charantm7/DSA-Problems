package Day1;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        for (int i = 2; i <= num / 2 + 1; i++) {
            if (num % i == 0) {
                System.out.println("It's not a prime number");
                isPrime = false;
                return;
            }
        }

        if (isPrime) {
            System.out.println("It is a prime number");
        }

    }
}
