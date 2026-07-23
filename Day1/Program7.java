package Day1;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digits: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}
