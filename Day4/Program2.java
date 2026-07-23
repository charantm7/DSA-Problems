package Day4;

public class Program2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) {
                sum += arr1[i];
            }
        }

        System.out.println(sum);

    }
}