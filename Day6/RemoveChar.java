package Day6;

public class RemoveChar {

    public static void main(String[] args) {

        String str = "Hi Hello";

        char target = 'H';

        String result = "";

        int num = 0;
        while (num < str.length()) {
            char chr = str.charAt(num);

            if (chr != target) {

                result += chr;
            }
            num++;
        }

        System.out.println(result);
    }

}
