package Day1;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digits: ");
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverse);

        sc.close();
    }
}
