package Day4;

public class Program15 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        int index = 0;

        int k = 3;

        int[] temp = new int[num.length];
        // -k:

        k %= num.length;

        for (int i = num.length - k; i < num.length; i++) {
            temp[index++] = num[i];
        }

        for (int i = 0; i < num.length - k; i++) {
            temp[index++] = num[i];
        }

        for (int x : temp) {
            System.out.println(x);
        }
    }
}
