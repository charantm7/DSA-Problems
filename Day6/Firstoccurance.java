package Day6;

public class Firstoccurance {
    public static void main(String[] args) {
        String str = "hi hello";

        boolean isRemoved = false;

        char target = 'h';

        int num = 0;

        while (num < str.length()) {

            char chr = str.charAt(num);

            if (chr == target && !isRemoved) {
                isRemoved = true;
            } else {
                System.out.println(chr);

            }

            num++;

        }
    }
}
