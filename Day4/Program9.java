package Day4;

public class Program9 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }

        for (int x : num) {
            System.out.println(x);
        }
    }
}
