package Day1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println("Number is divisible by 5 and 11.");
            } else {
                System.out.println("Number is not divisible by 5 and 11.");
            }
        }
    }
}
    