package Day5;

public class Trim {
    public static void main(String[] args) {
        String str = "  Hi hello ";

        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        for (int i = start; i <= end; i++) {
            System.out.print(str.charAt(i));
        }
    }

}
