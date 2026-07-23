package Day4;

public class Program11 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        int half_length = num.length / 2;

        for (int i = half_length; i >= 0; i--) {
            System.out.println(num[i] + " ");
        }

    }

}
