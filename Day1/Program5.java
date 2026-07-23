package Day1;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int start = sc.nextInt();

        System.out.println("Enter ending number:");
        int end = sc.nextInt();

        for (int i = start + 1; i < end; i++) {
            System.out.println(i);
        }

        sc.close();

    }
}
