package Day4;

public class Program14 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        // 0,1,2,3,4,5,6
        //

        int last = num[num.length - 1];

        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }

        num[0] = last;

        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
