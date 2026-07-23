package Day4;

public class Program6 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7 };

        int max = arr1[0];

        for (int i = arr1.length / 2 + 1; i < arr1.length; i++) {

            if (arr1[i] > max) {
                max = arr1[i];
            }

        }

        System.out.println(max);
    }
}
