package Day1;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a series place:");
        int num = sc.nextInt();
        sc.close();

        if (num == 0) {
            System.out.println(0);
            return;
        }
        if (num == 1) {
            System.out.println(1);
            return;
        }

        int value = 1;
        int secondValue = 0;
        for (int i = 2; i <= num; i++) {
            int temp = value;
            value = value + secondValue;
            secondValue = temp;
        }
        System.out.println(value);
    }
}
