package Day1;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digits: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (reverse == num) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
        sc.close();
    }
}
