package Day1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter num a:");
            int a = sc.nextInt();

            System.out.print("Enter num b:");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
            }
        }
    }
}
