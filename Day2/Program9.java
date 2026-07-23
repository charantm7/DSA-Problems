package Day2;

import java.util.Scanner;

public class Program9 {
    public static int sumOfSquareOfDig(int n) {
        int sum = 0;
        while (n != 0) {
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int n) {
        int result = n;
        while (result != 1 && result != 4) {
            result = sumOfSquareOfDig(result);
        }

        return result == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappyNumber(num)) {
            System.out.println("Given number is Happy Number.");
        } else {
            System.out.println("Given number isn't happy number");
        }

        sc.close();
    }

}
