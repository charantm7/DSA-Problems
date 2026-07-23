package Day4;

public class Program7 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7 };

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {

            sum += arr1[i];

        }

        System.out.println(sum / arr1.length);

    }
}
