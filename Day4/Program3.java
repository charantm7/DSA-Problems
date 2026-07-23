package Day4;

public class Program3 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7 };

        int min = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                if (arr1[i] < min) {
                    min = arr1[i];
                }
            }
        }

        System.out.println(min);
    }
}
