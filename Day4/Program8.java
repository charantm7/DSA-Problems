package Day4;

public class Program8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        for (int x : arr) {

            boolean isPrime = true;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(x);
            }
        }
    }
}