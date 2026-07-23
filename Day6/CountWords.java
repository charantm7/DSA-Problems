package Day6;

public class CountWords {
    public static void main(String[] args) {
        String str = " ";

        int countWord = 0;

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
                countWord++;
            }
        }

        System.out.println(countWord);
    }
}
