package Day1;

public class Program15 {
    public static void main(String[] args) {
        int a = 45;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
