package Day6;

public class ReverseWord {
    public static void main(String[] args) {
        String str = " Hi  Hello";
        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char chr = str.charAt(i);

            if (chr != ' ') {
                word = chr + word;
            } else {
                if (word.length() == 0) {
                    result = result + word;
                } else {
                    result = result + word + " ";
                }

                word = "";
            }

        }
        result = result + word;

        System.out.println(result);
    }
}
