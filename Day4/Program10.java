package Day4;

public class Program10 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        // 1,2,3,4,5,6
        // 0,1,2,3,4,5

        // 1 - 3,

        for (int i = 1; i < num.length - 2; i += 4) {
            int temp = num[i];
            num[i] = num[i + 2];
            num[i + 2] = temp;
        }

        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
