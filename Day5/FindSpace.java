package Day5;

public class FindSpace {

    public static void main(String[] args) {
        String str = "hi hello bye";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr == ' ') {
                count++;
            }

        }
        System.out.println(count);

    }
}
