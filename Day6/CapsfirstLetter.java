package Day6;

public class CapsfirstLetter {
    public static void main(String[] args) {

        String str = " hi hello";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (i == 0 || str.charAt(i - 1) == ' ') {
                if (chr >= 'a' && chr <= 'z') {
                    result += (char) (chr - 32);
                }
            } else {
                result += chr;
            }
        }

        System.out.println(result);
    }
}
