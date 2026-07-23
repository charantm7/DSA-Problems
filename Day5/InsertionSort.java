package Day5;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 7, 1, 9 };

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
