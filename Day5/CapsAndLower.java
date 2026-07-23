package Day5;

public class CapsAndLower {

    static String strReturnCaps(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (i % 2 == 0) {

                result += (char) (chr - 32);

            } else {
                // AnAnTh

                result += chr;

            }

        }

        return result;

    }

    public static void main(String[] args) {

        String s = "anAnth";
        System.out.println(strReturnCaps(s));
    }
}
