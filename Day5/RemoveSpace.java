package Day5;

public class RemoveSpace {

    public static void main(String[] args) {
        String str = "hi hello bye";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                continue;
            }

            System.out.printf("%s", chr);

        }

    }
}
