package Day4;

public class Program13 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        // 0,1,2,3,4,5,6
        // 
        

        for (int i = 1; i < num.length - 1; i += 2) {
            int temp = num[i];
            num[i] = num[i + 1];
            num[i + 1] = temp;
        }

        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
