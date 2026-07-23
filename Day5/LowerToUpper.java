package Day5;

public class LowerToUpper {
    public static void main(String[] args) {
        String str = "hi";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                chr = (char) (chr - 32);
            }

            System.out.printf("%s", chr);

        }

    }
}
