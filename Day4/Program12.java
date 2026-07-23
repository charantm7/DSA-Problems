package Day4;

public class Program12 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        int half_length = num.length / 2;

        for (int i = num.length - 1; i > half_length; i--) {
            System.out.println(num[i] + " ");
        }

    }
}
