package Day2;

import java.util.Scanner;

public class Program10 {

    public static int lengthOfNum(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrongNum(int n) {
        int sum = 0;
        int temp = n;
        int length = lengthOfNum(n);

        while (n>0){
            int last = n%10;
            sum += (int) Math.pow(last, length);
            n/=10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");

        int num = sc.nextInt();

        if (isArmstrongNum(num)) {
            System.out.println("Given number is Armstrong Number.");
        } else {
            System.out.println("Given number isn't Armstrong Number.");
        }
        sc.close();
    }

}
