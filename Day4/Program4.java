package Day4;

public class Program4 {

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7 };

        int max = arr1[0];

        for (int i = 0; i < arr1.length / 2; i++) {
            if (i % 2 != 0) {
                if (arr1[i] > max) {
                    max = arr1[i];
                }
            }
        }

        System.out.println(max);
    }
}
